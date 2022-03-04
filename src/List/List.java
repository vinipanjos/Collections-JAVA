package List;

import java.util.*;

class List {
    public static void main(String[] args) {

//        *List.List<Double> notas = new ArrayList<Double>();

        System.out.println("Crie uma lista e adicione 7 notas");

        //inicializando uma list, o exemplo que usou na aula n funcionou aqui, que seria a anotacao de cima
        ArrayList<Double> notas = new ArrayList<>(/*Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)*/);

        //adicionando um elemento na list
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        //exibindo toda a lista
        System.out.println(notas + "\n");

        //exibindo um determinado dado
        System.out.println("Exiba a posição da nota 5:\n" + notas.indexOf(5d));

        //adicionando um elemento em determinada posição da lista, no caso da posicao 4 passa a ser a 5
        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8.0);
        System.out.println(notas);

        //Alterando um elemento por outro elemento
        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //Conferindo um valor na lista
        System.out.println("Confira se o 5.0 está na lista: " + notas.contains(5.0));

        //Exibir a lista na ordem que foram adicionados
        System.out.println("Exiba todas as notas na ordem que foram informadas");
        for (Double nota: notas) System.out.print(nota + "  ");

        //Exibir um elemento de uma determinada posição na list
        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));

        //Exibir o menor valor da list
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //Exibir o maior valor da list
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma  = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //Exiba a media dos valores da list
        System.out.println("Exiba a soma dos valores: " + soma/notas.size());

        //Remova um valor na list
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //Remova uma posicao na list, logo a posicao 1 virara a posição 0 desse exemplo
        System.out.println("Remova a posicao 0: ");
        notas.remove(0);
        System.out.println(notas);

        //Removendo as notas observando criterios
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next<7) iterator1.remove();
        }
        System.out.println(notas);

        //Removendo todos os itens da list
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        //Conferir se a lista está vazia
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


    }
}
