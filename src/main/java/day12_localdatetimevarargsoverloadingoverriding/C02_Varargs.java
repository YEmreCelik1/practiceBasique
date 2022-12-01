package day12_localdatetimevarargsoverloadingoverriding;

public class C02_Varargs {
    public static void main(String[] args) {
        //Varargs kullanarak Verilen Stringleri birlestiren concat() isimli bir method olusturunuz
        concat("ab","cd","ef","gh","jk");
    }
    public static void concat(String...str){
        String newStr="";

        for (String w:str) {
            newStr+=w;
        }
        System.out.println(newStr);
    }
}
