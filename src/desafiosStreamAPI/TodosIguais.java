package desafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class TodosIguais {
    public static void main(String[] args) {
        //Lista para testar se está correto
        // List<Integer> numeros = Arrays.asList(1, 1,1,1,1,1);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Todos são iguais?: " + (numeros.stream().allMatch(n -> n.equals(numeros.get(0) ))? "Sim" : "Não"));
        
    }
}
