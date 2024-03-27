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

        // Il prezzo del tiket al km è 0.21€
        final double tiketPriceKM = 0.21;

        //Dichiaro la variabile discount e gli assegno un valore in base all'età
        int discount = 0;
        if(userAge < 18){
            discount = 20;
        } else if (userAge > 65) {
            discount = 50;
        }
        // Va applicato uno sconto del 20% ai minorenni e un 40% per gli over65
        double discountValue = (kmSelected * tiketPriceKM) * (discount / 100.0);
        double priceTiket = (kmSelected * tiketPriceKM) - discountValue;

        System.out.println(priceTiket);
    }

}
