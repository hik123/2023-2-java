package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;
        //num = num / 0;
        try {                   //에러 발생안되면 try부분 쭉 실행됨
            num = 10;
            num = num / 0;      //모든 언어에서 0으로 나눴을때 에러터짐
        } catch (Exception e) {  //try{}에서 예외가 터졌을때 catch부분 실행
            e.printStackTrace(); // 발생한 에러 출력
            System.out.println("예외 발생!");
            num = -1;
        } finally { //옵션, finally있어도되고 없어도됨 //예외 발생유무 상관없이 반드시 실행!
            System.out.println("finally 실행!!!"); //finally
        }
        System.out.printf("num: %d\n", num);
        System.out.println("끝");
    }
}
class ExceptionEx1_2 {
    public static void main(String[] args) {
        div(20);
    }
    public static void div(int num) {
        try {
            num = 10;
            return;      // return 만나도 finally 실행후 return
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생!");
            num = -1;
        } finally {         //확실히 보장 됐으면 하는것들은 finally에 저장
            System.out.println("finally 실행!!!");
        }
        System.out.printf("num: %d\n", num);
        System.out.println("끝");
    }
}
class ExceptionEx1_3 {

    public void sum() {}
    public static void main(String[] args) {
        try {
            //int num = 10 / 0;
            //ExceptionEx1_3 obj = null; // try문 바깥에 있으면 trycatch문 실행안되고 에러발생
            //obj.sum();
            int[] arr = new int[10];
            arr[10] = 10;
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {  //예외는 하나만 실행됨 if-elseif문 느낌
            System.out.println("수학적 예외");
        } catch(NullPointerException e) {      //널포인트exception 발생했을때 실행
            System.out.println("널포인트 예외");
        } catch (Exception e) {              // 최상위 부모인 Exception은 가장 밑에있어야됨
            System.out.println("모든 예외");
        }
        System.out.println("끝");
    }
}
