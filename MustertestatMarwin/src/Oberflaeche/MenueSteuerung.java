/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oberflaeche;

import Verwaltungsklassen.FahrzeugVerwaltung;
import Verwaltungsklassen.Kundenverwaltung;
import java.util.Scanner;


/**
 *
 * @author EDV-Beratung
 */
public class MenueSteuerung {

    private FahrzeugVerwaltung fahrzeugVerwaltung;
    private Kundenverwaltung kundenVerwaltung;
    private KundenVerwaltenAnsicht kundenVerwaltenAnsicht = new KundenVerwaltenAnsicht(this);
    private FahrzeugeVerwaltenAnsicht fahrzeugVerwaltenAnsicht = new FahrzeugeVerwaltenAnsicht(this);
    private Scanner scanner = new Scanner(System.in);

    public MenueSteuerung() {
        this.fahrzeugVerwaltung = new FahrzeugVerwaltung();
        this.kundenVerwaltung = new Kundenverwaltung();
        
    }

    public void hauptmenueAnzeigen() {

        boolean laufeweiter = true;
        String eingabeBenutzer = "";
        int uebersetzteBenutzereingabe;

        System.out.println("Stammdatenverwaltung 1.0 Copyright \u00a9 Marwin Shraideh, MNR 123456");
        System.out.println("Hauptmen\u00fc:");
        System.out.println("Bitte w\u00e4hlen Sie:");
        System.out.println("");

        while (laufeweiter) {
            System.out.println("Kunden      verwalten   1");
            System.out.println("Fahrzeuge   verwalten   2");
            System.out.println("Programm beenden        0\n");

            uebersetzteBenutzereingabe = this.pruefeEingabeBenutzer(this.scanner.next(), "haupt");

            switch (uebersetzteBenutzereingabe) {

                case 0:
                    System.out.println("Programm wurde durch den Benutzer beendet!");
                    System.out.println("x_x YOU MONSTER x_x");
                    System.exit(0);
                    break;
                case 1:
                    //laufeweiter = false;
                    System.out.println("-----------------------Kundenverwaltung-----------------------------------------------");
                    this.kundenwerwaltungAnzeigen();
                    break;
                case 2:
                    //laufeweiter = false;
                    System.out.println("----------------------Fahrzeugverwaltung-----------------------------------------------");
                    this.fahrzeugverwaltungAnzeigen();
                    break;
                case 99099:
                    System.out.println("Sie haben keine Zahl eingegeben! Bitte nur 0, 1, oder 2 ausw\u00e4hlen!\n\n");
                    break;
                case 88099:
                    System.out.println("Sie haben keine der zur Auswahl stehenden Zahlen ausgewählt!\nBitte nur 0, 1 oder 2 ausw\u00e4hlen!\n\n");
                    break;

            }

        }
    }

    public void fahrzeugverwaltungAnzeigen() {
        boolean laufeweiter = true;
        String eingabeBenutzer = "";
        int uebersetzteBenutzereingabe;

        System.out.println("Bitte w\u00e4hlen Sie eine Nummer:");

        while (laufeweiter) {

            System.out.println("Fahrzeug      anlegen       1");
            System.out.println("Fahrzeug      \u00e4ndern   2");
            System.out.println("Fahrzeug      l\u00f6schen  3");
            System.out.println("Fahrzeugliste anzeigen      4");
            System.out.println("Zur\u00fcck ins Hauptmen\u00fc      0\n");

            uebersetzteBenutzereingabe = this.pruefeEingabeBenutzer(this.scanner.next(), "fahr");

            switch (uebersetzteBenutzereingabe) {

                case 0:
                    this.hauptmenueAnzeigen();
                    break;
                case 1:
                    //laufeweiter = false;
                    System.out.println("-----------------------Fahrzeug anlegen-----------------------------------------------");
                    this.fahrzeugVerwaltenAnsicht.fahrzeugAnlegenMenueAufrufen();
                    break;
                case 2:
                    //laufeweiter = false;
                    System.out.println("----------------------Fahrzeug \u00e4ndern-----------------------------------------------");
                    break;
                case 3:
                    //laufeweiter = false;
                    System.out.println("-----------------------Fahrzeug l\u00f6schen-----------------------------------------------");
                    break;
                case 4:
                    //laufeweiter = false;
                    System.out.println("-----------------------Fahrzeugliste anzeigen-----------------------------------------------");
                    this.fahrzeugVerwaltenAnsicht.fahrzeugListeAnzeigen();
                    break;
                case 99099:
                    System.out.println("Sie haben keine Zahl eingegeben! Bitte nur 0, 1, 2, 3 oder 4 ausw\u00e4hlen!\n\n");
                    break;
                case 88099:
                    System.out.println("Sie haben keine der zur Auswahl stehenden Zahlen ausgewählt!\nBitte nur 0, 1, 2, 3 oder 4 ausw\u00e4hlen!\n\n");
                    break;

            }

        }
    }

