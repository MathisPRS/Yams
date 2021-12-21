package com.company;

public class Joueur {

    private String nom;
    private int score = 0;
    private int compteur = 0;
    private EtatJoueur etat;



    public Joueur(String nom){
        this.nom = nom;
        this.etat = EtatJoueur.EN_ATTENTE;
        this.score = 0;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public EtatJoueur getEtat() {
        return etat;
    }
    public void setEtat(EtatJoueur etat) {
        this.etat = etat;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public int getCompteur() {
        return compteur;
    }
    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
}
