package com.green.day11.ch6;

public class MethodExam2 {
    String scoreResultOpt(int n) {
        if (n > 100 || n < 0) {
            return "점수를 확인해 주세요";
        }
        String grade ="D";
        if (n == 100) {
            return "A+학점";
        } else if (n < 70) {
            return "D학점";
        } else if (n >= 90) {
            grade = "A";
        } else if (n >= 80) {
            grade = "B";
        } else if (n >= 70) {
            grade = "C";
        }
        //70~99점
        String opt = "0";
        int modVal = n % 10;
        if(modVal >= 8) {
            opt = "+";
        } else if(modVal <= 3) {
            opt = "-";
        }
        String result = String.format("%s%s학점", grade, opt);
        return result; // 년월일 날짜 찍을때 유용
        //return grade + opt + "학점"; //return에 ex)"학점" 문자열 넣을때 >> 반복문에 들어가면 문제생길수도

    }
    String getSeason(int mon) {
        switch(mon) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 12, 1, 2:
                return "겨울";
        }
        return "없음";
    }
}
