package ArcoIris;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        //Informar as cores do arco-iris
        System.out.println("Crie um conjunto e adicione as notas: ");
        HashSet<String> coresArcoIris = new HashSet<>(Arrays.asList("verde", "amarelo", "vermelho", "azul", "laranja",
                "violeta", "azul-escuro"));
        for (String cores : coresArcoIris) System.out.print(cores + "  ");

        //Informar a quantidade de cores
        System.out.println("\nNumero de cores: " + coresArcoIris.size());

        //Informe as cores em ordem alfabetica
        TreeSet<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
        for (String cores : coresArcoIris1) System.out.print(cores + "  ");

        //Informe as cores na ordem inversa que foi informado
        LinkedHashSet<String> coresArcoIris2 = new LinkedHashSet<>();
        
        System.out.println("Imprimindo a lista na ordem inversa:\n" + coresArcoIris2);
        //Exiba todas as cores que comecam com a letra V
        System.out.println("Cores que comecam com V");
        for (String cores : coresArcoIris) {
            if (cores.startsWith("v"))
                System.out.print(cores + "  ");
        }
        //Removendo as cores que não comecam com a letra V
        System.out.println("\nRemovendo cores que não começam com V");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (!next.startsWith("v")) iterator.remove();
        }
        System.out.println(coresArcoIris);
    }
}

