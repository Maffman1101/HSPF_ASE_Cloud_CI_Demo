/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachklassen;

/**
 *
 * @author EDV-Beratung
 */
public class Fahrzeug {
    
    private static int idZaehler = 1;
    
    private int fahrzeugnummer = 0;
    private String bezeichnung = "";
    private byte sitzplatzAnzahl = 0;
    private double mietPreisProTag = 0;
    
    private Fahrzeug(){
        
    }
    
    public Fahrzeug(String bezeichnung, byte sitzplatzAnzahl, double mietPreisProTag){
        this.fahrzeugnummer = idZaehler;
        this. bezeichnung = bezeichnung;
        this.sitzplatzAnzahl = sitzplatzAnzahl;
        this. mietPreisProTag = mietPreisProTag;
        idZaehler++;
    }

    public int getFahrzeugnummer() {
        return fahrzeugnummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public byte getSitzplatzAnzahl() {
        return sitzplatzAnzahl;
    }

    public void setSitzplatzAnzahl(byte sitzplatzAnzahl) {
        this.sitzplatzAnzahl = sitzplatzAnzahl;
    }

    public double getMietPreisProTag() {
        return mietPreisProTag;
    }

    public void setMietPreisProTag(double mietPreisProTag) {
        this.mietPreisProTag = mietPreisProTag;
    }
    
    
    
}
