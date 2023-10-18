package com.green.day14.ch6;

public class Car {
    String color; //전역변수는 객체가 살아있는동안 계속 지속됨
    String gearType;
    int door;

    public Car () {
        this("white"); // this() 생성자 호출
    }
    public Car (String color) { //오버로딩된 생성자, 파라미터를 가진 생성자
        this(color, "auto", 4); //이름이 같을때 this 사용 이름 다를때는 생략해도됨
    }
    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    public void printMySelf () {
        System.out.printf("color=%s, gearType=%s, door%d\n", color, gearType, door);
    }
}

class carTest {

    public static void main(String[] args) {
        Car car1 = new Car(); //new Car() 생성자 호출
        Car car2 = new Car("blue"); //String값 하나 받는 생성자 호출

        car1.printMySelf(); // color=white, gearType=auto, door=4
        car2.printMySelf(); // color=blue, gearType=auto, door=4
    }
}
