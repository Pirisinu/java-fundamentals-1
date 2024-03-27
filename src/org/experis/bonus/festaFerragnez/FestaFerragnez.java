package org.experis.bonus.festaFerragnez;

import java.util.Scanner;

public class FestaFerragnez {
    public static void main(String[] args) {
        // Inizzializzare l'array con i nomi degli inviati
        String[] invitedList = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"};

        // Importo lo scanner per ricevere in seguito il nome dell'utente
        Scanner scanner = new Scanner(System.in);

        //Chideo il nome all'utente
        System.out.println("Inserisci il tuo nome");
        String userName = scanner.nextLine();
        System.out.println(userName);

        // Se il suo nome è presente puo accedere alla lista altrimenti no.
        boolean isInvited = false;
        for (String guest : invitedList) {
            if (userName.equalsIgnoreCase(guest)) {
                isInvited = true;
                break;
            }
        }
        String message = isInvited ? "Puoi entrare nella festa." : "Non puoi entrare.";

        System.out.println(message);
    }
}
