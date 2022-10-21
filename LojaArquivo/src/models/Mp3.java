package models;

import java.util.Random;
import java.util.Scanner;

public class Mp3 extends Arquivo{
    private int numeroDownloads;

    public Mp3(){
        this(0, 0.0, "Nenhum", 0);
    }

    public Mp3(int kbytes, double preco, String autor, int numeroDownloads){
        super(kbytes, preco, autor);
        setNumeroDownloads(numeroDownloads);
    }

    public int getNumeroDownloads() {
        return numeroDownloads;
    }

    public void setNumeroDownloads(int numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    @Override
    public String getTipo(){
        return "Mp3: ";
    }

    @Override
    public String getDetalhes(){
        StringBuilder detalhes = new StringBuilder();
        detalhes.append(super.getDetalhes());
        detalhes.append(" - Número de downloads: " + getNumeroDownloads());
        detalhes.append(System.getProperty("line.separator"));
        return detalhes.toString();
    }

    @Override
    public void inserirDados(){
        super.inserirDados();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Inseria o número de Downloads: ");
        int numeroDownloads = teclado.nextInt();

        setNumeroDownloads(numeroDownloads);
    }
}
