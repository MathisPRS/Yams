package com.company;


import java.util.*;

public class Joueurs {

    private List<Joueur> joueurs = new ArrayList<Joueur>();
    Scanner scanner = new Scanner(System.in);

    public Joueurs() {
        System.out.println("Entrez le nom des participants, quand vous aurez fini, ecrivez 'stop'");
        boolean check = true;
        int n = 0;
        while (check) {
            n++;
            System.out.println("Joueur n°" + n);
            String Nomjoueurs = scanner.nextLine();
            if (!Nomjoueurs.equals("stop")) {
                joueurs.add(new Joueur(Nomjoueurs));
            } else {
                check = false;
            }
        }
    }

    public void afficherJoueurs() {
        System.out.println("Les Participants pour cette partie sont :\n");
        for (Joueur joueur : this.joueurs) {
            System.out.println("--> "+joueur.getNom());
        }
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    public List<Joueur> getJoueurs() {
        return this.joueurs;
    }

}