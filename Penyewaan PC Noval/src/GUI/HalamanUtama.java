/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ariff
 */
public class HalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    public HalamanUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuPelanggan = new javax.swing.JMenuItem();
        jMenuPC = new javax.swing.JMenuItem();
        jMenuTransaksi = new javax.swing.JMenuItem();
        jMenuKeluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Utama.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 424));

        jMenu1.setText("Pilihan Menu");

        jMenuPelanggan.setText("Pelanggan");
        jMenuPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPelangganActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPelanggan);

        jMenuPC.setText("Pc");
        jMenuPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPCActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPC);

        jMenuTransaksi.setText("Transaksi");
        jMenuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTransaksiActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuTransaksi);

        jMenuKeluar.setText("Keluar");
        jMenuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKeluarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuKeluar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPelangganActionPerformed
        Pelanggan pelangganFrame = new Pelanggan();
        pelangganFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuPelangganActionPerformed

    private void jMenuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuKeluarActionPerformed

    private void jMenuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTransaksiActionPerformed
        Transaksi TransaksiFrame = new Transaksi();
        TransaksiFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuTransaksiActionPerformed

    private void jMenuPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPCActionPerformed
        PC PCFrame = new PC();
        PCFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuPCActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuKeluar;
    private javax.swing.JMenuItem jMenuPC;
    private javax.swing.JMenuItem jMenuPelanggan;
    private javax.swing.JMenuItem jMenuTransaksi;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
