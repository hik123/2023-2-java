package com.green.day2.ch3;

public class OperatorEx24 {
    public static void main(String[] args){
        boolean b1 = 1 == 1 && 2 == 2; // and연산자(모든게 true여야 true,false가 하나라도 있으면 false)
        System.out.println("b1 : " + b1);

        boolean b2 = 1 == 1 && 2 == 2 && 3 == 4; // and연산자 t,t,f > f
        System.out.println("b2 : " + b2);

        System.out.println("--------------------");

        boolean b3 = 1 == 2 || 2 == 3 || 4 == 4; //or연산자 f,f,t > t   전부다 false > false
        System.out.println("b3 : " + b3);

        boolean b4 = 1 == 2 || 2 == 3 || 4 == 5;
        System.out.println("b4 : " + b4);

        System.out.println("--------------------");

        //부정연산자
        boolean b5 = 1 == 1;
        System.out.println("b5 : " + b5);
        System.out.println("!b5 : " + !b5); // !는 반대
        System.out.println("!!b5 : " + !!b5);





    }
}
