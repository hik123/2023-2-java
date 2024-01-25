package com.green.day83;

public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setItem(1);
        int intVal = (int)b1.getItem();

        System.out.println("intVal : " + intVal);

        b1.setItem("ㅇㅇㅇ");
        String strVal = (String)b1.getItem(); // 제네릭 나오기전에는 형변환 해서썼음 불편

        System.out.println("strVal : " + strVal);
        Box b2 = new Box();
        b2.setItem("안녕");
    }
}
