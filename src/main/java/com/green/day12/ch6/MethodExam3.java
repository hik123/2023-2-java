package com.green.day12.ch6;

public class MethodExam3 {
        int sumText(String str) {                       //  .toCharArray();
            int num = 0;
            int sum = 0;
            for (int i=0; i<str.length(); i++) {
                char sss = str.charAt(i); // .charAt(i); string타입을 i번째 문자를 char로 변경
                num = Character.getNumericValue(sss); // Character.getNumericValue()숫자로된 char형을 숫자형태 그대로 int형으로 변환
                sum += num;                           //  Integer.parseInt(); String타입의 숫자를 int타입으로 변환
            }

            return sum;
        }
        int sumText2(String str) {
            char[] charArr = str.toCharArray();
            int sum = 0;
            return sum;

        }

    public static void main(String[] args) {
        MethodExam3 me3 = new MethodExam3(); // MethodExam3객체의 주소값 담을수있는 me3
        int sum = me3.sumText("134"); //각각의 문자열의 숫자를 전부다 더해서 리턴 ex)"132" >> 6
        System.out.println("sum : " + sum);



    }

}

