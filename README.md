# Zadania z wielowątkowości

Zadania mają na celu ugruntowanie wiedzy przekazanej na prezentacji poprzez pokazanie praktycznej implementacji środowiska wielowątowego w Javie. Każde zadanie należy uzupełnić o wymagany kod oraz krótko odpowiedzieć na zadane pytania.


## [Zadanie 1](https://github.com/iniarski/MultithreadingExercises/blob/main/src/Zad1.java)
### Klasa Thread
Zadanie będzie polegało na implementacji prostej metody klasy dziedziczącej z klasy Thread, która będzie wywoływana na wielu wątkach jednocześnie.
Klasa Thread jest podstawową klasą do tworzenia i zarządzania wątkami. Reprezentuje pojedynczy wątek wykonywania, który może działać niezależnie i równolegle z innymi wątkami. Klasa Thread dostarcza mechanizmy do tworzenia, uruchamiania, kontrolowania oraz komunikowania się z wątkami.
## [Zadanie 2](https://github.com/iniarski/MultithreadingExercises/blob/main/src/Zad2.java)
### Interfejs Runnable
Cel zadania jest podobny do zadania 1, jednak w tym przypadku klasa implementowanej metody dziedziczy z klasy Runnable, co stanowi odmienny sposób na stworzenie wielowątkowej funkcjonalności w naszym programie.
Interfejs Runnable jest często używany w języku Java do tworzenia wątków. Jest to funkcjonalny interfejs, który definiuje jedną metodę o nazwie run(). Implementacja tego interfejsu umożliwia wykonanie konkretnej logiki w oddzielnym wątku.
## [Zadanie 3](https://github.com/iniarski/MultithreadingExercises/blob/main/src/Zad3.java)
### Lambda Expression
Zademonstrowany został przypadek tworzenia wątku z pomocą wyrażenia lambda. Należy uzupełnić kod w odpowiednim miejscu oraz przetestować pewną zmianę opisaną w 39 linijce.
Wątki z wykorzystaniem wyrażeń lambda, są bardziej zwięzłe i czytelne niż tradycyjne podejście oparte na implementacji interfejsu Runnable. Wykorzystując wyrażenie lambda, możemy bezpośrednio definiować kod, który ma zostać wykonany w oddzielnym wątku.
## [Zadanie 4](https://github.com/iniarski/MultithreadingExercises/blob/main/src/Zad4.java)
### Thread.join()
Zadanie polega na wywoływaniu kluczowych metod obiektu klasy Thread (start() i join()) w opdowiedniej kolejności. Dodatkowo należy uzupełnić kod jak w przypadku zadania 2.
Metoda start() jest używana do rozpoczęcia wykonywania wątku. Wywołanie tej metody powoduje uruchomienie nowego wątku i wywołanie metody run() wewnątrz tego wątku.
Metoda join() używana jest do synchronizacji wątków, czyli czekania na zakończenie innego wątku, zanim kontynuujemy wykonanie obecnego wątku.
Wywołanie thread.join() blokuje obecny wątek, aż wątek thread zakończy swoje działanie.
## [Zadanie 5](https://github.com/iniarski/MultithreadingExercises/blob/main/src/Zad5.java)
### Keyword synchronized
Wymagane jest uzupełnienie w opdowiedni sposób metody main() w celu utworzenia oraz uruchomienia wątków, oraz przetestowanie dwóch przypadków implementacji metody increment() - z użyciem słówka synchronized oraz bez niego.
Słowo kluczowe synchronized zapewnia mechanizm blokowania, który chroni przed wystąpieniem problemów związanych z równoczesnym dostępem do współdzielonych zasobów przez wiele wątków. Zapewnia spójność i bezpieczeństwo operacji na tych zasobach.
## [Zadanie 6](https://github.com/iniarski/MultithreadingExercises/blob/main/src/Zad6.java)
### Thread pool
W tym zadaniu przedstawione będzie tworzenie i działanie Thread Poola. 
Fixed Thread Pool (stały pulik wątków) jest mechanizmem zarządzania wątkami w języku Java, który pozwala na efektywne wykorzystanie ograniczonego zestawu wątków do przetwarzania zadań. W puliku wątków o stałej wielkości określa się, ile wątków ma być utworzonych i dostępnych do przetwarzania zadań.
## [Zadanie 7](https://github.com/iniarski/MultithreadingExercises/blob/main/src/Zad7.java)
### AtomicReference
W ostatnim zadaniu omówona zostania klasa Atomic reference. 
Służy do manipulowania referencjami obiektów w sposób bezpieczny dla wątków (thread-safe). 
AtomicReference umożliwia operacje atomowe na referencji obiektu, co oznacza, że można bezpiecznie wykonywać operacje odczytu i zapisu na tym obiekcie w środowisku wielowątkowym.
