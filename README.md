# Java Cours - Exercices

Exercices réalisés dans le cadre de mon apprentissage de Java (première formation en Java).

## Prérequis

- JDK 25 (Amazon Corretto, installé via IntelliJ)
- IntelliJ IDEA (Community ou Ultimate)
- Maven (géré automatiquement par IntelliJ)

## Structure du projet

```
javaCours/
├── .idea/              # Configuration IntelliJ
├── src/
│   ├── main/
│   │   └── java/
│   │       └── fr/simplon/
│   │           └── Main.java   # Classe principale avec tous les exercices
│   └── test/
├── .gitignore
└── pom.xml              # Configuration Maven
```

## Comment ce projet a été créé

1. Ouverture d'IntelliJ IDEA → **New Project**
2. Choix de **Maven** comme système de build
3. Choix du JDK (IntelliJ propose de le télécharger si besoin, ici JDK 25)
4. Nom du projet : `javaCours`
5. IntelliJ génère automatiquement la structure Maven standard (`src/main/java`, `pom.xml`, etc.)
6. Création du package `fr.simplon` et de la classe `Main`

## Exercices réalisés

| Exercice | Description |
|----------|-------------|
| exo1 | Somme et moyenne de deux nombres |
| exo2 | Pair ou impair |
| exo3 | Longueur d'une chaîne de caractères |
| exo4 | Somme des éléments d'un tableau |
| exo5 | Simulation d'un lancer de dé |
| exo6 | Comptage des voyelles dans une chaîne |
| exo7 | Racine carrée d'un nombre |

## Exécution

Lancer la classe `Main.java` depuis IntelliJ (clic sur l'icône ▶️ à côté de `public static void main`).