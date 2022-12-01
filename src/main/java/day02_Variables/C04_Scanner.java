package day02_Variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdirma

        String str = "1234";
        int ilk=Integer.valueOf(str.substring(0,1));
        int son = Integer.valueOf(str.substring(3,4));
        System.out.println(ilk+son);

        //Kullanicidan 3 basamakli sayi alip sayinin basamaklarini birler,onlar ve yuzler seklinde yazdr.
        int s = 123;
        int birler=s%10;
        int onlar = (s/10)%10;
        int yuzler=((s/10)/10)%10;
        System.out.println(birler);
        System.out.println(onlar);
        System.out.println(yuzler);


    }
}
