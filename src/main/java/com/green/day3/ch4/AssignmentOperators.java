package com.green.day3.ch4;

public class AssignmentOperators {
    public static void main(String[] args) {
        //p132
        //복합 대입 연산자
        int n1, n2, n3;
        n3 = 10;
        n1 = n2 = n3; //우측 값을 좌측에 복사해서 준다
        System.out.printf("n1 : %d, n2: %d, n3: %d\n",
                n1, n2, n3);

        n1 = n1 + 4;  // =을 만나면 오른쪽부터 먼저 연산 //n1값이 변경됨
        System.out.printf("n1 : %d, n2: %d, n3: %d\n",
                n1, n2, n3);

        n2 += 4;   // + 부분에 % - 등등 다들어갈수있다.
        System.out.printf("n1 : %d, n2: %d, n3: %d\n",
                n1, n2, n3);

        n3++; //++1씩 증가 --1씩감소
        ++n3;
        System.out.printf("n1 : %d, n2: %d, n3: %d\n",
                n1, n2, n3);

        n2--;
        --n2;
        System.out.printf("n1 : %d, n2: %d, n3: %d\n",
                n1, n2, n3);

    }
}
