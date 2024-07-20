package Map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploComHashTable {
    public static void main(String[] args) {
        Hashtable<String, Double> mediaAlunos = new Hashtable<>(); // A diferança dele pro HashMap é que ele é multithread
        mediaAlunos.put("Aluno1", 9.5);
        mediaAlunos.put("Aluno2", 5.9);
        mediaAlunos.put("Aluno4", 8.1);

        System.out.println("Trás a nota do Aluno1 " + mediaAlunos.get("Aluno1"));

        System.out.println("Verifica se existe o Aluno1 " +mediaAlunos.containsKey("Aluno1"));

        System.out.println("Verifica se existe a média 8.1 " + mediaAlunos.containsValue(8.1));

        for(Map.Entry<String,Double> entry : mediaAlunos.entrySet()){ //Para varrer todos os valores de chave e valor
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for(String key : mediaAlunos.keySet()){ //Para varrer todos os valores de chave e valor
            System.out.println(key + " - " + mediaAlunos.get(key));
        }

        for(Double value : mediaAlunos.values()){ //Para varrer todos os valores de valor apenas
            System.out.println(value);
        }
    }
}
