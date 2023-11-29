package com.green.day44;


public class Test { //체이닝기법
    public static void main(String[] args) {
        MyInfo mi = new MyInfo()
                .title("ddd")
                .description("인스타 클론 코딩");

        System.out.println(mi);

        MyOpenAPI moa = new MyOpenAPI()
                .info(mi)
                .name("jack");

        System.out.println(moa);
    }
}
