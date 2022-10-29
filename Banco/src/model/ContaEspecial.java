package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaEspecial extends Conta{

    public ContaEspecial(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
    }

    @Override
    public Boolean sacar(BigDecimal valor){
        // se o valor a ser sacado for maior retorna false
        if (valor.compareTo(this.saldo) == 1){
            System.out.println("Saldo insuficiente!");
            return false;
        }

        String valorString = this.saldo.toString();
        BigDecimal valorComTaxa = new BigDecimal(String.valueOf(valor.add(valor.multiply(new BigDecimal("0.001")))));
        //subtrai o valor do saldo e cobra uma taxa de 0.1% do valor
        this.saldo = new BigDecimal(valorString).subtract(valorComTaxa).setScale(3, RoundingMode.HALF_EVEN);
        return true;
    }
}
