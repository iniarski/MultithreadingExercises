public class Zad5 {

    // Keyword synchronized

    static class Counter {

        private int count = 0;
        // licznik który będzie zwiększany

        /*synchronized*/ void increment() {
            count++;
            // metoda zwiększająca licznik
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {

        Counter c = new Counter();

        /*
        TODO:
        Zapoznaj się ze stworzoną wyżej klasą Counter

        Stwórz dwa Thready, a w nich wywołaj metodę increment() na obiekcie c klasy Counter wiele razy (np. 1024)
        zaczekaj aż skończą się wykonywać

        Czy wynik jest zgodny z oczekiwaniami?
        Odkomentuj słowo kluczowe synchronized, czy teraz wynik się zgadza?
         */

        // Pytanie 5: Dlaczego bez użycia synchronized wynik był błedny?
        // Jakie są wady używania synchronized

        System.out.println("Back to main");

        System.out.println("Count: " + c.getCount());

        /*
        Słowo kluczowe synchronized jest używane w języku Java do zastosowania synchronizacji na poziomie wątków.
        Pozwala to na kontrolowanie dostępu do współdzielonych zasobów w taki sposób,
        że tylko jeden wątek może mieć do nich dostęp w danym momencie.
         */

    }
}
