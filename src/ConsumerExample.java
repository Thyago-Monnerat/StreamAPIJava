import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9,0);

    // Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };

    // Usar o Consumer para imprimir números pares no Stream
    numeros.stream().forEach(imprimirNumeroPar);

    // Pode ser feito assim também
    numeros.stream().forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer n) {
        if(n % 2 == 0){
          System.out.println(n);
        }
      }
    });

    // Ou assim
    numeros.forEach(numero -> {if(numero % 2 == 0){System.out.println(numero);}});

    // Podemos aplicar um Predicate
    numeros.stream().filter(new Predicate<Integer>(){
      @Override
      public boolean test(Integer n) {
        return n % 2 == 0;
      }
      
    }).forEach(numero -> {if(numero % 2 == 0){System.out.println(numero);}});

    // Podemos aplicar um Predicate com lambda e Reference Method
    numeros.stream().filter(n->n%2==0).forEach(System.out::println);

  }
}