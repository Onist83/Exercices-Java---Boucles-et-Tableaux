public class Combinaisons {

//    Exercice 23 -

  /*  public static int[] arrayCarre (int[] array) {
        int result = 1;
        int[] arrayC = new int[array.length] ;
        int number = 0;
        for(int i : array) {
            result = i*i;
            arrayC[number] = result ;
            number++;
        }   return arrayC;
    }

    public static void main(String[] args) {
        int[] param = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int carre : arrayCarre(param)) {
            System.out.print(carre+ " ");
        }
    }
*/
    //    Exercice 24 -

 /*   public static  String [] counter(int [] nums) {
        int countPair = 0;
        int countImpair = 0;

        for (int number : nums) {
            if (number % 2 == 0) {
                countPair++;
            } else {
                countImpair++;
            }
        }
        String counterPair = "Il y a " + countPair + " nombres pairs";
        String counterImpair = "Il y a " + countImpair + " nombres impairs";

        return new String [] {counterPair, counterImpair};
    }



    public static void main(String[] args) {
        int[] param = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String[] result = counter(param);
        for (String s : result) {
            System.out.println(s);
        }
    }
*/
//    Exercice 25 -

/*    public static void temp(int[] array) {
        int numberMini = array[0];
        int numberMaxi = array[0];
        int average = 0;

        for (int arrayTemp : array) {
            average += arrayTemp;

        }
            average = average / array.length;

        for (int arrayTemp : array) {

            if (arrayTemp<numberMini) {
                numberMini = arrayTemp;
            } if (arrayTemp>numberMaxi) {
                numberMaxi = arrayTemp;
            }
        }
        System.out.println("La moyenne est de " + average);
        System.out.println("La note la plus basse est de " + numberMini);
        System.out.println("La note la plus haute est de " + numberMaxi);
    }


    public static void main(String[] args) {

        int[] param = {10,22,3,15,11,21,7};
        temp(param);
    }

*/

//    Exeercice 26 -

/*     public static void note(int[] arrays) {
          int noteNumber = 0;
          int countMention = 0;
          int countBien = 0;
          int countPassable = 0;
          int countEchec = 0;

          for (int arrayNote : arrays) {
              if (arrayNote >= 16) {
                  countMention++;
              }
              if (arrayNote >= 12 && arrayNote < 16) {
                  countBien++;
              }
              if (arrayNote >= 10 && arrayNote < 12) {
                  countPassable++;
              }
              if (arrayNote < 10) {
                  countEchec++;
              }
          } System.out.println("Il y a " + countMention + " de mention Très Bien");
          System.out.println("Il y a " + countBien + " de mention Bien");
          System.out.println("Il y a " + countPassable + " de mention Passable");
          System.out.println("Il y a " + countEchec + " d'échec");
      }


    public static void main(String[] args) {

        int[] param = {6,8,10,11,12,14,16,18,13,5};
        note(param);
    }
    */
//    Exercice 27 -
    public static void compareArray() {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i<array1.length; i++) {
            if (array1[i]!=array2[i]) {
                System.out.println("Les tableaux sont différents");
                return;
            }
        }
        System.out.println("les tableaux sont égaux");
    }

    public static void main(String[] args) {
        compareArray();
    }
}


// break arrete la boucle; return arrete la methode