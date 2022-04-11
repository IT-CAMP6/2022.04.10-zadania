public class Zadanie1 {
    public static void main(String[] args) {
        //tworzenie tablicy
        int[] tab = new int[100];

        //uzupełniane tablicy kolejnymi liczbami
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }

        //wyświetlanie uzupełnionej tablicy
        for(int element : tab) {
            System.out.println(element);
        }


        System.out.println("Liczby podzielne przez 2 lub 5:");
        for(int element : tab) {
            if(element % 2 == 0 || element % 5 == 0) {
                System.out.println(element);
            }
        }
    }
}
