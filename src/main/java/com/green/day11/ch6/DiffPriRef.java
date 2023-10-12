package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30;
        changeVal(num); //
        System.out.println("num : " + num);

        NumBox nb =new NumBox();
        System.out.println("(1)nb.num : " +nb.num);
        nb.num = 30;
        System.out.println("(2)nb.num : " +nb.num);
        changeVal(nb);      //메소드 호출            // 타입이 다르면 같은 이름의 메소드 사용가능 (파라미터만 가능)>>오버로딩 객체지향에서 가능
        System.out.println("(3)nb.num : " + nb.num);
    }
    public static void changeVal(int num) {
        System.out.println("changeVal - int");
        num = 10;
    }

    public static void changeVal(NumBox dd)  {
        //dd = new NumBox();
        System.out.println("changeVal - NumBox");
        dd.num = 10;
    }
}
class NumBox {
    int num;
}
