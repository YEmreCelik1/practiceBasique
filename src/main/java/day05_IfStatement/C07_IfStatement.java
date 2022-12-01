package day05_IfStatement;

import java.util.Arrays;
import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan dortgenin kenar uzunluklrini inceleyin ve dikdortgenin kare olup olmadigini inceleyin

        Scanner scan = new Scanner(System.in);
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3= scan.nextInt();
        int kenar4 = scan.nextInt();

        if(kenar1==kenar2&&kenar2==kenar3&&kenar3==kenar4){
            System.out.println("kare");
        }else
            System.out.println("Kare degil");




    }
}
