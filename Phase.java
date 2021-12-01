package com.company;

public class Phase {

    private Joueurs joueurs;
    private Combos combos;

    public Phase(Joueurs joueurs,Combos combos){
        this.joueurs = joueurs;
        /*this.combos = combos;*/
    }
     public void DeroulementPhase(){
        try {
            for (Joueur joueur : joueurs.getJoueurs()) {
                System.out.println("C'est à" + joueur.getNom() + " de jouer");

            }
        }catch (NullPointerException e){
            System.out.println("ça return null");
        }
    }
}
