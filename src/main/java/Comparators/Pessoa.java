package Comparators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private Integer idade;

    @Override
    public int compareTo(Pessoa o) {
        return this.getIdade() - o.getIdade(); //Comparando idade
    }
}
