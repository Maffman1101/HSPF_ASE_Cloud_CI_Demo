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
public class Kunde {
    
    private static int idZaehler = 1;
    
    private int kundenNummer = 0;
    private String vorname = "";
    private String nachname = "";
    private String eMail = "";
    
    private Kunde(){
        
    }
    
    public Kunde(String vorname, String nachname, String eMail){
        this.kundenNummer = idZaehler;
        this. vorname = vorname;
        this.nachname = nachname;
        this.eMail = eMail;
        idZaehler++;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    
    
}
