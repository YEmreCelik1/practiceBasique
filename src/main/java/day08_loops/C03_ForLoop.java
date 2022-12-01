package day08_loops;

public class C03_ForLoop {
    public static void main(String[] args) {
        /*
    EX :Kullanicidan bir kelime isteyiniz
     alinan kelimenin karakter dizisinin her harfi ve
     bu harfin karakter dizisi içindeki indexini birer satıra yazdirin
             ORNEK
      Bir kelime giriniz:istanbul
       Karakter        Index
         i               0
         s               1
         t               2
         a               3
         n               4
         b               5
         u               6
         l               7
     */
        String str = "istanbul";
        System.out.println("Karakter Index");
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i)+"\t\t\t"+i);
        }

        //question
        /*
            *
           * *
          *   *
         *     *
        *********
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("*".repeat(9));

    }
}
