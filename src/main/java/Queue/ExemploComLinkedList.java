package Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ExemploComLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pam");
        filaBanco.add("Paty");
        filaBanco.add("Perla");
        filaBanco.add("Princesa");

        System.out.println(filaBanco);

        var clienteASerAtendido = filaBanco.poll(); // Trás o primeiro elemento da fila e remove ele da lista

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        var primeiroCliente = filaBanco.peek(); // Trás o primeiro elemento da fila, sem remover ele da lista

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        primeiroCliente = filaBanco.element(); // Trás o primeiro elemento da fila igual ao peek, sem remover ele da lista, mas se a lista estiver vazia da uma exceção NoSuchElement

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        var iterator = filaBanco.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        filaBanco.clear();

        try{
            filaBanco.element(); //Testando exception gerada pelo método Element() da queue quando a fila está vazia
        }catch (NoSuchElementException e){
            System.out.println("Lista está vazia");
        }


    }

}
