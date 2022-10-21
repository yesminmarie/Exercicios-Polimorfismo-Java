package model;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia(){
        this(0, 0.0, "Nenhum");
    }
    public Midia(int codigo, double preco, String nome){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo(){
        return "Midia: ";
    }

    public String getDetalhes(){
        StringBuilder detalhes = new StringBuilder();
        detalhes.append(getCodigo());
        detalhes.append(" - ");
        detalhes.append(getNome());
        detalhes.append(" - R$ ");
        detalhes.append(getPreco());

        return detalhes.toString();
    }

    public void printDados(){
        StringBuilder dados = new StringBuilder();
        dados.append("Classe: " + getTipo() + System.getProperty("line.separator") +
                "Detalhes: " + getDetalhes());
        System.out.println(dados.toString());
    }

    public void inserirDados(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o codigo:\n");
        int codigo = teclado.nextInt();
        System.out.print("Digite o preço:\n");
        double preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Digite o nome:\n");
        String nome = teclado.nextLine();

        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);

    }
}
