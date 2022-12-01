package day11_multidimensionalarrays;

import java.util.Arrays;

public class C01Fibonacci {
    public static void main(String[] args) {
          /*
      INTERWIEW
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....

     */
        int fibb=9;
        int arr []=new int[fibb];
        arr[0]=0;
        arr[1]=1;

        for (int i = 2; i < fibb; i++) {
            arr[i]=arr[i-2]+arr[i-1];
            //System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

    }
}
