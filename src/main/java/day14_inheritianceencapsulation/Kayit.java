package day14_inheritianceencapsulation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Kayit extends RunnerSansliKullanci{
    LocalDateTime kullaniciDate;
    static List<String> kullanicilar=new ArrayList<>();
    static List<Integer> listKullaniciSaniye = new ArrayList<>();
    static Scanner scan ;
    static int counter = 0;

    public void kayitOl(){
        String isim="";
        System.out.println("Kullanici isminizi giriniz.");
        isim=scan.nextLine();

        int kullaniciSaniye = LocalDateTime.now().getSecond();
        System.out.println("Kullanici girdigi saniye"+kullaniciSaniye);

        kullanicilar.add(isim);
        listKullaniciSaniye.add(kullaniciSaniye);

        tamamMiDevamMi();


    }//kayit()

    public void tamamMiDevamMi() {
        String tmmMiDvmMi="";
        do {
            System.out.println("Baska kayit yapmak istiyormusunuz? E/H");
            tmmMiDvmMi=scan.next();
            if(tmmMiDvmMi.equalsIgnoreCase("e")){
                kayitOl();
            }else if (tmmMiDvmMi.equalsIgnoreCase("h")){
                System.out.println("Hoscakalin");
                break;
            }

        }while(!tmmMiDvmMi.equalsIgnoreCase("e")&&!tmmMiDvmMi.equalsIgnoreCase("h"));

        counter++;

        if(counter==1){//bunu yazmayinca Array i tekrar yazdirir.
            SansliKullanici sansliKullanici = new SansliKullanici();
            sansliKullanici.sansliKullaniciYazdir(kullanicilar,listKullaniciSaniye);

        }
    }
    static {
        scan = new Scanner(System.in);
        counter=0;
    }


}
