package day03_IfStatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {
        //kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz islemden biri ile yapiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Choisissez une option..\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication");
       int option = scan.nextInt();
        System.out.println("Entrez 2 nombre");
        double s1= scan.nextDouble(), s2= scan.nextDouble();

        if(option==1){
            System.out.println(s1+s2);
        } else if (option==2){
            System.out.println(s1-s2);
        } else if (option ==3) {
            System.out.println(s1/s2);
        }
        else
            System.out.println(s1*s2);
    }
}
