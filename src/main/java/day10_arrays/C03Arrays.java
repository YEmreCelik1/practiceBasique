package day10_arrays;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {
 /*
    INTERWIEW QUESTIONS
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        String str = "karakalem";
        String s []=str.split("");
        Arrays.sort(s);
        System.out.println(Arrays.toString(s)); //[a, a, a, e, k, k, l, m, r]
        int count=0;
        for (int i = 1; i <s.length ; i++) {
            if(s[i-1].equals(s[i])){
                count++;
            }else{
                System.out.println(s[i-1]+" karakteri "+ (count+1)+" defa");
                count=0;
            }

            if(i==s.length-1){
                System.out.println(s[i]+" karakteri "+ (count+1)+" defa");
            }

        }


    }
}
