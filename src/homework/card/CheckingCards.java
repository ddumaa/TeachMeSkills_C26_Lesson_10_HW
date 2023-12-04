package homework.card;

import homework.client.ClientInfo;

public class CheckingCards {
    public static void checkingCardsMethod(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            int count = 0;
            for (int x = 0; x < cards.length; x++) {
                if (cards[i].equals(cards[x])) {
                    count++;
                }
            }
            if (i == cards.length - 1) {
                if (count > 0) {
                    System.out.println("Same cards: " + count*2);
                } else {
                    System.out.println("There are no identical cards");
                }
            }
        }
    }
}

