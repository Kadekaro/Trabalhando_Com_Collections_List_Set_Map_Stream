package TrabalhandoComOMetodoSET.ProgramaDeTreinamentoIDEUsandoSet.ProgramaArcoIrisUsandoSet;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");

        for (String cor : coresArcoIris) {      // 1°
            System.out.println(cor);            // 1°
        }

        System.out.println();

        System.out.println("A quantidade de cores que o Arco Íris tem: " + coresArcoIris.size());    // 2°

        System.out.println();

        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);      // 3°
        System.out.println(coresArcoIris2);                             // 3°

        System.out.println();

        List<String> coresInversa = new ArrayList<>(coresArcoIris2);    // 4°
        Collections.reverse(coresInversa);                              // 4°
        System.out.println(coresInversa);                               // 4°

        System.out.println();

        for (String cores : coresArcoIris2) {                           // 5°
            if (cores.toLowerCase().startsWith("v"))                    // 5°
                System.out.println(cores);                              // 5°
        }

        System.out.println();

        coresArcoIris2.removeIf(cores2 -> cores2.toLowerCase().startsWith("v"));        // 6°
        System.out.println(coresArcoIris2);                                             // 6°

        System.out.println();

        coresArcoIris2.clear();                     // 7°
        System.out.println(coresArcoIris2);         // 8°
    }
}
