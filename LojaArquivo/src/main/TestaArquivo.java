package main;

import models.Arquivo;
import models.Mp3;
import models.Mp4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class TestaArquivo {
    public static void main(String[] args) {
        Random valoresAleatorios = new Random();
        int opcao;
        int kbytes;
        double preco;
        String autor;
        Arquivo[] arquivos = new Arquivo[4];
        for (int pos = 0; pos < arquivos.length; pos++) {
            opcao = valoresAleatorios.nextInt(2) + 1;
            if (opcao == 1) {
                kbytes = valoresAleatorios.nextInt(1000) + 20;
                preco = valoresAleatorios.nextDouble() * 30 + 5;
                BigDecimal precoArredondado = new BigDecimal(preco).setScale(2, RoundingMode.HALF_EVEN);
                autor = "Autor: " + pos;
                int numeroDownloads = valoresAleatorios.nextInt(4000) + 4000;
                arquivos[pos] = new Mp3(kbytes, precoArredondado.doubleValue(), autor, numeroDownloads);
            } else {
                kbytes = valoresAleatorios.nextInt(200000) + 20;
                preco = valoresAleatorios.nextDouble() * 30 + 5;
                BigDecimal precoArredondado = new BigDecimal(preco).setScale(2, RoundingMode.HALF_EVEN);
                autor = "Autor: " + pos;
                int numeroVisitas = valoresAleatorios.nextInt(9000) + 10000;
                arquivos[pos] = new Mp4(kbytes, precoArredondado.doubleValue(), autor, numeroVisitas);
            }

        }
        for (Arquivo arquivo : arquivos) {
            System.out.println("Valores antes do reajuste de preço:");
            arquivo.printDados();
            if(arquivo instanceof Mp3 && ((Mp3) arquivo).getNumeroDownloads() > 5000){
                preco = arquivo.getPreco() + arquivo.getPreco()*0.05;
                BigDecimal precoArredondado = new BigDecimal(preco).setScale(2, RoundingMode.HALF_EVEN);
                arquivo.setPreco(precoArredondado.doubleValue());
            }
            if(arquivo instanceof Mp4 && ((Mp4) arquivo).getNumeroVisitas() > 1000){
                preco = arquivo.getPreco() + arquivo.getPreco()*0.08;
                BigDecimal precoArredondado = new BigDecimal(preco).setScale(2, RoundingMode.HALF_EVEN);
                arquivo.setPreco(precoArredondado.doubleValue());
            }
            System.out.println("Valores após reajuste de preço");
            arquivo.printDados();
        }
    }
}
