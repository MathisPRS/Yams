package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LancerDes {
    private List<Dè> des =new ArrayList<Dè>();

    public void LancerDes()
    {

        Scanner input = new Scanner(System.in);
        int nombredes = input.nextInt();

        Random ranNum = new Random();

        int total = 0;
        int nombrealeatoire;

        for (int i = 0; i < nombredes; i++) {

            nombrealeatoire = ranNum.nextInt(6) +1;

            des.add(new Dè(nombrealeatoire));
            }
            afficherdes();
        }

    public void RelancerDes(){

        for (int i = 0; i < 5; i++)
        System.out.print("Quels Dés voulez-vous relancer ? \n" +
                "------> Ecrivez le numéro du dés à relancer \n" +
                "------> Ecrivez les numéros 1 par 1 et pour finir ecrivez le chiffre '0' ");
        Scanner input = new Scanner(System.in);
        int dés = input.nextInt();

        switch (dés){
            case 0:
                LancerDes();
                break;
            case 1:
                 = 1;
                this.des.set(0,face);
                break;
            case 2:
                // instructions à exécuter si expression est égale à valeur3
                break;
            case 3:
                // instructions à exécuter si expression est égale à valeur3
                break;
            case 4:
                // instructions à exécuter si expression est égale à valeur3
                break;
            case 5:
                // instructions à exécuter si expression est égale à valeur3
                break;
            default:
                System.out.print("La valeurs que vous avez entrez n'est pas correcte, \n " +
                        "Il ne faut pas écrire '1 2 5', Il faut ecrire les numéros 1 par 1");
                break;
        }
    }


    public void afficherdes(){
        System.out.print("Tu as obtenu: \n");
        int i = 0;
        for (Dè dè : this.des) {
            i++;
            System.out.println("Dè n°"+i+" ----------->"+dè.getFace());
        }
    }

    public void totaldes() {
        /*total = total + nombrealeatoire;*/
    }
}
