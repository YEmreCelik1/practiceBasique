package day14_inheritianceencapsulation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SansliKullanici  {

    public void sansliKullaniciYazdir(List<String> kullanicilar, List<Integer> listKullaniciSaniye) {

        List<String> sansliKullaniciIndex= new ArrayList<>();
        for (int i = 0; i <listKullaniciSaniye.size() ; i++) {

            if(listKullaniciSaniye.get(i)<10){
                sansliKullaniciIndex.add(kullanicilar.get(i));
            }

        }
        System.out.println("Sansli kullanicilar:"+sansliKullaniciIndex);

    }
}

