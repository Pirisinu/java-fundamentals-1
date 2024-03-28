package org.experis.snack;

import java.util.Random;

public class RandomStudent {

    public static void main(String[] args) {
        String[] names = {"Giuseppe\tMongelli", "Giulio\tD'Angelo", "Roberto\tBenfini",
                "Salvatore\tBono", "Umberto Maria\tFaenza", "Massimo\tAzzini", "Alessandro\tCingolani",
                "Giuseppe\tGerace", "Alessandro\tMatricardi", "Alessandro\tPirisinu",
                "Salvatore Dario\tTorrisi", "Valerio\tCarbone", "Edoardo\tCicognani", "Gabriel\tD'Amico",
                "Francesco\tCarrara", "Vinicius\tDe Miranda", "Davide\tGila", "Luca\tMasera",
                "Mekki\tOuertani", "Matteo\tPupino", "Alberto\tStizzoli", "Cristian\tUrsino",
                "Luca\tMincuzzi", "Serena\tPeschiaroli"};

        Random randomGenerator = new Random();
        int randomIndex = randomGenerator.nextInt(names.length);
        String selectedName = names[randomIndex];
        System.out.println("Persona selezionata casualmente: " + selectedName);

    }
}