package ProgramasQueFizUsandoLISTAS.DescobrindoOAssassino_LIST.MesesAndTemperaturas.OrdenandoElementos.PrimeiraParteLista;

import java.util.ArrayList;
import java.util.List;

public class ListPartOne {
    public static void main(String[] args) {

//     {[(   Resolva esse exercício usando o método de  da implementação do LINKEDLIST:   )]}

        System.out.println("""
                Crie uma lista chamada notas2 e coloque todos os elementos da list ArrayList nessa nova lista:\s
                """);

        List<Double> nota2 = new ArrayList<>();
        nota2.add(6.0);
        nota2.add(7.0);
        nota2.add(8.0);
        nota2.add(9.0);
        nota2.add(8.0);
        nota2.add(6.0);
        nota2.add(8.0);
        nota2.add(5.0);
        nota2.add(4.0);
        nota2.add(7.0);


    System.out.println("Mostre a primeira nota da nova lista sem removê-la: " +
    nota2.get(0));

    System.out.println(nota2);

    System.out.println();

    System.out.println("Mostre a primeira nota da nova lista removendo-a: " + nota2.remove(0));

    System.out.println(nota2);
    }
}
