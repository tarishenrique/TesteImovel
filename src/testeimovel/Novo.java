
package testeimovel;
public class Novo extends Imovel{
    private double adicionalPreco;

    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }

    public void printNovo(){

        printImovel();
        System.out.println(
            "Preço adicional: " + (preco + adicionalPreco)
        );
    }   
}
