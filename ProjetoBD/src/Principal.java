
import javax.swing.JOptionPane;

import javax.swing.*;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vinic
 */
public class Principal extends javax.swing.JFrame {

    public Connection conn = null;
    public Statement stmt;
    public ResultSet rs;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        abas.setEnabledAt(1, false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        txtSigla = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel3.add(txtLogin);
        txtLogin.setBounds(40, 40, 170, 30);

        btnEntrar.setBackground(new java.awt.Color(153, 153, 153));
        btnEntrar.setText("Entre");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        jPanel3.add(btnEntrar);
        btnEntrar.setBounds(80, 130, 90, 23);

        jLabel1.setText("Senha");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(40, 70, 60, 20);

        jLabel2.setText("Login");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(40, 20, 40, 20);
        jPanel3.add(txtSenha);
        txtSenha.setBounds(40, 90, 170, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(100, 70, 250, 180);

        abas.addTab("Login", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(null);

        txtSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiglaActionPerformed(evt);
            }
        });
        jPanel2.add(txtSigla);
        txtSigla.setBounds(90, 60, 299, 28);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome);
        txtNome.setBounds(90, 100, 299, 28);

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(90, 150, 299, 96);

        jLabel3.setText("Sigla");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 60, 51, 14);

        jLabel4.setText("Nome");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 90, 51, 28);

        jLabel5.setText("Descri????o");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 140, 70, 39);

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jPanel2.add(btnInserir);
        btnInserir.setBounds(30, 260, 100, 30);

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeletar);
        btnDeletar.setBounds(190, 260, 70, 30);

        btnAtt.setText("Atualizar");
        btnAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtt);
        btnAtt.setBounds(320, 260, 110, 30);

        abas.addTab("Cadastro", jPanel2);

        getContentPane().add(abas);
        abas.setBounds(20, 20, 450, 340);

        setBounds(0, 0, 508, 436);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        String senha = new String(txtSenha.getPassword());

        if (txtLogin.getText().equals("adm") && senha.equals("123")) {
            abas.setEnabledAt(1, true);
            abas.setSelectedIndex(1);
        } else {

            JOptionPane.showMessageDialog(null,
                    "Dados de login incorretos",
                    "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiglaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:

        String query1 = "DELETE FROM curso WHERE(sigla=";
        String a = txtSigla.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbaula4",
                    "root", "123");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = query1 + "'" + txtSigla.getText() + "')";
            JOptionPane.showMessageDialog(null, sql);
            int i = 0;
            i = stmt.executeUpdate(sql);//executando o comando sql
            stmt.close();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Curso deletado com sucesso!");
                // limpando campos
                txtSigla.setText("");
                txtNome.setText("");
                txtDesc.setText("");
//abreTabela();
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarKeyPressed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbaula4",
                    "root", "123");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "INSERT INTO curso VALUES('"
                    + txtSigla.getText() + "','"
                    + txtNome.getText() + "','"
                    + txtDesc.getText() + "')";
            JOptionPane.showMessageDialog(null, sql);
            int i = 0;
            i = stmt.executeUpdate(sql);//executando o comando sql
            stmt.close();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
                //abreTabela();
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttActionPerformed
        // TODO add your handling code here:

        String query1 = "UPDATE curso SET sigla=";
        String a = txtSigla.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbaula4", "root", "123");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = query1 + "'" + txtSigla.getText() + "',"
                    + "nome='" + txtNome.getText() + "',"
                    + "descricao='" + txtDesc.getText()
                    + "' where sigla=" + "'" + txtSigla.getText() + "'";
            JOptionPane.showMessageDialog(null, sql);
            int i = 0;
            i = stmt.executeUpdate(sql);//executando o comando sql
            int y = 0;
            stmt.close();
            y = stmt.CLOSE_CURRENT_RESULT;
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Curso alterado com sucesso!");
//abreTabela();
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnAttActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton btnAtt;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
