package desafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class MediaMaior5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> listaImpares = numeros.stream().filter(n -> n> 5).toList();

        System.out.println(listaImpares.stream().reduce(0, Integer::sum)/listaImpares.size());
    }
}
