package br.com.ShoppingList.Negocio;

public class Produto {
    
    private String nomeProd;
    private int quantidade;
    private double valor;
    private int idProduto;
    
    public Produto(){ 
        
    }

    public Produto(String nomeProd, int quantidade, double valor, int idProduto) {
        this.nomeProd = nomeProd;
        this.quantidade = quantidade;
        this.valor = valor;
        this.idProduto = idProduto;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nome) {
        this.nomeProd = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void getIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
}    

