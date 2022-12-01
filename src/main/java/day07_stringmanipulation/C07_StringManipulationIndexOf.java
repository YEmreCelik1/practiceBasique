package day07_stringmanipulation;

public class C07_StringManipulationIndexOf {
    public static void main(String[] args) {
        //verilen bir string deki bir karakterin tekrarli mi tekrarsiz mi olduguna bakma
        String str="Kara kara dusunme Ankara";

        char ch ='a';

        if(str.indexOf(ch)==str.lastIndexOf(ch)){
            System.out.println("tekrarsiz");
        }else
            System.out.println("tekrarli");

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın


        String s= "lvjks@mail.com";

        if(s.contains("@gmail.com")){
            if(s.endsWith("@gmail.com")){
                System.out.println("ok");
            }else System.out.println("lutfen yazimı kontrol edin");
        }else
            System.out.println("lutfen gmail adresi giriniz");






    }
}
