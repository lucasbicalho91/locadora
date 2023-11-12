/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Lucas
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaPrinicpal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuLocacao = new javax.swing.JMenu();
        jMenuItemAlugar = new javax.swing.JMenuItem();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAtor = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFilme = new javax.swing.JMenuItem();
        jMenuItemItem = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VideoLocadora Hora da Pipoca");
        setBackground(new java.awt.Color(240, 240, 240));

        jPanelTelaPrinicpal.setBackground(new java.awt.Color(153, 153, 153));
        jPanelTelaPrinicpal.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTelaPrinicpalLayout = new javax.swing.GroupLayout(jPanelTelaPrinicpal);
        jPanelTelaPrinicpal.setLayout(jPanelTelaPrinicpalLayout);
        jPanelTelaPrinicpalLayout.setHorizontalGroup(
            jPanelTelaPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaPrinicpalLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
        );
        jPanelTelaPrinicpalLayout.setVerticalGroup(
            jPanelTelaPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaPrinicpalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jMenuLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jMenuLocacao.setText("Locação");
        jMenuLocacao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemAlugar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemAlugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemAlugar.setText("Alugar");
        jMenuItemAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlugarActionPerformed(evt);
            }
        });
        jMenuLocacao.add(jMenuItemAlugar);

        jMenuItemConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuLocacao.add(jMenuItemConsultar);

        jMenuBarTelaPrincipal.add(jMenuLocacao);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemAtor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemAtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemAtor.setText("Ator");
        jMenuCadastro.add(jMenuItemAtor);

        jMenuItemCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemFilme.setText("Filme");
        jMenuCadastro.add(jMenuItemFilme);

        jMenuItemItem.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemItem.setText("Item");
        jMenuCadastro.add(jMenuItemItem);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanelTelaPrinicpal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanelTelaPrinicpal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAlugarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAlugar;
    private javax.swing.JMenuItem jMenuItemAtor;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemFilme;
    private javax.swing.JMenuItem jMenuItemItem;
    private javax.swing.JMenu jMenuLocacao;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelTelaPrinicpal;
    // End of variables declaration//GEN-END:variables
}