package model;

import java.util.Scanner;

public class DVD extends Midia{
    private int numeroDeFaixas;

    public DVD(){
        this(0, 0.0, "Nenhum", 0);
    }

    public DVD(int codigo, double preco, String nome, int numeroDeFaixas){
        super(codigo, preco, nome);
        setNumeroDeFaixas(numeroDeFaixas);
    }

    public void setNumeroDeFaixas(int numeroDeFaixas){
        this.numeroDeFaixas = numeroDeFaixas > 0 ? numeroDeFaixas : 0;
    }
    @Override
    public String getTipo(){
        return "DVD: ";
    }

    @Override
    public String getDetalhes(){
        StringBuilder detalhes = new StringBuilder();
        detalhes.append(super.getDetalhes());
        detalhes.append(" - Número de Faixas: " + numeroDeFaixas);
        detalhes.append(System.getProperty("line.separator"));
        return detalhes.toString();
    }

    @Override
    public void inserirDados(){
        super.inserirDados();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número de faixas: ");
        int numeroDeFaixas = teclado.nextInt();

        setNumeroDeFaixas(numeroDeFaixas);

    }
}
