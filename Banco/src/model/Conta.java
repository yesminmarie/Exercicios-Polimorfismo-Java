package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conta {
    protected BigDecimal saldo;
    private int agencia;
    private int numero;

    private Cliente cliente;

    public Conta(){

    }
    public Conta(int agencia, int numero, Cliente cliente){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = new BigDecimal("0");
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(BigDecimal valor){
        String valorString = this.saldo.toString();
        this.saldo = new BigDecimal(valorString).add(valor);
    }
    public Boolean sacar(BigDecimal valor){
        // se o valor a ser sacado for maior retorna false
        if (valor.compareTo(this.saldo) == 1){
            System.out.println("Saldo insuficiente!");
            return false;
        }
        String valorString = this.saldo.toString();
        BigDecimal valorComTaxa = new BigDecimal(String.valueOf(valor.add(valor.multiply(new BigDecimal("0.005")))));
        //subtrai o valor do saldo e cobra uma taxa de 0.5% do valor
        this.saldo = new BigDecimal(valorString).subtract(valorComTaxa).setScale(3, RoundingMode.HALF_EVEN);
        return true;
    }
}
