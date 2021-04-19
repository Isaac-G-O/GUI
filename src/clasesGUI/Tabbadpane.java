
package clasesGUI;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tabbadpane extends javax.swing.JFrame {
    
    private int poblacion[]={200, 300, 400, 500, 600};
    
    public Tabbadpane() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEscolaridad = new javax.swing.ButtonGroup();
        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanelRadioButtonGroup = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonPrimaria = new javax.swing.JRadioButton();
        jRadioButtonSecundaria = new javax.swing.JRadioButton();
        jRadioButtonPreparatoria = new javax.swing.JRadioButton();
        jRadioButtonNinguna = new javax.swing.JRadioButton();
        jPanelCheckBox = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxFutBol = new javax.swing.JCheckBox();
        jCheckBoxBasquet = new javax.swing.JCheckBox();
        jCheckBoxKarate = new javax.swing.JCheckBox();
        jCheckBoxNatacion = new javax.swing.JCheckBox();
        jPanelComboBoxSpinner = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerEdad = new javax.swing.JSpinner();
        MostrarGrabar = new javax.swing.JPanel();
        jButtonVer = new javax.swing.JButton();
        jButtonGrabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelRadioButtonGroup.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("Escolaridad terminada:");

        buttonGroupEscolaridad.add(jRadioButtonPrimaria);
        jRadioButtonPrimaria.setSelected(true);
        jRadioButtonPrimaria.setText("Primaria");

        buttonGroupEscolaridad.add(jRadioButtonSecundaria);
        jRadioButtonSecundaria.setText("Secundaria");

        buttonGroupEscolaridad.add(jRadioButtonPreparatoria);
        jRadioButtonPreparatoria.setText("Preparatoria");

        buttonGroupEscolaridad.add(jRadioButtonNinguna);
        jRadioButtonNinguna.setText("Ninguna");

        javax.swing.GroupLayout jPanelRadioButtonGroupLayout = new javax.swing.GroupLayout(jPanelRadioButtonGroup);
        jPanelRadioButtonGroup.setLayout(jPanelRadioButtonGroupLayout);
        jPanelRadioButtonGroupLayout.setHorizontalGroup(
            jPanelRadioButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRadioButtonGroupLayout.createSequentialGroup()
                .addGroup(jPanelRadioButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRadioButtonGroupLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanelRadioButtonGroupLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanelRadioButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonSecundaria)
                            .addComponent(jRadioButtonPrimaria)
                            .addComponent(jRadioButtonNinguna)
                            .addComponent(jRadioButtonPreparatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(320, Short.MAX_VALUE))
        );

        jPanelRadioButtonGroupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButtonNinguna, jRadioButtonPreparatoria, jRadioButtonPrimaria, jRadioButtonSecundaria});

        jPanelRadioButtonGroupLayout.setVerticalGroup(
            jPanelRadioButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRadioButtonGroupLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonPrimaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonSecundaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonPreparatoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNinguna)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Botones de Radio y Button Group", jPanelRadioButtonGroup);

        jPanelCheckBox.setBackground(new java.awt.Color(153, 255, 255));

        jLabel2.setText("Deporte favorito:");

        jCheckBoxFutBol.setSelected(true);
        jCheckBoxFutBol.setText("FutBol");

        jCheckBoxBasquet.setText("Basquet");

        jCheckBoxKarate.setText("Karate");

        jCheckBoxNatacion.setText("Natacion");

        javax.swing.GroupLayout jPanelCheckBoxLayout = new javax.swing.GroupLayout(jPanelCheckBox);
        jPanelCheckBox.setLayout(jPanelCheckBoxLayout);
        jPanelCheckBoxLayout.setHorizontalGroup(
            jPanelCheckBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckBoxLayout.createSequentialGroup()
                .addGroup(jPanelCheckBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCheckBoxLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(jPanelCheckBoxLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanelCheckBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxBasquet)
                            .addComponent(jCheckBoxFutBol)
                            .addComponent(jCheckBoxKarate)
                            .addComponent(jCheckBoxNatacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(334, Short.MAX_VALUE))
        );

        jPanelCheckBoxLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCheckBoxBasquet, jCheckBoxFutBol, jCheckBoxKarate, jCheckBoxNatacion});

        jPanelCheckBoxLayout.setVerticalGroup(
            jPanelCheckBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckBoxLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jCheckBoxFutBol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxBasquet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxKarate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxNatacion)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Check", jPanelCheckBox);

        jPanelComboBoxSpinner.setBackground(new java.awt.Color(255, 255, 153));

        jLabel3.setText("Lugar de nacimiento:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aguascalientes", "San Luis Potosi", "Guadalajara", "Leon", "Zacatecas" }));

        jLabel4.setText("Edad:");

        javax.swing.GroupLayout jPanelComboBoxSpinnerLayout = new javax.swing.GroupLayout(jPanelComboBoxSpinner);
        jPanelComboBoxSpinner.setLayout(jPanelComboBoxSpinnerLayout);
        jPanelComboBoxSpinnerLayout.setHorizontalGroup(
            jPanelComboBoxSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComboBoxSpinnerLayout.createSequentialGroup()
                .addGroup(jPanelComboBoxSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelComboBoxSpinnerLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4))
                    .addGroup(jPanelComboBoxSpinnerLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanelComboBoxSpinnerLayout.setVerticalGroup(
            jPanelComboBoxSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComboBoxSpinnerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelComboBoxSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelComboBoxSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("ComboBox y Spinner", jPanelComboBoxSpinner);

        MostrarGrabar.setBackground(new java.awt.Color(153, 153, 255));

        jButtonVer.setText("Ver Informacion en pantalla");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        jButtonGrabar.setText("Grabar archivo de texto");
        jButtonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabarActionPerformed(evt);
            }
        });

        jTextAreaMostrar.setColumns(20);
        jTextAreaMostrar.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMostrar);

        javax.swing.GroupLayout MostrarGrabarLayout = new javax.swing.GroupLayout(MostrarGrabar);
        MostrarGrabar.setLayout(MostrarGrabarLayout);
        MostrarGrabarLayout.setHorizontalGroup(
            MostrarGrabarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarGrabarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(MostrarGrabarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MostrarGrabarLayout.createSequentialGroup()
                        .addComponent(jButtonVer)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonGrabar)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        MostrarGrabarLayout.setVerticalGroup(
            MostrarGrabarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarGrabarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MostrarGrabarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVer)
                    .addComponent(jButtonGrabar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Mostrar y Grabar", MostrarGrabar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        String grado = "", deporte = "", ciudad = "";
        int indice, edad;
        this.jTextAreaMostrar.setText("");
        //Obteniendo el valor de los radio button
        if (this.jRadioButtonPrimaria.isSelected())
            grado = "Primaria";
        else if (this.jRadioButtonPreparatoria.isSelected())
            grado = "Preparatoria";
        else if (this.jRadioButtonSecundaria.isSelected())
            grado = "Secundaria";
        else
            grado = "Ninguno";
        //Obteniendo el valor de los CheckBox
        if (this.jCheckBoxBasquet.isSelected())
            deporte += "Basquet ";
        if(this.jCheckBoxNatacion.isSelected())
            deporte += "Natacion ";        
        if(this.jCheckBoxFutBol.isSelected())
            deporte += "FutBol ";        
        if(this.jCheckBoxKarate.isSelected())
            deporte += "Karate";
        //Obteniendo el valor del combo box
        ciudad = (String)this.jComboBox1.getSelectedItem();
        indice = (int)this.jComboBox1.getSelectedIndex();
        //Obteniendo el primer spinner
        edad = (int)this.jSpinnerEdad.getValue();
        this.jTextAreaMostrar.append("Escolaridad: " + grado);
        this.jTextAreaMostrar.append("\nEdad: " + edad);
        this.jTextAreaMostrar.append("\nDeportes: " + deporte);
        this.jTextAreaMostrar.append("\nCiudad de Nacimiento: " + ciudad);
        this.jTextAreaMostrar.append("\nTotal de poblacion: " + poblacion[indice] + " miles\n");
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jButtonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarActionPerformed
        String grado = "", deporte = "", ciudad = "";
        int indice, edad;
        this.jTextAreaMostrar.setText("");
        //Obteniendo el valor de los radio button
        if (this.jRadioButtonPrimaria.isSelected())
            grado = "Primaria";
        else if (this.jRadioButtonPreparatoria.isSelected())
            grado = "Preparatoria";
        else if (this.jRadioButtonSecundaria.isSelected())
            grado = "Secundaria";
        else
            grado = "Ninguno";
        //Obteniendo el valor de los CheckBox
        if (this.jCheckBoxBasquet.isSelected())
            deporte += "Basquet ";
        if(this.jCheckBoxNatacion.isSelected())
            deporte += "Natacion ";        
        if(this.jCheckBoxFutBol.isSelected())
            deporte += "FutBol ";        
        if(this.jCheckBoxKarate.isSelected())
            deporte += "Karate";
        //Obteniendo el valor del combo box
        ciudad = (String)this.jComboBox1.getSelectedItem();
        indice = (int)this.jComboBox1.getSelectedIndex();
        //Obteniendo el primer spinner
        edad = (int)this.jSpinnerEdad.getValue();
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("datos.txt"));
            pw.println(grado);
            pw.println(edad);
            pw.println(deporte);
            pw.println(ciudad);
            pw.println(poblacion[indice] + " miles");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Tabbadpane.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Listo archivo grabado ...");
    }//GEN-LAST:event_jButtonGrabarActionPerformed

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
            java.util.logging.Logger.getLogger(Tabbadpane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabbadpane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabbadpane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabbadpane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabbadpane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MostrarGrabar;
    private javax.swing.ButtonGroup buttonGroupEscolaridad;
    private javax.swing.JButton jButtonGrabar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JCheckBox jCheckBoxBasquet;
    private javax.swing.JCheckBox jCheckBoxFutBol;
    private javax.swing.JCheckBox jCheckBoxKarate;
    private javax.swing.JCheckBox jCheckBoxNatacion;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelCheckBox;
    private javax.swing.JPanel jPanelComboBoxSpinner;
    private javax.swing.JPanel jPanelRadioButtonGroup;
    private javax.swing.JRadioButton jRadioButtonNinguna;
    private javax.swing.JRadioButton jRadioButtonPreparatoria;
    private javax.swing.JRadioButton jRadioButtonPrimaria;
    private javax.swing.JRadioButton jRadioButtonSecundaria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerEdad;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTextArea jTextAreaMostrar;
    // End of variables declaration//GEN-END:variables
}
