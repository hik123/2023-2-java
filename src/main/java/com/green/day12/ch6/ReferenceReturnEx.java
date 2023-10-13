package com.green.day12.ch6;

class Data2 {
    int x;
    double d;
}
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data2 d = new Data2(); //  d >> Data2 주소값
        d.x = 10;
        d.d = 100.5;

        Data2 d2 =copyObj(d);   // Data2 주소값을 copyObj메소드에 보낸게 d2 // d2 >> copyObj 주소값
        System.out.println("d == d2 : " + (d == d2)); //false
        System.out.println("d.x == d2.x : " + (d.x == d2.x)); //true
        System.out.println("d.d == d2.d : " + (d.d == d2.d)); //true
    }

    public static Data2 copyObj(Data2 obj) {
        Data2 tmp = new Data2();
        tmp.x = obj.x;
        tmp.d = obj.d;
        return tmp;

    }
}
