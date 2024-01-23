package org.example.Lecture_01;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x + y);
//            }
//        };

        PlainInterface plainInterface0 = (x,y)-> String.valueOf(x+y);

        PlainInterface plainInterface1 = (x,y)-> {
            int a = x - y;
            return String.valueOf(x+y);
        };
        PlainInterface plainInterface2 = (x,y) -> String.valueOf(Integer.compare(x,y));

        PlainInterface_v2 plainInterfacev2_1 = (x,y) -> Integer.compare(x,y);
        PlainInterface_v2 plainInterfacev2_2 = Integer::compare;
        PlainInterface_v2 plainInterfacev2_3 = Integer::sum;


        System.out.println(plainInterface1.action(3,5));
        System.out.println(plainInterface2.action(3,5));
        System.out.println(plainInterfacev2_1.action(5,6));
        System.out.println(plainInterfacev2_2.action(5,6));
        List <String> list = Arrays.asList("Привет","мир","Я", "родился","!");

//        list = list.stream().filter(str->str.length()>4).collect(Collectors.toList());
//        for (String item: list) {
//            System.out.println(item);
//        }
        list.stream().filter(str->str.length()>4).forEach(System.out::println);
    Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().map(x->x*x).forEach(System.out::println);
        Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().map(x->"число "+ x + " SQR " + x*x).forEach(System.out::println);
        Arrays.asList(1,2,43,4,55,6,62,1,4,71,4,6,84,2,9,10).stream().sorted().distinct().forEach(System.out::println);
    }
}