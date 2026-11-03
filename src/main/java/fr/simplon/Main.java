package fr.simplon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exo1();
        exo2();
        exo3();
        exo4();
        exo5();
        exo6();
        exo7();
    }

    // Exercice 1 : calcule la somme et la moyenne de deux nombres saisis
    public static void exo1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir 1 chiffre :");
        int a = sc.nextInt();
        System.out.println("Tu as saisi : " + a);

        System.out.println("Veuillez saisir 1 autre chiffre :");
        int b = sc.nextInt();
        System.out.println("Tu as saisi : " + b);

        System.out.println("La somme est de : " + (a + b));

        float avg = (float) (a + b) / 2;
        System.out.println("La moyenne est de : " + avg);
    }

    // Exercice 2 : indique si un nombre saisi est pair ou impair
    public static void exo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier :");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " est pair");
        } else {
            System.out.println(n + " est impair");
        }
    }

    // Exercice 3 : affiche la longueur d'une chaîne de caractères saisie
    public static void exo3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une chaîne de caractères :");

        String str = sc.nextLine();
        System.out.println("La longueur de la chaîne est de : " + str.length());
    }

    // Exercice 4 : met des entiers saisis dans un tableau et affiche leur somme
    public static void exo4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de nombres voulez-vous saisir ?");
        int taille = sc.nextInt();

        int[] tableau = new int[taille];

        for (int i = 0; i < taille; i++) {
            System.out.println("Saisissez le nombre " + (i + 1) + " :");
            tableau[i] = sc.nextInt();
        }

        System.out.println("Le tableau est : " + arrayToString(tableau));

        int somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }

        System.out.println("La somme des éléments du tableau est de : " + somme);
    }

    private static String arrayToString(int[] array) {
        String tmp = "[";

        for (int i : array) {
            tmp += i + ", ";
        }
        tmp = tmp.substring(0, tmp.length() - 2) + "]";

        return tmp;
    }

    // Exercice 5 : simule le lancer d'un dé à six faces
    public static void exo5() {
        int resultat = (int) (Math.random() * 6) + 1;
        System.out.println("Vous avez fait : " + resultat);
    }

// Exercice 6 : compte le nombre de voyelles dans une chaîne saisie
    public static void exo6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une chaîne de caractères :");
        String texte = sc.nextLine().toLowerCase();

        String voyelles = "aeiouy";
        int compteur = 0;

        for (int i = 0; i < texte.length(); i++) {
            char lettre = texte.charAt(i);
            if (voyelles.indexOf(lettre) != -1) {
                compteur++;
            }
        }

        System.out.println("Nombre de voyelles : " + compteur);
    }
    // Exercice 7 : calcule la racine carrée d'un nombre saisi
    public static void exo7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        double nombre = sc.nextDouble();

        double racine = Math.sqrt(nombre);
        System.out.println("La racine carrée est de : " + racine);
    }

}