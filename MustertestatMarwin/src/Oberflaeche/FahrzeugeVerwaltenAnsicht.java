/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oberflaeche;

import Fachklassen.Fahrzeug;
import Verwaltungsklassen.FahrzeugVerwaltung;
import java.util.Scanner;

/**
 *
 * @author EDV-Beratung
 */
public class FahrzeugeVerwaltenAnsicht {

    private MenueSteuerung menueSteuerung;
    private Scanner scanner = new Scanner(System.in);
    //private FahrzeugVerwaltung fahrzeugVerwaltung = this.menueSteuerung.getFahrzeugVerwaltung();

    public FahrzeugeVerwaltenAnsicht(MenueSteuerung menue) {
        this.menueSteuerung = menue;
    }

    public void fahrzeugAnlegenMenueAufrufen() {
        FahrzeugVerwaltung fahrzeugVerwaltung = this.menueSteuerung.getFahrzeugVerwaltung();
        String bezeichnung = "";
        String sitzplatzAnzahl = "";
        String mietpreisProTag = "";
        byte platzAnzahlByte = 0;
        double preisDouble = 0;

        boolean sitzAnzahlNOk = true;
        boolean preisNOk = true;
        boolean solangeSitzplatzFalsch;

        System.out.println("Bitte machen Sie folgende Angaben:");
        System.out.println("Fahrzeugbezeichnung:\n");
        bezeichnung = this.scanner.next();
        System.out.println("Sitzplatzanzahl:\n");
        while (sitzAnzahlNOk) {

            sitzplatzAnzahl = this.scanner.next();

            solangeSitzplatzFalsch = fahrzeugVerwaltung.pruefeSitzplatzAnzahlOK(sitzplatzAnzahl);

            if (solangeSitzplatzFalsch) {
                sitzAnzahlNOk = false;
            } else {
                System.out.println("Keine Zahl eingegeben. Bitte Eingabe wiederholen:\n");
            }

        }

        System.out.println("Mietpreis pro Tag:\n");

        while (preisNOk) {

            mietpreisProTag = this.scanner.next();

            if (fahrzeugVerwaltung.pruefeMietpreisOK(mietpreisProTag)) {
                preisNOk = false;
            } else {
                System.out.println("Keine Zahl eingegeben. Bitte Eingabe wiederholen:\n");
            }

        }

        fahrzeugVerwaltung.fahrzeugAnlegen(bezeichnung, sitzplatzAnzahl, mietpreisProTag);

        System.out.println("Kunde wurde erfolgreich angelegt!\n");
        this.menueSteuerung.kundenwerwaltungAnzeigen();

    }

    public void fahrzeugListeAnzeigen() {
        FahrzeugVerwaltung fahrzeugVerwaltung = this.menueSteuerung.getFahrzeugVerwaltung();
        if (!fahrzeugVerwaltung.getFahrzeugListe().isEmpty()) {
            for (Fahrzeug fahrzeug : fahrzeugVerwaltung.getFahrzeugListe()) {
                System.out.println("-------------------------------------");
                System.out.println("Identifikationsnummer:  " + fahrzeug.getFahrzeugnummer());
                System.out.println("Bezeichnung:            " + fahrzeug.getBezeichnung());
                System.out.println("Sitzplatzanzahl:        " + fahrzeug.getSitzplatzAnzahl());
                System.out.println("Mietpreis pro Tag:      " + fahrzeug.getMietPreisProTag());
            }
        } else {
            System.out.println("Es wurden noch keine Fahrzeuge gepflegt!");
        }
    }

}
