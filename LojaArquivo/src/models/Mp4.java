package models;

import java.util.Random;
import java.util.Scanner;

public class Mp4 extends Arquivo{
    private int numeroVisitas;

    public Mp4(){
        this(0 ,0.0, "Nenhum", 0);
    }

    public Mp4(int kbytes, double preco, String autor, int numeroVisitas){
        super(kbytes, preco, autor);
        setNumeroVisitas(numeroVisitas);
    }

    public int getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    @Override
    public String getTipo(){
        return "Mp4: ";
    }

    @Override
    public String getDetalhes(){
        StringBuilder detalhes = new StringBuilder();
        detalhes.append(super.getDetalhes());
        detalhes.append(" - Número de visitas: " + getNumeroVisitas());
        detalhes.append(System.getProperty("line.separator"));
        return detalhes.toString();
    }

    @Override
    public void inserirDados(){
        super.inserirDados();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o número de visitas: ");
        int numeroVisitas = teclado.nextInt();

        setNumeroVisitas(numeroVisitas);
    }
}
