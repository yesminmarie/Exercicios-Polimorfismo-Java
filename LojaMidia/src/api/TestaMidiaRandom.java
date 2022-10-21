package api;

import model.CD;
import model.DVD;
import model.Midia;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class TestaMidiaRandom {
    public static void main(String[] args) {
        Midia[] midias = new Midia[3];
        Random valoresRandomicos = new Random();
        int opcao;
        int codigo;
        double preco;
        String nome;
        int numeroFaixas;

        for (int pos = 0, contadorCD = 0, contadorDVD = 0; pos < midias.length; pos++){
            opcao = valoresRandomicos.nextInt(2) + 1;// 1 ou 2.
            if(opcao == 1){
                contadorCD++;
                codigo = pos + 1;
                preco = valoresRandomicos.nextDouble()*20 + 15;// gera um valor double aleatorio de 15 até 35.
                BigDecimal precoArredondado = new BigDecimal(preco).setScale(2, RoundingMode.HALF_EVEN);
                nome = "CD: " + contadorCD;
                numeroFaixas = valoresRandomicos.nextInt(15) + 5; // gera um valor inteiro aleatorio entre 5 e 20.
                midias[pos] = new CD(codigo, precoArredondado.doubleValue(), nome, numeroFaixas);
            } else {
                contadorDVD++;
                codigo = pos + 1;
                preco = valoresRandomicos.nextDouble()*30 + 20; // de 20 a 50
                BigDecimal precoArredondado = new BigDecimal(preco).setScale(2, RoundingMode.HALF_EVEN);
                nome = "DVD: " + contadorDVD;
                numeroFaixas = valoresRandomicos.nextInt(20) + 5; // de 5 a 25
                midias[pos] = new DVD(codigo, precoArredondado.doubleValue(), nome, numeroFaixas);
            }
        }

        for (Midia midia : midias){
            midia.printDados();
        }
    }
}
