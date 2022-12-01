package day03_IfStatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);

        boolean sonuc = 5>4&&7<9&&6+3==9&&5+2!=8;
        System.out.println(sonuc);

        boolean sonuc2 = 5>4&&7>9&&6+3==9&&5+2!=8;
        System.out.println(sonuc2);

        int sayi1 = 15;
        boolean comment= sayi1>10 &&sayi1<20;
        System.out.println(comment);


        int sayi2 = 5;
        System.out.println(sayi2<10||sayi2>20);


    }
}
