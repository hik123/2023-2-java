package com.green.day14.ch6;

public class Data1 {
    int value; // int value = 100; 명시적 초기화 // 잘안씀
    int value2;
    int value3;

    public Data1() {
        //value = 100;
        //value2 = 200;
        //value3 = 300;
        this(100, 200, 300); //정수 3개 받는 생성자를 호출 //this()생성자 호출할때
                                    // this.(주소값. 이랑 같음) 멤버필드, 메소드에 접근할때
    } //생성자 // 생성자 없을때 컴파일러가 자동으로 넣어줌 //기본생성자(파라미터없는 생성자)
    //public void Data1 {} //리턴타입이 있으니 메소드
    //생성자 객체 생성할때 생성자 호출 필요   //파라미터가 있는 생성자 쓰려면 기본생성자 넣어야함
                                            // 생성자 리턴값이 없고, 클래스 이름과 같아야한다
    public Data1(int a) {
        value = a; //생성되자마자 값을 밀어넣고 싶을때 쓰기도함
    }
    public Data1(int a, int b, int c) {
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printMySelf() {
        System.out.printf("value: %d, value2: %d, value3: %d\n"
                , value, value2, value3);
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        data1.printMySelf();  // 100, 200, 300 나오게

        Data1 data1_2 = new Data1(10, 20, 30); //생성자를 이용하면 객체생성과 동시에 멤버필드 값 세팅하고싶을때 밀어넣는게 가능하다
        data1_2.printMySelf();
    }
}
