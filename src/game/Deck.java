package game;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Deck {
    private final Random random = new Random();
    public HashSet<Card> deck;

    public void prepareDeck() {
        deck.add(new Card("Двойка крести", 2));
        deck.add(new Card("Двойка бубна", 2));
        deck.add(new Card("Двойка пика", 2));
        deck.add(new Card("Двойка черви", 2));

        deck.add(new Card("Тройка крести", 3));
        deck.add(new Card("Тройка бубна", 3));
        deck.add(new Card("Тройка пика", 3));
        deck.add(new Card("Тройка черви", 3));

        deck.add(new Card("Четверка крести", 4));
        deck.add(new Card("Четверка бубна", 4));
        deck.add(new Card("Четверка пика", 4));
        deck.add(new Card("Четверка черви", 4));

        deck.add(new Card("Пятерка крести", 5));
        deck.add(new Card("Пятерка бубна", 5));
        deck.add(new Card("Пятерка пика", 5));
        deck.add(new Card("Пятерка черви", 5));

        deck.add(new Card("Шестерка крести", 6));
        deck.add(new Card("Шестерка бубна", 6));
        deck.add(new Card("Шестерка пика", 6));
        deck.add(new Card("Шестерка черви", 6));

        deck.add(new Card("Семерка крести", 7));
        deck.add(new Card("Семерка бубна", 7));
        deck.add(new Card("Семерка пика", 7));
        deck.add(new Card("Семерка черви", 7));

        deck.add(new Card("Восьмерка крести", 8));
        deck.add(new Card("Восьмерка бубна", 8));
        deck.add(new Card("Восьмерка пика", 8));
        deck.add(new Card("Восьмерка черви", 8));

        deck.add(new Card("Девятка крести", 9));
        deck.add(new Card("Девятка бубна", 9));
        deck.add(new Card("Девятка пика", 9));
        deck.add(new Card("Девятка черви", 9));

        deck.add(new Card("Десятка крести", 10));
        deck.add(new Card("Десятка бубна", 10));
        deck.add(new Card("Десятка пика", 10));
        deck.add(new Card("Десятка черви", 10));

        deck.add(new Card("Валет крести", 11));
        deck.add(new Card("Валет бубна", 11));
        deck.add(new Card("Валет пика", 11));
        deck.add(new Card("Валет черви", 11));

        deck.add(new Card("Дама крести", 12));
        deck.add(new Card("Дама бубна", 12));
        deck.add(new Card("Дама пика", 12));
        deck.add(new Card("Дама черви", 12));

        deck.add(new Card("Король крести", 13));
        deck.add(new Card("Король бубна", 13));
        deck.add(new Card("Король пика", 13));
        deck.add(new Card("Король черви", 13));

        deck.add(new Card("Туз крести", 14));
        deck.add(new Card("Туз бубна", 14));
        deck.add(new Card("Туз пика", 14));
        deck.add(new Card("Туз черви", 14));
    }

    public Card getRandomCard() {
        if (deck.isEmpty()) {
            System.out.println("Колода пуста");
            return null;
        } else {
            int index = random.nextInt(deck.size());
            return deck.get(index);
        }
    }
}
//ЧЛЕЕЕЕЕЕЕЕЕЕЕЕНЫЫЫЫЫЫЫЫЫ
