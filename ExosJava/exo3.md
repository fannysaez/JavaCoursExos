# Exercice 3 - Longueur d'une chaîne de caractères

Affiche la longueur d'une chaîne saisie par l'utilisateur.

```java
public static void exo3() {
    Scanner sc = new Scanner(System.in);
    sc.nextLine(); // vide le retour à la ligne laissé par exo2
    System.out.println("Veuillez saisir une chaîne de caractères :");

    String text = sc.nextLine();
    System.out.println("La longueur de la chaîne est de : " + text.length());
}
```

## Explications
- `sc.nextLine()` lit une ligne complète de texte (contrairement à `nextInt()` qui ne lit qu'un nombre)
- `text.length()` renvoie le nombre de caractères de la chaîne
- Le premier `sc.nextLine()` sert à "vider" le retour à la ligne laissé par un `nextInt()` précédent