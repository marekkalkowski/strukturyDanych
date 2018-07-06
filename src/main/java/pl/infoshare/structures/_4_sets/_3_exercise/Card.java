package pl.infoshare.structures._4_sets._3_exercise;

public class Card {

    private final Integer value;
    private final CardType cardType;

    public Card(Integer value, CardType cardType) {
        this.value = value;
        this.cardType = cardType;
    }

    public Integer getValue() {
        return value;
    }

    public CardType getCardType() {
        return cardType;
    }
}