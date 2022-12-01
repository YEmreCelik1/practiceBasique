package day01_variables;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ad,soyad,javayi sevdinizmi bilgilerini aliniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String prenom=JOptionPane.showInputDialog("Hosgeldiniz");
        JOptionPane.showMessageDialog(null,"Java sinifina hosgeldiniz"+prenom,"Java",JOptionPane.INFORMATION_MESSAGE);
        System.out.println(prenom);
        System.out.println("Soyadinizi giriniz");
        String nom = scan.nextLine();
        System.out.println("Javayi sevdiniz mi?");
        boolean cevap = scan.nextBoolean();



    }



}
