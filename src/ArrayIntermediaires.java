import java.util.Scanner;

public class ArrayIntermediaires {

//    Exercice 18 -

  /*  public static void createArray() {

        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();

        do {
            if (choice == 1) {
                array();
                affichageMenu();
                choice = scanner.nextInt();
            }
            else if (choice > 2 || choice == 0) {
                System.out.println("Choix non valide");
                affichageMenu();
                choice = scanner.nextInt();
            }
        }  while (choice != 2) ;
        System.out.println("Exit");
    }

                public static void affichageMenu () {
                    System.out.println("What choice do you want to do?");
                    System.out.println("Choice 1: Create a array");
                    System.out.println("Choice 2: Exit");
                }
        //
                public static void array (){
                    System.out.println("How many numbers do you want to enter?(max10)");
                    Scanner scanner = new Scanner(System.in);
                    int choiceLargeur = scanner.nextInt();
                    int[] numbers = new int[choiceLargeur];
//                    scanner choiceLargeur

                    for (int i = 0; i < choiceLargeur; i++) {
                        System.out.println("Type number: ");
                        numbers[i] = scanner.nextInt();
                    }

                    for(int arrayNumb : numbers) {
                        System.out.print(arrayNumb + " ");
                        System.out.println(" ");
                    }

                }




            public static void main (String[]args){
                createArray ();
            }

*/

    // Exercice 19 -
/*
       public static void compareArray (int [] array ) {
           int numb;
           for (int i = 0; i < array.length - 1; i++) {
               for (int j = i + 1; j < array.length; j++) {
                   if (array[i] > array[j]) {
                       int value = array[i];
                       array[i] = array[j];
                       array[j] = value;
                   }
               }
           }
           for (int i = 0; i < array.length; i++) {
               System.out.print(array[i] + " ");
           }
       }


        public static void main(String[] args) {
        int[] numbers = {5,8,25,3,23,15,29};
        compareArray(numbers);
    }
*/

//    Exercice 20 -

 /*   public static void compare(int[] array) {
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();

        do {
            if (choice == 1) {
                System.out.println("Type in the number you are looking for");
                compar();
                affichageMenu();
            } else if (choice > 2 || choice == 0) {
                System.out.println("Choix non valide");
                affichageMenu();
                choice = scanner.nextInt();
            }
        } while (choice != 2);
        System.out.println("Exit");
    }

    public static void affichageMenu() {
        System.out.println("What choice do you want to do?");
        System.out.println("Choice 1: What number are you looking for?");
        System.out.println("Choice 2: Exit");
    }

    public static void compar(int[] array) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (array [i]==  ) {
                System.out.println("The number exists");
            } else {
                System.out.println("The number doesn't exists");
            }

        }

    }


    public static void main(String[] args) {
        int[] myArray = {5, 8, 25, 3, 23, 15, 29};
        compare(myArray);
    }


    // Exercice 21 -

 /*   public static void compte(int[] array) {
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();

        do {
            if (choice == 1) {
                System.out.println("Type in the number you are looking for");
                comparaison();
                affichageMenu();
            } else if (choice > 2 || choice == 0) {
                System.out.println("Choix non valide");
                affichageMenu();
                choice = scanner.nextInt();
            }
        } while (choice != 2);
        System.out.println("Exit");
    }

    public static void affichageMenu() {
        System.out.println("What choice do you want to do?");
        System.out.println("Choice 1: How many times?");
        System.out.println("Choice 2: Exit");
    }


    public static void comparaison (int [] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            if (scanner == ) {

            }
        }
    }






        public static void main (String[]args){
        int[] myArray = {5, 5, 5, 8, 34, 23, 23, 23, 15, 15, 8, 25, 3, 23, 15, 29};
        compte(myArray);
    }
*/

//    Exercice 22 -

  /*  public static void createArray() {
        int choiceLargeur = ;


    }



    public static void main (String[]args) {
        int[] myArr = {3, 4, 1, 5, 10};
        compte(myArr);
    } */
}






