package org.experis.snack;

import java.util.Scanner;

public class FoundCharA {
    // CONSEGNA
    // Data una stringa inserita dall’utente contare quante volte appare il carattere ‘a’ (minuscolo o maiuscolo)
    public static void main(String[] args) {
        // Importo lo scanner
        Scanner scan = new Scanner(System.in);

        // Chiedo il testo da scandionare
        System.out.println("Inserisci testo a piacimento");
        // Salvo il testo
        String inputString = scan.nextLine();

        // Chiedo la lettera da cercare
        System.out.println("Inserisci il carattere da cercare");
        // Salvo il carattere
        char charToSearch = scan.next().charAt(0);


        char[] listChar = inputString.toCharArray();
        int counter = 0;
        for (char c : listChar){
            if (c == charToSearch){
                counter++;
            }
        }
        System.out.println("Numero di volte che ho trovalo la lettera a:" + counter  );
    }
}
