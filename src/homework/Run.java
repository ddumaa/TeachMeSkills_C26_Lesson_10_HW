package homework;

import homework.card.Card;
import homework.card.CheckingCards;
import homework.client.ClientInfo;

public class Run {
    public static void main(String[] args) {
        Card card_1 = new Card(123, "1234_5678_000", 158.34);
        Card card_2 = new Card(123, "1234_5678_000", 548.74);
        Card card_3 = new Card(127, "1234_5678_000", 24.03);
        Card card_4 = new Card(127, "1134_5678_000", 124.40);
        ClientInfo client1 = new ClientInfo("Anton", "Miguyan");
        client1.cards = new Card[]{card_1, card_2, card_3, card_4};
        CheckingCards.checkingCardsMethod();
    }
}
