package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_getIndex {
    public static void main(String[] args) {

        List<Integer> sayilarList= new ArrayList<>();
        sayilarList.add(4);
        sayilarList.add(3);
        sayilarList.add(0,9); // [9, 4, 3]
        sayilarList.add(2,7); // [9, 4, 7, 3]

        System.out.println(sayilarList.get(2)); // 9

        System.out.println(sayilarList); // [9, 4, 7, 3]


    }
}
