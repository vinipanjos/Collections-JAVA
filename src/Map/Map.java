package Map;

import java.util.*;

public class Map {
    /*
    Dados os modelos de carro e seus consumos na estrada, faça:
    modelo = gol, consumo = 14,4 km/l
    modelo = uno, consumo = 15,6 km/l
    modelo = mobi, consumo = 16,1 km/l
    modelo = hb20, consumo = 14,5 km/l
    modelo = kwid, consumo = 15,6 km/l
     */
    public static void main(String[] args) {
        //


        //Inicializando um map e Implementando dados no map
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        HashMap<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        //Manipulando dados
        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        //Verificando se tem o dado dentro do Map
        System.out.println("Confira se o modelo Tucson está no dicionario " + carrosPopulares.containsKey("tucson"));

        //Exibindo um dado especifico dentro do Map
        System.out.println("Exiba o consumo do uno "+ carrosPopulares.get("uno"));

        //Exibir um determinado dado por ordem de adição (não tem jeito)
        //System.out.println("Exiba o terceiro modelo adicionado ");

        //Exibir somente o nome das chaves
        System.out.println("Exiba os modelos:" + carrosPopulares.keySet());
        //Ou vc pode usar o set para coletar esses dados
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //Exibir somente os dados contidos nas chaves
        System.out.println("Exiba os consumos " + carrosPopulares.values());
        //Ou vc pode usar collections para coletar esses dados
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        //Exibir a chave que tem o maior valor
        System.out.println("Exiba o modelo mais economico e seu valor");
        Double menorConsumo = Collections.max(carrosPopulares.values());
        Set<java.util.Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMenorConsumo = "";

        for (java.util.Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(menorConsumo)) {
                modeloMenorConsumo = entry.getKey();
                System.out.println("Modelo mais eficiente " + modeloMenorConsumo + " - " + menorConsumo);
            }
        }

        //Exibir a chave que tem o menor valor
        System.out.println("Exiba o modelo menos economico e seu valor");
        Double maiorConsumo = Collections.min(carrosPopulares.values());
        String modeloMaiorConsumo = "";
        for (java.util.Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(maiorConsumo)) {
                modeloMaiorConsumo = entry.getKey();
                System.out.println("Modelo menos eficiente " + modeloMaiorConsumo + " - " + maiorConsumo);
            }
        }

        //Somando os valores
        System.out.println("Faça a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma é igual " + soma);

        //Exibindo a media dos valores
        System.out.println("A media é igual " + soma/carrosPopulares.size());

        //Removendo determinado dados do Map de acordo com um criterio
        System.out.println("Remova os modelos com o consumo igual a 15.6km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        //Exibir os dados na ordem que foram adicionados
        System.out.println("Informe os carros na ordem que foram adicionados");
        LinkedHashMap<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        //Exiba os dados ordenadas pela key
        System.out.println("Exiba os carros ordenados pelo modelo:");
        TreeMap<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        //Remover o map
        System.out.println("Remova os dados dos carros");
        carrosPopulares2.clear();
        System.out.println(carrosPopulares2);

        //Verificando se tem algum dado no conjunto Map
        System.out.println("Está vazio o conjunto ?" + carrosPopulares2.isEmpty());

    }
}
