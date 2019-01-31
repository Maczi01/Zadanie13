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
}
