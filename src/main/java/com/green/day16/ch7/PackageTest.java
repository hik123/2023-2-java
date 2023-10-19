package com.green.day16.ch7;

import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.*; //*와일드카드 쓰면 전부다 import하는 효과
//import com.green.day15.ch7.Parent;
import static com.green.day13.ch6.MyMath2.staticAbs;
import static com.green.day13.ch6.MyMath2.staticNum;

public class PackageTest {
    public static void main(String[] args) {
        Parent parent;
        //com.green.day15.ch7.Parent parent; /import안쓰면 패키지 네임까지 전부 적어야사용가능
        staticAbs(10);

        staticNum  = 10;
    }
}

