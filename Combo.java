package com.company;

public class Combo {

    private String nom;
    private int score = 0;
    private EtatCombo etat;
    private Dé dè;


    public Combo(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public EtatCombo getEtat() {
        return etat;
    }
    public void setEtat(EtatCombo etat) {
        this.etat = etat;
    }

    public Dé getDè() {
        return dè;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
}