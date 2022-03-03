import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListOrdenation {

    /*Dado as seguintes  informacoes  sobre meus gatos, crie uma lista e ordene esta lista exibindo:
     (nome - idade - cor)
     gato 1 = nome: Jon, idade: 18, cor: preto
     gato 2 = nome: Simba, idade: 6, cor:tigrado
     gato 3 = nome: Jon, idade: 12, cor: amarelo
     */
    public static void main(String[] args) {

        ArrayList<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};
        //Printando na ordem de inserção
        System.out.println("Printando na ordem de inserção:");
        System.out.println(meusGatos);

        //Printando na ordem aleatoria
        System.out.println("Printando na ordem aleatoria:");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //Printando na ordem nome(tem q sobrescrever o metodo comparable na classe gato)
        System.out.println("Printando na ordem do nome:");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        //Printando na ordem idade(tem q sobrescrever o metodo comparable na classe gato e criar uma classe comparator)
        System.out.println("Printando na ordem da idade:");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        //Printando na ordem cor
        System.out.println("Printando na ordem da cor:");
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        //Printando na ordem Nome/Cor/Idade
        System.out.println("Printando na ordem de preferencia -> Cor, Nome e Idade");
        //Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }
}
//adicionar a interface Comparable
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
//Sobreescrever conforme sua demanda
    @Override
    public int compareTo(Gato gato) {
        //vamos comparar a string nome, retornando 0 se o nome for igual, 1 se o nome for maior e -1 se for menor
        //no caso de ordem alfabetica
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}