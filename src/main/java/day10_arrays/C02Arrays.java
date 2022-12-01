package day10_arrays;

import java.util.Arrays;

public class C02Arrays {
    public static void main(String[] args) {
        /*Kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan kodu yaziniz
*/
        int arr [] = {-7,12,-3,9,-9,15};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int soustraction=(arr[arr.length-1])-arr[0];
        System.out.println(soustraction);
    }
}
