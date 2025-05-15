package workspaces.model;

import java.util.List;
import java.util.ArrayList;

/**
 * ZooKeep verwaltet das Model
 * 
 * @author Tierpark-Gruppe
 */

/*  
    Zooname final?
    
    Liste von Tieren
    Liste von Gehegen
    Liste von Mitarbeitern
    Futterlager
    
    Tiere hinzufügen
    Tiere ausgeben
    Gehege hinzufügen
    Gehege ausgeben
    Mitarbeiter hinzufügen
    Mitarbeiter ausgeben
    Futterlager ausgeben
    Futterlager einlagern
    */

public class ZooList {

    private String name;
    private List<Tier> alleTiere;
    private List<Gehege> alleGehege;
    private List<Waerter> alleWaerter;
    private List<Tierarzt> alleTieraerzte;
    private Futterlager futterlager;
    
    public ZooKeep(String name) {
        this.name = name;
        this.alleTiere = new ArrayList<>();
        this.alleGehege = new ArrayList<>();
        this.alleWaerter = new ArrayList<>();
        this.alleTieraerzte = new ArrayList<>();
        this.futterlager = new Futterlager();
    }
//getter
public String getName() {
    return name;
}    
 public List<Tier> getAlleTiere() {
    return alleTiere;
}

 public List<Gehege> getAlleGehege() {
     return alleGehege;
 } 
 
 public List<Waerter> getAlleWaerter() {
     return alleWaerter;
 }
 
 public List<Tierarzt> getAlleTieraerzte() {
     return alleTieraerzte;
 }
 
public Futterlager getFutterlager() {
    return futterlager;
}
//setter
  public void setName(String name) {
    this.name = name;
}      
//Methoden
//einfach Tierhinzufügen
 public void tierHinzufuegen(Tier tier) {
    alleTiere.add(tier);
}
 //einfaches Tierentfernen
 public boolean tierEntfernen(Tier tier) {
    return alleTiere.remove(tier);
}
}