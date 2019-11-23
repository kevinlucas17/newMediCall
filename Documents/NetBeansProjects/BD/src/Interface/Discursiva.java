/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Candidato;
import Classes.Prova;
import Dao.ProvaDao;
import Dao.TblFazProvaDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Discursiva extends javax.swing.JFrame {
    private Candidato candidato = new Candidato();
    private final ProvaDao provadao = new ProvaDao();
    private Prova prova = new Prova();
    private final TblFazProvaDao fazProva = new TblFazProvaDao();
    
    /**
     * Creates new form Discursiva
     */
    public Discursiva() {
        initComponents();
        setLables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_NOME = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_CPF = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_EMAIL = new javax.swing.JLabel();
        jButton_INSERIR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField_INSERIRDISCURSIVA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel_idInscricao = new javax.swing.JLabel();
        jLabel_NOTAQUALIFICACAO = new javax.swing.JLabel();
        jLabel_RECEBENOTAQUALIFICACAO = new javax.swing.JLabel();
        jButtonVOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("NOME:");

        jLabel3.setText("CPF:");

        jLabel5.setText("EMAIL:");

        jButton_INSERIR.setText("INSERIR");
        jButton_INSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERIRActionPerformed(evt);
            }
        });

        jLabel7.setText("NOTA DISCURSIVA");

        jLabel8.setText("ID INSCRIÇÃO:");

        jLabel_NOTAQUALIFICACAO.setText("NOTA QUALIFICAÇÃO");

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
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField_INSERIRDISCURSIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(jButton_INSERIR, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel_idInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_NOTAQUALIFICACAO)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_RECEBENOTAQUALIFICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVOLTAR)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVOLTAR)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_idInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_CPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_RECEBENOTAQUALIFICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_INSERIR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField_INSERIRDISCURSIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114))))
                    .addComponent(jLabel_NOTAQUALIFICACAO)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERIRActionPerformed
            Prova provaD = new Prova();
            provaD.setNotaDiscursiva(Float.parseFloat(jTextField_INSERIRDISCURSIVA.getText()));
            prova.setTipo("D");
            provadao.insereDisc(provaD);
            prova.setId(provadao.ultimoId());            
            fazProva.associaProva(candidato, prova);
        
    }//GEN-LAST:event_jButton_INSERIRActionPerformed

    private void jButtonVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVOLTARActionPerformed
        Candidatos candidatos = new Candidatos();
        candidatos.setVisible(true);                
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
            java.util.logging.Logger.getLogger(Discursiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discursiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discursiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discursiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Discursiva().setVisible(true);
            }
        });
    }
    public void recebeCandidato(Candidato candidatos){
        this.candidato = candidatos;
        
    }
    public void recebeProvaQuali(Prova provaQ){
        this.prova = provaQ;
        setLables();
    }
    private void setLables(){
        jLabel_NOME.setText(candidato.getNome());
        jLabel_EMAIL.setText(candidato.getEmail());
        jLabel_CPF.setText(String.valueOf(candidato.getCpf()));
        jLabel_idInscricao.setText(String.valueOf(candidato.getId_inscricao()));
        jLabel_RECEBENOTAQUALIFICACAO.setText(String.valueOf(prova.getNotaDiscursiva()));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVOLTAR;
    private javax.swing.JButton jButton_INSERIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_CPF;
    private javax.swing.JLabel jLabel_EMAIL;
    private javax.swing.JLabel jLabel_NOME;
    private javax.swing.JLabel jLabel_NOTAQUALIFICACAO;
    private javax.swing.JLabel jLabel_RECEBENOTAQUALIFICACAO;
    private javax.swing.JLabel jLabel_idInscricao;
    private javax.swing.JTextField jTextField_INSERIRDISCURSIVA;
    // End of variables declaration//GEN-END:variables
}
