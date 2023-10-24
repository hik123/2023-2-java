package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3);
        nbb.start();            // new 생성자(); //new붙은건 생성자
    }
}

class NumberBaseball {
    protected int strike;
    protected int ball;
    protected int out;
    private final int GAME_COUNT;
    private final int[] gameNumbers; //레퍼런스의 final은 주소값을 못바꿈! 객체는 바꿀수있음

    public NumberBaseball(int count) {
        GAME_COUNT = count;
        gameNumbers = new int[count];
    }
    public void start() {
        setRandomNumNotDuplicate(); //0~9사이의 랜덤값 중복없이
        getUserInput();
    }

    private void getUserInput() {
        Scanner scan = new Scanner(System.in);
        final int[] userArr = new int[GAME_COUNT];
        for(int i=0; i<GAME_COUNT; i++) {
            System.out.printf("%d 숫자", i+1);
            userArr[i] = scan.nextInt();
        }

        boolean r = isContinueCheckResult(userArr);

        scan.close(); //스캐너 사용 끝나고 닫기
    }
    private boolean isContinueCheckResult (int[] arr) {
        int strike=0, ball=0, out;
        for (int i=0; i<gameNumbers.length; i++) {
            if (gameNumbers[i] == arr[i]) { strike++; }
           // for(int z=0; i<arr.length; i++) {

            //}
        }

        return false;
    }
    private void setRandomNumNotDuplicate() {
        for (int i=0; i<GAME_COUNT; i++) {
            gameNumbers[i] = getRandomValluew();
            for(int z=0; z<i; z++) {
                if(gameNumbers[i] == gameNumbers[z]) {
                    i--;
                    break;
                }
            }
        }
        for(int val : gameNumbers) {
            System.out.println(val);
        }
    }
    private int getRandomValluew() {
        return (int)(Math.random() * 10);
    }
}   // 중복되지않는 0~9 숫자중 3개가 주어짐 숫자3개를 맞추는 게임
    // 숫자, 자리 맞추면 S스트라이크   // 숫자는 맞췄는데 자리는 못맞추면 B볼 // 하나도 못맞추면 Out
        // ex) 3 7 2
        //     1 2 3
        // strike:0, ball: 2, out: 1