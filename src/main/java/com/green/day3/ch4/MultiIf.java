package com.green.day3.ch4;

public class MultiIf {
    public static void main(String[] args) {
        int num = -10;

        if(num >= 50) {
            if (num >= 80) {
                System.out.printf("%d는 엄청 엄청 엄청 크다\n!", num);
            } else {
                System.out.printf("%d는 엄청 엄청 크다\n!", num);
            }
        } else {
            if (num >= 40) {
                System.out.printf("%d는 엄청 크다!\n", num );
            } else {
                System.out.printf("%d는 좀 크다!\n",num);  // 분기문 갯수 제한 없으나, 가능한 3번정도
            }
        }
        System.out.printf("-- 끝 --");
    }
}
