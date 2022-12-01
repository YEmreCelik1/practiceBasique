package day15exceptionsabstraction;

public class C01TryCatch {
    public static void main(String[] args) {
        //Verilen iki sayida ikinci sayiyi bolen olarak kullanip her defasinda azaltarak 10 kez bolen kodu yaziniz

        int sayi1= 100;
        int sayi2 = 5;

        //1.way
        int counter=0;
        while(counter<10){

            if(sayi2==0){
                System.out.println("Payda sifir oldu.");
            }else {
                System.out.println(sayi1/sayi2);
            }
            sayi2--;
            counter++;
        }

        //2.way

        int x=100;
        int y=5;
        int sayac=0;
       while(sayac<10){

           try{
               System.out.println(x/y);
           }catch (ArithmeticException e){
              //System.out.println("Payda sifir olamaz"+e.getMessage());
               //System.err.println("Payda sifir olamaz"); //kodu devam ettiriyor ancak hata mesajini en alta yazdiriyor.
                e.printStackTrace(); //kodu devam ettiriyor ancak hata mesajini en alta yazdiriyor.
           }
           sayac++;
           y--;
       }



    }
}
