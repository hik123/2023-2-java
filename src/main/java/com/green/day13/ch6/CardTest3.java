package com.green.day13.ch6;

import java.util.Arrays;

class Card {
    String pattern; //Spade, Heart ..
    String Denomination; //A, 2~10, J, Q, K

    void printYourSelf() {
        System.out.printf("%s-%s\n",pattern, Denomination);
    }
}
public class CardTest3 {
    public static void main(String[] args) {
        Card c = new Card();
        c.pattern = "Spade"; //속성에다가 ""String 값을넣겠다.
        c.Denomination = "A";
        c.printYourSelf(); // Spade-A 출력되게   // (Sapde-A , Spade-2 ...

        Card c2 = new Card();
        c2.pattern = "Heart";
        c2.Denomination = "J";
        c2.printYourSelf(); //Heart-J

        Card[] cards = makeCards();
        System.out.println(cards.length);

    }
    public static Card[] makeCards() {
        Card[] cArr = new Card[52];
        Card[] cArr2 = new Card[13];

        String[] kinds = {"String", "Heart", "Diamond", "Club"};
        int idx=0;
        for (int i=0; i< kinds.length; i++){
            for (int z=1; z<=cArr2.length; z++) {
                String Denomination = CardTest2.getNumberFromINt(z);
                cArr[idx++]= new Card();
                cArr[idx++].pattern = kinds[i];
                cArr[idx++].Denomination = Denomination;
            }
        }
        return cArr;
    }

}
