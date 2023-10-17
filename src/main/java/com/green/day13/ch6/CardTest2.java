package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2 {
    public static void main(String[] args) {
        Card[] cards = makeCards(); //52개의 Card 배열
        //Card[] cards2 = makeCards();
        System.out.println(cards.length); //52

        for(Card c : cards) { //c 주소값 계속바뀌면서
            c.printYourSelf();  //Spade (A)
                                //Heart (2)
        }
    }
    public static Card[] makeCards() {
            Card[] cards = new Card[52]; //Card 객체의 cards배열
            Card c1 = new Card();

            String[] kinds = {"String", "Heart", "Diamond", "Club"};
            int cnt = 0;
        for (int i=0; i<kinds.length; i++) {
            for (int z=1; z<=13; z++) {
                String number = getNumberFromINt(z); // 1> "A", 2> "2", 13 > "K"
                Card c= new Card();
                c1.kind = kinds[i];
                c1.number = number;
                cards[cnt++] = c;
            }
        }
            //Spade, Heart, Diamond, Club
            //A, 2~10, J, Q, K 순차적으로 카드 객체 만들어서 넣기
        return cards;
    }
    public static String getNumberFromINt(int nums) {  //Integer.parseInt() 문자열을 정수로//String.valueOf()정수를 문자열로
        switch(nums) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(nums);
    }
}
