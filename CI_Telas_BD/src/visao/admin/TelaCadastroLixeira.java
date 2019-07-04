/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.admin;


import coletainteligente.Bairro;
import coletainteligente.Lixeira;
import coletainteligentedao.BairroDAO;
import coletainteligentedao.LixeiraDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinicius
 */
public class TelaCadastroLixeira extends javax.swing.JFrame {

  
    //CRIA TABELA
    DefaultTableModel model = new DefaultTableModel();
    
    /**
     * Creates new form TelaCadastroLixeira
     */
    public TelaCadastroLixeira() {
        initComponents();
        inicializa();
    }

    private void inicializa() {
       
        //CRIA CABEÇALHO
        model.setColumnIdentifiers(new Object[]{"Lixeira", "Bairro","Capacidade", "Latitude", "Longitude", "Nível Atual"});
        //SETANDO TABELA
        jTableLixeira.setModel(model);
        //AUMENTA O TAMANHO DA SEGUNDA COLUNA
        jTableLixeira.getColumnModel().getColumn(1).setPreferredWidth(190);
        listaLixeiras();
        
        
        BairroDAO bairroDAO = new BairroDAO();
        ArrayList listaBairro = bairroDAO.selectListaBairro();
        jComboBoxBairro1.removeAllItems();
        jComboBoxBairro1.addItem("Todos");
        jComboBoxBairro.removeAllItems();
        for (Object bairro : listaBairro) {
            jComboBoxBairro1.addItem((String) bairro);
            jComboBoxBairro.addItem((String) bairro);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel3 = new javax.swing.JLabel();
        jTextFieldCapacidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBairro = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldLatitude = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldLongitude = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLixeira = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCodigoLixeira = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNivelAtual = new javax.swing.JTextField();
        jComboBoxBairro1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Lixeiras");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Bairro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel3, gridBagConstraints);

        jTextFieldCapacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        getContentPane().add(jTextFieldCapacidade, gridBagConstraints);

        jLabel1.setText("Capacidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel1, gridBagConstraints);

        jComboBoxBairro.setSelectedItem(this);
        jComboBoxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBairroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        getContentPane().add(jComboBoxBairro, gridBagConstraints);

        jLabel5.setText("Latitude");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        getContentPane().add(jTextFieldLatitude, gridBagConstraints);

        jLabel6.setText("Longitude");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        getContentPane().add(jTextFieldLongitude, gridBagConstraints);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonCadastrar, gridBagConstraints);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonLimpar, gridBagConstraints);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonSair, gridBagConstraints);

