package Set;

import java.util.TreeSet;

public class ExemploComTreeSet {
    public static void main(String[] args) {
        TreeSet<String> nomes = new TreeSet<>(); //Cada modificação dispara uma nova ordenação da árvore
        // isso pode acarretar problemas de performance

        nomes.add("RJ");
        nomes.add("SP");
        nomes.add("ES");
        nomes.add("MG");

        System.out.println(nomes);

        System.out.println("Topo da árvore " + nomes.first());
        System.out.println("ùltimo da árvore " + nomes.last());
        System.out.println("Primeiro abaixo do parâmetro da árvore " + nomes.lower("MG"));
        System.out.println("Primeiro acima do parâmetro da árvore " + nomes.higher("MG"));

        var iterator =  nomes.stream().sorted().iterator(); // Iterando com iterator e ordenando com o sorted

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Imprimindo e removendo o primeiro" + nomes.pollFirst()); //Removendo o primeiro da lista
        System.out.println("Imprimindo e removendo o último" + nomes.pollLast()); //Removendo o último da lista
    }
}
