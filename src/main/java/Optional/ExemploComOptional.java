package Optional;

import java.util.Optional;

public class ExemploComOptional {
    public static void main(String [] args){
        Optional<String> optionalValor = Optional.of("Contem valor");

        optionalValor.ifPresent(System.out::println);

        if(optionalValor.isPresent()){
            System.out.println("Não está nulo");
        }

        System.out.println(optionalValor.stream().count());

        optionalValor = Optional.ofNullable(null); //para informar que o valor pode ser Nulo

        optionalValor.ifPresentOrElse(System.out::println, () -> System.out.println("Está nulo"));

        if(optionalValor.isEmpty()){
            System.out.println("Está nulo");
        }
    }
}
