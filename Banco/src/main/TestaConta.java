package main;

import model.Cliente;
import model.Conta;
import model.ContaEspecial;

import java.math.BigDecimal;

public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("123.456.789-10", "Ana");
        Cliente clienteEspecial = new Cliente("987.654.321-11", "Maria");

        Conta contaComum = new Conta(11, 1111, cliente);
        Conta contaEspecial = new ContaEspecial(22, 2222, clienteEspecial);

        //Conta comum
        contaComum.depositar(new BigDecimal("1000"));
        contaComum.sacar(new BigDecimal("100.50"));

        //Conta Especial
        contaEspecial.depositar(new BigDecimal("1000"));
        contaEspecial.sacar(new BigDecimal("100.50"));

        System.out.println("Saldo conta comum: " + contaComum.getSaldo());
        System.out.println("Saldo conta especial: " + contaEspecial.getSaldo());

        contaComum.sacar(new BigDecimal("1000"));
        contaEspecial.sacar(new BigDecimal("1000"));
        System.out.println("Saldo conta comum: " + contaComum.getSaldo());
        System.out.println("Saldo conta especial: " + contaEspecial.getSaldo());
    }
}
