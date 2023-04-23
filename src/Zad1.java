import java.util.Random;

public class Zad1{

    // Wielowątkowość - Thread

    public static void main(String[] args) {

        // tworzenie obiektów
        yourThread thread1 = new yourThread("Hazelnut");
        yourThread thread2 = new yourThread("Almond");
        yourThread thread3 = new yourThread("Pistachio");

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

        // Pytanie 1 : Czym róźnią się metody run i start

    }

    static class yourThread extends Thread // <- implementacja wielowątkowości
                                           // następuje poprzez rozszerzenie klasy Thread
    {

        private String name;
        yourThread(String name) {
            this.name = name;
        }

        @Override
        public void run() { // <- nadpisanie metody run klasy Thread

            /* TODO:
             1. wypisz na konsolę komunikat o rozpoczęciu i nazwę klasy (pole name)
             2. poczekaj losowy czas (np. od 0 do 5 sekund)
             3. wypisz na konsolę komunikat o zakończeniu */

            // Kod tutaj:


            /* Przydatne klasy/metody

               1. Random.nextLong(long origin, long bound) - zwraca pseudolosowego longa
                                                            z przedziału origin - bound

               2. Thread.sleep(long millis) - wstrzymuje wykonanie wątku na podaną liczbę milisekund
                    UWAGA - metoda rzuca wyjątek InterruptedExecption - trzeba go obsłużyć
             */

        }
    }
}

