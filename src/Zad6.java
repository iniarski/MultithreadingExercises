import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Zad6 {

    // Threadpool

    public static void main(String[] args) {

        String[] nameList = {"Walnut", "Hazelnut", "Pistachio", "Peanut", "Almond", "Coconut",
                "Pecan", "Cashew", "Macadamia", "Brazil nut", "Chestnut", "Pine nut"};

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        /*
            TODO:
                W pętli utwórz 12 obiektów yourRunnable (po jednym dla każdego Stringa z nameList)
                Dodaj je do ExecutorService'a threadPool metodą submit
                Zmodyfikuj yourRunnable.run() tak, aby wyświetlało dodatkowo informację o aktualnym wątku
         */

        // Kod tutaj


        // zamknięcie - pula nie przyjmuje więcej zadań do wywołania
        threadPool.shutdown();

        // threadPool.submit(new yourRunnable("Not a nut"));

        // oczekiwanie na zakończenie wykonywania się zadań

        try {
            threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Back to main");

        // Pytanie 6: Na ilu wątkach wykonuje się metoda run objektów yourRunnable?
        // Czy wątki są obciążone równomiernie, kiedy zaczyna się ich wykonywanie?
        // Co się stanie jeżeli spróbujemy dodać zadanie do puli po zamknięciu?

    }



    static class yourRunnable implements Runnable // <- implementacja wielowątkowości
            // następuje poprzez wykorzystanie interfejsu Runnable
    {

        private String name;
        yourRunnable(String name) {
            this.name = name;
            System.out.println("yourRunnable object with name " + name + " created.");
        }

        @Override
        public void run() { // <- zdefiniowanie metody run


            /* TODO:
                1. wypisz na konsolę komunikat o rozpoczęciu i nazwę klasy (pole name)
                2. poczekaj losowy czas (np. od 0 do 5 sekund)
                3. wypisz na konsolę komunikat o zakończeniu
                4. Dodaj do wypisywanych komunikatów informacje o aktualnym wątku
             */


            // Kod tutaj: (możesz skopiować z poprzednich zadań)

            /* Przydatne klasy/metody

               1. Random.nextLong(long origin, long bound) - zwraca pseudolosowego longa
                                                            z przedziału origin - bound

               2. Thread.sleep(long millis) - wstrzymuje wykonanie wątku na podaną liczbę milisekund
                    UWAGA - metoda rzuca wyjątek InterruptedExecption - trzeba go obsłużyć

               3. Thread.currentThread() - metoda statyczna zwracająca referencję do aktualnego wątku

               4. Thread.getName() - zwraca stringa będącego nazwą aktalnego wątku

               5. ExecutorService.submit() - dodaje zadanie do wykonanie w puli
             */

        }
    }
}

