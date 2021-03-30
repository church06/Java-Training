package C_3;

import java.util.Random;

public class C_3_24 {

    enum Cards {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    enum Suits {
        Clubs, Diamonds, Hearts, Spades
    }

    public static void main(String[] args) {
        C_3_24 c324 = new C_3_24();

        Random r = new Random();
        int suits_token = r.nextInt(4);
        int cards_token = r.nextInt(13);
        System.out.println("宁的卡牌为：" + c324.suits_r(suits_token) + " " + c324.cards_r(cards_token));
    }

    public Cards cards_r(int input) {
        switch (input) {
            case 0:
                return Cards.Ace;
            case 1:
                return Cards.Two;
            case 2:
                return Cards.Three;
            case 3:
                return Cards.Four;
            case 4:
                return Cards.Five;
            case 5:
                return Cards.Six;
            case 6:
                return Cards.Seven;
            case 7:
                return Cards.Eight;

            case 8:
                return Cards.Nine;

            case 9:
                return Cards.Ten;

            case 10:
                return Cards.Jack;

            case 11:
                return Cards.Queen;

            case 12:
                return Cards.King;

            default:
                return null;
        }
    }

    private Suits suits_r(int input) {
        switch (input) {
            case 0:
                return Suits.Clubs;

            case 1:
                return Suits.Diamonds;

            case 3:
                return Suits.Hearts;

            case 4:
                return Suits.Spades;

            default:
                return null;
        }
    }
}
