package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.printAll();
        //Card c1 = cd.getCard(); //return null;
        //Card c2 = cd.getCard(); //return null;

        for(int i=0; i<52; i++) {
            System.out.println(i);
            Card c = cd.getCard();
            c.printMySelf();
        }
        System.out.println("---------");
        //cd.printAll();

                    //호출할때마다 다른카드의 주소값 // 넘겨줬으면 지움 null로 바꾸기

        /*
        Spade(A)
        Spade(B)
        ..
        Club(K)
         */
    }
}
