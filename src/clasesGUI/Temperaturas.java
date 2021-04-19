
package clasesGUI;


public class Temperaturas extends javax.swing.JFrame {

    private static int op;
    
    public Temperaturas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.jButtonConvertir.setEnabled(false);
        this.jTextFieldTemp1.setEditable(false);
        this.jTextFieldTemp2.setEditable(false);
        this.jRadioButtonOp1.requestFocus();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        temp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonOp1 = new javax.swing.JRadioButton();
        jRadioButtonOp2 = new javax.swing.JRadioButton();
        jTextFieldTemp1 = new javax.swing.JTextField();
        jTextFieldTemp2 = new javax.swing.JTextField();
        jLabelTemp1 = new javax.swing.JLabel();
        jLabelTemp2 = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperaturas");

        jPanel1.setBackground(new java.awt.Color(41, 134, 131));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setText("Conversor de Temperaturas");

        temp.add(jRadioButtonOp1);
        jRadioButtonOp1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jRadioButtonOp1.setText("Centigrados a Fahrenheit");
        jRadioButtonOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOp1ActionPerformed(evt);
            }
        });

        temp.add(jRadioButtonOp2);
        jRadioButtonOp2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jRadioButtonOp2.setText("Fanhrenheit a Centigrados");
        jRadioButtonOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOp2ActionPerformed(evt);
            }
        });

        jTextFieldTemp1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N

        jTextFieldTemp2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N

        jLabelTemp1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N

        jLabelTemp2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N

        jButtonConvertir.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jButtonConvertir.setText("Convertir");
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConvertir)
                    .addComponent(jRadioButtonOp1)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldTemp2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jTextFieldTemp1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTemp1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelTemp2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jRadioButtonOp2)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonOp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonOp2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTemp1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTemp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTemp2))
                .addGap(30, 30, 30)
                .addComponent(jButtonConvertir)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOp1ActionPerformed
        //JOptionPane.showMessageDialog(this, "Uno");
        this.jLabelTemp1.setText("Centigrados");
        this.jLabelTemp2.setText("Fahrenheit");
        this.jTextFieldTemp1.setEditable(true);
        this.jTextFieldTemp1.requestFocus();
        this.jButtonConvertir.setEnabled(true);
        this.jTextFieldTemp1.setText("");
        this.jTextFieldTemp2.setText("");
        op = 0;
    }//GEN-LAST:event_jRadioButtonOp1ActionPerformed

    private void jRadioButtonOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOp2ActionPerformed
        //JOptionPane.showMessageDialog(this, "Dos");
        this.jLabelTemp1.setText("Fahrenheit");
        this.jLabelTemp2.setText("Centigrados");
        this.jTextFieldTemp1.setEditable(true);
        this.jTextFieldTemp1.requestFocus();
        this.jButtonConvertir.setEnabled(true);
        this.jTextFieldTemp1.setText("");
        this.jTextFieldTemp2.setText("");
        op = 1;
    }//GEN-LAST:event_jRadioButtonOp2ActionPerformed

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        String res;
        Double temperatura;
        res = this.jTextFieldTemp1.getText().trim();
        temperatura = Double.parseDouble(res);
        if(op == 0){
            temperatura = (temperatura * 1.8) + 32;
            this.jTextFieldTemp2.setText("" + String.format("%.3f", temperatura));
        }else{
            temperatura = (temperatura - 32) / 1.8;
            this.jTextFieldTemp2.setText("" + String.format("%.3f", temperatura));
        }
    }//GEN-LAST:event_jButtonConvertirActionPerformed

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
            java.util.logging.Logger.getLogger(Temperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temperaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temperaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTemp1;
    private javax.swing.JLabel jLabelTemp2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonOp1;
    private javax.swing.JRadioButton jRadioButtonOp2;
    private javax.swing.JTextField jTextFieldTemp1;
    private javax.swing.JTextField jTextFieldTemp2;
    private javax.swing.ButtonGroup temp;
    // End of variables declaration//GEN-END:variables
}
