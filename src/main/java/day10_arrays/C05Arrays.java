package day10_arrays;

public class C05Arrays {
    public static void main(String[] args) {
         /*
    Interwiew Sorusu
    Ogrencilerin test sonuclarini degerlendiren Java kodunu  yaziniz
    //10 sorumuz var
    //ogrencilerin cevaplari
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // cevap anahtari
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    output:
    1 nolu ogrencinin dogru cevap sayisi :7
    2 nolu ogrencinin dogru cevap sayisi :6
    3 nolu ogrencinin dogru cevap sayisi :5
    4 nolu ogrencinin dogru cevap sayisi :4
    5 nolu ogrencinin dogru cevap sayisi :8
    6 nolu ogrencinin dogru cevap sayisi :7
    7 nolu ogrencinin dogru cevap sayisi :7
    8 nolu ogrencinin dogru cevap sayisi :7

*/
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        f(answers);
    }

    public static void f(char[][] reponse){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (char [] w:reponse) {

            int index=0;
            int ogrenciNo=1;
            int counter=0;

            for (Character k:w) {
                if(k.equals(keys[index])){
                    counter++;
                }
                index++;
            }
            System.out.println(ogrenciNo+" nolu ogrenci dogru cevap sayisi: "+counter);

        }

    }
}
