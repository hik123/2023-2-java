package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.print(4); //4단 구구단 콘솔에 출력
        /* 4 x 1 = 4
           4 x 2 = 8
           ...
           4 x 9 까지
         */
        System.out.println("(2)-------------------");
        gugudan.printFromTo(4, 7); //4~7단까지 출력
        gugudan.printFromTo(3, 4); //3~4단까지 출력

        System.out.println("(3)-------------------");

        gugudan.printFromTo(3, 6, "-----"); //단이 바뀔때 ----- (구분자seperate)
    }
}
