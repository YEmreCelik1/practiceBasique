package day07_stringmanipulation;

import java.util.Scanner;

public class C01_StringManipulationConcat {
    public static void main(String[] args) {


        System.out.println("Merhaba"+(15+-20));//Merhaba-5

        //Kullanicidan alinan isim ve soy ismi buyuk harflerle yazdirma

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi ayri ayri giriniz");
        String isim = scan.nextLine().toUpperCase(), soyisim=scan.nextLine().toUpperCase();

        String str = isim.concat(" "+soyisim);
        System.out.println(str);










    }

}
