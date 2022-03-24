package DescobrindoOAssassino__LISTAS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {
    public static void question() {
        Scanner receberperguntas = new Scanner(System.in);
        Perguntas perguntas;

        List<String> listaDePerguntas = new ArrayList<>();
        perguntas = new Perguntas();
        listaDePerguntas.add(perguntas.getPrimeira());
        listaDePerguntas.add(perguntas.getSegunda());
        listaDePerguntas.add(perguntas.getTerceira());
        listaDePerguntas.add(perguntas.getQuarta());
        listaDePerguntas.add(perguntas.getQuinta());


        System.out.println("""
                Iremos fazer 5 perguntinhas para o(a) senhor(a), afim de tentar esclarecer o que houve.\s
                Responda somente com SIM(s) ou NÃO(n), e tente ser o mais sincero possivel!
                """);


        int contador, descobridorDeAssassinos = 0;
        for (contador = 0; contador < listaDePerguntas.size(); contador++) {
            System.out.print(listaDePerguntas.get(contador));
            String resposta = receberperguntas.next();
            if (resposta.compareToIgnoreCase("s") >= 0) {
                descobridorDeAssassinos++;
            }
        }
        if (descobridorDeAssassinos < 3) {
            System.out.println("Inocente! \nEssa pessoa não tem relação com o caso!");
        }
        if (descobridorDeAssassinos > 2 && descobridorDeAssassinos < 5) {
            System.out.println("Cúmplice! \nEssa pessoa é cumplice nesse caso!");
        } else if (descobridorDeAssassinos > 4) {
            System.out.println("Assassino! \nEssa pessoa é o assassino; TOME CUIDADO!");
        }
    }
}