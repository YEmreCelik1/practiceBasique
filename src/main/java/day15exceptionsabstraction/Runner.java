package day15exceptionsabstraction;

import static day15exceptionsabstraction.Kayit.counter;

public class Runner {
    public Runner(){

    }
    public static void main(String[] args) {
        Kayit obj=new Kayit();
        obj.kayit();
        System.out.println(counter+ "kez dogru kulanici girisi yapildi");

    }
}
