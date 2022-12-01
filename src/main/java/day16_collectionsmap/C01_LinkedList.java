package day16_collectionsmap;

import java.util.LinkedList;
import java.util.Scanner;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        TASK:
          Node'larin değereleri; "AYSE" "EMEL" "HARUN" "IREM" olan bir LinkedList olusturun
          Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
          "Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
          Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin

         */
        LinkedList<String> list = new LinkedList<>();
        list.add("ayse");
        list.add("emel");
        list.add("harun");
        list.add("irem");

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz..");
        String isim = scan.next().toLowerCase();
        if(list.contains(isim)){
            System.out.println("Girilen isim listeden silindi.");
            list.remove(isim);
            System.out.println(list);
        }else {
            System.out.println("Girilen isim listede bulunamadi.");
            System.out.println(list);
        }
    }
}
