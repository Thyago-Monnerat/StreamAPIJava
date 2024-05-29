package desafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class RemoverImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Mantive os pares pois o desafio pede para remover os numeros ímpares, porém, a lista passada é imutável e não quis alterar o código da lista.
        System.out.println(numeros.stream().filter(n->n%2==0).toList());
    }
}
