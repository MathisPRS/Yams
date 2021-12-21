package com.company;

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

                //Phase ou le joueur joue,il lance les dés
                this.Des.LancerDes();
                this.Des.afficherdes();
                this.Des.RelancerDes();
                this.combos.scanne();
                //Analyse de se qu'il a fait


                //passation à l'autre joueur
                //On remet la liste a 0 pour l'autre joueurs
                Des.getDes().clear();
                System.out.println("Appuyer sur 'ENTRER' pour passer au joueur suivant ");
                String pause = input.nextLine();
            }
        }catch (NullPointerException e){
            System.out.println("ça return null");
        }
    }
}
