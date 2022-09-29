package testeimovel;

public class Velho extends Imovel {
    private double descontoPreco;

    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }

    public void printVelho(){

        printImovel();
        System.out.println(
            "Preço com desconto: " + (preco - descontoPreco)
        );
    }    
}
