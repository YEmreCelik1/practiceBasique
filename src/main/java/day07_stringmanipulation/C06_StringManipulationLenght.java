package day07_stringmanipulation;

public class C06_StringManipulationLenght {
    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */

        String cumle = "Bugun hava yagmurlu degildi.";

        System.out.println(cumle.length());

        String str1 = "";
        System.out.println(str1.length());

        //// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        String isim="Joyce", soyisim="Jonathan";

        if(isim.length()>soyisim.length()){
            System.out.println("isim daha uzundur");
        } else if (isim.length()==soyisim.length()) {
            System.out.println("Ikiside esit");

        }else
            System.out.println("soyisim daha uzundur.");

        //Kullanicidan 4 harfli bir kelime isteyin ve kelimeyi tersten yazdirin
        //1.yol
        String str="Joyce";

        for(int i = str.length()-1;i>-1;i--){
            System.out.print(str.substring(i,i+1));
        }
        System.out.println();
        //2.yol
        String s = "Joyce";
        if(s.length()==5){
            char bir = s.charAt(s.length()-1);
            char iki = s.charAt(3);
            char uc= s.charAt(2);
            char dort = s.charAt(1);
            char bes=s.charAt(0);
            System.out.println(bir+""+iki+uc+dort+bes);
        }else System.out.println("Tekrar deneyiniz");

    }
}
