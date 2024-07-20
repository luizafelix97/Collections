package Set;

import java.util.LinkedHashSet;

public class ExemploComLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> nomes = new LinkedHashSet<>(); //Mantém a ordem de inserção dos elementos

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
