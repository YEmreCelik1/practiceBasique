package day09_nestedforloop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
         /* tac uzunlugu -> 6 iken
            ^
            ^^
            ^^^
            ^^^^
            ^^^^^
            ^^^^^^
            |||
            |||
            |||
            |||
            |||
     */
        
        int feuille= 6;
        int body=5;

        for (int i = 0; i < feuille; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        for (int i = 0; i <body; i++) {
            System.out.println("|||");

        }
    }
}
