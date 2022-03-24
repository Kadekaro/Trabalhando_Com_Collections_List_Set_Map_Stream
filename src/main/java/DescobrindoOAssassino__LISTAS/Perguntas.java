package DescobrindoOAssassino__LISTAS;

public class Perguntas {
    public String primeira, segunda, terceira, quarta, quinta;

    public String getPrimeira() {
        return primeira;
    }

    public String getSegunda() {
        return segunda;
    }

    public String getTerceira() {
        return terceira;
    }

    public String getQuarta() {
        return quarta;
    }

    public String getQuinta() {
        return quinta;
    }

    @Override
    public String toString() {
        return  primeira + '\'' +
                segunda + '\'' +
                terceira + '\'' +
                quarta + '\'' +
                quinta + '\'';
    }

    public Perguntas() {
        primeira = "-> 1º)Você telefonou para a vítima? R: ";
        segunda = "-> 2º)Esteve no local do crime? R: ";
        terceira = "-> 3º)Mora perto da vítima? R: ";
        quarta = "-> 4º)Devia para a vítima? R: ";
        quinta = "-> 5º)Trabalhou com a vítima? R: ";
    }
}
