import java.util.Random;

public class Zad2 {

    // Wielowątkowość - Runnable

    public static void main(String[] args) {

        // tworzenie obiektów
        yourRunnable runnable1 = new yourRunnable("Peanut");
        yourRunnable runnable2 = new yourRunnable("Walnut");
        yourRunnable runnable3 = new yourRunnable("Pecan");

        // tworzenie Threadów, w których zostanie uruchomiona metoda run

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        // wywołanie metody run
        thread1.run();
        thread2.run();
        thread3.run();

        System.out.println("Back to main.");


        // wywołanie metody start
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Back to main.");

        // Pytanie 2 : Czym róźnią się klasa Thread i interfejs Runnable?
        // Dlaczego oglibyśmy woleć zastosowac Runnable bardziej niż Thread?

    }

    static class yourRunnable implements Runnable // <- implementacja wielowątkowości
                                           // następuje poprzez wykorzystanie interfejsu Runnable
    {

        private String name;
        yourRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() { // <- zdefiniowanie metody run

            /*
            TODO:
             1. wypisz na konsolę komunikat o rozpoczęciu i nazwę klasy (pole name)
             2. poczekaj losowy czas (np. od 0 do 5 sekund)
             3. wypisz na konsolę komunikat o zakończeniu */

            // Kod tutaj: (możesz skopiować z poprzedniego zadania)

            /* Przydatne klasy/metody

               1. Random.nextLong(long origin, long bound) - zwraca pseudolosowego longa
                                                            z przedziału origin - bound

               2. Thread.sleep(long millis) - wstrzymuje wykonanie wątku na podaną liczbę milisekund
                    UWAGA - metoda rzuca wyjątek InterruptedExecption - trzeba go obsłużyć
             */

        }
    }
}

