package com.company;

public class Main {
    public static void main(String args[])
    {
        Joueurs joueurs = new Joueurs();
        Dés dés = new Dés();
        Combos combos = new Combos();
        Phase phase = new Phase(joueurs, combos);

        //Pour ajouter des joueur
        joueurs.Joueurs();

        joueurs.afficherJoueurs();

        //Pour Commencer le jeux (phase)
        phase.DeroulementPhase();

    }
}
