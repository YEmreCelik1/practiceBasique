package day03_IfStatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {
    char harf = 'a';
    char harf2 = 'A';
        System.out.println("harf>harf2:"+(harf>harf2));//true karsilastirma islemleri sonucu true ya da false doner.
//Buyuk harflerin Ascii degerlri kucuk harflerinkinden daha kucuktur.

        //Herhangi bir char variable in ASCII degerini kod yazarak bulunuz.
        char ch = '?';
        System.out.println(ch+0);
        char space = ' ';
        System.out.println(space+0);

        int harf3 = 'M'; //Char in bir matematiksel bir de resim karakteri vardir. Matematiksel deger icin int a atayabiliriz.

        System.out.println(harf3);

        byte b1 = 12;
        byte b2 = -125;
        System.out.println("b1>b2?"+(b1>b2));

        float f1 = 2.376473F;
        float f2 = 6.837483f;

        System.out.println("f1>f2?"+(f1>f2));
        System.out.println("b1>f1?"+(b1>f1));

        long lng1 = 545463547364L;
        System.out.println("b1<lng1?"+(b1<lng1));

        char ch2 = 'h';
        System.out.println("b1>ch?"+(b1>ch));

















    }
}
