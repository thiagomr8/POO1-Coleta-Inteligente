/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import coletainteligente.Coleta;
import coletainteligente.Coletor;
import coletainteligente.Lixeira;
import coletainteligente.PersistenciaArquivo;
import coletainteligentedao.BairroDAO;
import coletainteligentedao.ColetaDAO;
import coletainteligentedao.ColetorDAO;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiag
 */
public class TelaColeta extends javax.swing.JFrame {

    /**
     * Creates new form TelaGeraRota
     */
    private List <Object> listaBairro;
    private List <Coletor> listaColetor;
    public  DefaultTableModel model;
    
    public TelaColeta() {
        initComponents();
        
       
        BairroDAO bairrodao = new BairroDAO();
        listaBairro = bairrodao.selectListaBairro();
        
        ColetorDAO coletordao = new ColetorDAO();
        listaColetor = coletordao.listaColetoresList();
        
        jcbBairro.removeAllItems();
        jcbColetor.removeAllItems();
        
        for(Object bairro : listaBairro){
           jcbBairro.addItem((String) bairro);
        }
        
        for(Coletor coletor : listaColetor){
          jcbColetor.addItem(coletor.getPlaca());
        }
        
        //CRIA TABELA
        model = new DefaultTableModel();
        //CRIA CABEÇALHO
        model.setColumnIdentifiers(new Object[]{"Código Lixeira", "Nivel Atual", "Latitude", "Longitude"});
        //SETANDO TABELA
        jTable1.setModel(model);
        jScrollPane2.setViewportView(jTable1); 
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlColetor = new javax.swing.JLabel();
        jcbBairro = new javax.swing.JComboBox<String>();
        jbGerarRota = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbIniciarColeta = new javax.swing.JButton();
        jlNivelColetado = new javax.swing.JLabel();
        jtfNivelTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbColetor = new javax.swing.JComboBox();
        jlBairro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerar Rota");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlColetor.setText("Selecione o coletor");
        getContentPane().add(jlColetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 4, -1, 20));

        getContentPane().add(jcbBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 380, -1));

        jbGerarRota.setText("Gerar Rota");
        jbGerarRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarRotaActionPerformed(evt);
            }
        });
        getContentPane().add(jbGerarRota, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jbIniciarColeta.setText("Iniciar Coleta");
        jbIniciarColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarColetaActionPerformed(evt);
            }
        });
        getContentPane().add(jbIniciarColeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jlNivelColetado.setText("Nivel Coletado");
        getContentPane().add(jlNivelColetado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 20));

        jtfNivelTotal.setEditable(false);
        jtfNivelTotal.setBackground(new java.awt.Color(255, 255, 255));
        jtfNivelTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfNivelTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNivelTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNivelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 60, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 380, 120));

        jcbColetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbColetor.setSelectedIndex(-1);
        jcbColetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbColetorActionPerformed(evt);
            }
        });
        getContentPane().add(jcbColetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 380, -1));

        jlBairro.setText("Selecione a bairro");
        getContentPane().add(jlBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        setSize(new java.awt.Dimension(558, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbGerarRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarRotaActionPerformed
        
        BairroDAO bairrodao = new BairroDAO();
        String nomeBairro = (String) listaBairro.get(jcbBairro.getSelectedIndex());
        
        // REMOVE LINHA DAS TABELAS
        while (model.getRowCount() > 0)
        {
         model.removeRow(0);
        }//
        
        bairrodao.listaLixeirasCheias(model, nomeBairro);
        jTable1.setModel(model);
        jScrollPane2.setViewportView(jTable1);    
    }//GEN-LAST:event_jbGerarRotaActionPerformed

    private void jbIniciarColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarColetaActionPerformed
        // TODO add your handling code here:
      
        // int select = jTableLixeira.getSelectedRow();
       // jTextFieldCodigoLixeira.setText(jTableLixeira.getModel().getValueAt(select,0).toString());
        
        
        int indice = jcbColetor.getSelectedIndex();
        Coletor coletor =  listaColetor.get(indice);
        Lixeira lixeira = new Lixeira();
        Coleta coleta = new Coleta();
      
        
        float nivelTotal = 0;
     
        while (model.getRowCount() > 0 && nivelTotal < coletor.getCapacidade())
        {
            try {
                // Pega primeira linha da tabela
                lixeira.setCodigo(jTable1.getModel().getValueAt(0,0).toString());
                coleta.setVolume(jTable1.getModel().getValueAt(0,1).toString());
            } catch (Exception ex) {
                Logger.getLogger(TelaColeta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // Remove primeira linha
            model.removeRow(0);
            
            JOptionPane.showMessageDialog(null, "Lixeira coletada:  "+ lixeira.getCodigo());
          
            coleta.setColetor(coletor);
            coleta.setLixeira(lixeira);
            coleta.setData(Calendar.getInstance().getTime());
            
            ColetaDAO coletadao = new ColetaDAO();
            coletadao.insere(coleta);
            PersistenciaArquivo arquivo = new PersistenciaArquivo();
            arquivo.salvaColeta(coleta);

            nivelTotal += coleta.getVolume();
            jtfNivelTotal.setText(Float.toString(nivelTotal));
            
           try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(TelaColeta.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
        
        // SET do model
        jTable1.setModel(model);
        jScrollPane2.setViewportView(jTable1);
                
        
        
        
      
       
        JOptionPane.showMessageDialog(null, "Coleta Registrada");
        this.dispose();
        
    }//GEN-LAST:event_jbIniciarColetaActionPerformed

    private void jcbColetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbColetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbColetorActionPerformed

    private void jtfNivelTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNivelTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNivelTotalActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaColeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbGerarRota;
    private javax.swing.JButton jbIniciarColeta;
    private javax.swing.JButton jbSair;
    private javax.swing.JComboBox<String> jcbBairro;
    private javax.swing.JComboBox jcbColetor;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlColetor;
    private javax.swing.JLabel jlNivelColetado;
    private javax.swing.JTextField jtfNivelTotal;
    // End of variables declaration//GEN-END:variables
}
