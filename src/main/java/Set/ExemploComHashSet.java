package Set;

import java.util.HashSet;

public class ExemploComHashSet {

    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>(); // Não garantem a ordenação da inserção,
        // isso garante uma melhor perfomance na adição e remoção dos dados

        nomes.add("Nome1");
        nomes.add("Nome59999");
        nomes.add("Nome3");
        nomes.add("Nome4");

        System.out.println(nomes);

        var iterator =  nomes.stream().sorted().iterator(); // Iterando com iterator e ordenando com o sorted

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
