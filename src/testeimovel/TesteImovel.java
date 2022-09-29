
package testeimovel;

import java.util.Scanner;

public class TesteImovel {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        Novo imo1 = new Novo();
        imo1.setEndereco("Avenida X, N 00, Centro");
        imo1.setPreco(200000);
        imo1.setAdicionalPreco(50000);

        Velho imoVelho = new Velho();
        imoVelho.setEndereco("Rua A, N 1456, Periferia");
        imoVelho.setPreco(100000);
        imoVelho.setDescontoPreco(10000);

        System.out.println(
            "1 - Imóvel Novo\n2 - Imóvel Velho"
        );

        opcao = entrada.nextInt();

        if (opcao == 1){
            imo1.printNovo();
        } else if (opcao == 2){
            imoVelho.printVelho();
        } else {
            System.out.println("Opção Incorreta");
        }





    }
    
}
