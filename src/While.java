import java.util.Scanner;

public class While {
    // Exercice 6 -

    public static void guess() {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();
        int phrase;


        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("Guess my number");
                    System.out.println("Choice 1: Write a number");
                    phrase = scanner.nextInt();
                    jeux();
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;

                default:
                    System.out.println("Choix non valide");
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;
            }
        }
    }

    public static void affichageMenu() {
        System.out.println("What choice do you want to do?");
        System.out.println("Choice 1: Write a number for a multiplication");
        System.out.println("Choice 2: Exit");
    }

    public static void jeux() {
        int numb = ;
        int randomNum = (int) (Math.random() * 101);
        if (i > randomNum) {
            System.out.println("My number is smaller");
            numb = scanner.nextInt();
        } else if (i < randomNum) {
            System.out.println("My number is greater");
            numb = scanner.nextInt();
        } else {
            System.out.println("You Win");
        }

    }
}


    public static void main(String[] args) {
        guess();
    }
}
