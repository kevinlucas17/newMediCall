/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Dao.CandidatoDao;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Kevin
 */
public class Candidatos extends javax.swing.JFrame {

    CandidatoDao candidatos = new CandidatoDao();
    
    public Candidatos() {
        initComponents();
        setTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldPESQUISACPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTable = new javax.swing.JTable();
        jButtonINSCREVER = new javax.swing.JButton();
        jButtonPAGAR = new javax.swing.JButton();
        jButtonMODIFICAR = new javax.swing.JButton();
        jButtonEXCLUIR = new javax.swing.JButton();
        jButtonVOLTAR = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextFieldPESQUISACPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPESQUISACPFKeyReleased(evt);
            }
        });

        jLabel1.setText("DIGITE O NOME:");

        jTableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableTable);

        jButtonINSCREVER.setText("INSCREVER");
        jButtonINSCREVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSCREVERActionPerformed(evt);
            }
        });

        jButtonPAGAR.setText("PAGAR");
        jButtonPAGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPAGARActionPerformed(evt);
            }
        });

        jButtonMODIFICAR.setText("MODIFICAR");

        jButtonEXCLUIR.setText("EXCLUIR");
        jButtonEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXCLUIRActionPerformed(evt);
            }
        });

        jButtonVOLTAR.setText("VOLTAR");
        jButtonVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVOLTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jTextFieldPESQUISACPF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonINSCREVER, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonPAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButtonMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jButtonEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVOLTAR)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVOLTAR)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPESQUISACPF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonINSCREVER, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonINSCREVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSCREVERActionPerformed
        // TODO add your handling code here:        
        Inscricao inscricao = new Inscricao();
        inscricao.recebeCpf(Integer.parseInt(getLinhaTable(0)));
        inscricao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonINSCREVERActionPerformed

    private void jTextFieldPESQUISACPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPESQUISACPFKeyReleased
        //CONSULTA POR CPF
       setTable(jTextFieldPESQUISACPF.getText());
    }//GEN-LAST:event_jTextFieldPESQUISACPFKeyReleased

    private void jButtonPAGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPAGARActionPerformed
        
    }//GEN-LAST:event_jButtonPAGARActionPerformed

    private void jButtonEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXCLUIRActionPerformed
       
    }//GEN-LAST:event_jButtonEXCLUIRActionPerformed

    private void jButtonVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVOLTARActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVOLTARActionPerformed

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
            java.util.logging.Logger.getLogger(Candidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Candidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Candidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Candidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Candidatos().setVisible(true);
            }
        });
    }
    
    private String getLinhaTable(int j){        
        try{
        int i =jTableTable.getSelectedRow();
        return jTableTable.getModel().getValueAt(i, j).toString();
        }catch(Exception e){
            System.out.println(e + " getlinatable");
            return null;            
        }      
        
    }   
    
    
    
    private void setTable(){
        try{
        ResultSet rs = candidatos.recuperaCandidato();
        jTableTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println(e+" setTable");
        }
    }
     private void setTable(String g){
        try{
        ResultSet rs = candidatos.recuperaCandidato(g);
        jTableTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println(e+" setTable");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEXCLUIR;
    private javax.swing.JButton jButtonINSCREVER;
    private javax.swing.JButton jButtonMODIFICAR;
    private javax.swing.JButton jButtonPAGAR;
    private javax.swing.JButton jButtonVOLTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableTable;
    private javax.swing.JTextField jTextFieldPESQUISACPF;
    // End of variables declaration//GEN-END:variables
}
