package day07_stringmanipulation;

public class C05_StringManipulationIsEmpty {
    public static void main(String[] args) {

String str1= "Hi";
        System.out.println(str1.isEmpty());//false


String str2 = "";
        System.out.println(str2.isEmpty());//true

        //Kullanicidan alinan bir String de bosluk karakteri olup olmadigini kontrol etme

        String s= "fkll vflflks";

        if(s.replace(" ","").length()<s.length()){
            System.out.println("bosluk vardir.");
        }else
            System.out.println("Bosluk yoktur");











    }
}
