package Map;

import java.util.HashMap;
import java.util.Random;

public class LancamentoDados {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int numeroDados;
        HashMap<Integer, Integer> lancamentoDados = new HashMap<>();

        //Lançando os dados
        while (contador < 100) {
            ++contador;
            numeroDados = random.nextInt(6) + 1;
            lancamentoDados.put(contador, numeroDados);
        }
        System.out.println(lancamentoDados);

        //Verificando quantas vezes cada numero foi lançado
        Integer validador;
        int um = 0;
        int dois = 0;
        int tres = 0;
        int quatro = 0;
        int cinco = 0;
        int seis = 0;
        for (Integer integer : lancamentoDados.values()) {
            validador = integer;
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
