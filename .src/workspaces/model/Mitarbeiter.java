package workspaces.model;
/**
 * Modell von Gehegeobjekten
 * 
 * @author Tierpark-Gruppe
 */
public class Gehege {
  
    /**
     * Der Gehegetyp. Wassergehege, Savanne etc.
     */
    private String name;
    
    /**
     * Maximale Anzahl an Tieren im Gehege.
     */
    private int groesse;
    /**
     * Konstruktor für ein gemütliches Gehegeobjekt
     * 
     * @param name Typ des Geheges
     * @param groesse Maximal Anzahl an Tieren im Gehege
     */
    public Gehege (String name, int groesse) {
        this.name = name;
        this.groesse = groesse;
    }
    
    public String toString() {
    return name;
}
}
