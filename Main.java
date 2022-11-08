import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int scoreJoueur = 0;
        int scoreIA = 0;

        while (scoreJoueur !=3 && scoreIA !=3) {

            switch (round(choixJoueur(), random.nextInt(3)+1)){
                case 1:
                    scoreJoueur++;
                    break;
                case 2:
                    scoreIA++;
                    break;
            }

            System.out.println("Score joueur: "+scoreJoueur+" ,score IA : " +scoreIA);
        }
    }
    public static int choixJoueur() {
        Scanner input = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1 pour Pierre");
            System.out.println("2 pour Papier");
            System.out.println("3 pour Ciseaux");
            System.out.println("Choisissez :");
            choix=input.nextInt();
        } while (choix>3||choix<1);
        return choix;
    }

    public  static String selectionJoueur (int choix) {
        String object=null;

        switch (choix) {
            case 1:
                object="Pierre";
                break;
            case 2:
                object="Papier";
                break;
            case 3:
                object="Ciseaux";
                break;
        }
        return object;
    }
    public static int round (int choixJoueur, int choixIA) {
        int result = 0;
        System.out.println("Votre choix est : " +selectionJoueur(choixJoueur)+ "le choix de l'IA est : " +selectionJoueur(choixIA));
        if (choixJoueur==1 && choixIA==3 || choixJoueur==2 && choixIA== 1 || choixJoueur== 3 && choixIA==2 ){
            System.out.println("Tu as gagné ce round !");
            result = 1;
        } else if (choixJoueur==choixIA) {
            System.out.println("Egalité !");
            result = 0;
        } else {
            System.out.println("Tu as perdu ce round !");
            result = 2;
        }
        return result;
    }
}
