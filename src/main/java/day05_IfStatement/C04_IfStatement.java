package day05_IfStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        //Kullanici 0 dan kucuk 120den buyuk deger giremeyecek sekilde degerleri aliyor
        //Calisan kadinsa 60 yasindan buyuk oldugunda emekli olur
        //Calisan erkekse 65 yasindan buyuk emekli olur

        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyet giriniz.\nK\nE");
        String cinsiyet = scan.next().toUpperCase();
        System.out.println("Yas giriniz");
        int yas = scan.nextInt();

        if(cinsiyet.equalsIgnoreCase("K")){
            if(yas>=60&&yas<=120){
                System.out.println("Emekli ilabilir");
            } else if (yas<60&&yas>-1) {
                System.out.println("Emekli olamaz");

            }else
                System.out.println("Gecerli bir deger giriniz");

        } else if (cinsiyet.equalsIgnoreCase("E")) {
            if(yas>=65&&yas<=120){
                System.out.println("Emekli ilabilir");
            } else if (yas<65&&yas>-1) {
                System.out.println("Emekli olamaz");

            }else
                System.out.println("Gecerli bir deger giriniz");


        }else if(!(cinsiyet.equalsIgnoreCase("E")||cinsiyet.equalsIgnoreCase("K"))){
            System.out.println("Gecerli bir harf giriniz");
        }else
            System.out.println("Gecerli bir sayi giriniz");




    }
}
