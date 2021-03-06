/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletainteligentedao;

import conexao.ConexaoDB;
import coletainteligente.Bairro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiag
 */
public class BairroDAO {
    
    
    public void insere(Bairro b){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO bairro (nome) VALUES (?);");
           //stmt.setInt(1, c.getCodigo());
            stmt.setString(1, b.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insert criado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            if ( ex.getSQLState().equals("23505")){
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro do bairro, porque o bairro '"+b.getNome()+"' já está cadastrado nesse sistema!\n"); 
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro do bairro:\n"  + ex.getMessage());
            }
            
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }
    /**
     *Retorna Falso caso não encontre o nome
     * @param nome
     * @return check
     */
    public boolean readBairro(String nome) {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = conexao.prepareStatement("SELECT * FROM bairro WHERE nome = ?;");
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            
           if(rs.next()) {
               check = true;
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return check;
    }
 
     public int codBairro (String nome) {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codigo = 0;
        
        try {
            stmt = conexao.prepareStatement("SELECT * FROM bairro WHERE nome = ?;");
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            
           if(rs.next()) {
               codigo = rs.getInt("cod_bairro");
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return codigo;
    }
       
    
    public ArrayList selectListaBairro() {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList dados = new ArrayList();

        try {
            stmt = conexao.prepareStatement("SELECT * FROM bairro ORDER BY nome;");
            //stmt.setString(1, nome);
            rs = stmt.executeQuery();
            
           while(rs.next()) {
               dados.add(rs.getString("nome"));
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return dados;
    }
    
    public void listaLixeirasCheias(DefaultTableModel model, String nome, float capacidadeCaminhao) {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        float total = 0;
        try {
            stmt = conexao.prepareStatement("SELECT cod_lixeira, nivel_atual, latitude, longitude, (capacidade *  (nivel_atual/100.0)) as  volumeAtual FROM LIXEIRA INNER JOIN BAIRRO ON (BAIRRO.COD_BAIRRO = LIXEIRA.COD_BAIRRO) WHERE nivel_atual >= 70 AND bairro.nome = ?");
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            
            
           while(rs.next() && ((total + rs.getFloat("volumeAtual")) < capacidadeCaminhao)) {
                 total += rs.getFloat("volumeAtual") ;
               
                try {
                    
                    model.addRow(new Object[]{Integer.toString(rs.getInt("cod_lixeira")),Float.toString(rs.getFloat("volumeAtual")),Float.toString(rs.getFloat("latitude")), Float.toString(rs.getFloat("longitude"))});
                    
                } catch (Exception ex) {
                    Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
              
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
    }
    
        public ArrayList selectListaCodBairro() {
        Connection conexao = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList dados = new ArrayList();

        try {
            stmt = conexao.prepareStatement("SELECT * FROM bairro;");
            //stmt.setString(1, nome);
            rs = stmt.executeQuery();
            
           while(rs.next()) {
               dados.add(rs.getString("cod_bairro"));
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConexaoDB.closeConnection(conexao, stmt);
        }
        return dados;
    }
    
    public void deleta(String nome){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
           
            stmt = con.prepareStatement("DELETE FROM bairro WHERE nome=?");
            stmt.setString(1, nome);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso");
            
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível excluir:\n"  + ex.getMessage());
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
        }
    }
    
    public void alteraBairro(String nomeOld, String nome){
        
        Connection con = ConexaoDB.getConexao();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE bairro SET nome=? WHERE nome=?");
            stmt.setString(1, nome);
            stmt.setString(2, nomeOld);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update realizado com sucesso");
            ConexaoDB.closeConnection(con, stmt);
            
        } catch (SQLException ex) {
            Logger.getLogger(BairroDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            if ( ex.getSQLState().equals("23505")){
                JOptionPane.showMessageDialog(null, "Não foi possível realizar a atualização do bairro, porque o bairro '"+nome+"' já está cadastrado nesse sistema!\n"); 
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível realizar a atualização do bairro:\n"  + ex.getMessage());
            }
            
        } finally {
            ConexaoDB.closeConnection(con, stmt);
            
        }
    }
    
}

