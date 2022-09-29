package testeimovel;

public class Imovel {
    protected String endereco;
    protected double preco;

    

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printImovel(){
        System.out.println(
            "Endereço: " + endereco +
            "\nPreço: " + preco
        );
    }

    
    
}
