/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Dao.CandidatoDao;
import Dao.InscricaoDao;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Inscricao extends javax.swing.JFrame {
    private String cpf;
    private final InscricaoDao inscricaodao = new InscricaoDao();
    private CandidatoDao candidatodao = new CandidatoDao();
    
    /**
     * Creates new form Inscricao
     */
    public Inscricao() {
        initComponents();
        
    }
     public void recebeCpf(String c){
        this.cpf = c;
        setLabels();
    }
     
    private void setLabels(){                  
        System.out.println(cpf);
        try{   
        ResultSet rs = candidatodao.recuperaCandidatoCpf(cpf);         
        while(rs.next()){
            jLabelCPF.setText(rs.getString(1));
            jLabel_NOME.setText(rs.getString(2));
            jLabel_EMAIL.setText(rs.getString(3));
        }
        }catch(SQLException e){
            System.out.println(e+" setlables inscricao");
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

        jLabel5 = new javax.swing.JLabel();
        jLabel_cpf = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabel_nome = new javax.swing.JLabel();
        jLabel_NOME = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_EMAIL = new javax.swing.JLabel();
        jButtonINSCREVER = new javax.swing.JButton();
        jButtonVOLTAR = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_cpf.setText("CPF:");

        jLabel_nome.setText("NOME:");

        jLabel_email.setText("EMAIL:");

        jButtonINSCREVER.setText("INSCREVER");
        jButtonINSCREVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSCREVERActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonINSCREVER, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVOLTAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_cpf)
                                    .addGap(82, 82, 82)
                                    .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_nome)
                                    .addGap(72, 72, 72)
                                    .addComponent(jLabel_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVOLTAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_cpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_NOME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel_email))
                    .addComponent(jLabel_EMAIL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jButtonINSCREVER, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonINSCREVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSCREVERActionPerformed
        CandidatoDao candidato = new CandidatoDao();
        if(inscricaodao.recebeUltimo()!=0){
        candidato.atribuiCandidatoInscricao(inscricaodao.recebeUltimo(), Long.parseLong(cpf));
        }else{
           JOptionPane.showMessageDialog(null, "Erro","Atribuicao Errada",HEIGHT);
        }
    }//GEN-LAST:event_jButtonINSCREVERActionPerformed

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
            java.util.logging.Logger.getLogger(Inscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscricao().setVisible(true);
            }
        });
    }       
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonINSCREVER;
    private javax.swing.JButton jButtonVOLTAR;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabel_EMAIL;
    private javax.swing.JLabel jLabel_NOME;
    private javax.swing.JLabel jLabel_cpf;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_nome;
    // End of variables declaration//GEN-END:variables
}
