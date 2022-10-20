package api;

import model.CD;
import model.DVD;
import model.Midia;

import java.util.Scanner;

public class TestaMidia {
    public static void main(String[] args) {
        Midia[] midias = new Midia[3];
        int opcao;
        Scanner teclado = new Scanner(System.in);

        for(int pos = 0; pos < midias.length; pos++){
            System.out.println("Digite 1 para cadastrar CD");
            System.out.println("Digite 2 para cadastrar DVD");
            opcao = teclado.nextInt();

            if(opcao == 1){
                midias[pos] = new CD();
            } else if(opcao == 2){
                midias[pos] = new DVD();
            }
            midias[pos].inserirDados();
        }
        for(Midia midia : midias){
            midia.printDados();
        }

        teclado.close();
    }
}
