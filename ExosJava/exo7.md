# Exercice 7 - Racine carrée

Calcule la racine carrée d'un nombre saisi.

```java
public static void exo7() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Veuillez saisir un nombre :");
    double nombre = sc.nextDouble();

    double racine = Math.sqrt(nombre);
    System.out.println("La racine carrée est de : " + racine);
}
```

## Explications
- `sc.nextDouble()` lit un nombre décimal saisi
- `Math.sqrt()` calcule la racine carrée et renvoie un `double`