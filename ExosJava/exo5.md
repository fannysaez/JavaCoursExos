# Exercice 5 - Simulation d'un lancer de dé

Simule le lancer d'un dé à six faces.

```java
public static void exo5() {
    int resultat = (int) (Math.random() * 6) + 1;
    System.out.println("Vous avez fait : " + resultat);
}
```

## Explications
- `Math.random()` génère un nombre décimal aléatoire entre 0 (inclus) et 1 (exclu)
- En multipliant par 6 puis en castant en `int`, on obtient un nombre entier entre 0 et 5
- Le `+ 1` décale le résultat pour obtenir une valeur entre 1 et 6