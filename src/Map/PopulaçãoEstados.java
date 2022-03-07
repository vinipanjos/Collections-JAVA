package Map;

import java.util.*;

public class PopulaçãoEstados {
    /*
    Estado PE - Pop = 9616621
    Estado AL - Pop = 3351543
    Estado CE - Pop = 9187103
    Estado RN - Pop = 3534265
     */
    public static void main(String[] args) {
        System.out.println("Relacione os estados e sua população utilizando o Map");
        HashMap<String, Integer> estadosBrasileiros = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosBrasileiros);
        System.out.println("----------------------------------");
        //Substituindo um dado
        System.out.println("Substituindo a população de RN por 3534165");
        estadosBrasileiros.put("RN", 3534165);

        System.out.println("----------------------------------");
        //Conferindo se um dado está no map e inserindo se n tiver
        System.out.println("Conferindo se o estado PB está no map: " + estadosBrasileiros.containsKey("PB"));
        if (!estadosBrasileiros.containsKey("PB")) {
            System.out.println("Adicionando o novo estado");
            estadosBrasileiros.put("PB", 4039277);
        }
        System.out.println(estadosBrasileiros);

        System.out.println("----------------------------------");
        //Exibir os dados na ordem que foi informado
        System.out.println("Exibindo os estados na ordem q foi informado");
        LinkedHashMap<String, Integer> estadosBrasileiros1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estadosBrasileiros1);

        System.out.println("----------------------------------");
        //Exiba em ordem alfabetica
        System.out.println("Exibindo em ordem alfabetica os estados");
        TreeMap<String, Integer> estadosBrasileiros2 = new TreeMap<>(estadosBrasileiros);
        System.out.println(estadosBrasileiros2);

        System.out.println("----------------------------------");
        //Exiba o menor valor e sua key
        System.out.println("Exibindo a menor população e seu estado");
        Set<java.util.Map.Entry<String, Integer>> entries = estadosBrasileiros.entrySet();
        Integer menorPopulacao = Collections.min(estadosBrasileiros.values());
        String estadorMenorPopulacao  = "";
        for (java.util.Map.Entry<String, Integer> entry: entries ) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadorMenorPopulacao = entry.getKey();
                System.out.println("Estado com menor população: " + estadorMenorPopulacao + " - " + entry.getValue());
            }
        }

        System.out.println("----------------------------------");
        //Exiba o menor valor e sua key
        System.out.println("Exibindo a maior população e seu estado");
        Integer maiorPopulacao = Collections.max(estadosBrasileiros.values());
        String estadorMaiorPopulacao  = "";
        for (java.util.Map.Entry<String, Integer> entry: entries ) {
            if (entry.getValue().equals(maiorPopulacao)) {
                estadorMaiorPopulacao = entry.getKey();
                System.out.println("Estado com maior população: " + estadorMaiorPopulacao + " - " + entry.getValue());
            }
        }

        System.out.println("----------------------------------");
        //Somando os valores
        System.out.println("Obtendo o total da população desses estados somados");
        Iterator<Integer> iterator = estadosBrasileiros.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Populaçao total é de: " + soma);

        System.out.println("----------------------------------");
        //Obtendo a media de dados por numero de keys
        System.out.println("Obtendo a media da população por estado: " +  soma/estadosBrasileiros.size());

        System.out.println("----------------------------------");
        //Removendo algum dado de acordo com um criterio
        System.out.println("Remova os estados com população menor que 4 milhões e exiba os que sobraram: ");
        Iterator<Integer> iterator1 = estadosBrasileiros.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(estadosBrasileiros);

        //Removendo os dados do map
        System.out.println("Remova os estados da lista");
        estadosBrasileiros.clear();
        System.out.println("A lista está vazia: " + estadosBrasileiros.isEmpty());

    }
}
