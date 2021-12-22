package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dés {
    private List<Dé> des =new ArrayList<Dé>();
    private List<Dé> desSelectionnees =new ArrayList<Dé>();
    private Combos combos;
    private int compteur = 0;

    public void LancerDes() {
        Scanner input = new Scanner(System.in);
        Random ranNum = new Random();
        int nombrealeatoire;
        for (int i =0; i < 5 ; i++) {
            nombrealeatoire = ranNum.nextInt(6) +1;
            Dé dés = new Dé(nombrealeatoire);
            des.add(dés);
        }
    }

    public void RelancerDes(){
        //Initialisation des variable pour num aleatoire, et la face a changer

        Random ranNum = new Random();
        Scanner input = new Scanner(System.in);
        int nombrealeatoire;
        int numdes;
        boolean check = true;

        //Affichage de la demande
        while (check) {

            if (this.compteur == 2) {
                System.out.println("Tu n'as plus de lancé! ton lancer finale est :");
                afficherdes();
                compteur =0;
                check =false;
            }else {
                System.out.print("\nQuels Dés voulez-vous relancer ? \n" +
                        "------> Ecrivez le numéro du dés à relancer \n" +
                        "------> Ecrivez les numéros 1 par 1 et pour finir ecrivez le chiffre '0' \n" +
                        "-----------------------------------------------------------------------------\n" +
                        "En attente d'une réponse : ");

                int dés = input.nextInt();
                switch (dés) {
                    case 0:
                        System.out.print("Vous avez terminé ce lancer !");
                        this.compteur = compteur + 1;
                        if (compteur != 2){
                            afficherdes();
                        }
                        break;
                    case 1:
                        numdes = 0;
                        nombrealeatoire = ranNum.nextInt(6) + 1;
                        this.des.set(numdes, new Dé(nombrealeatoire));
                        System.out.print("-----------------------------------------------------------------------------\n" +
                                "Vous avez relancé le dés num°1, Voulez vous en relancer un autre ? \n" +
                                "--------Le resultats de vos des relancé vous seront affiché une fois que vous aurez finis le lancé");
                        break;
                    case 2:
                        numdes = 1;
                        nombrealeatoire = ranNum.nextInt(6) + 1;
                        this.des.set(numdes, new Dé(nombrealeatoire));
                        System.out.print("-----------------------------------------------------------------------------\n" +
                                "Vous avez relancé le dés num°2, Voulez vous en relancer un autre ? \n" +
                                "--------Le resultats de vos des relancé vous seront affiché une fois que vous aurez finis le lancé");
                        break;
                    case 3:

                        numdes = 2;
                        nombrealeatoire = ranNum.nextInt(6) + 1;
                        this.des.set(numdes, new Dé(nombrealeatoire));
                        System.out.print("-----------------------------------------------------------------------------\n" +
                                "Vous avez relancé le dés num°3, Voulez vous en relancer un autre ? \n" +
                                "--------Le resultats de vos des relancé vous seront affiché une fois que vous aurez finis le lancé");
                        break;
                    case 4:
                        numdes = 3;
                        nombrealeatoire = ranNum.nextInt(6) + 1;
                        this.des.set(numdes, new Dé(nombrealeatoire));
                        System.out.print("-----------------------------------------------------------------------------\n" +
                                "Vous avez relancé le dés num°4, Voulez vous en relancer un autre ? \n" +
                                "--------Le resultats de vos des relancé vous seront affiché une fois que vous aurez finis le lancé");
                        break;
                    case 5:
                        numdes = 4;
                        nombrealeatoire = ranNum.nextInt(6) + 1;
                        this.des.set(numdes, new Dé(nombrealeatoire));
                        System.out.print("-----------------------------------------------------------------------------\n" +
                                "Vous avez relancé le dés num°5, Voulez vous en relancer un autre ? \n" +
                                "--------Le resultats de vos des relancé vous seront affiché une fois que vous aurez finis le lancé");
                        break;
                    default:
                        System.out.print("La valeurs que vous avez entrez n'est pas correcte, \n " +
                                "Il ne faut pas écrire '1 2 5', Il faut ecrire les numéros 1 par 1");
                        break;
                }
            }
        }
    }

    public void afficherdes(){
        int i;
        switch (compteur) {
            case 0 :
                System.out.print("\n"+"------------------------------"+"\nPour ton 1er lancé tu as obtenu: \n");
                i = 0;
                for (Dé dé : this.des) {
                    i++;
                    System.out.println("Dè n°" + i + " ----------->" + dé.getFace());
                }
                break;
            case 1 :
                System.out.print("\n"+"------------------------------"+"\nPour ton 2ème lancé tu as obtenu: \n");
                i = 0;
                for (Dé dé : this.des) {
                    i++;
                    System.out.println("Dè n°" + i + " ----------->" + dé.getFace());
                }
                break;
            case 2 :
                System.out.print("\n"+"------------------------------"+"\nPour ton derniers lancé tu as obtenu: \n");
                i = 0;
                for (Dé dé : this.des) {
                    i++;
                    System.out.println("Dè n°" + i + " ----------->" + dé.getFace());
                }
                break;
        }
    }

    public void totaldes() {
        /*total = total + nombrealeatoire;*/
    }

    public List<Dé> getDes() {
        return des;
    }

    public void setDes(List<Dé> des) {
        this.des = des;
    }

    public List<Dé> getDesSelectionnees() {
        return desSelectionnees;
    }

    public void setDesSelectionnees(List<Dé> desSelectionnees) {
        this.desSelectionnees = desSelectionnees;
    }
}
