package day07_stringmanipulation;

public class C04_StartsWith {
    public static void main(String[] args) {

        /*
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        //string Ka ile basliyormu dir ile bitiyor mu

        String cumle = "Kazananlar hic hata yapmayanlar degil, vazgecmeyenlerdir.";

        System.out.println(cumle.startsWith("Ka")&&cumle.endsWith("dir."));












    }
}
