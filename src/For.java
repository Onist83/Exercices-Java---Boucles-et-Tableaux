import java.util.Scanner;

/*public class For {

    //Exercice 1 -

  /*  public static void multiple() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        multiple();
    }*/


    //Exercice 2 -

/*    public static void fibonacci() {
// i=8 // 0+1 1+1 2+1 3+2 5+3 8+5 13

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();
        int phrase;

        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("Method Fibonacci");
                    System.out.println("Choice 1: Write a number");
                    phrase = scanner.nextInt();
                    method(phrase);
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;
                default:
                    System.out.println("Choix non valide");
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Exit");
                    run = false;
                    break;
            }
        }
    }

    public static void affichageMenu() {
        System.out.println("What choice do you want to do?");
        System.out.println("Choice 1: Write a number");
        System.out.println("Choice 2: Exit");
    }

    public static void method(int num) {
        int number0 = 0;
        int number1 = 1;
        int i = 1;

        // i = number0 + number1
        // number1 = i
        // number0 = number1
        // i = number1 + number0
        // number1 = i
        // number0 = number1
        System.out.println(number0);
        for (int j = 0;  j< num; j++) {
            System.out.println(i);
            if (i > num) {
                break;
            }
            i = number0 + number1;
            number0 = number1;
            number1 = i;
        }
    }

    public static void main(String[] args) {
        fibonacci();
    } */



    // Exercice 3 -

 /*   public static void multiplication() {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();
        int phrase;

        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("Multiplication");
                    System.out.println("Choice 1: Write a number for a multiplication");
                    phrase = scanner.nextInt();
                    method (phrase);
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;
                default:
                    System.out.println("Choix non valide");
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Exit");
                    run = false;
                    break;
            }
        }

    }

    public static void affichageMenu() {
        System.out.println("What choice do you want to do?");
        System.out.println("Choice 1: Write a number for a multiplication");
        System.out.println("Choice 2: Exit");
    }


     public static void method(int num) {
         //tableau 0 à 10
         int result = 0;
         for (int i = 0; i < 10; i++) {
             System.out.println(num*i);


         }
     }


         public static void main (String[]args){
             multiplication();

         } */




     // Exercice 4 -

   /* public static void factorielle() {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();
        int phrase;

        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("Factorielle");
                    System.out.println("Choice 1: Write a number for a factorielle");
                    phrase = scanner.nextInt();
                    method (phrase);
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


    public static void method(int num) {
        int n = 1;
        for (int i = 1; i <= num; i++) {
            n = n * i; // ou n*= i;
        }   System.out.println(n);
    }



    public static void main (String[]args){
        factorielle();
    }*/


    // Exercice 5 -

  /*  public static void damier () {
        int z = 11;
        int j = 0;
        for (int x = 0; x < z; x++) {
            System.out.println();
            for (int y = 0; y < z; y++) {

                if (j % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("-");
                }   j++;
            }
        }
    }

    public static void main (String[]args){
        damier();
    }
} */






















