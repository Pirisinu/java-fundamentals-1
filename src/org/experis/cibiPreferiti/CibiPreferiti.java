package org.experis.cibiPreferiti;

public class CibiPreferiti {
    public static void main(String[] args) {

        // Inizzializzare l'array
        String[] piattiPreferiti = {
                "Spaghetti alla carbonara",
                "Risotto ai funghi porcini",
                "Lasagne alla bolognese",
                "Penne all'arrabbiata",
                "Gnocchi alla sorrentina",
                "Minestrone",
                "gelato"
        };
        // Lunghezza dell'array
        System.out.println("Lunghezza dell'array: " + piattiPreferiti.length);
        // Cibo in prima posizione dell'array
        System.out.println("Cibo in prima posizione: " + piattiPreferiti[0]);
        // Cibo in ultima posizione
        System.out.println("Cibo in prima posizione: " + piattiPreferiti[piattiPreferiti.length - 1]);
        // Cibo nella metà della classifica
        int middleIndex;
        if((piattiPreferiti.length % 2)!=0){
            middleIndex = (piattiPreferiti.length / 2) + 1;
        }else{
            middleIndex = piattiPreferiti.length / 2;
        }
        System.out.println("Indice dell'elemento mediano: " + middleIndex);
    }
}
