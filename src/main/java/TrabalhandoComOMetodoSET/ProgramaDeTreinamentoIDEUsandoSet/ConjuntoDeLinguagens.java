package TrabalhandoComOMetodoSET.ProgramaDeTreinamentoIDEUsandoSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoDeLinguagens {
    public static void main(String[] args) {
        System.out.println("\n----- Ordenando por ordem de INSERÇÃO: -----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Arduino", 2005, "Arduino IDE"));
            add(new LinguagemFavorita("Python", 1990, "Pycharm"));
            add(new LinguagemFavorita("Java", 1980, "IntelliJ"));
        }};

        for (LinguagemFavorita linguagens : minhasLinguagensFavoritas) {
            System.out.println("Nome: " + linguagens.getNome() + ", Ano De Criação: " + linguagens.getAnoDeCriacao() + ", Nome da IDE: " + linguagens.getIde());
        }

        System.out.println("\n  ----- Ordem Natural -----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new TreeSet<>() {{
            add(new LinguagemFavorita("Arduino", 1980, "Arduino IDE"));
            add(new LinguagemFavorita("Python", 1980, "Pycharm"));
            add(new LinguagemFavorita("Java", 1980, "IntelliJ"));
        }};

        for (LinguagemFavorita linguagens : minhasLinguagensFavoritas1) {
            System.out.println("Nome: " + linguagens.getNome() + ", Ano De Criação: " + linguagens.getAnoDeCriacao() + ", Nome da IDE: " + linguagens.getIde());
        }

        System.out.println("\n  ----- Ordenando Por: Nome Ano de Criação e IDE! -----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(new ComparandoPorStringNomeAnoEIDE()) {{
            add(new LinguagemFavorita("Python", 1990, "Pycharm"));
            add(new LinguagemFavorita("Arduino", 2005, "Arduino IDE"));
            add(new LinguagemFavorita("Java", 1980, "IntelliJ"));
        }};

        for (LinguagemFavorita linguagens : minhasLinguagensFavoritas2) {
            System.out.println("Nome: " + linguagens.getNome() + ", Ano De Criação: " + linguagens.getAnoDeCriacao() + ", Nome da IDE: " + linguagens.getIde());

        }
    }
}
