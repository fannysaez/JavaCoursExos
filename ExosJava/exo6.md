# Exercice 6 - Comptage des voyelles

Compte le nombre de voyelles dans une chaîne saisie.

```java
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
```

## Explications
- `toLowerCase()` met le texte en minuscules, pour que "A" et "a" soient traités pareil
- Une boucle parcourt chaque caractère de la chaîne avec `charAt(i)`
- `voyelles.indexOf(lettre)` cherche la lettre dans la chaîne `"aeiouy"` ; si elle n'y est pas, la méthode renvoie `-1`