package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi= scan.nextInt();

       String sonuc = (sayi>0) ? (sayi>99&&sayi<1000?  "3 basamakli sifirdan buyuk sayi":
                                                        sayi%2==0?"3basakli olmayan cift sayi":
                                                        "3 basamakli olmayan tek sayi"):"Sifirdan buyuk bir sayi giriniz";


    }
}
