# Exercice 1 - Somme et moyenne de deux nombres

Calcule la somme et la moyenne de deux nombres saisis par l'utilisateur.

```java
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
```

## Explications
- `Scanner` permet de récupérer ce que l'utilisateur tape au clavier
- `sc.nextInt()` lit un nombre entier saisi
- La moyenne est castée en `float` (`(float) (a + b) / 2`) pour avoir un résultat avec décimales, sinon la division entre deux `int` tronque la partie décimale