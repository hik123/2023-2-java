package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) { //모든 소프트웨어의 시작점
        String str = new String("dd");
        //                           // 객체생성 >> Tv(타입) tv1(이름) = new 클래스명()
        Tv tv1 = new Tv(); //tv1은 Tv객체의 주소값을 담을수있다.  new Tv()클래스를 객체화
        tv1.channel = 10;  // 주소값. (접근할때 . 사용) >> 그 객채한테 접근, 명령 내리고싶을때
        tv1.power = true;       //기본형만 디폴트값이 있다.  boolean디폴트값false
        tv1.color = "빨간색";

        Tv tv2 = new Tv(); // new로 만든 tv1 tv2는 다른존재
        tv2.channel = 20;

        System.out.println("tv1 == tv2 >> " + (tv1 == tv2));

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.channel : " + tv1.power);
        System.out.println("tv1.channel : " + tv1.color);

        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv2.channel : " + tv2.power);
        System.out.println("tv2.channel : " + tv2.color); //디폴트값  null(주소값이 가지고 있지않다)
    }
}
// 클래스(만들 수 있는 설명) - 문서, 설계도, 설명
// 객체(Object, Instance) - 아파트 , TV,제품


//java,  DB(MariaDB), JSON, spring boot(IoC, DI)
//Lombok, notion, slack, ERD(tool이용)
//1차 프로젝트
//spring boot + Mybatis

// 2차
//TDD, Spring Boot Security,login(JWT), Redis

//3차 JPA(QueryDSL), Social Login
