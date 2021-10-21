package TrabalhandoComOMetodoSET.ProgramaDeTreinamentoIDEUsandoSet;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }


    public String getIde() {
        return ide;
    }

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String nome;
    public int anoDeCriacao;
    public String ide;

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }


    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        int anoDeCriacao = Integer.compare(this.getAnoDeCriacao(), linguagemFavorita.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return this.getNome().compareTo(linguagemFavorita.getNome());
    }


}
class ComparandoPorStringNomeAnoEIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita L1, LinguagemFavorita L2) {

        int nome = L1.getNome().compareTo(L2.getNome());
        if (nome != 0) return nome;

        int ide = L1.getIde().compareTo(L2.getIde());
        if (ide != 0) return ide;

        return Integer.compare(L1.getAnoDeCriacao(), L2.getAnoDeCriacao());
    }
}
