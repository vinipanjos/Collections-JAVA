package List;

import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;

public class TemperaturaMedia {
    public static void main(String[] args) {


        ArrayList<Dado> dados = new ArrayList<>() {{
            add(new Dado(Month.JANUARY, 29));
            add(new Dado(Month.FEBRUARY, 32));
            add(new Dado(Month.MARCH, 31));
            add(new Dado(Month.APRIL, 27));
            add(new Dado(Month.MAY, 25));
            add(new Dado(Month.JUNE, 21));

        }};

        System.out.println("Exibindo a media dos 6 primeiros meses");
        int soma = 0;
        for (Dado dado : dados) {
            soma += dado.getTemperatura();
        }
        double media = soma/dados.size();
        System.out.println(media);

        System.out.println("Os meses que ocorreram temperaturas maiores foram:");
        Iterator<Dado> iterator1 = dados.iterator();
        while (iterator1.hasNext()){
            Dado next = iterator1.next();
            if (next.getTemperatura()>= media) System.out.println(next.getMes() + " : " + next.getTemperatura() );
        }
    }
}


class Dado{
    private Month mes;
    private int temperatura;

    public Dado(Month mes, int temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public Month getMes() {
        return mes;
    }

    public int getTemperatura() {
        return temperatura;
    }
}