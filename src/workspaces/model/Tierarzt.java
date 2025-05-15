package workspaces.model;
/**
 * Modell für das Tierarztobjekt
 * 
 * @author Tierpark-Gruppe
 */
public class Tierarzt extends Mitarbeiter {

   /**
    * Konstruktor für Tierarzt
    * 
    * Der Job "Tierarzt" wird automatisch gesetzt. Tierärzte haben keine Schichten (erweiterbar).
    * 
    * @param name Name des Tierarztes. Z.B. Bernhard Grzimek
    */
    public Tierarzt(String name) {
       super(name, "Tierarzt", ""); 
       
    }
    
    public boolean behandleTier(Tier tier) {
    if (!tier.isGesund()) {
        return tier.wehVergeh(); 
    }
    return false;
}
}