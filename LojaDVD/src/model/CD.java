package model;

import java.util.Scanner;

public class CD extends Midia{
    private int numeroDeMusicas;

    public CD(){
        this(0,0.0,"Nenhum", 0);
    }
    public CD(int codigo, double preco, String nome, int numeroDeMusicas){
        super(codigo, preco, nome);
        setNumeroDeMuscias(numeroDeMusicas);
    }

    public void setNumeroDeMuscias(int numeroDeMuscias){
        this.numeroDeMusicas = numeroDeMuscias > 0 ? numeroDeMuscias : 0;
    }

    @Override
    public String getTipo(){
        return "CD: ";
    }

    @Override
    public String getDetalhes(){
        StringBuilder detalhes = new StringBuilder();
        detalhes.append(super.getDetalhes());
        detalhes.append(" - Número de Músicas: " + numeroDeMusicas);
        detalhes.append(System.getProperty("line.separator"));

        return detalhes.toString();
    }

    @Override
    public void inserirDados(){
        super.inserirDados();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número de músicas");
        int numeroDeMusicas = teclado.nextInt();

        setNumeroDeMuscias(numeroDeMusicas);

    }
}
