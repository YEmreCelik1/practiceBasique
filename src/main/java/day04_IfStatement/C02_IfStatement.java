package day04_IfStatement;

public class C02_IfStatement {
    public static void main(String[] args) {
         /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */
        int not = 89;
        if(not>=90 && not<=100){
            System.out.println("A Tres bien");
        }else if (not>=80 && not<90){
            System.out.println("B bien");
        } else if (not>=70 && not<80) {
            System.out.println("C Moyen");

        }else if(not>=60 && not<70){
            System.out.println("D Ca va");

        }else
            System.out.println("C'est raté.");




    }
}
