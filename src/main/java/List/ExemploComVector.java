package List;

import java.util.List;
import java.util.Vector;

public class ExemploComVector {
    public static void main(String[] args){
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("boliche");
        esportes.add("vôlei");
        esportes.add("tênis");

        var iterator = esportes.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
