package day05_IfStatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {

    //kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz.");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if(sayi1<sayi2){
            System.out.println(sayi1);
        }else if(sayi1>sayi2){
            System.out.println(sayi2);
        }else
            System.out.println("Sayi1=Sayi2");

        //2.yol

        System.out.println(sayi1==sayi2?"Sayi1==sayi2":sayi1>sayi2?sayi2:sayi1);













    }
}
