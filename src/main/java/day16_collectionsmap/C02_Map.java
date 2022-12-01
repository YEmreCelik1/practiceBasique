package day16_collectionsmap;

import java.util.HashMap;
import java.util.Map;

public class C02_Map {
    public static void main(String[] args) {
        /*
    Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
         input : {"Ahmet", "Alev", "Gulay"};  {"Yilmaz", "Erdem", "Kaleli"};
         output : {Ahmet=Yilmaz, Alev =Erdem, Gulay=Kaleli};
     */

        String str1 []= {"Ahmet", "Alev", "Gulay"};
        String str2 [] = {"Yilmaz", "Erdem", "Kaleli"};
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < str1.length ; i++) {
            map.put(str1[i],str2[i] );
        }
        System.out.println(map);



    }
}
