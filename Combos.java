package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//http://www.codeurjava.com/2015/08/compter-le-nombre-de-repetition-dun-element-dans-arraylist-en-java.html
//calcule de répétition dans une liste
public class Combos {
    private List<Integer> DesScanner =new ArrayList<Integer>();
    private List<Integer> Occurence =new ArrayList<Integer>();
    private HashMap<Integer,Integer> OccurenceDes = new HashMap();

    private List<Combo> combo =new ArrayList<Combo>();
    private int score;
    private int CompteOccurence;

    Dés Des = new Dés();


    public void scanne() {
        System.out.println("Analyse de votre coup ...");

        //On mets en place une liste pour récupérer les occurences.
        int i=0;
        int u=0;
        do{
            i++;
            this.CompteOccurence = Collections.frequency(this.DesScanner, i);
            System.out.println("Le nombre de "+ i +": " + this.CompteOccurence);
            Occurence.add(5);
            Occurence.set(u,this.CompteOccurence);
            u++;
        }while(i<6);
        int Nombre_de_1 = this.Occurence.get(0);
        int Nombre_de_2 = this.Occurence.get(1);
        int Nombre_de_3 = this.Occurence.get(2);
        int Nombre_de_4 = this.Occurence.get(3);
        int Nombre_de_5 = this.Occurence.get(4);
        int Nombre_de_6 = this.Occurence.get(5);

        System.out.println("Vous avez la possiblité de faire :");

    }

    //Ces fonctions vont servir pour l'attribue des points
    public void Un() {
    //total du chiffre
    }
    public void Deux() {
    //total du chiffre

    }
    public void Trois() {
        //total du chiffre

    }
    public void Quatre() {
        //total du chiffre

    }
    public void Cinq() {
        //total du chiffre

    }
    public void Six() {
        //total du chiffre

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

    public List<Combo> getCombo() {return combo;}
    public void setCombo(List<Combo> combo) {this.combo = combo;}

    public List<Integer> getDesScanner() {
        return DesScanner;
    }
    public void setDesScanner(List<Integer> desScanner) {
        DesScanner = desScanner;
    }

    public List<Integer> getOccurence() {
        return Occurence;
    }

    public void setOccurence(List<Integer> occurence) {
        Occurence = occurence;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
