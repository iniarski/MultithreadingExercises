import java.util.Random;

public class Zad4 {

    // Metoda join

    public static void main(String[] args) {

        // tworzenie obiektów
        yourRunnable runnable1 = new yourRunnable("Macadamia");
        yourRunnable runnable2 = new yourRunnable("Hazelnut");
        yourRunnable runnable3 = new yourRunnable("Cashew");

        // tworzenie Threadów

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);


        // Kod tutaj:


        /*
        TODO:
            wywołaj na threadach metody start i join
            w jakiej kolejności to zrobisz (start, join, start, join, start, join czy
            start, start, start, join, join, join), dlaczego?

            UWAGA: metoda Thread.join() rzuca wyjątek InterruptedException
            Wskazówka: aby nie musieć każdorazowo obsługiwać wyjątków możemmy oddelegować ten wyjątek do metody main,
            metoda main może rzucać ten wyjątek (keyword throws)
         */

        System.out.println("Back to main.");

        // Pytanie 4 : Jak działa metoda join?

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

            // Kod tutaj: (możesz skopiować z zadań 1/2)


            /* Przydatne klasy/metody

               1. Random.nextLong(long origin, long bound) - zwraca pseudolosowego longa
                                                            z przedziału origin - bound

               2. Thread.sleep(long millis) - wstrzymuje wykonanie wątku na podaną liczbę milisekund
                    UWAGA - metoda rzuca wyjątek InterruptedExecption - trzeba go obsłużyć
             */

        }
    }
}

