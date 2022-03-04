package Set;

import java.util.*;

public class SetOrdenation {
    /* Dada as seguintes informações das minhas series favoritas, crie um conjunto
    e ordene este conjunto exibindo (nome - genero - tempo de episodio);

     */
    public static void main(String[] args) {

        HashSet<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70 show", "comédia", 25));
        }};
        //Verificando se foram adicionadas de forma aleatoria
        System.out.println("Verificando o set:");
        for(Serie serie:minhasSeries) System.out.println(serie);

        LinkedHashSet<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70 show", "comédia", 25));
        }};
        //Verificando se foram adicionadas na sequencia que foram adicionada
        System.out.println("Verificando o set:");
        for(Serie serie:minhasSeries1) System.out.println(serie);

        //Imprimir na ordem do tempo de episodio
        System.out.println("Imprimir na ordem do tempo:");
        TreeSet<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie:minhasSeries2) System.out.println(serie);

        //Imprimir na ordem Nome/Genero/Tempo
        System.out.println("Imprimir na ordem do Nome/Genero/Tempo:");
        TreeSet<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie:minhasSeries3) System.out.println(serie);


    }
}
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private int tempoEpisodio;

    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return tempoEpisodio == serie.tempoEpisodio && nome.equals(serie.nome) && genero.equals(serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0 ) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
}
class ComparatorNomeGeneroTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0 ) return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0 ) return genero;
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