    public void kundenwerwaltungAnzeigen() {

        boolean laufeweiter = true;
        String eingabeBenutzer = "";
        int uebersetzteBenutzereingabe;

        System.out.println("Bitte w\u00e4hlen Sie eine Nummer:");

        while (laufeweiter) {

            System.out.println("Kunden      anlegen     1");
            System.out.println("Kunden      \u00e4ndern     2");
            System.out.println("Kunden      l\u00f6schen     3");
            System.out.println("Kundenliste anzeigen    4");
            System.out.println("Zur\u00fcck ins Hauptmen\u00fc      0\n");

            uebersetzteBenutzereingabe = this.pruefeEingabeBenutzer(this.scanner.next(), "kunde");

            switch (uebersetzteBenutzereingabe) {

                case 0:
                    this.hauptmenueAnzeigen();
                    break;
                case 1:
                    //laufeweiter = false;
                    System.out.println("-----------------------Kunde anlegen-----------------------------------------------");
                    break;
                case 2:
                    //laufeweiter = false;
                    System.out.println("----------------------Kunde \u00e4ndern-----------------------------------------------");
                    break;
                case 3:
                    //laufeweiter = false;
                    System.out.println("-----------------------Kunde l\u00f6schen-----------------------------------------------");
                    break;
                case 4:
                    //laufeweiter = false;
                    System.out.println("-----------------------Kundenliste anzeigen-----------------------------------------------");
                    break;
                case 99099:
                    System.out.println("Sie haben keine Zahl eingegeben! Bitte nur 0, 1, 2, 3 oder 4 ausw\u00e4hlen!\n\n");
                    break;
                case 88099:
                    System.out.println("Sie haben keine der zur Auswahl stehenden Zahlen ausgewählt!\nBitte nur 0, 1, 2, 3 oder 4 ausw\u00e4hlen!\n\n");
                    break;

            }

        }
    }

    public FahrzeugVerwaltung getFahrzeugVerwaltung() {
        return fahrzeugVerwaltung;
    }

    public Kundenverwaltung getKundenVerwaltung() {
        return kundenVerwaltung;
    }
    
    
    
//     public void universalVerwaltungAnzeigen(String aufzurufendesMenue) {
//
//        boolean laufeweiter = true;
//        String eingabeBenutzer = "";
//        int uebersetzteBenutzereingabe;
//        String platzhalterAusgabe = "";
//        
//        if (aufzurufendesMenue.equals("fahr")){
//            platzhalterAusgabe = "Fahrzeug";
//        }
//        if (aufzurufendesMenue.equals("kunde")){
//            platzhalterAusgabe = "Kunden";
//        }
//
//        System.out.println("Bitte w\u00e4hlen Sie eine Nummer:");
//
//        while (laufeweiter) {
//
//            System.out.println(platzhalterAusgabe + "      anlegen     1");
//            System.out.println(platzhalterAusgabe + "      \u00e4ndern     2");
//            System.out.println(platzhalterAusgabe + "      l\u00f6schen     3");
//            System.out.println(platzhalterAusgabe + "liste anzeigen    4");
//            System.out.println("Zur\u00fcck ins Hauptmen\u00fc      0\n");
//
//            if(aufzurufendesMenue.equals("kunde")){
//            uebersetzteBenutzereingabe = this.pruefeEingabeBenutzer(this.scanner.next(), "kunde");
//            }
//            if(aufzurufendesMenue.equals("fahr")){
//                uebersetzteBenutzereingabe = this.pruefeEingabeBenutzer(this.scanner.next(), "fahr");
//            }
//
//            switch (uebersetzteBenutzereingabe) {
//
//                case 0:
//                    this.hauptmenueAnzeigen();
//                    break;
//                case 1:
//                    //laufeweiter = false;
//                    System.out.println("-----------------------Kunde anlegen-----------------------------------------------");
//                    break;
//                case 2:
//                    //laufeweiter = false;
//                    System.out.println("----------------------Kunde \u00e4ndern-----------------------------------------------");
//                    break;
//                case 3:
//                    //laufeweiter = false;
//                    System.out.println("-----------------------Kunde l\u00f6schen-----------------------------------------------");
//                    break;
//                case 4:
//                    //laufeweiter = false;
//                    System.out.println("-----------------------Kundenliste anzeigen-----------------------------------------------");
//                    break;
//                case 99099:
//                    System.out.println("Sie haben keine Zahl eingegeben! Bitte nur 0, 1, 2, 3 oder 4 ausw\u00e4hlen!\n\n");
//                    break;
//                case 88099:
//                    System.out.println("Sie haben keine der zur Auswahl stehenden Zahlen ausgewählt!\nBitte nur 0, 1, 2, 3 oder 4 ausw\u00e4hlen!\n\n");
//                    break;
//
//            }
//
//        }
//    }

    public int pruefeEingabeBenutzer(String eingabeBenutzer, String ursprung) {
        int auswahlZahl = 0;

        try {
            auswahlZahl = Integer.parseInt(eingabeBenutzer);
        } catch (NumberFormatException e) {
            return 99099; // wenn keine Zahl eingegeben wurde
        }

        if (ursprung.equals("haupt")) {
            if (auswahlZahl >= 0 && 2 >= auswahlZahl) {
                return auswahlZahl; // --> EIngabe korrekt
            }
        }

        if (ursprung.equals("kunde")) {
            if (auswahlZahl >= 0 && 4 >= auswahlZahl) {
                return auswahlZahl; //  --> EIngabe korrekt
            }
        }

        if (ursprung.equals("fahr")) {
            if (auswahlZahl >= 0 && 4 >= auswahlZahl) {
                return auswahlZahl; //  --> EIngabe korrekt
            }
        }

        return 88099; // wenn eine andere Zahl als 0 1 2 eingegeben wurde
    }

}
