package day10_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04Arrays {
    public static void main(String[] args) {
        /*
    Interwiew
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
    Test data
    hackerDili("java ile hersey guzel")
    j4v4 1l3 h3r53y guz3l
    İpucu harfleri değiştirin ve ekrana yazdırın.
   */
        List<String> list = new ArrayList<>(Arrays.asList("s","a","e","i","o"));
        List<String> nombres = new ArrayList<>(Arrays.asList("5","4","3","2","1","0"));

        String str= "java ile hersey guzel";

        for (int i = 0; i <str.length() ; i++) {
            String ch = str.substring(i,i+1);
            if(list.contains(ch)){
                int index = list.indexOf(ch);
                str=str.replaceAll(ch, nombres.get(index));

            }
        }
        System.out.println(str);
    }
}
