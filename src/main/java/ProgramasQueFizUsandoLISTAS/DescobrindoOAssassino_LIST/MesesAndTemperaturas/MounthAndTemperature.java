package ProgramasQueFizUsandoLISTAS.DescobrindoOAssassino_LIST.MesesAndTemperaturas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MounthAndTemperature {

    public static void main(String[] args) {

        List<MeseseTemperaturas> mesTemp = new ArrayList<>(){{
            add(new MeseseTemperaturas("Janeiro", 28.0));
            add(new MeseseTemperaturas("Fevereiro", 26.0));
            add(new MeseseTemperaturas("Março", 23.0));
            add(new MeseseTemperaturas("Abril", 23.0));
            add(new MeseseTemperaturas("Maio", 19.0));
            add(new MeseseTemperaturas("junho", 15.0));

        }};
        int i;
        double soma = 0d;
        Iterator<MeseseTemperaturas> iterator = mesTemp.iterator();

        for (i = 0; i < mesTemp.size(); i++ ) {

            Double proximatemperatura = iterator.next().temperature;
            if (proximatemperatura != 0) {
                soma += proximatemperatura;
            }
        }

        System.out.println("\n            A média de temperatura dos últimos 6 meses é: " + new DecimalFormat("#,##0.00").format(soma/ mesTemp.size()) + "º\n");
        for (i = 0; i < mesTemp.size(); i++ ) {
            System.out.println("                   " + mesTemp.get(i) + "\n");
        }
    }
}

