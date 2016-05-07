/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oberflaeche;

import java.util.Scanner;

/**
 *
 * @author EDV-Beratung
 */
public class KundenVerwaltenAnsicht {

    private MenueSteuerung menueSteuerung;
    private Scanner scanner = new Scanner(System.in);

    public KundenVerwaltenAnsicht(MenueSteuerung menue) {
        this.menueSteuerung = menue;
    }

    public void kundeAnlegenMenueAufrufen() {
        String vorname = "";
        String nachname = "";
        String eMail = "";
        
        System.out.println("Bitte machen Sie folgende Angaben:");
        System.out.println("Vorname:\n");
        vorname = this.scanner.next();
        System.out.println("Nachname:\n");
        nachname = this.scanner.next();
        System.out.println("Email:\n");
        eMail = this.scanner.next();
        
        
            System.out.println("Kunde wurde erfolgreich angelegt!\n");
            menueSteuerung.kundenwerwaltungAnzeigen();
        

    }
}
