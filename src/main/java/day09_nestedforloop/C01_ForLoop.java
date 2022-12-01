package day09_nestedforloop;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
         'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
         */

        String str= "abpaldakfajclad";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
            if(str.charAt(i)=='c'){
                break;
            }
        }
        System.out.println("a "+count+" fois");


        /* 1'den 100'e kadar hic rakam  kullanmadan sayilari konsola yazdiriniz*/

        for (int i = 'A'/'A'; i <='d' ; i++) {
            System.out.print(i+" ");
        }
    }
}
