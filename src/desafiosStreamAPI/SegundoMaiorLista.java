package desafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class SegundoMaiorLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorDaLista = numeros.stream().max(Integer::compareTo).get();
        System.out.println(numeros.stream().filter(n -> n < maiorDaLista).sorted().max(Integer::compareTo).get());
    }
}
