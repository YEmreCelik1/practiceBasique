package day05_IfStatement;

public class C01_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin sayilarin ikiside pozitifse "sayilarin toplamini yazdirin
        //ikise de negatifse sayilarin carpinin
        //ikisi farkli isaretlere sahipse islem yapilamaz
        //sayilardan sifira esit olan varsa sifir carpmaya gore yutan elemandir

        double sayi1=1, sayi2=0;

        if(sayi1>0&&sayi2>0){
            System.out.println(sayi1+sayi2);
        } else if (sayi1<0&&sayi2<0) {
            System.out.println(sayi1*sayi2);
        } else if (sayi1>0&&sayi2<0 ||sayi2>0&&sayi1>0) { //sayi1*sayi2<0 demek daha kisa dir
            System.out.println("farkli isaretlerde sayilarla islem yapilamaz");
        }else
            System.out.println("Sifir yutan elemandir.");




    }
}
