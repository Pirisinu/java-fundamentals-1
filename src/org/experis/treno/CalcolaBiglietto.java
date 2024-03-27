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

        // Il prezzo del tiket è 0.21€
        final double tiketPrice = 0.21;

        //Dichiaro la variabile discount e gli assegno un valore in base all'età
        int discount;
        if(userAge < 18){
            discount = 20;
        } else if (userAge >65) {
            discount = 20;
        }
        // Va applicato uno sconto del 20% ai minorenni e un 40% per gli over65

    }

}
