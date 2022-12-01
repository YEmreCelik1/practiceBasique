package day02_Variables;

public class C05_Scanner {

    public static void main(String[] args) {
        String str = "123";
        String birler=""+str.charAt(2);
        String onlar = ""+str.charAt(1);
        String yuzler=""+str.charAt(0);
        System.out.println("Birler basamagi:"+birler);
        System.out.println("Onlar basamagi:"+onlar);
        System.out.println("Yuzler basamagi:"+yuzler);
    }
}
