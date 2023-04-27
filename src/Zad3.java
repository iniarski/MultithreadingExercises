import java.util.Arrays;

public class Zad3 {

    // lambda expression

    public static void main(String[] args) {

        // tworzenie tablicy z liczbami od 0 do 99

        int[] numbersArray = new int[100];

        for (int i = 0; i < 100; i++) {
            numbersArray[i] = i;
        }

        // tablica do której zapisujemy wyniki

        int[] sumsArray = new int[10];



        for (int i = 0; i < 10; i++) {

            int finalI = i;

            Thread sumThread = new Thread(() -> {
                /*
                wyrażenie lambda (lambda expression)
                składnia () -> {}
                to anonimowa funkcja, w tym przypadku umożliwia stwożenie metodey bez pisania
                klasy implementującej Runnable

                    TODO:
                        Zapisz do sumsArray sumy kolejnych 10 liczb
                        sumsArray[0] to suma liczb 0 - 9
                        sumsArray[1] to suma liczb 10 - 19 itd...
                        Spróbuj zastąpi zmienną finalI itreratorem pętli (i)
                        Co się stanie?
                 */

                int sum = 0;

                System.out.println("Thread nr " + (finalI + 1) + " starting");

                // Kod tutaj :

                // .

                sumsArray[finalI] = sum;

                System.out.println("Thread nr " + (finalI + 1) + " finished");

            });

            sumThread.start();
        }

        System.out.println(Arrays.toString(sumsArray));

        // Pytanie 3: Czy wyniki są zgodne z oczekiwaniami, dlaczego?
        // Dlaczego używamy zmiennej finalI a nie i?

    }
}

