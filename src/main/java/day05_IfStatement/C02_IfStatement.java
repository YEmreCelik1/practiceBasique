package day05_IfStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan yasini isteyin
        //65 den buyukse emekli olabilirsin
        // 65 den kucukse emekli olaazsin. ? sene daha calismalisin

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz:");
        double yas = scan.nextDouble();
        if(yas<0){
            System.out.println("Negatif sayi giremezsiniz");
        }else{
            if (yas >= 65) {

                System.out.println("Emekli olabilirsin");
            }else{
                System.out.println("Emekli olamazsin " + (65-yas)+ " sene daha calismalisin");
            }
        }

















    }
}
