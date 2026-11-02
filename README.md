# Java Cours - Exercices

Exercices réalisés dans le cadre de mon apprentissage de Java (première formation en Java).

## Prérequis

- JDK 25 (Amazon Corretto, installé via IntelliJ)
- IntelliJ IDEA (Community ou Ultimate)
- Maven (géré automatiquement par IntelliJ)

---

## Structure du projet

```
javaCours/
├── .idea/              # Configuration IntelliJ
├── ExosJava/            # Détail de chaque exercice (code + explications)
│   ├── exo1.md
│   ├── exo2.md
│   ├── exo3.md
│   ├── exo4.md
│   ├── exo5.md
│   ├── exo6.md
│   └── exo7.md
├── images/               # Captures d'écran utilisées dans la documentation
│   └── IDE Java - execution.png
├── src/
│   ├── main/
│   │   └── java/
│   │       └── fr/simplon/
│   │           └── Main.java   # Classe principale avec tous les exercices
│   └── test/
├── .gitignore
└── pom.xml              # Configuration Maven
```
---

## Comment ce projet a été créé

1. Ouverture d'IntelliJ IDEA → **New Project**
2. Choix de **Maven** comme système de build
3. Choix du JDK (IntelliJ propose de le télécharger si besoin, ici JDK 25)
4. Nom du projet : `javaCours`
5. IntelliJ génère automatiquement la structure Maven standard (`src/main/java`, `pom.xml`, etc.)
6. Création du package `fr.simplon` et de la classe `Main`

---

## Comment fonctionne Java

- Le code source (`.java`) est compilé en bytecode (`.class`)
- Le bytecode est exécuté par la JVM, spécifique à chaque système d'exploitation
- C'est ce qui rend Java portable : le même `.class` tourne sur Windows, Linux, Mac

## Comprendre la structure du projet

### `.idea/`
Configuration propre à IntelliJ (apparence, modules, lancement...), générée automatiquement par l'IDE.

### `src/main/java/fr/simplon/`
- `src/main/java` : emplacement standard imposé par Maven pour tout le code source Java
- `fr/simplon` : le **package** de mes classes, qui organise le code et évite les conflits de noms
- Chaque `.` dans un nom de package correspond à un sous-dossier

### `pom.xml`
Fichier de configuration de Maven ("Project Object Model") : nom du projet, version de Java, et dépendances (librairies externes utilisées).

---

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

---

## Table des matières

1. [Somme et moyenne de deux nombres](ExosJava/exo1.md)
2. [Pair ou impair](ExosJava/exo2.md)
3. [Longueur d'une chaîne de caractères](ExosJava/exo3.md)
4. [Somme des éléments d'un tableau](ExosJava/exo4.md)
5. [Simulation d'un lancer de dé](ExosJava/exo5.md)
6. [Comptage des voyelles](ExosJava/exo6.md)
7. [Racine carrée](ExosJava/exo7.md)

---

## Exécution

Le programme peut être lancé de deux façons dans IntelliJ :

1. **Rapide** : clic sur l'icône ▶️ à côté de `public static void main`
2. **Via une configuration de lancement** (Run/Debug Configurations) :
    - **Name** : nom donné à la configuration (ex: "javaCours Main")
    - **Main class** : `fr.simplon.Main` — la classe contenant le point d'entrée du programme
    - **Working directory** : dossier racine du projet
    - **Program arguments** : arguments optionnels passés au programme (non utilisés ici)

![Configuration de lancement](images/IDE%20Java%20-%20execution.png)