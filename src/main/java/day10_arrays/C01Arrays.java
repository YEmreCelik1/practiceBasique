package day10_arrays;

import java.util.ArrayList;
import java.util.List;

public class C01Arrays {
    public static void main(String[] args) {
        //EX:Size verilen ArrayListte 8 (inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(20);
        list.add(8);
        list.add(13);

        System.out.println(list);

        for (int w:list) {
            list.set(list.indexOf(w),w*2);
            if(w==8){
                break;
            }
        }
        System.out.println(list);
    }
}
