package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phase {

    private Joueurs joueurs;
    private Combos combos;
    Dés Des = new Dés();

    public Phase(Joueurs joueurs,Combos combos){
        this.joueurs = joueurs;
        this.combos = combos;
    }
     public void DeroulementPhase(){
         Scanner input = new Scanner(System.in);
        try {
            for (Joueur joueur : joueurs.getJoueurs()) {
                System.out.println("---------------------------- \n");

                System.out.println("C'est à " + joueur.getNom() + " de jouer !!!");

                // Phase ou le joueur joue,il lance les dés
                this.Des.LancerDes();
                this.Des.afficherdes();
                this.Des.RelancerDes();

//                Puisque je suis nul en java j'insere la liste de des dans une autre liste appelé des Scanner (ça me sert de pont)
                for (Dé dé : this.Des.getDes()) {

                    int désScanner = dé.getFace();
                    this.combos.getDesScanner().add(désScanner);
                }

                //Analyse de se qu'il a fait
                this.combos.scanne();

                //Passation à l'autre joueur,
                System.out.println("Appuyer sur 'ENTRER' pour passer au joueur suivant ");
                String pause = input.nextLine();
                //On remet la liste a 0 pour l'autre joueurs
                this.Des.getDes().clear();
                this.combos.getOccurence().clear();
                this.combos.getDesScanner().clear();

            }
        }catch (NullPointerException e){
            System.out.println("ça return null");
        }
    }
}
