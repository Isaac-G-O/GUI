
package clasesGUI;

import javax.swing.JOptionPane;

public class Examen extends javax.swing.JFrame {

    //Atributos
    
    int contadorBien = 0, contadorMal = 0;
    int n1, n2;
    
    public Examen() {
        initComponents();
        this.setLocationRelativeTo(this);
        operacion();
    }
    
    public void operacion(){
        this.n1 = (int)(Math.random()*(10 - 1 + 1) + 1);
        this.n2 = (int)(Math.random()*(10 - 1 + 1) + 1);
        String aux = " " + n1 + " x " + n2 + " = ";
        this.jTextFieldOp.setText(aux);
        this.jTextFieldRes.setText("");
        this.jTextFieldOp.setEditable(false);
        this.jLabelBien.setVisible(false);
        this.jLabelMal.setVisible(false);
        this.jTextFieldRes.requestFocus();
        this.jButtonSiguiente.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldOp = new javax.swing.JTextField();
        jTextFieldRes = new javax.swing.JTextField();
        jButtonRevisar = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonTerminar = new javax.swing.JButton();
        jLabelBien = new javax.swing.JLabel();
        jLabelMal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen de Tablas");
        setFocusTraversalPolicyProvider(true);

        jPanelBase.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Examen:");

        jTextFieldOp.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jTextFieldRes.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jButtonRevisar.setText("Revisar");
        jButtonRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRevisarActionPerformed(evt);
            }
        });

        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonTerminar.setText("Terminar");
        jButtonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarActionPerformed(evt);
            }
        });

        jLabelBien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N

        jLabelMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTerminar)
                    .addComponent(jButtonSiguiente)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBaseLayout.createSequentialGroup()
                                .addComponent(jButtonRevisar)
                                .addGap(103, 103, 103))
                            .addGroup(jPanelBaseLayout.createSequentialGroup()
                                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldOp))
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldRes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelBien)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabelMal)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanelBaseLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonRevisar, jButtonSiguiente, jButtonTerminar});

        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBien)
                            .addComponent(jLabelMal))))
                .addGap(18, 18, 18)
                .addComponent(jButtonRevisar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSiguiente)
                .addGap(18, 18, 18)
                .addComponent(jButtonTerminar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRevisarActionPerformed
        String res = this.jTextFieldRes.getText().trim();
        int resnum = Integer.parseInt(res);
        if(resnum == (n1 * n2)){
            this.jLabelBien.setVisible(true);
            this.contadorBien++;
        }else{
            this.jLabelMal.setVisible(true);
            this.contadorMal++;
        }
        this.jButtonSiguiente.setEnabled(true);
    }//GEN-LAST:event_jButtonRevisarActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        operacion();
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarActionPerformed
        double cali;
        int totalop = contadorBien + contadorMal;
        cali = (contadorBien * 10) / totalop;
        JOptionPane.showMessageDialog(this, "Tu calificacion es: " + cali);
        this.dispose();
    }//GEN-LAST:event_jButtonTerminarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRevisar;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBien;
    private javax.swing.JLabel jLabelMal;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JTextField jTextFieldOp;
    private javax.swing.JTextField jTextFieldRes;
    // End of variables declaration//GEN-END:variables
}
