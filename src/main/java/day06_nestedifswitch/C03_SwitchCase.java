package day06_nestedifswitch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

/*
DERS PROGRAMI

Hangi gun hangi dersin oldugunu gosteren bir program yaziniz

 Pazartesi ve Sali ise: Java

Persembe ve Cuma ise: Selenyum

Carsamba ve Cumartesi ise: SQL

aksi halde: izin gunu=Day Off
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gun = scan.next().toLowerCase();

        switch (gun){
            case "pazartesi": case "sali":
                System.out.println("Java");
                break;
            case "persembe": case "cuma":
                System.out.println("Selenyum");
                break;
            case "carsamba": case "cumartesi":
                System.out.println("SQL");
                break;
            default:
                System.out.println("Izin gunu");
        }












    }
}
