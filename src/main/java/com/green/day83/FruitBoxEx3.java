package com.green.day83;

import org.checkerframework.checker.units.qual.A;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitGBoxList = new FruitBox();
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitGBoxList);
        System.out.println("j1 : " + j1);

        FruitBox<Apple> appleGBoxList = new FruitBox();
        appleGBoxList.add(new Apple());
        appleGBoxList.add(new Apple());

        Juice j3 = Juicer.makeJuice(appleGBoxList);
        System.out.println("j3 : " + j3);
    }
}

class Juice {
    private String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return this.name;
    }
}

class Juicer<T>{                                                // ? << 와일드카드   //<?> 아무거나 다들어감  //? super
    static Juice makeJuice(FruitBox<? extends Fruit> box) { //<? extends Fruit> 상한,이 메소드에 넣을수 있는 타입은 Fruit 까지만 Fruit자식들만
        String temp = "";                            //바로 메모리에 올라가서 <>타입 지정못함 //static 넣으면 클래스의 <>과 전혀 상관없어짐
        for(Fruit f : box.getList()) {
            temp += f + " ";
        }
        return new Juice(temp);
    }
}
