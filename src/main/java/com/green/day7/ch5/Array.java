package com.green.day7.ch5;

public class Array { //int[] arr 레퍼런스타입은 주소값 저장 // 주소값 8byte
    public static void main(String[] args) { //배열: 같은타입의 여러값들을 한곳에 모아두는것 //변수로 여러값지정할려면 이름하나하나 지정해야
        int n = 10, n2 = 20, n3 = 30;
        int[] arr = {10, 20, 30, 40, 50}; //상수처럼 만들자마자 고정 //변수에는 값 1개만  //arr 배열에 접근할수있는 주소값 저장 //index라는 방번호가 붙음
        String[] arr2 = {"A", "B", "가가", "나나"};

        int[] arr3 = new int[30]; //각 방에는 0이 들어가있음.
        int arr4[] = new int[30]; //c언어방식 //java에서는 사용가능 하지만 int형으로 보이기 때문에 int[]사용 추천


        // int[] a; //[]기본형x 참조형  // a에 주소값만 저장가능
                 //배열 >> 같은타입의
        arr[0] = 200; //값 쓰기 //0번방 값 변경
        //int val = arr[0]; //읽어올때
        System.out.println("arr[0]: " + arr[0]);
        System.out.println("arr[1]: " + arr[1]);
        System.out.println("arr[2]: " + arr[2]);
        System.out.println("arr[3]: " + arr[3]);

        System.out.println("arr.length : " + arr.length);//arr.length arr배열의 길이
    }
}
