package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploComArrayList {


    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        nomes.add("Nome1");
        nomes.add("Nome59999");
        nomes.add("Nome3");
        nomes.add("Nome4");

        System.out.println(nomes);

        Collections.sort(nomes); // Trabalhando com ordenação simples

        System.out.println(nomes);

        nomes.set(1, "Larissa"); // Trocando valor na posição especifica

        System.out.println(nomes);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        int posicao = nomes.indexOf("Larissa");

        System.out.println(posicao+1);

        System.out.println("USANDO FOR");
        for(String nome : nomes){ // Iterando da forma mais comum
            System.out.println(nome);
        }

        var iterator = nomes.iterator(); // Iterando com iterator

        System.out.println("USANDO ITERATOR");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
