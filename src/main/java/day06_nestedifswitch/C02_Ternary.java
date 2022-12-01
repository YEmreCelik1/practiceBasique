package day06_nestedifswitch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

/*
Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
'A'  ->  "Cok Basarili"
'B'  ->  "Basarili"
'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
            yazdiriniz.Nested Ternary ile cozunuz
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Notu giriniz");
        String str = scan.next();

        String sonuc = str.equalsIgnoreCase("A")? ("Cok basarili"):(str.equalsIgnoreCase("B")?("Basarili"):(str.equalsIgnoreCase("C")?("Orta"):("Digerleri")));
















    }
}
