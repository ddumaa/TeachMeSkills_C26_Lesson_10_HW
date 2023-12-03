package homework;

import java.util.Objects;

public class Card {
    int cvv;
    String cardNumber;
    double money;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && Objects.equals(cardNumber, card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }

    public Card (int cvv, String cardNumber, double money) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.money = money;
    }
}
