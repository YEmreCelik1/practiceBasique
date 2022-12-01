package day15exceptionsabstraction;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C02_TryCatch {
    static  Scanner scan = new Scanner(System.in);
    static int sira;
    public static void main(String[] args) {
        /*
    Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
    Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
    (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exception vermesinin onune gecelim)
     */
        String [] str = {"Et", "Sut", "Findik", "Fistik"};

           urun(str);
           try {
               int control = sira;
               System.out.println("Secilen urun:"+str[sira-1]);
               System.out.println("Devam etmek istermisiniz?E/H");
               if(scan.next().equalsIgnoreCase("e")){
                   urun(str);  //burada bu kod silinerek while dongusu icersine alinip tekrar tekrar vatandasin urun girmesi saglanabilir.
               }else {
                   System.out.println("Tesekkurler..");
               }
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("Listede olmayan bir sira girdiniz.");
           }




    }

    private static void urun(String[] str){
        System.out.println(Arrays.toString(str));
        System.out.println("Urun sirasini giriniz.");
        sira= scan.nextInt();



    }
}
