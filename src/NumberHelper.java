import java.util.Arrays;

public class NumberHelper {

    static int sumaCyfr(int liczba) {
        String name = String.valueOf(liczba);
        int dlugosc = name.length();
        int suma = 0;
        for (int i = 0; i < dlugosc; i++) {
            suma = suma + Character.getNumericValue(name.charAt(i));
        }
        return suma;
    }

    static int sumaCyfr2(int liczba) {
        int suma = 0;
        counter(liczba);
        int[] tab = new int[counter(liczba)];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = liczba % 10;
            liczba = liczba / 10;
        }
        suma = sumFromArray(tab);
        return suma;
    }

    static int counter(int liczba) {
        int count = 0;
        while (liczba > 0) {
            liczba = liczba / 10;
            count++;
        }
        return count;
    }

    static int sumFromArray(int[] tablica) {
        int sum = 0;
        for (int s : tablica){
            sum = sum + s;
        }
        return sum;
    }
}
