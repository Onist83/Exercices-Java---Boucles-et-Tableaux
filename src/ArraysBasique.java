import java.util.ArrayList;

//public class ArraysBasique {

   /* // Exercice 13-
// 2,5,3,8,1
    public static int[] newArray(int[] arr) {

        int[] resultArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
           System.out.print(" " + arr[i]);
       }

        for (int i = 0; i < arr.length; i++) {
            resultArray[i] = arr[i] * 2;
       }
           return resultArray;
       }


   public static void main(String[] args) {

        int []monTableau = {2,5,3,8,1};
        int[] result = newArray(monTableau);

       System.out.println();
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

*/

    // Exercice 14 -

    /*public static void array1() {


        //int[] array = {2, 5, 3, 8, 1};    // Tableau en parametre et valeur de retour
        //public static int additionner(int a, int b) {
        //return a + b;


            }*/
/*
    public static int multiplication(int[] tableaux) {
        int result = 1;
        for (int i = 0; i < tableaux.length; i++) {
            result = tableaux[i]*result;
        }
        return result;
    }



        public static void main(String[] args) {
             int []monTableau = {2,5,3,8,1};
             int result = multiplication(monTableau);
            System.out.println(result);
            //array1();
        } */


 /*    // Exercice 15 -

    public static void compare(int[] arr) {
        int petit = 1;
        int index = 0;
        for ( int i=0; i < arr.length; i++) {
            if (petit > arr[i]) {
                petit = arr[i];
                index = i;
                System.out.println(petit);
            }
        }
        System.out.println(index);
        System.out.println(petit);

    }
            public static void main(String[] args) {
                    int []monTableau = {2,-6,3,-8,1};
                    compare(monTableau);
                }
*/

    // Exercice 16 -

 /*       public static void differenceNotes (double[] array) {
            double result1 = 0;

            for ( int i=0; i < array.length; i++) {
                result1 = result1 + array[i];

            }
            result1= result1/array.length;
            System.out.println(result1);


//            int n = result1-array[i];   // boucle pour faire la différence entre moyenne et note
            for (double difNote : array   ) {                          // for each à faire;
                double n = difNote-result1;
                System.out.println(n);
            }
        }

            public static void main(String[] args) {
              double[] notes = {12,15,10,18,15};
                differenceNotes(notes);
            }
*/

        
        // Exercice 17 -

/*    public static void compare (int[] array) {

//        int result = 0;
//
//
//        for ( int i=0; i <= array.length; i++) {
//             if (result >= i ) {
//                System.out.println("Il y a " + result +" de nombres positifs");
//            }    else if (result == i) {
//                System.out.println("Il y a " + result +" de nombres nuls");
//            } else{
//                System.out.println("Il y a " + result +" de nombres négatifs");
//            }
//        }

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int number : array) {
            //            System.out.println(number);

            if (number > 0 ) {
                count1++;

            } else if (number < 0) {
                count2++;

            } else {
                count3++;

            }
        }       System.out.println("Il y a " + count3 +" de nombres nuls");
                System.out.println("Il y a " + count2 +" de nombres négatifs");
                System.out.println("Il y a " + count1 +" de nombres positifs");
    }

    public static void main(String[] args) {
        int[] numbers = {12,15,-10,-18,0,3,4,-7,-6,0};
        compare(numbers);
    }
 }*/