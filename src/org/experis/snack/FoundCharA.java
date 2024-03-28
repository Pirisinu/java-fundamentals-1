package org.experis.snack;

import java.util.Scanner;

public class FoundCharA {
    // CONSEGNA
    // Data una stringa inserita dall’utente contare quante volte appare il carattere ‘a’ (minuscolo o maiuscolo)
    public static void main(String[] args) {
        // Importo lo scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci testo a piacimento");
        String inputString = scan.nextLine();
        char[] listChar = inputString.toCharArray();
        int counter = 0;
        for (char c : listChar){
            if (c == 'a'){
                counter++;
            }
        }
        System.out.println("Numero di volte che ho trovalo la lettera a:" + counter  );
    }
}
