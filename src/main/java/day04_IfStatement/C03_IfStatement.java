package day04_IfStatement;

public class C03_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
        /*
        String ifadelrde equals kullanilir. Cunku Java da 2 tane memory var. Stack ve heap. Non primitive olan String de referans
        degerine de bakildigi icin == yerine equals() kullanilir.
         */
        String gun = "vendredi";
        gun=gun.toLowerCase();

        if(gun.equals("vendredi")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if(gun.equals("mardi")){
            System.out.println("Yahudilerin kutsal gun");
        }
        if(gun.equals("dimanche")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if(!gun.equals("vendredi")&&!gun.equals("mardi")&&!gun.equals("dimanche")){
            System.out.println("Kutsal gun degil");
        }
//2; yol
        String jour = "dimanche";
        if(jour.equalsIgnoreCase("vendredi")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if(jour.equalsIgnoreCase(("mardi"))){
            System.out.println("Yahudile icin kutsal gun");
        }
        if(jour.equalsIgnoreCase("dimanche")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if(!jour.equalsIgnoreCase("vendredi")&&!jour.equalsIgnoreCase("mardi")&&!jour.equalsIgnoreCase("dimanche")){
            System.out.println("Kutsal ir gun girmediniz");
        }
//3. yol
        String j = "Vendredi";

        if(j.equalsIgnoreCase("vendredi")){
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (j.equalsIgnoreCase("samedi")) {
            System.out.println("Yahudiler icin kutsal gun");

        } else if (j.equalsIgnoreCase("dimanche")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }else
            System.out.println("Kutsal gun girmediniz");


    }
}
