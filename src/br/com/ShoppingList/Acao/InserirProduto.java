package br.com.ShoppingList.Acao;

import br.com.ShoppingList.Negocio.Produto;
import br.com.ShoppingList.Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InserirProduto {
    
    public void cadastraProduto(Produto produto) {
        
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO carrinho"
                    + "(nomeProd, quantidade, valor)"
                    + "VALUES"
                    + "(?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, produto.getNomeProd());
            st.setInt(2, produto.getQuantidade());
            st.setDouble(3, produto.getValor());

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    produto.setIdProduto(id);
                }
                rs.close();
            } else {
                throw new SQLException("Erro inesperado! Nenhum produto cadastrado!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexao.fechaConexao();
        }

    }
}
