import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class Zad7 {

    // Atomic reference

    public static void main(String[] args) {

        String[] nameList = {"Walnut", "Hazelnut", "Pistachio", "Peanut", "Almond", "Coconut",
                "Pecan", "Cashew", "Macadamia", "Brazil nut", "Chestnut", "Pine nut"};

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        AtomicReference<Long> totalTime = new AtomicReference<>(0L);

        /*
            TODO:
               Zmodyfikuj klasę yourRunnable jak opisano poniżej
               Utwór obiekty w pętli jak opsano poniżej
         */

        // Kod tutaj:

        // zamknięcie - pula nie przyjmuje więcej zadań do wywołania
        threadPool.shutdown();

        // oczekiwanie na zakończenie wykonywania się zadań

        try {
            threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Back to main");

        System.out.println("Total time: " + totalTime.get() + "ms");

        // Pytanie 7: Do czego

    }



    static class yourRunnable implements Runnable // <- implementacja wielowątkowości
            // następuje poprzez wykorzystanie interfejsu Runnable
    {

        private String name;
        private AtomicReference<Long> timeCounter;
        yourRunnable(String name, AtomicReference<Long> timeCounter) {
            this.name = name;
            this.timeCounter = timeCounter;
            System.out.println("yourRunnable object with name " + name + " created.");
        }

        @Override
        public void run() { // <- zdefiniowanie metody run

            /* TODO:
                Zmodyfikuj klasę yourRunnable, tak aby konstruktor przyjmował dodatkowy parametr typu
                AtomicReference<Long> i zapisał go do prywatnego pola
                Podczas wykonywania metody run zwiększ wartość referencji o czas podany to Thread.sleep
             */


            // Kod tutaj: (możesz skopiować z poprzedniego zadania)

            /* Przydatne klasy/metody

               1. Random.nextLong(long origin, long bound) - zwraca pseudolosowego longa
                                                            z przedziału origin - bound

               2. Thread.sleep(long millis) - wstrzymuje wykonanie wątku na podaną liczbę milisekund
                    UWAGA - metoda rzuca wyjątek InterruptedExecption - trzeba go obsłużyć

               3. Thread.currentThread() - metoda statyczna zwracająca referencję do aktualnego wątku

               4. Thread.getName() - zwraca stringa będącego nazwą aktalnego wątku

               5. ExecutorService.submit() - dodaje zadanie do wykonanie w puli

               6/7. AtomicReference.get()/set() - otrzymywanie/ustawianie wartości
             */

        }
    }
}

