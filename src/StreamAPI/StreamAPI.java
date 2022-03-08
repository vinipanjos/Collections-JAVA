package StreamAPI;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4","1","2","3","9","9","6","5");

        //Imprimir todos os elementos
        System.out.println("Imprimindo todos os numeros da lista: ");

        /*Interface Funcional*/
//        numerosAleatorios.stream().forEach( new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        /*Lambda*/
//        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        /*Method Reference*/
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("----------------------------------------------");

        //Selecionando dados da list e implementando em um set
        System.out.println("Pegue os cinco primeiros numeros e coloque dentro de um set");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
        Set<String> collect = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collect);

        System.out.println("----------------------------------------------");

        //Tranformando o tipo dos elementos
        System.out.println("Transforme essa lista de string em lista de inteiros");
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatorios1);
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        //Separando dados de acordo com algum criterio e colocando numa lista
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer i) {
//                        if (i > 2 && i%2==0) return true;
//                        return false;
//                    }
//                }).collect(Collectors.toList())
//                .forEach(System.out::println);

        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> {
                    if (i > 2 && i % 2 == 0) return true;
                    return false;
                }).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("----------------------------------------------");

        //Pegando a media dos valores
        System.out.println("Mostre a média dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("----------------------------------------------");

        //Removendo valores
        System.out.println("Remova os valores impares ");
        numerosAleatorios1.removeIf(i -> (i%2 ==1));
        System.out.println(numerosAleatorios1);

        System.out.println("----------------------------------------------");

        //Ignorando dados
        System.out.println("Ignore os 3 primeiros elementos e imprima o resto");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        //Removendo valores e exibindo o tamanho q ficou a lista
        System.out.println("Remova os valores impares e mostra quantos restaram ");
        Set<String> collectNaoRepetidos = numerosAleatorios.stream()
                .collect(Collectors.toSet());
        System.out.println(collectNaoRepetidos.size());

        System.out.println("----------------------------------------------");

        //Mostrando o menor valor
        System.out.println("Mostre o menor valor da lista ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .min()
                .ifPresent(System.out::println);


        System.out.println("----------------------------------------------");

        //Mostrando o maior valor
        System.out.println("Mostre o maior valor da lista ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);


        System.out.println("----------------------------------------------");

        //Pegando um tipo de dado e somando
        System.out.println("Pegue os numeros impares e some");
        int somaImpares = numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .filter(i-> (i%2==1))
                .sum();
        System.out.println(somaImpares);
    }
}
