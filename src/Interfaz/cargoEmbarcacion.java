/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

/**
 *
 * @author jhonz
 */
public class cargoEmbarcacion extends javax.swing.JPanel {

    /**
     * Creates new form cargoEmbarcacion
     */
    public cargoEmbarcacion() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jButtonRegistrar = new javax.swing.JButton();
        jPanelForm = new javax.swing.JPanel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelID1 = new javax.swing.JLabel();
        jLabelID2 = new javax.swing.JLabel();
        jLabelID3 = new javax.swing.JLabel();
        jTextFieldActual = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldFecha3 = new javax.swing.JTextField();
        jLabelRegistroBodega = new javax.swing.JLabel();
        jLabelEs = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonEditar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        jButtonRegistrar.setBackground(new java.awt.Color(0, 51, 204));
        jButtonRegistrar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.setToolTipText("");
        jButtonRegistrar.setBorder(null);
        jButtonRegistrar.setBorderPainted(false);
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegistrar.setFocusPainted(false);
        jButtonRegistrar.setPreferredSize(new java.awt.Dimension(400, 40));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanelForm.setBackground(new java.awt.Color(255, 255, 255));
        jPanelForm.setPreferredSize(new java.awt.Dimension(1200, 600));

        jTextFieldID.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(97, 97, 97));
        jTextFieldID.setAutoscrolls(false);
        jTextFieldID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextFieldID.setMinimumSize(new java.awt.Dimension(800, 18));
        jTextFieldID.setName(""); // NOI18N

        jLabelID.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID.setText("Contenedores:");
        jLabelID.setToolTipText("");

        jLabelID1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelID1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID1.setText("ID bodega:");
        jLabelID1.setToolTipText("");

        jLabelID2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelID2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID2.setText("Otra cosa:");
        jLabelID2.setToolTipText("");

        jLabelID3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelID3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID3.setText("Capacidad actual: ");
        jLabelID3.setToolTipText("");

        jTextFieldActual.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldActual.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldActual.setForeground(new java.awt.Color(97, 97, 97));
        jTextFieldActual.setAutoscrolls(false);
        jTextFieldActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldActual.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextFieldActual.setMinimumSize(new java.awt.Dimension(800, 18));
        jTextFieldActual.setName(""); // NOI18N

        jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(97, 97, 97));
        jTextFieldTotal.setAutoscrolls(false);
        jTextFieldTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldTotal.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextFieldTotal.setMinimumSize(new java.awt.Dimension(800, 18));
        jTextFieldTotal.setName(""); // NOI18N

        jTextFieldFecha3.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFecha3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldFecha3.setForeground(new java.awt.Color(97, 97, 97));
        jTextFieldFecha3.setAutoscrolls(false);
        jTextFieldFecha3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldFecha3.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextFieldFecha3.setMinimumSize(new java.awt.Dimension(800, 18));
        jTextFieldFecha3.setName(""); // NOI18N

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(jLabelID2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(jLabelID3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldActual, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelFormLayout.createSequentialGroup()
                            .addComponent(jLabelID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFormLayout.createSequentialGroup()
                            .addComponent(jLabelID1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID1))
                .addGap(29, 29, 29)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID3)
                    .addComponent(jTextFieldActual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID2)
                    .addComponent(jTextFieldFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        add(jPanelForm, gridBagConstraints);

        jLabelRegistroBodega.setFont(new java.awt.Font("SansSerif", 1, 54)); // NOI18N
        jLabelRegistroBodega.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRegistroBodega.setText("Bodega");
        jLabelRegistroBodega.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = 20;
        add(jLabelRegistroBodega, gridBagConstraints);

        jLabelEs.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = 20;
        add(jLabelEs, gridBagConstraints);

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setPreferredSize(new java.awt.Dimension(1200, 60));

        jButtonEditar.setBackground(new java.awt.Color(0, 51, 204));
        jButtonEditar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setToolTipText("");
        jButtonEditar.setBorder(null);
        jButtonEditar.setBorderPainted(false);
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEditar.setFocusPainted(false);
        jButtonEditar.setPreferredSize(new java.awt.Dimension(100, 40));

        jButtonGuardar.setBackground(new java.awt.Color(0, 51, 204));
        jButtonGuardar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setToolTipText("");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonGuardar.setFocusPainted(false);
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        add(jPanelBotones, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelEs;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelID1;
    private javax.swing.JLabel jLabelID2;
    private javax.swing.JLabel jLabelID3;
    private javax.swing.JLabel jLabelRegistroBodega;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JTextField jTextFieldActual;
    private javax.swing.JTextField jTextFieldFecha3;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
