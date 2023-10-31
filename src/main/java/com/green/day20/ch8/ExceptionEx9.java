package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            //Exception e = new Exception("일부러 에러 터트림!!");
            System.out.println("ddd");
            //throw e; // 예외가 발생되면 Exception을 throw 던진다.
            throw new Exception("일부러 크크크"); //6,8열 한번에 작성가능
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("--끝--");
    }
}
