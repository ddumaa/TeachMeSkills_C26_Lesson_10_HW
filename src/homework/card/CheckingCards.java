package homework.card;

import homework.client.ClientInfo;

public class CheckingCards {
   public static void checkingCardsMethod (int id1, int id2){
        if (ClientInfo.cards.length == 0 ) {
            System.out.println("You don't have a card");
        } else if (id1 == id2) {
            System.out.println("One card indicated");
        } else if (ClientInfo.cards.length < id1 || ClientInfo.cards.length < id2){
            System.out.println("You don't have such a card");
        } else if (ClientInfo.cards[id1].equals(ClientInfo.cards[id2])){
            System.out.println("The cards are the same");
        } else {
            System.out.println("The cards are not the same");
        }
    }
}
