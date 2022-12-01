package day15exceptionsabstraction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Market {
    public static void main(String[] args) {
         /*
    Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
    Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
    (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exception vermesinin onune gecelim)
     */
        Scanner scan;
        String [] str = {"Et", "Sut", "Findik", "Fistik"};

        boolean flag = true;

        while(flag){
                    System.out.println("Sira numarasi giriniz.");
            try {
                scan = new Scanner(System.in);
                int sira = scan.nextInt();
                System.out.println(str[sira]);
                flag=false;
            }catch (InputMismatchException e){
                System.out.println("Sayisal degerler giriniz"+e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sira disina cikmayiniz."+e.getMessage());
            }
        }

    }
}
