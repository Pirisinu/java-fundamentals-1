package org.experis.treno;


import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        // Importare lo scanner per ricevere gli input dall'utente
        Scanner scanner = new Scanner(System.in);
        // Chiedere all'utente numero chilometri e la sua età
        int kmSelected, userAge;
        System.out.println("Quanti chilometri devi percorrere?");
        kmSelected = scanner.nextInt();
        System.out.println("Quanti anni hai?");
        userAge = scanner.nextInt();
        System.out.println("km selezionati: " + kmSelected);
        System.out.println("eta : " + userAge);
        // Il prezzo del tiket è 0.21€

        // Va applicato uno sconto del 20% ai minorenni e un 40% per gli over65
    }

}
