package day08_loops;

public class C01_ForLoop {
    public static void main(String[] args) {
        //question1
        // Kullanicidan baslangic , bitis ve artis miktarini alarak
        // aradaki tum sayilari aralarina virgul koyarak yazdirin

        int debut=11, fin=33, sommeAugmentation=3;

        for (int i = debut; i <=fin ; i+=sommeAugmentation) {

                System.out.print(i+",");

        }


    /* question2;
     Interview Question
          Kullanicidan 100’den kucuk bir tamsayi isteyin.
          1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
          Ancak;
          - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
          - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
          - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
     */
        System.out.println();
        f(80);

    }

    public static void f(int nombre){
        for (int i = 1; i <=nombre ; i++) {

            if(i%3==0&&i%5==0){
                System.out.println("Java guzeldir");
            } else if (i%3==0) {
                System.out.println("Java");
            } else if (i%5==0) {
                System.out.println("Guzeldir.");
            }else
                System.out.println(i);

        }
    }
}
