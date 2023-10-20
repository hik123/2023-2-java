package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonusPrice = c.getBonusPoint();

        Tv tv = new Tv();
        //int tvPrice = tv.getPrice(); //100
        int tvBonusPrice = tv.getBonusPoint(); // 10
    }
}
class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer); //money: 1000, bonusPoint: 0;
        buyer.buy(new Tv()); //price: 100
        buyer.buy(new Tv()); //price: 100
        buyer.buy(new Computer()); // price: 200
        buyer.buy(new Computer()); // price: 200
        buyer.buy(new Computer()); // price: 200
        buyer.buy(new Computer()); // price: 200
        buyer.buy(new Computer()); // price: 200
        buyer.buy(new Tv()); //price: 100
        System.out.println(buyer); //money: 750, bonusPoint:

        //buyer money가 부족하면 "잔액 부족 money 값 마이너스 처리x
        //잔액이 부족하지 않으면 Tv을/를 구입하셨습니다.
        // > money 마이너스 처리, bonusPoint 플러스 처리
    }
}
class Buyer {
    public void buy (Product product) {
        if(money < product.getPrice()) {
            System.out.println("잔액 부족");
            return;
        }
        //money = money - product.getPrice();
        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        System.out.printf("%s을/를 구매하셨습니다.", product);

        //System.out.printf("제품명 : %s\n", product);
        //System.out.printf("price : %d\n", product.getPrice());
        //System.out.printf("bonusPoint : %d\n", product.getBonusPoint()) ;
    }
    private int money;
    private int bonusPoint;
    public Buyer() {
        this.money = 1050;
        this.bonusPoint = 0;
    }

    @Override
    public String toString() {
        return String.format("money : %d, bonusPoint : %d", money, bonusPoint);
    }
}
class Product {
    private int price;
    private int bonusPoint;
    public Product (int val) {
        this.price = val;
        this.bonusPoint = (int)(val * 0.1);
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
    public int getPrice () {
        return price;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public void setBonesPoint(int price) {
        this.price = price;
    }
    //public int getBonusPoint () { return getbonusPoint; }
    @Override
    public String toString () {
        return String.format("price : %d, bonusPoint : %d", price, bonusPoint);
    }
}
class Tv extends Product {
    public Tv () {
        super(100);
    }
    @Override
    public String toString () {
        //return "Tv, " + super.toString();
        return "Tv";
    }

    public int getBonusPoint() {
        return super.getBonusPoint();
    }

    public int getPrice() {
        return super.getPrice();
    }

    public void setPrice(int price) {
        super.setPrice(price);
    }

    public void setBonesPoint(int price) {
        super.setBonesPoint(price);
    }
}
class Computer extends Product {
    public Computer () {
        super(200);
    }
    public int getBonusPoint() {
        return super.getBonusPoint();
    }

    public int getPrice() {
        return super.getPrice();
    }

    public void setPrice(int price) {
        super.setPrice(price);
    }

    public void setBonesPoint(int price) {
        super.setBonesPoint(price);
    }

    /*
        public void setPrice (int price) {
            this.price = price;
        }
        public int getPrice () {
            return price;
        }
        public int getBonusPoint () {
            return bonusPoint;
        }
        public int getBonusPoint () {
            return bonusPoint;
        }

         */
    @Override
    public String toString() {
       //return "Computer, " + super.toString();
        return "Computer";
    }
}
