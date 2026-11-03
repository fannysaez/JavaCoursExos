# Exercice 9 - Affichage récursif d'un tableau (sans for)

Créer une fonction récursive qui affiche un tableau de string, ou entier (sans for).

```java
// Exercice 9 : affiche les éléments d'un tableau de manière récursive (sans for)
public static void exo9(String[] array, int index) {
    if (index < array.length) {
        System.out.println(array[index]);
        exo9(array, index + 1);
    }
}
```

## Explications
- `index` sert de compteur, comme le ferait un `for`, mais passé en paramètre puisqu'il n'y a pas de boucle ici
- `index < array.length` est la **condition d'arrêt** de la récursivité : sans elle, la fonction s'appellerait indéfiniment et finirait par saturer la mémoire (`StackOverflowError`)
- Tant que l'index est dans les limites du tableau, on affiche l'élément courant (`array[index]`), puis on rappelle `exo9()` avec `index + 1` pour passer à l'élément suivant
- Quand `index` atteint `array.length`, la condition devient fausse, le `if` ne s'exécute plus, et la récursion s'arrête d'elle-même

## Appel depuis main()

```java
String[] tableau = {"pomme", "banane", "kiwi"};
exo9(tableau, 0);
```

On démarre toujours avec `index = 0`, le premier élément du tableau.