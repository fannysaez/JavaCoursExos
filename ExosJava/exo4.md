# Exercice 4 - Somme des éléments d'un tableau

Demande des entiers, les stocke dans un tableau, et affiche leur somme.

```java
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
```

## Explications
- On demande d'abord la taille du tableau, car en Java un tableau a une taille fixe définie à sa création (`new int[taille]`)
- Une boucle `for` remplit le tableau avec les valeurs saisies
- Une seconde boucle `for` additionne tous les éléments du tableau
- `arrayToString()` transforme le tableau en texte lisible, du type `[1, 2, 3]`