package day09_nestedforloop;

public class C03_DoWhile {
    public static void main(String[] args) {
        /*
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
        Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
        int MuzSayısı =165, hayatta kalmaDays = 0;
        boolean maymunAlive = true;
        */

        int nombreBanane=165;
        int manger = 4;
        int vie=0;
        boolean contuniation= true;

        do {
            nombreBanane-=4;
            vie++;
            if (nombreBanane<4){
                contuniation=false;
            }

        }while (contuniation);

        System.out.println("le nombre des jours vivant:"+vie);
    }
}
