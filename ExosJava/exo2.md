# Exercice 2 - Pair ou impair

Indique si un nombre entier saisi est pair ou impair.

```java
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
```

## Explications
- `n % 2` calcule le reste de la division de `n` par 2
- Si le reste vaut `0`, le nombre est pair, sinon il est impair