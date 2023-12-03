package homework.client;

import homework.card.Card;

public class ClientInfo {
    String firstName;
    String lastName;
    public static Card[] cards;

    public ClientInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
