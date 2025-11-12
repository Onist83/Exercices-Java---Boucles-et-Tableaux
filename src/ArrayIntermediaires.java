import java.util.Scanner;

public class ArrayIntermediaires {

//    Exercice 18 -

    public static void createArray(int[] array) {

        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();

        do {
            if (choice == 1) {
                System.out.println("How many numbers do you want to enter?(max10)");
                ();
                affichageMenu();
                choice = scanner.nextInt();
            }
        }


                public static void affichageMenu () {
                    System.out.println("What choice do you want to do?");
                    System.out.println("Choice 1: Create a array");
                    System.out.println("Choice 2: Exit");
//
                }

                public static void array ( int choice){
                     System.out.println("How many numbers do you want to enter?(max10)");
                    Scanner scanner = new Scanner(System.in);
                    int number = scanner.nextInt();

                }
}


            public static void main (String[]args){
                createArray();
            }
        }

