package com.green.day18.ch7;

import com.green.day12.ch6.Card;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList(); //상속관계
        list.add(10);
        list.add(10.3f);
        list.add(10.4d);
        list.add(13L);
        list.add("dddd");
        list.add(new Card());

        Object val1 = list.get(0);
        int intVal = (int)val1;

        float floatVal = (float)list.get(1);

        Object obj = 10;
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "ddd";
        obj = new Card();
    }
}

class ArrayListTest2 {
    public static void main(String[] args) {
        int v1 =10; //프러머티브타입
        Integer v2 =10; //레퍼런스타입 래퍼타입
        System.out.println(v1 == v2);
        List<Integer> list = new ArrayList(); //<>들어갈 수 있는 각방의 타입을 넣을수있음 기본형은 못적고 래퍼타입 적어야됨
        //System.out.println(list.get(0)); 에러
        System.out.println(list.size());

        list.add(10); //add(추가)메소드 통해서 값 추가 //=대입연산자 못씀 // ArrayList 타입 맞출려고 사용
        list.add(20);
        list.add(30);
        list.add(45);
        //list.add(10.3f);
        //list.add(10.3d);
        //list.add("ddd");
        int val1 =list.get(0); //값 빼내기
        System.out.println(list.get(1));

        System.out.println("size: " + list.size()); //list는 .length말고 .size 써야 배열크기나옴

        // [0]: 10
        // [1]: 20
        // [2]: 30
        // [3]: 45

        for (int i=0; i<list.size(); i++) {
            System.out.printf("[%d]: %d\n", i, list.get(i));
        }

        for(int val : list) {
            System.out.println(val);
        }
    }
}

class ArrayListTest3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list); //toString이 오버라이딩 되있어서 주소값 문자열 안나오고 배열 출력됨
        list.add(1, 100); // 1번방에 100을 삽입하고 나머지 뒤로밀림
        System.out.println(list);
        list.add(3, 200);
        System.out.println(list);

        list.remove(0); // 0번방을 지우고 나머지 배열 앞으로 밀림
        System.out.println("4: " + list + ", size : " + list.size());
    }
}