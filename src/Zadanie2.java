import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Random random = new Random();
        //tworzenie tablicy
        int[] tab = new int[100];

        //uzupełniane tablicy losowymi liczbami
        for(int i = 0; i < tab.length; i++) {
            //int randomNumber = random.nextInt(21) + 100;
            tab[i] = random.nextInt(1001);
        }

        //wyświetlanie uzupełnionej tablicy
        for(int element : tab) {
            System.out.println(element);
        }

        //wyliczanie średniej
        double suma = 0.0;
        for(int element : tab) {
            suma = suma + element;
        }

        System.out.println("Avg: ");
        System.out.println(suma / (double) tab.length);
    }
}
