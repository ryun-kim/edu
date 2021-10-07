package Exam_01;

import java.util.ArrayList;
import java.util.List;

public class CardMain {
    public static void main(String[] args) {
        List<Card> cards;
        String[] shape = {"spade", "heart", "diamond", "clover"};
        cards = new ArrayList();
        int ln = 13;
        for (int i = 0; i < shape.length; i++) {
            for (int z = 1; z <= ln; z++) {
                String value = String.valueOf(z);
                switch (z) {
                    case 1:
                        value = "A";
                        break;
                    case 11:
                        value = "J";
                        break;
                    case 12:
                        value = "Q";
                        break;
                    case 13:
                        value = "K";
                        break;
                    default:
                        value = String.valueOf(z);
                }
                Card cd = new Card(shape[i], value);
                cards.add(cd);
            }
        }

        for(int i =0; i<cards.size(); i++){
            Card c = cards.get(i);
            System.out.println(c);
        }
        System.out.println("------");
        Card c1 = new Card("spade", "K");
        System.out.println(c1);
        Card c2 = new Card("heart", "2");
        System.out.println(c2);

    }
}

