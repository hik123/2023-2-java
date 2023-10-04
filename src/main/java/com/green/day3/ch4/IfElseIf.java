package com.green.day3.ch4;

public class IfElseIf {
    public static void main(String[] args) {
        if(2 == 1) { //elseif 문 boolean 밖에 못옴
            System.out.println("1");
        } else if(3 == 2) {
            System.out.println("2");
        } else if (4 == 3) {
            System.out.println("3");
        } else {  //else 넣어도되고 안넣어도됨
            System.out.println("else");
                    //else 유무 , 그룹으로 묶었을때
                    //if문 안의 if문도 가능
        }

        System.out.println("끝!");
    }
}
