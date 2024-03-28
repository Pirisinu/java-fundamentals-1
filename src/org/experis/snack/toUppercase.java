package org.experis.snack;

import java.util.Arrays;

public class toUppercase {
    public static void main(String[] args) {
        //dato un array di stringhe, trasformate tutti gli elementi dell’array in upper case: si deve fare con un unico ciclo for sull’array.

        String[] testo = {
                "trasformate",
                "tutti",
                "gli",
                "elementi",
                "dell",
                "’",
                "array",
                "in",
                "upper",
                "case"};
        System.out.println("Array preformattato: " + Arrays.toString(testo));

        for (int i = 0; i < testo.length; i++) {
            testo[i] = testo[i].toUpperCase();
        }

        System.out.println("Array formattato: " + Arrays.toString(testo));

        System.out.print("Sotto forma di testo: ");
        for (String parola : testo){
            System.out.print(parola);
            System.out.print(" ");
        }
    }
}
