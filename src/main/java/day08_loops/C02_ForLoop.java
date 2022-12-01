package day08_loops;

public class C02_ForLoop {
    public static void main(String[] args) {
        /*
      Kullanicidan bir cumle ve bir harf alin,
      Cumlede verilen harfin kac kere
      kullanildigini bulup, yazdirin
      ORNEK:
      INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e
      OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

        String str = "Java is not easy";
        char ch ='a';
        int counter=0;
        int demarres=0;
        for (int i = 0; i <str.length() ; i++) {

            int index=str.indexOf(ch,demarres);
           // System.out.println(index);
            if(index>=0){
                counter++;
            }else
                break;
            demarres=index+1;
        }
        System.out.println(ch+" "+counter+" defa kullanildi.");
        int compteur=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                compteur++;
            }
        }
        System.out.println(compteur+" defa..");
    }
}