        jTableLixeira.setAutoCreateRowSorter(true);
        jTableLixeira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableLixeira.setDropMode(javax.swing.DropMode.ON);
        jTableLixeira.getTableHeader().setReorderingAllowed(false);
        jTableLixeira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLixeiraMouseClicked(evt);
            }
        });
        jTableLixeira.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableLixeiraKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLixeira);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 547;
        gridBagConstraints.ipady = 143;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 15, 20);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonExcluir, gridBagConstraints);

        jLabel4.setText("Filtrar por Bairro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel7.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel7, gridBagConstraints);

        jTextFieldCodigoLixeira.setEnabled(false);
        jTextFieldCodigoLixeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoLixeiraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        getContentPane().add(jTextFieldCodigoLixeira, gridBagConstraints);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonEditar, gridBagConstraints);

        jLabel2.setText("Nível_Atual");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel2, gridBagConstraints);

        jTextFieldNivelAtual.setEditable(false);
        jTextFieldNivelAtual.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNivelAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNivelAtualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        getContentPane().add(jTextFieldNivelAtual, gridBagConstraints);

        jComboBoxBairro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBairro1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 178;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        getContentPane().add(jComboBoxBairro1, gridBagConstraints);

        setSize(new java.awt.Dimension(843, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCapacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCapacidadeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        Lixeira lixeira = new Lixeira();
        Bairro bairro = new Bairro();
        String capacidade = jTextFieldCapacidade.getText();
        String latitude = jTextFieldLatitude.getText();
        String longitude = jTextFieldLongitude.getText();
        String nivelAtual = jTextFieldNivelAtual.getText();
        BairroDAO bairrodao = new BairroDAO();
        String nomeBairro = jComboBoxBairro.getSelectedItem().toString();
        String codbairro = Integer.toString(bairrodao.codBairro(nomeBairro));
        try {
            lixeira.setRegiao(bairro);
            lixeira.bairro.setCodigo(codbairro);
            lixeira.setCapacidade(capacidade);
            lixeira.setLatitude(latitude);
            lixeira.setLongitude(longitude);
            lixeira.setNivelAtual(nivelAtual);
            
            LixeiraDAO lixeiradao = new LixeiraDAO();
            lixeiradao.insere(lixeira);
            listaLixeiras();
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroLixeira.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Campos obrigatórios não estão preenchidos");
        }
        //System.out.println(capacidade + latitude + longitude + bairro);

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jComboBoxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBairroActionPerformed
        System.out.println("linha" + jTableLixeira.getSelectionModel());
    }//GEN-LAST:event_jComboBoxBairroActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldLatitude.setText("");
        jTextFieldLongitude.setText("");
        jTextFieldCapacidade.setText("");
        jTextFieldCodigoLixeira.setText("");
        jTextFieldNivelAtual.setText(""); 
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
      
        if (!jTextFieldCodigoLixeira.getText().equals("")
            || !jTextFieldLatitude.getText().equals("")
            || !jTextFieldCapacidade.getText().equals("")
            || !jTextFieldLongitude.getText().equals("")
            || !jTextFieldNivelAtual.getText().equals("")){
            int resposta = JOptionPane.showConfirmDialog(null, "Há campos preenchidos!\nTem certeza que deseja sair dessa tela?");

            if (resposta == JOptionPane.YES_OPTION){
                this.dispose();
            }
        }else{
            this.dispose();
        }
        
     
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String instrucaoDel = "DELETE FROM lixeira WHERE cod_lixeira = ?";
        if (!jTextFieldCodigoLixeira.getText().equalsIgnoreCase("")){
            LixeiraDAO lixeiradao = new LixeiraDAO();
            int resposta = JOptionPane.showConfirmDialog(null, "Essa lixeira pode está associada a algum registro de coleta ou descarte.\nExclui-la pode acarretar na exclusão desses regitros!\n\nTem certeza que deseja excluir?\n\n");
            if(resposta == JOptionPane.YES_OPTION){
                instrucaoDel = instrucaoDel.replace("?", jTextFieldCodigoLixeira.getText());
                lixeiradao.genericSQL(instrucaoDel);
            }
            
            jTextFieldLatitude.setText("");
            jTextFieldLongitude.setText("");
            jTextFieldCapacidade.setText("");
            jTextFieldCodigoLixeira.setText("");
            jTextFieldNivelAtual.setText("");
            
            listaLixeiras();
        }
        else {
            JOptionPane.showMessageDialog(null, "Só é possivel excluir lixeiras já cadastradas");
        }
     
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableLixeiraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableLixeiraKeyReleased
        
    }//GEN-LAST:event_jTableLixeiraKeyReleased

    private void jTextFieldCodigoLixeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoLixeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoLixeiraActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        Lixeira lixeira = new Lixeira();
        Bairro bairro = new Bairro();
        BairroDAO bairrodao = new BairroDAO();
        
        String codLixeira = jTextFieldCodigoLixeira.getText();
        String nomeBairro = jComboBoxBairro.getSelectedItem().toString();
        String codbairro = Integer.toString(bairrodao.codBairro(nomeBairro));
        String capacidade = jTextFieldCapacidade.getText();
        String latitude = jTextFieldLatitude.getText();
        String longitude = jTextFieldLongitude.getText();
        String nivelAtual = jTextFieldNivelAtual.getText();
        
        try {
            lixeira.setCodigo(codLixeira);
            lixeira.setRegiao(bairro);
            lixeira.bairro.setCodigo(codbairro);
            lixeira.setCapacidade(capacidade);
            lixeira.setLatitude(latitude);
            lixeira.setLongitude(longitude);
            lixeira.setNivelAtual(nivelAtual);
            
            LixeiraDAO lixeiradao = new LixeiraDAO();
            lixeiradao.setLixeira(lixeira);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(TelaCadastroLixeira.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            if(jComboBoxBairro1.getSelectedItem().toString().equalsIgnoreCase("Todos")){

                 listaLixeiras();  

            }else {

                 filtraLixeirasPorBairro();
            }
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTableLixeiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLixeiraMouseClicked
        selecionaLinha();
    }//GEN-LAST:event_jTableLixeiraMouseClicked

    private void jTextFieldNivelAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNivelAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNivelAtualActionPerformed

    private void jComboBoxBairro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBairro1ActionPerformed
        
        if(jComboBoxBairro1.getSelectedItem().toString().equalsIgnoreCase("Todos")){

            listaLixeiras();  

       }else {

            filtraLixeirasPorBairro();
       }
    
    }//GEN-LAST:event_jComboBoxBairro1ActionPerformed
    public void listaLixeiras() {
        
        // REMOVE LINHA DAS TABELAS
        while (model.getRowCount() > 0)
        {
         model.removeRow(0);
        }
          
        LixeiraDAO lixeiradao = new LixeiraDAO();
        lixeiradao.listaLixeiras(model);    
        jTableLixeira.setModel(model);
        jScrollPane1.setViewportView(jTableLixeira); 
       
    }
    
    public void filtraLixeirasPorBairro() {
       
        // REMOVE LINHA DAS TABELAS
        while (model.getRowCount() > 0)
        {
         model.removeRow(0);
        }
        
        LixeiraDAO lixeiradao = new LixeiraDAO();
        BairroDAO bairrodao = new BairroDAO();
        String nomeBairro = jComboBoxBairro1.getSelectedItem().toString();
        String codbairro = Integer.toString(bairrodao.codBairro(nomeBairro));
        lixeiradao.filtraLixeirasPorBairro(model, codbairro);    
        jTableLixeira.setModel(model);
        jScrollPane1.setViewportView(jTableLixeira); 

    }
    
    public void selecionaLinha() {
        
        int select = jTableLixeira.getSelectedRow();
        jTextFieldCodigoLixeira.setText(jTableLixeira.getModel().getValueAt(select,0).toString());
        jComboBoxBairro.setSelectedItem(jTableLixeira.getModel().getValueAt(select,1).toString());
        jTextFieldCapacidade.setText(jTableLixeira.getModel().getValueAt(select,2).toString());
        jTextFieldLatitude.setText(jTableLixeira.getModel().getValueAt(select,3).toString());
        jTextFieldLongitude.setText(jTableLixeira.getModel().getValueAt(select,4).toString());
        jTextFieldNivelAtual.setText(jTableLixeira.getModel().getValueAt(select,5).toString());
    }
        
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
            java.util.logging.Logger.getLogger(TelaCadastroLixeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLixeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLixeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLixeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroLixeira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox jComboBoxBairro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLixeira;
    private javax.swing.JTextField jTextFieldCapacidade;
    private javax.swing.JTextField jTextFieldCodigoLixeira;
    private javax.swing.JTextField jTextFieldLatitude;
    private javax.swing.JTextField jTextFieldLongitude;
    private javax.swing.JTextField jTextFieldNivelAtual;
    // End of variables declaration//GEN-END:variables
}
