package day11_multidimensionalarrays;

import java.util.Arrays;

public class C02MultiDimensionalArrays {

    public static void main(String[] args) {
        //Kullanicidan alinan bir Stringde gecen sesli harfleri console yazdirin
        String str = "On continue à apprendre Java";
        str=str.replaceAll("[^AEUOIaeuoi]","");
        //System.out.println(str);
        String s[]= str.split("");
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));//[O, a, a, a, e, e, e, i, o, u]
        String result ="";
        for (String w:s) {
            if(!result.contains(w)){
                result+=w+" ";
            }
        }
        System.out.println(result);


    }
}
