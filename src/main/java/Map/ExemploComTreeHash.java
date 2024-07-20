package Map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploComTreeHash {
    public static void main(String[] args) {
        TreeMap<String,String> nomes = new TreeMap<>();

        nomes.put("RJ", "Rio de Janeiro");
        nomes.put("SP", "São Paulo");
        nomes.put("ES", "Espirito Santo");
        nomes.put("MG", "Minas Gerais");

        System.out.println(nomes.firstEntry());
        System.out.println(nomes.firstKey());
        System.out.println(nomes.lastEntry());
        System.out.println(nomes.lastKey());

        for(Map.Entry<String,String> entry : nomes.entrySet()){ //Para varrer todos os valores de chave e valor
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for(String key : nomes.keySet()){ //Para varrer todos os valores de chave e valor
            System.out.println(key + " " + nomes.get(key));
        }

        System.out.println(nomes.pollFirstEntry());
        System.out.println(nomes.pollLastEntry());

    }
}
