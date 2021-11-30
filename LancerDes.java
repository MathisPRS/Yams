package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LancerDes {
    private List<Dè> des =new ArrayList<Dè>();

    public void LancerDes()
    {
        System.out.print("Entre le nombre de dès que tu veux jeter ");
        Scanner input = new Scanner(System.in);
        int nombredes = input.nextInt();

        Random ranNum = new Random();

        System.out.print("Tu as obtenu: \n");
        int total = 0;
        int nombrealeatoire = 0;

        for (int i = 0; i < nombredes; i++) {

            nombrealeatoire = ranNum.nextInt(6) +1;
            /*total = total + nombrealeatoire;*/
            des.add(new Dè(nombrealeatoire));
            }
            afficherdes();
        System.out.println("Combien de dés veux-tu relancer ?\n" +
                "Attention! Réfléchi bien tu ne pourras pas revenir en arrière");
        int nombrechange = input.nextInt();
    }

    public void afficherdes(){
        int i = 0;
        for (Dè dè : this.des) {
            i++;
            System.out.println("Dè n°"+i+" ----------->"+dè.getFace());
        }

    }

    public void totaldes() {

    }
}
