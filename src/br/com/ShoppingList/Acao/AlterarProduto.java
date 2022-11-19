package br.com.ShoppingList.Acao;

import br.com.ShoppingList.Conexao.Conexao;
import br.com.ShoppingList.Negocio.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterarProduto {
    
    public void atualizaCarro(Produto produto) throws SQLException {
        
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {
            String sql = "";
            sql += "";
            sql += "UPDATE produto "
                    + "SET NomeProd = ?, Quantidade = ?, Valor = ?, "
                    + "WHERE idProduto = ?";
            st = conexao.getConexao().prepareStatement(sql);

            st.setString(1, produto.getNomeProd());
            st.setInt(2, produto.getQuantidade());
            st.setDouble(3, produto.getValor());

            //Executa a atualização
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            //conexao.fechaConexao();
            st.close();
        }
    }
}
