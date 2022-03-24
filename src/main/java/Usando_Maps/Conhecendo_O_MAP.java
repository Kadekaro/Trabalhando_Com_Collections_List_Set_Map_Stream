package Usando_Maps;
import java.util.*;

public class Conhecendo_O_MAP {
    public static void main(String[] args) {

    Map<String, Integer> populacaoDeCadaEstado = new HashMap<>() {{
        put("PE",9616621);
        put("AL",3351543);
        put("CE",9187103);
        put("RN",3534265);
    }};
        System.out.println("\n --- População normal passada pelo exercício: ---");
        System.out.println("\n" + populacaoDeCadaEstado);

        System.out.println( "\n----------------------------------------------\n" );

        System.out.println(" --- Trocando o valor da população do Rio Grande do Norte: --- ");
        populacaoDeCadaEstado.put("RN", 3534165);
        System.out.println(populacaoDeCadaEstado);

        System.out.println( "\n----------------------------------------------\n" );

        if (populacaoDeCadaEstado.containsKey("PB")){
            System.out.println("Contém o estado do Pernambuco");
        }else {
            System.out.println("Não contém o estado do Pernambuco, mas acabou de ser add: ");
            populacaoDeCadaEstado.put("PB", 4039277);
            System.out.println(populacaoDeCadaEstado);
        }
        System.out.println( "\n----------------------------------------------\n" );

        System.out.println("População do estado do Pernambuco: " + populacaoDeCadaEstado.get("PE"));

        System.out.println( "\n----------------------------------------------\n" );
        Map<String,Integer> ordemQueFoiInformadoEstados = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
            put("PB",4039277);
        }};

        System.out.println(" --- Exibindo na ordem que foi informado os Estados: --- ");
        System.out.println(ordemQueFoiInformadoEstados);

        System.out.println( "\n----------------------------------------------\n" );
        Map<String,Integer> ordemAlfabetica = new TreeMap<>(){{
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
            put("PE",9616621);
            put("PB",4039277);
        }};

        System.out.println(" --- Exibindo na ordem alfabética os Estados informados: --- ");
        System.out.println(ordemAlfabetica);

        System.out.println( "\n----------------------------------------------\n" );
        System.out.println(" --- Exibindo o estado com a menor quantidade de pessoas: --- ");
        Integer menorQuantidadePessoas = Collections.min(ordemAlfabetica.values());
        System.out.println(menorQuantidadePessoas);

        System.out.println( "\n----------------------------------------------\n" );
        System.out.println(" --- Exibindo o estado com a maior quantidade de pessoas: --- ");
        Integer maiorQuantidadePessoas = Collections.max(ordemAlfabetica.values());
        Set<Map.Entry<String, Integer>> entradaDoMaior = ordemAlfabetica.entrySet();
        String estadoComMaiorQuantidadePessoas = "";
        for (Map.Entry<String, Integer> entry : entradaDoMaior
             ) { if (entry.getValue().equals(maiorQuantidadePessoas)){
                 estadoComMaiorQuantidadePessoas = entry.getKey();
             }
        }
        System.out.println("Estado: " + estadoComMaiorQuantidadePessoas + " Quantidade: " + maiorQuantidadePessoas);

        System.out.println( "\n----------------------------------------------\n" );
        System.out.println(" --- Exibindo a média da população desses estados: --- ");
        int somaDosEstados = 0;
        for (Integer valoresDaPopulacaoDosEstados : ordemAlfabetica.values()) {
            somaDosEstados += valoresDaPopulacaoDosEstados;
        }
        System.out.println("A soma da população de todos os estados é de: " + somaDosEstados);
        System.out.println("A média da população de todos os estados é de: " + somaDosEstados/ ordemAlfabetica.size());

        System.out.println(" --- A média com Iterator: --- ");
        int somaDosEstados1 = 0;
        Iterator<Integer> iterator = ordemAlfabetica.values().iterator();
        while (iterator.hasNext()){
            somaDosEstados1 += iterator.next();
        }
        System.out.println("A soma da população de todos os estados é de: " + somaDosEstados1);
        System.out.println("A média da população de todos os estados é de: " + somaDosEstados1 / ordemAlfabetica.size());

        System.out.println(" --- A média com Map E entrySet --- ");
        int somaDosEstados2 = 0;
        Set<Map.Entry<String,Integer>> percorrendoEmapeando = ordemAlfabetica.entrySet();
        for (Map.Entry<String,Integer> valoresDosEstados : percorrendoEmapeando){
            somaDosEstados2 += valoresDosEstados.getValue();
        }
        System.out.println("A soma da população de todos os estados é de: " + somaDosEstados2);
        System.out.println("A média da população de todos os estados é de: " + somaDosEstados2/ ordemAlfabetica.size());

        System.out.println( "\n----------------------------------------------\n" );
        System.out.println("  --- Remova os estados com a população menor que 4 milhões de habitantes: --- ");
        Iterator<Integer> iterator1 = ordemAlfabetica.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next() <= 4000000){
                iterator1.remove();
            }
        }
        System.out.println("Os estados com mais de 4 milhões de habitantes são: " + ordemAlfabetica);



        System.out.println( "\n----------------------------------------------\n" );
        System.out.println(" --- Apague os dicionários com os Estados com suas respectivas populações estimadas: ---");
        ordemAlfabetica.clear();
        System.out.println(ordemAlfabetica);
    }
}