package models;

import java.util.Random;
import java.util.Scanner;

public class Arquivo {
    private int kbytes;
    private double preco;
    private String autor;

    public Arquivo(){
        this(0,0.0,"Nenhum");
    }

    public Arquivo(int kbytes, double preco, String autor){
        setKbytes(kbytes);
        setPreco(preco);
        setAutor(autor);
    }

    public int getKbytes() {
        return kbytes;
    }

    public void setKbytes(int kbytes) {
        this.kbytes = kbytes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo(){
        return "Arquivo ";
    }

    public String getDetalhes(){
        StringBuilder detalhes = new StringBuilder("Detalhes: ");
        detalhes.append("Kbytes: " + getKbytes() + " - Preço: " + getPreco() + " - Autor: " + getAutor());
        return detalhes.toString();
    }

    public void printDados(){
        System.out.println(getTipo() + "\n" + getDetalhes());
    }

    public void inserirDados(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo em kbytes: ");
        int kbytes = teclado.nextInt();
        System.out.println("Digite o preço: ");
        double preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Digite o nome do autor");
        String autor = teclado.nextLine();

        setKbytes(kbytes);
        setPreco(preco);
        setAutor(autor);
    }
}
