package Set;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        //Criar um conjunto e adicionar notas
        System.out.println("Crie um conjunto e adicione as notas: ");
        HashSet<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //Não consegue manipular a posição ou elemento
        //Não consegue exibir um elemento pela posição

        //Conferindo se possui um elemento no set
        System.out.println("Confira se a nota 5 está no conjunto " + notas.contains(5.0));

        //Conferindo o menor valor no set, para o maior é só mudar o min para max
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //Exibir a soma de todos os valores
        System.out.println("Exibindo a soma de todos os valores: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("Logo a media é " + soma/ notas.size());

        //Removendo um elemento do set
        System.out.println("Remover o 0.0");
        notas.remove(0.0);
        System.out.println(notas);

        //Removendo as notas de acordo com um criterio
        System.out.println("Remova as notas abaixo de 7.0");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next<7) iterator1.remove();
        }
        System.out.println(notas);

        //Exiba a nota na ordem que foram adicionada
        System.out.println("Informe as notas na ordem que foram adicionadas");
        LinkedHashSet<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        notas2.add(2.6);
        System.out.println(notas2);

        //Exibir as notas em ordem crescente
        System.out.println("Informe as notas em ordem crescente");
        TreeSet<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        //Apagar o conjunto
        System.out.println("Apague o conjunto");
        notas.clear();

        //Verificar se está vazio
        System.out.println("Verificar se está vazio " + notas.isEmpty());
        System.out.println("Verificar se está vazio " + notas2.isEmpty());
        System.out.println("Verificar se está vazio " + notas3.isEmpty());
    }
}
