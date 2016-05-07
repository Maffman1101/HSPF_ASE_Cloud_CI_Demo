/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verwaltungsklassen;

import Fachklassen.Fahrzeug;
import java.util.ArrayList;

/**
 *
 * @author EDV-Beratung
 */
public class FahrzeugVerwaltung {

    private ArrayList<Fahrzeug> fahrzeugListe;

    public FahrzeugVerwaltung() {
        this.fahrzeugListe = new ArrayList<>();
    }


    public boolean pruefeSitzplatzAnzahlOK(String sitzplatzAnzahl) {
        byte anzahlSitzplatz = 0;

        try {
            anzahlSitzplatz = Byte.parseByte(sitzplatzAnzahl);
        } catch (NumberFormatException e) {
            return false; // sitzplatzanzahl ist keine Zahl
        }

        return true;
    }

    public boolean pruefeMietpreisOK(String mietpreisProTag) {
        double mietpreis = 0;
        
        try {
            mietpreis = Double.parseDouble(mietpreisProTag);
        } catch (NumberFormatException es) {
            return false; // mietpreis ist keine Zahl
        }
        
        return true;
    }

    public void fahrzeugAnlegen(String beschreibung, String sitzpleatze, String mietpreis) {
        this.fahrzeugListe.add(new Fahrzeug(beschreibung, Byte.valueOf(sitzpleatze), Double.valueOf(mietpreis)));
    }

    public ArrayList<Fahrzeug> getFahrzeugListe() {
        return fahrzeugListe;
    }
    
    
}
