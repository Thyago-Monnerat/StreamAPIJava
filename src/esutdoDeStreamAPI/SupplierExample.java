package esutdoDeStreamAPI;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
  public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
    // Não precisa usar o Collectors
    List<String> listaSaudacoes2 = Stream.generate(saudacao).limit(5).toList();
    // Usando Supplier
    List<String> listaSaudacoes3 = Stream.generate(new Supplier<String>(){
        @Override
        public String get(){
           return "Olá, seja bem-vindo(a)!";
        }
    }).limit(5).toList();
    // Usando Lambda
    List<String> listaSaudacoes4 = Stream.generate(()-> "Olá, seja bem-vindo(a)!").limit(5).toList();

    System.out.println("------------------------------ Com Collectors ------------------------------");
    // Imprimir as saudações geradas com Reference Method
    listaSaudacoes.forEach(System.out::println);
    System.out.println("------------------------------ Sem Collectors ------------------------------");
    // Imprimir as saudações geradas com Lambda Expressions
    listaSaudacoes2.forEach(s -> System.out.println(s));
    System.out.println("------------------------------ Criando um Supplier ------------------------------");
    listaSaudacoes3.forEach(System.out::println);
    System.out.println("------------------------------ Com Lambda ------------------------------");
    listaSaudacoes4.forEach(s -> System.out.println(s));
  }
}