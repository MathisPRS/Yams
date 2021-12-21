package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combos {
    Dés Des = new Dés();
//http://www.codeurjava.com/2015/08/compter-le-nombre-de-repetition-dun-element-dans-arraylist-en-java.html
    //calcule de répétition dans une liste


    public void scanne() {
        System.out.println("Analyse de votre coup ...");
        for (Dé dé : this.Des.getDes()) {
            System.out.println("Dè n°" + " ----------->" + dé.getFace());
            System.out.println("22222222");

        }
        System.out.println("Vous avez fait :");

    }
    public void Un() {

    }
    public void Deux() {

    }
    public void Trois() {

    }
    public void Quatre() {

    }
    public void Cinq() {

    }
    public void Six() {

    }
    public void Brelan() {
//Somme des 3 dés
    }
    public void Carre() {
//Somme des 4 dés
    }
    public void Full() {
//25pts
    }
    public void PetiteSuite() {
//4 a la suite = 20 pts
    }
    public void GrandeSuite() {
//5 a la suite = 40pts
    }

    public void Chance() {
//somme de tout les dés
    }
    public void Yams() {

    }
    public void PartieInf() {
//Si + de 63pts alors +35
    }
    public void PartieSupp() {
//30pts+( pointsactuel - 70pts) = score finale
    }




}
