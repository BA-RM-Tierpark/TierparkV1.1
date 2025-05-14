package workspaces.model;

import java.util.*;



public class Futterlager {

	private Map<String, Integer> bestand = new HashMap<>(); //Damit kannst du beliebige Futterarten dynamisch hinzufügen und verwalten.

	private Map<String, Integer> mindestbestand = new HashMap<>();


	public List<Integer> getBestandsWerte() {
	    return new ArrayList<>(bestand.values());
	}
	
	public List<Integer> getMindestBestandsWerte() {
	    return new ArrayList<>(mindestbestand.values());
	}

	
	public void neueFutterartAnlegen(String futterart, int mindestwert) {
		
        String art = futterart.toLowerCase();
        
        bestand.putIfAbsent(art, 0); //fügt die Futterart mit dem Wert 0 hinzu wenn noch nicht existiert.
        mindestbestand.put(art, mindestwert); // setzt den mindestbestand auf den eingegebenen wert 
    }
	
	
	public void einlagern(String futterart, int menge) {
        String art = futterart.toLowerCase();
        
        bestand.putIfAbsent(art, 0);  // Setz auf 0 wenn nicht vorhanden
        bestand.put(art, bestand.get(art) + menge);  // Erhöht den Wert nachträglich auf einlagerrungsmenge

        
        prüfeMindestbestand(art);
    }
	
	public boolean entnehmen(String futterart, int menge) {
        String art = futterart.toLowerCase();
        
        int aktuellerBestand = bestand.getOrDefault(art, 0); //sucht die futterart in der Map
        
        if (aktuellerBestand >= menge) {
            bestand.put(art, aktuellerBestand - menge);
            prüfeMindestbestand(art); // es wird nochmal bei der entnahme geprüft ob Mindestbestand jetzt kleiner ist nach entnahme
            return true;
        } else {
            return false;
        }
    }
	
	public String getBestandsAnzeige() {
        String result = "";
        for (Map.Entry<String, Integer> entry : bestand.entrySet()) { // iteriert über alle Eintrage der bestand-Map
            result += entry.getKey() + ": " + entry.getValue() + "\n"; // getKey gibt futterArt zurück und getValue den Bestand
        }
        return result;
    }
	
	 private void prüfeMindestbestand(String art) {
	        int aktuell = bestand.getOrDefault(art, 0); //Rufe den aktuellen Bestand für die Futterart ab
	        int mindest = mindestbestand.getOrDefault(art, 0); // Rufe den aktuellen Mindestbestand für die Futterart ab
	        if (aktuell < mindest) { //Vergleicht beide Bestände und meldet sich falls Mindestbestand kleiner als Bestand
	          System.out.println("zu wenig bestand von: " + art);
	        }
	    } //MINDESTBESTAND NOCH NICHT DEFINIERT //VERBRAUCHSERMITTLUNG? Wenn ja dann auch auf abhängigkeit von anderen Attributen

	 
	 
	 
	 
	 
	 /*
	  * public void berechneUndSetzeMindestbestand(String futterart, int anzahlTiere, int futterProTier) {
    	int mindestwert = anzahlTiere * futterProTier;
    	neueFutterartAnlegen(futterart, mindestwert);
		}
	  */
	 
	 
	 
	 }

