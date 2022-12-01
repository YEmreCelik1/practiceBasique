package day05_IfStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //kullanicidan maas teklifi isteyin ve
        //Teklif 20000 uzerinde ise "kabul ediyorum".
        //teklif 10000 ile 20000 arasinda ise "Konusabiliriz"
        //10 000 binin altinda ise maalesef kabul edemem yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Maas teklifi giriniz");
        double maas = scan.nextDouble();
        if(maas>=20000){
            System.out.println("Kabul");
        }else if(maas>=10000){
            System.out.println("Konusabiliriz");
        }else
            System.out.println("maalesef");
    }
}
