package br.com.ShoppingList.Principal;

import br.com.ShoppingList.Conexao.Conexao;
import br.com.ShoppingList.Acao.InserirProduto;

public class Principal {

    public static void main(String[] args) {

        Conexao con = new Conexao();
        con.getConexao();

        System.out.println("O status da conexão é: " + con.getStatusConexao());
        
        

    }

}