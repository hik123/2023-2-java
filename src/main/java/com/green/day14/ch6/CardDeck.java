package com.green.day14.ch6;

public class CardDeck {
    Card[] cards;
    public CardDeck() {
        init();
    }
    private void init() {
        cards = new Card[52];

        String[] patterns = { "Spade", "Heart", "Diamond", "Club" };
        int idx = 0;
        for(int i=0; i<patterns.length; i++) {
            String pattern = patterns[i];
            for(int z=1; z<=13; z++) {
                String denomination = this.getNumberFromINt(z);
                cards[idx++] = new Card(pattern, denomination); // << Card c = new Card(pattern, denomination);
                                                                //    cards[i++] = c;
            }
        }
    }
    public void printAll() {
        for (Card c : cards) {
            c.printMySelf();
        }
    }
    public Card getCard() {
        Card c = null;
        while (true) {
            int rIdx = (int) (Math.random() * cards.length);
            c = cards[rIdx];
            if(c != null) {
                cards[rIdx] = null;
                break;
            }
        }
        return c;
    }
    private String getNumberFromINt(int num) {  //private 같은클래스 내에서만 사용가능
        switch(num) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
        }
        return String.valueOf(num);
    }
}
