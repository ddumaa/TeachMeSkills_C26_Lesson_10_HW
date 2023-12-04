package homework.card;

import homework.client.ClientInfo;

public class CheckingCards {
    public static void checkingCardsMethod(){
        for (int i = 0; i < ClientInfo.cards.length; i++){
            int count = 0;
            for (int x = 0; x < ClientInfo.cards.length; x++){
                if (ClientInfo.cards[i].equals(ClientInfo.cards[x])) {
                    count++;
                }
            }
            if (i == ClientInfo.cards.length-1){
                if (count > 0){
                    System.out.println("Same cards: " + count);
                } else {
                    System.out.println("There are no identical cards");
                }
            }
        }
    }
}
