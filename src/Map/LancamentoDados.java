package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class LancamentoDados {
    public static void main(String[] args) {
        Random random = new Random();
        Integer contador = 0;
        Integer numeroDados = 0;
        HashMap<Integer, Integer> lancamentoDados = new HashMap<>();

        //Lançando os dados
        while (contador < 100) {
            ++contador;
            numeroDados = random.nextInt(6) + 1;
            lancamentoDados.put(contador, numeroDados);
        }
        System.out.println(lancamentoDados);

        //Verificando quantas vezes cada numero foi lançado
        Integer validador = 0;
        Integer um = 0;
        Integer dois = 0;
        Integer tres = 0;
        Integer quatro = 0;
        Integer cinco = 0;
        Integer seis = 0;
        Iterator<Integer> iterator = lancamentoDados.values().iterator();
        while (iterator.hasNext()) {
            validador = iterator.next();
            if (validador == 6) {
                ++seis;
            } else if (validador == 5) {
                ++cinco;
            } else if (validador == 4) {
                ++quatro;
            } else if (validador == 3) {
                ++tres;
            } else if (validador == 2) {
                ++dois;
            } else ++um;
        }
        System.out.println("O numero 1 foi sorteado :" + um +
                "\nO numero 2 foi sorteado :" + dois +
                "\nO numero 3 foi sorteado :" + tres +
                "\nO numero 4 foi sorteado :" + quatro +
                "\nO numero 5 foi sorteado :" + cinco +
                "\nO numero 6 foi sorteado :" + seis);
    }
}
