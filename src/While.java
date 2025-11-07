import java.util.Scanner;

/*    public class While {
    // Exercice 6 -

    /*public static void guess() {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();


        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("Guess my number");
                    System.out.println("Choice 1: Write a number");
                    jeux();
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
        System.out.println("Choice 1: Write a number for guess my number");
        System.out.println("Choice 2: Exit");
    }

    public static void jeux() {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int randomNum = (int) (Math.random() * 101);
        boolean run2 = true;

        while (run2) {

            if (numb > randomNum) {
                    System.out.println("My number is smaller");
                    numb = scanner.nextInt();
                } else if (numb < randomNum) {
                    System.out.println("My number is greater");
                    numb = scanner.nextInt();
                } else {
                    System.out.println("You Win");
                    run2 = false;
                }

        }
    }



    public static void main(String[] args) {
        guess();
        } */


    // Exercice 7 -

  /*  public static void addition() {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();

        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("Addition");
                    System.out.println("Choice 1: Write a number");
                    numbers();
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

        public static void affichageMenu () {
            System.out.println("What choice do you want to do?");
            System.out.println("Choice 1: Write a number");
            System.out.println("Choice 2: Exit");
        }

        // il faut un return
        // addition de chaque nombre
        // resultat final en appuyant sur 0

        public static int numbers () {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            boolean run2 = true;
            int result = 0;

            while (run2) {
                if (number == 0) {                     // result+=i
                    System.out.println("You result is : " + result);
                    run2 = false;
                } else {
                    result += number;
                    System.out.println("You result is : " + result);
                    System.out.println("Enter a new number to add it");
                    number = scanner.nextInt();
                }
            } return result;
        }








        public static void main (String[]args){
            addition();
        } */


    // Exercice 8 -
/*
    public static void compte() {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();

        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("Compte");
                    System.out.println("Choice 1: Write a number");
                    numbs();
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

    public static int numbs() {
        boolean run2 = true;
        Scanner scanner = new Scanner(System.in);
        int numbs = scanner.nextInt();
        int count = 0;

// compteur pour comptabiliser le nombre de chiffres "count" et sa valeur "countValue"
// numbs = count

        while (run2) {
            if (numbs != 0) {
                numbs /= 10 ;
                count++;
                } else {
                run2 = false;
                }
            }   System.out.println("There are " + count + "  numbers.");
                return count ;
        }




    public static void main (String[]args){
        compte();
    }
*/

    // Exercice 9 -

 /*   public static void primeOrNot() {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();

        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("Prime numbers or not");
                    System.out.println("Choice 1: Write a number");
                    prime();
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
        public static void affichageMenu () {
            System.out.println("What choice do you want to do?");
            System.out.println("Choice 1: Write a number");
            System.out.println("Choice 2: Exit");
        }


        public static void prime () {
            Scanner scanner = new Scanner(System.in);
            int numbers = scanner.nextInt();
            boolean run2 = true;

            while (run2) {

                if (numbers == 0) {
                    System.out.println("Pas premier");
                    numbers = scanner.nextInt();

                } else if (numbers == 1) {
                    System.out.println("Peut etre");
                    numbers = scanner.nextInt();

                } else if (numbers == 2) {
                    System.out.println("Pas premier");
                    numbers = scanner.nextInt();

                } else if (numbers == 3) {
                    System.out.println("Peut etre");
                    numbers = scanner.nextInt();

                } else if (numbers == 5) {
                    System.out.println("Peut etre");
                    numbers = scanner.nextInt();

                } else if (numbers == 7) {
                    System.out.println("Peut etre");
                    numbers = scanner.nextInt();

                } else if (numbers % 2 == 0) {
                    System.out.println("Pas premier");
                    numbers = scanner.nextInt();

                } else if (numbers % 3 == 0) {
                    System.out.println("Pas premier");
                    numbers = scanner.nextInt();

                } else if (numbers % 5 == 0) {
                    System.out.println("Pas premier");
                    numbers = scanner.nextInt();

                } else if (numbers % 7 == 0) {
                    System.out.println("Pas premier");

                } else {
                    System.out.println("Peut etre");
                    run2 = false;
                }
            }
        }

                public static void main (String[]args){
                    primeOrNot();
                }
            } */





