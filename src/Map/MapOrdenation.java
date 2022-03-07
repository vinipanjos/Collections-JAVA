package Map;

import java.util.*;
import java.util.Map;

public class MapOrdenation {
    /*
    Dado os seguintes dados sobre seus livros e seus autores, crie uma biblioteca e ordene-a
    Autor: Hawking, Stephen - Livro: Uma breve historia do tempo - Paginas: 256
    Autor: Duhigg, Charles - Livro: O poder do habito - Paginas: 408
    Autor: Harari, Yuval Naah - Livro: 21 lições para o seculo 21 - Paginas: 432
     */
    public static void main(String[] args) {

        HashMap<String, Livros> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livros("O poder do habito", 408));
            put("Harari, Yuval Naah", new Livros("21 lições para o seculo 21", 432));
        }};
        //Informar os dados aleatoriamente
        System.out.println("---------Ordem Aleatoria---------");
        for (Map.Entry<String, Livros> livros : meusLivros.entrySet()) System.out.println(livros.getKey() + " - " + livros.getValue().getNomeLivro() + " - " + livros.getValue().getPaginas());

        //Informar na ordem que foi adicionada
        LinkedHashMap<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livros("O poder do habito", 408));
            put("Harari, Yuval Naah", new Livros("21 lições para o seculo 21", 432));
        }};
        System.out.println("---------Ordem de inserção---------");
        for (Map.Entry<String, Livros> livros : meusLivros1.entrySet()) System.out.println(livros.getKey() + " - " + livros.getValue().getNomeLivro() + " - " + livros.getValue().getPaginas());

        //Informar na ordem alfabetica
        System.out.println("---------Ordem Alfabetica dos Autores---------");
        TreeMap<String, Livros> meusLivros2 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livros> livros : meusLivros2.entrySet()) System.out.println(livros.getKey() + " - " + livros.getValue().getNomeLivro() + " - " + livros.getValue().getPaginas());

        System.out.println("---------Ordem Alfabetica do nome dos livros---------");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNomeLivro());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livros : meusLivros3) System.out.println(livros.getKey() + " - " + livros.getValue().getNomeLivro() + " - " + livros.getValue().getPaginas());




    }
}
class Livros{
    private String nomeLivro;
    private Integer paginas;

    public Livros(String nomeLivro, Integer paginas) {
        this.nomeLivro = nomeLivro;
        this.paginas = paginas;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nomeLivro.equals(livros.nomeLivro) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeLivro, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNomeLivro().compareToIgnoreCase(l2.getValue().getNomeLivro());
    }
}
