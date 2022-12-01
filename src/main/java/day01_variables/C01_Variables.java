package day01_variables;

public class C01_Variables {
    public static void main(String[] args) {
        /*
   Variable
     bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
     Variable icinde deger saklayan bir konteynirdir
   //bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
   //örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
   //geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
   //kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız
    */
        int level = 1;
        System.out.println("level = " + level);

        boolean ogrenciMi = true;
        boolean yagisVarMi = false;
        System.out.println("yagisVarMi = " + yagisVarMi);
        System.out.println("ogrenciMi = " + ogrenciMi);

        char sembol = '?';
        char chh = '9';
        System.out.println("sembol = " + sembol);
        System.out.println("ch = " + chh);

        double aa = 0.2, bb=3.5;

        long populationWord = 700000000000L;
        long xx = 1234;

        System.out.println("x = " + xx);
        System.out.println("a = " + aa);
        System.out.println("b = " + bb);
        System.out.println("populationWord = " + populationWord);



//farkli 3 data turunde variable olusturun ve bunlari yazdirin
        int a = 12;
        System.out.println(a);
        short b = 13;
        System.out.println(b);
        String str = "Stylo";
        System.out.println(str);
        char ilkHarf = 'k';
        System.out.println(ilkHarf);

        //herkes kendi adini ve soyadini yazdirsin
        String isim = "Joyce";
        String soyIsim = "Jonathon";
        System.out.println("isim "+isim);
        System.out.println("Soyisim " + soyIsim);

//3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int x= 12;
        short y = 16;

        System.out.println("sonuc"+(x+y));

        //4- Bir tamsayi ve bir ondalikli variable olusturun
    //bunlarin toplamini yazdirin

        int k = 13;
        double l= 3.5;
        System.out.println(k+l);
    //5 – char data turunde bir variable olusturun ve yazdirin
char ch = '?';
        System.out.println(ch);

        //6-Peki bir tamsayi ile bir harfi toplayabilirmiyiz.

        char xy = 'm';
        int sayi= 3;
        System.out.println((xy+sayi));

        int deger1= 0;
        char harf2='s';
        System.out.println(harf2+deger1);

        // Initializing Variable  (variable baslangic degeri verme)

        int age = 32;


    }
}
