package com.company;

public class Dè {

    private int face = 0;
    private EtatDés etat;

    public Dè(int face) {
        this.face= face;
        this.etat = EtatDés.CONSERVE;
    }

    public int getFace() {
        return face;
    }
    public void setFace(int face) {
        this.face = face;
    }

    public EtatDés getEtat() {
        return etat;
    }

    public void setEtat(EtatDés etat) {
        this.etat = etat;
    }
}
