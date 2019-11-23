/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Candidato;
import Classes.Prova;
import Dao.CandidatoDao;
import Dao.InscricaoDao;
import Dao.ProvaDao;
import Dao.TblFazProvaDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Qualificacao extends javax.swing.JFrame {
    private final InscricaoDao inscricaodao = new InscricaoDao();
    private final CandidatoDao candidatodao = new CandidatoDao();
    private Candidato candidato = new Candidato();
    private Prova provaQ = new Prova();
    private ProvaDao provadao = new ProvaDao();
    /**
     * Creates new form Qualificacao
     */
    public Qualificacao() {
        initComponents();
        setLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_CPF = new javax.swing.JLabel();
        jLabel_NOME = new javax.swing.JLabel();
        jLabelNOME = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabel_EMAIL = new javax.swing.JLabel();
        jLabelEMAIL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNOTAQUALI = new javax.swing.JTextField();
        jButtonINSERIR = new javax.swing.JButton();
        jLabel_IDINSCRICAO = new javax.swing.JLabel();
        jLabel_RECEBEINSCRICAOID = new javax.swing.JLabel();
        jLabelSITUACAO = new javax.swing.JLabel();
        jLabelPAGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_CPF.setText("CPF:");

        jLabel_NOME.setText("NOME:");

        jLabel_EMAIL.setText("EMAIL:");

        jLabel7.setText("NOTA QUALIFICACAO");

        jButtonINSERIR.setText("INSERIR");
        jButtonINSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSERIRActionPerformed(evt);
            }
        });

        jLabel_IDINSCRICAO.setText("ID INSCRIÇÃO");

        jLabelSITUACAO.setText("SITUAÇÃO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_CPF)
                            .addComponent(jLabel_EMAIL)
                            .addComponent(jLabel_NOME))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSITUACAO)
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabelPAGO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_IDINSCRICAO)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel_RECEBEINSCRICAOID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(jTextFieldNOTAQUALI, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonINSERIR, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_NOME)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_RECEBEINSCRICAOID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_IDINSCRICAO))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPAGO, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSITUACAO))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CPF))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_EMAIL)
                    .addComponent(jLabelEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNOTAQUALI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButtonINSERIR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonINSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSERIRActionPerformed
        
        //faltando associar a nota ao cpf do candidato atraves da tabela tbl_faz_prova
        if(candidato.getVerificaPagamento()){
            provaQ.setNotaQualificacao(Float.parseFloat(jTextFieldNOTAQUALI.getText()));
            provadao.insereQuali(provaQ);
            provaQ.setTipo("Q");
            
            TblFazProvaDao fazProva = new TblFazProvaDao();
            if(fazProva.associaProva(candidato, provaQ)){
                JOptionPane.showMessageDialog(null, "Prova Realizada!!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro Prova!!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Candidato Caloteiro!!!");
        }
    }//GEN-LAST:event_jButtonINSERIRActionPerformed

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
            java.util.logging.Logger.getLogger(Qualificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Qualificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Qualificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Qualificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Qualificacao().setVisible(true);
            }
        });
    }
    
    public void recebeCandidato(Candidato candidatos){
        this.candidato = candidatos;
    }
    private void setLabels(){        
        jLabelNOME.setText(candidato.getNome());
        jLabelCPF.setText(String.valueOf(candidato.getCpf()));
        jLabelEMAIL.setText(candidato.getEmail());
        jLabel_RECEBEINSCRICAOID.setText(String.valueOf(candidato.getId_inscricao()));
        jLabelPAGO.setText(String.valueOf(candidato.getVerificaPagamento()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonINSERIR;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEMAIL;
    private javax.swing.JLabel jLabelNOME;
    private javax.swing.JLabel jLabelPAGO;
    private javax.swing.JLabel jLabelSITUACAO;
    private javax.swing.JLabel jLabel_CPF;
    private javax.swing.JLabel jLabel_EMAIL;
    private javax.swing.JLabel jLabel_IDINSCRICAO;
    private javax.swing.JLabel jLabel_NOME;
    private javax.swing.JLabel jLabel_RECEBEINSCRICAOID;
    private javax.swing.JTextField jTextFieldNOTAQUALI;
    // End of variables declaration//GEN-END:variables
}
