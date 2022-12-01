package day06_nestedifswitch;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        /*
        // Kullanıcının yasadıgı güne  göre;
// Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
// pazartesi hafta başlangıcı
//BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanin kacinci gunundesiniz");
        int gunNo= scan.nextInt();

        if(gunNo<=0||gunNo>7){
            System.out.println("Hatali giris");
        }else
        {
            System.out.println("Kac gun sonrasini istiyorsunuz" );
            int sonrasi = scan.nextInt();
            int bulunanGun= (sonrasi+gunNo)%7;

            switch (bulunanGun){
                case 1:
                    System.out.println(sonrasi + " gun sonra gunlerden Pazartesi");
                    break;
                case 2:
                    System.out.println(sonrasi + " gun sonra gunlerden Sali");
                    break;
                case 3:
                    System.out.println(sonrasi + " gun sonra gunlerden Carsamba");
                    break;
                case 4:
                    System.out.println(sonrasi + " gun sonra gunlerden Persembe");
                    break;
                case 5:
                    System.out.println(sonrasi + " gun sonra gunlerden Cuma");
                    break;
                case 6:
                    System.out.println(sonrasi + " gun sonra gunlerden Cumartesi");
                    break;
                default:
                    System.out.println(sonrasi + " gun sonra gunlerden Pazar");
                    break;

            }
        }







    }
}
