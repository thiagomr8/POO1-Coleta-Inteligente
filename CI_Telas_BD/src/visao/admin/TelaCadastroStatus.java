/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.admin;

import coletainteligente.Status;
import coletainteligente.PersistenciaArquivo;
import coletainteligentedao.StatusDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;     

/**
 *
 * @author Lavinia
 */
public class TelaCadastroStatus extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroStatus
     */
    public TelaCadastroStatus() {
        initComponents();
        
        StatusDAO statusDAO = new StatusDAO();
        jListStatus.setListData(statusDAO.selectListaDescricao().toArray());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoDescricaoStatus = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListStatus = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        campoNovaDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Status");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cadastro Status");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));
        jPanel1.add(campoDescricaoStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 23));

        jButtonSalvar.setText("Cadastrar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel2.setText("Novo Status");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jButtonLimpar.setText("Limpar Campos");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jScrollPane1.setViewportView(jListStatus);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 175, -1));

        jLabel3.setText("Status");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        campoNovaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNovaDescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(campoNovaDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 132, -1));

        jLabel4.setText("Alterar Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 310));

        setSize(new java.awt.Dimension(539, 346));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        StatusDAO statusDAO = new StatusDAO();
        
        PersistenciaArquivo registro = new PersistenciaArquivo();
        
        String descricao = campoDescricaoStatus.getText();

        try {
            
            Status status = new Status(descricao);
            statusDAO.insere(status);
            registro.salvaStatus(status);
            JOptionPane.showMessageDialog(null, "Status cadastrado com sucesso!");
            jListStatus.setListData(statusDAO.selectListaDescricao().toArray());
            campoDescricaoStatus.setText("");

        } catch (Exception ex){
            Logger.getLogger(TelaCadastroStatus.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        if (! campoDescricaoStatus.getText().equals("")){
            int resposta = JOptionPane.showConfirmDialog(null, "Há campos preenchidos!\nTem certeza que deseja sair dessa tela?");
        
           if (resposta == JOptionPane.YES_OPTION){
                this.dispose();
           }
        }else{
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        campoDescricaoStatus.setText("");
        campoNovaDescricao.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void campoNovaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNovaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNovaDescricaoActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        StatusDAO statusDAO = new StatusDAO();
        int index = jListStatus.getSelectedIndex();
        ArrayList dados = statusDAO.selectListaDescricao();
        statusDAO.deleta((String) dados.get(index));
        jListStatus.setListData(statusDAO.selectListaDescricao().toArray());
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        StatusDAO statusDAO = new StatusDAO();
        int index = jListStatus.getSelectedIndex();
        ArrayList dados = statusDAO.selectListaDescricao();
        if(("".equals(campoNovaDescricao.getText())) || index == -1 ) {
            JOptionPane.showMessageDialog(null, "Insira uma descrição");
        }else{
            statusDAO.alteraStatus((String) dados.get(index), campoNovaDescricao.getText());
            campoNovaDescricao.setText(null);
            jListStatus.setListData(statusDAO.selectListaDescricao().toArray());
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoDescricaoStatus;
    private javax.swing.JTextField campoNovaDescricao;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jListStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}