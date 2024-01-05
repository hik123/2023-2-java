package com.green.day68.ch14;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for(int i=0; i<10; i++) {
            list.add(i + 10);
        }
        for(Integer val : list) {
            System.out.println(val);
        }
        System.out.println("------");
        list.forEach(new MyConsumer<Integer>());
        System.out.println("------");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);
            }
        });

        System.out.println("------");
        list.forEach(i -> System.out.println("MyConsumer(3) : " + i));
        System.out.println("------");
        /*
        list.removeIf(i -> i % 2 == 0);  //{}생략하면 결과값으로 리턴해줌 return 생략가능
                        // () >>  Pridicate인터페이스를 implements 한 객체의 주소값
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer v) {
                return v % 2 == 0;
            }
        });
        */
        list.removeIf(v -> v % 2 == 0); //true일때 삭제하겠다
        System.out.println(list);
        list.replaceAll( v -> v <= 15 ? v * 2 : v); // 15이하는 x2처리, 나머지는 그대로
        System.out.println(list);

        Map<String, String> map = new HashMap(); // <키값, 밸류값>
        map.put("name", "홍길동");
        map.put("age", "23세");
        map.put("height", "172cm");
        map.forEach( (k, v) -> System.out.printf("%s: $s\n", k, v) );
    }

}

class MyConsumer<T> implements Consumer<T> { // T << 어떤 타입도 될수있다
    @Override
    public void accept(T o) {
        System.out.println("MyConsumer(1) : " + o);
    }
}