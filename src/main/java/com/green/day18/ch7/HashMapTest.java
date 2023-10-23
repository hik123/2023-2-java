package com.green.day18.ch7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap(); //배열의 0번방, 1번방 개념이없는
        map.put("a", 10);   //k(키)값 과 v(밸류)값
        map.put("b", 20);
        map.put("b", 30);   //

        Object obj = map.get("b"); //키값만 알면 밸류값 가져올수있음
        int val = (int)obj;
        System.out.println("val : " + val);
    }
}

class HashMapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("Tv", 0);
        map.put("Computer", 0);
        map.put("Audio", 0);

        map.put("Tv", map.get("Tv") + 1);
        map.put("Tv", map.get("Tv") + 1);

        System.out.println("Tv-Count : " + map.get("Tv"));
        System.out.println("size : " + map.size());
    }
}
