package com.company;

public class Phase {

    private Joueurs joueurs;
    private Combos combos;
    Dés LancerDes = new Dés();

    public Phase(Joueurs joueurs,Combos combos){
        this.joueurs = joueurs;
        /*this.combos = combos;*/
    }
     public void DeroulementPhase(){
        try {
            for (Joueur joueur : joueurs.getJoueurs()) {
                System.out.println("---------------------------- \n");

                System.out.println("C'est à " + joueur.getNom() + " de jouer !!!");
                //Le joueur lance les dés
                this.LancerDes.LancerDes();
                this.LancerDes.afficherdes();
                this.LancerDes.RelancerDes();
                LancerDes.getDes().clear();
            }
        }catch (NullPointerException e){
            System.out.println("ça return null");
        }
    }
}
