package br.com.ShoppingList.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private String statusConexao = "Não conectado!";
    
    public Connection getConexao(){
        
        Connection conexao = null;
        
        
        try{
            
            String nomeDriver = "com.mysql.cj.jdbc.Driver";  
            Class.forName(nomeDriver);
            
            String servidor = "localhost"; 
            String schema = "shoppinglist"; 
              
            String url = "jdbc:mysql://" + servidor + "/" + schema;
                     
            String usuario = "root";
            String senha = "123456";
            
            conexao = (Connection)DriverManager.getConnection(url,usuario,senha);
               
            //Testando a conexão
            if(conexao != null){ 
                statusConexao = "Conectado!";
            } else{
                statusConexao = "Não conectado!";
            }
            
            return conexao;
            
        } catch(ClassNotFoundException e){ 
            System.out.println("Driver de conexão não encontrado!");
            return null;
        } catch(SQLException e){
            System.out.println("Falha na conexão!");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    //Retorna o status da conexão
    public String getStatusConexao(){
        return statusConexao;
    }
    
    //Método para encerrar a conexão
    public boolean fechaConexao(){
        try{
            getConexao().close(); //Fecha a conexão
            statusConexao = "Conexão Fechada"; 
            return true; 
        } catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }       
    }
}    
    


