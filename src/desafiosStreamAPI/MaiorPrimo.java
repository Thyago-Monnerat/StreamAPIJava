package desafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MaiorPrimo {

    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(numero)).noneMatch(i -> numero % i == 0);
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream().filter(MaiorPrimo::primo).toList();

        System.out.println(primos.stream().max(Integer::compareTo).get());
    }
}
