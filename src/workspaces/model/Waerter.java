package workspaces.model;
/**
 * Modell für das Wärterobjekt
 * 
 * @author Tierpark-Gruppe
 */
public class Waerter extends Mitarbeiter {

    
    /**
     * Maximal Anzahl an Gehegen für die ein Wärter zuständig sein kann.
     */
    private int maxGehege;
   
    /**
     * Gehege für die der Wärter zuständig ist. Liste?
     */
 
    /**
     * Konstruktor für Wärter
     *
     * Job "Wärter" wird automatisch gesetzt.
     * 
     * @param name Name des Wärters
     * @param schicht Schicht, der der Wärter eingeteilt ist
     * @param maxGehege Die maximale Anzahl an Gehehen, die der Wärter betreuen kann
     */
    public Waerter(String name, String schicht, int maxGehege) {
        super(name, "Wärter", schicht);
        this.maxGehege = maxGehege;
    }
   
    //Methoden
    
    public boolean fuettere(Tier tier) {
        return tier.fuettern();
    }
    
}