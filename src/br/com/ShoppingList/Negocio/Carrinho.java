package br.com.ShoppingList.Negocio;

public class Carrinho {
    
    private String nome;
    private double valor;
    private double total;
    
    public Carrinho (){
    
    }

    public Carrinho(String nome, double valor, double total) {
        this.nome = nome;
        this.valor = valor;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
