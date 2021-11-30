package com.company;

import java.util.Random;
import java.util.Scanner;

public class TableauScore {
    public static void main(String args[])
    {
        System.out.print("Entre le nombre de dès que tu veux jeter ");

        Scanner input = new Scanner(System.in);
        int nombredes = input.nextInt();
        Random ranNum = new Random();

        System.out.print("Tu as obtenu: ");
        int total = 0;
        int nombrealeatoire = 0;

        for (int i = 0; i < nombredes; i++) {

            nombrealeatoire = ranNum.nextInt(6) +1;
            total = total + nombrealeatoire;
            System.out.print(nombrealeatoire);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Total: " + total);
        input.close();
    }
}
