# Exercice 3 - Longueur d'une chaîne de caractères

Affiche la longueur d'une chaîne saisie par l'utilisateur.

```java
public static void exo3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Veuillez saisir une chaîne de caractères :");

    String str = sc.nextLine();
    System.out.println("La longueur de la chaîne est de : " + str.length());
}
```

## Explications
- `sc.nextLine()` lit une ligne complète de texte (contrairement à `nextInt()` qui ne lit qu'un nombre)
- `str.length()` renvoie le nombre de caractères de la chaîne

## Remarque

Si cet exercice est appelé juste après un exercice utilisant `sc.nextInt()` (comme `exo2()`), il faut ajouter un `sc.nextLine()` supplémentaire au tout début, pour "vider" le retour à la ligne laissé par le `nextInt()` précédent — sinon la saisie est sautée :

```java
public static void exo3() {
    Scanner sc = new Scanner(System.in);
    sc.nextLine(); // vide le retour à la ligne laissé par un nextInt() précédent
    System.out.println("Veuillez saisir une chaîne de caractères :");

    String str = sc.nextLine();
    System.out.println("La longueur de la chaîne est de : " + str.length());
}
```

⚠️ Attention : ce `nextLine()` supplémentaire ne doit être ajouté **que** si `exo3()` est appelée après une méthode utilisant `nextInt()`. Si elle est appelée seule, il bloque le programme en attendant une saisie, avant même d'afficher le message d'invite.