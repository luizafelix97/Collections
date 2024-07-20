package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdernacaoServiceImpl {

    public static void main(String [] args){
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("nome1", 37));
        pessoas.add(new Pessoa("nome2", 13));
        pessoas.add(new Pessoa("nome3", 95));

        imprimindoListaPessoas(pessoas);

        pessoas.sort((first,second) -> first.getIdade() - second.getIdade()); //Ordenando por idade crescente

        imprimindoListaPessoas(pessoas);

        pessoas.sort((first,second) -> second.getIdade() - first.getIdade()); //Ordenando por idade decrescente

        imprimindoListaPessoas(pessoas);

        pessoas.sort(Comparator.comparing(Pessoa::getIdade)); //Ordenando por idade

        imprimindoListaPessoas(pessoas);

        pessoas.sort(Comparator.comparing(Pessoa::getNome)); //Ordenando por nome

        imprimindoListaPessoas(pessoas);

        Collections.sort(pessoas); //Ordenando com Collections, só serve se for uma lista de um objeto que implementa a interface Comparable

        imprimindoListaPessoas(pessoas);

        Collections.sort(pessoas, new PessoaComparator());

        imprimindoListaPessoas(pessoas);
    }

    static void imprimindoListaPessoas(List<Pessoa> lista){
        for(Pessoa pessoa : lista){
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
        }
    }

}
