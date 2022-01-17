/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Mundo.estructuras.listas.LinkedList;
import Mundo.estructuras.listas.Node;
import Mundo.shippingcontrol.Embarcacion;
import javax.swing.JOptionPane;

public class RegistroEmbarcacion extends javax.swing.JPanel {

    /**
     * Creates new form RegistroEmbarcacionForm
     */
    MarcoPrincipal principal;

    private String[] datos = new String[7];

    private boolean registro;

    public RegistroEmbarcacion(boolean registro, MarcoPrincipal principal, int IMO, String nombre, String bandera, int tipo, int capacidad, int actual, boolean disp) {
        this.registro = registro;
        this.principal = principal;
        datos[0] = String.valueOf(IMO);
        datos[1] = nombre;
        datos[2] = bandera;
        datos[3] = String.valueOf(tipo);
        datos[4] = String.valueOf(capacidad);
        datos[5] = String.valueOf(actual);
        datos[6] = String.valueOf(disp);
        initComponents();
        habilitar();
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
        jPanel1 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonGuardarRegistro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bandera = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        contenedores = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxDisp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        IMO = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Embarcación");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGuardar.setBackground(new java.awt.Color(0, 51, 204));
        jButtonGuardar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setToolTipText("");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonGuardar.setFocusPainted(false);
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(100, 40));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 200, 80));

        jButtonGuardarRegistro.setBackground(new java.awt.Color(0, 51, 204));
        jButtonGuardarRegistro.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonGuardarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardarRegistro.setText("Registrar");
        jButtonGuardarRegistro.setToolTipText("");
        jButtonGuardarRegistro.setBorder(null);
        jButtonGuardarRegistro.setBorderPainted(false);
        jButtonGuardarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonGuardarRegistro.setFocusPainted(false);
        jButtonGuardarRegistro.setPreferredSize(new java.awt.Dimension(100, 40));
        jButtonGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 200, 80));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre de embarcación:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        nombre.setEditable(false);
        nombre.setBackground(new java.awt.Color(18, 30, 49));
        nombre.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.setPreferredSize(new java.awt.Dimension(80, 35));
        nombre.setText(datos[1]);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 500, 28));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bandera:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        bandera.setEditable(false);
        bandera.setBackground(new java.awt.Color(18, 30, 49));
        bandera.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        bandera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bandera.setPreferredSize(new java.awt.Dimension(80, 35));
        bandera.setText(datos[2]);
        jPanel1.add(bandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 500, 28));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo de embarcación:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jComboBoxTipo.setBackground(new java.awt.Color(18, 30, 49));
        jComboBoxTipo.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cargo general", "Portacontenedor", "Granelero", "Frigorifrico", "Ro-Ro", "Tanquero", "Industrial" }));
        jComboBoxTipo.setEnabled(false);
        jComboBoxTipo.setPreferredSize(new java.awt.Dimension(90, 35));
        jComboBoxTipo.setSelectedIndex(Integer.valueOf(datos[3]));
        jPanel1.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 500, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Capacidad de contenedores:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 30));

        capacidad.setEditable(false);
        capacidad.setBackground(new java.awt.Color(18, 30, 49));
        capacidad.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        capacidad.setToolTipText("");
        capacidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        capacidad.setPreferredSize(new java.awt.Dimension(197, 35));
        capacidad.setText(datos[4]);
        jPanel1.add(capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 500, 28));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Número actual de contenedores:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 30));

        contenedores.setEditable(false);
        contenedores.setBackground(new java.awt.Color(18, 30, 49));
        contenedores.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        contenedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contenedores.setPreferredSize(new java.awt.Dimension(228, 35));
        jPanel1.add(contenedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 500, 28));
        contenedores.setText(datos[5]);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Disponibilidad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, 30));

        jComboBoxDisp.setBackground(new java.awt.Color(18, 30, 49));
        jComboBoxDisp.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jComboBoxDisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        jComboBoxDisp.setSelectedIndex(1);
        jComboBoxDisp.setEnabled(false);
        jComboBoxDisp.setPreferredSize(new java.awt.Dimension(90, 35));
        if(datos[6]=="true"){
            jComboBoxDisp.setSelectedIndex(1);
        }else{
            jComboBoxDisp.setSelectedIndex(0);
        }
        jPanel1.add(jComboBoxDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 500, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("IMO: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        IMO.setEditable(false);
        IMO.setBackground(new java.awt.Color(204, 204, 204));
        IMO.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        IMO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IMO.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        IMO.setPreferredSize(new java.awt.Dimension(80, 35));
        IMO.setText(datos[0]);
        jPanel1.add(IMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 500, 28));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 600, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(10, 30, 49));
        jLabel9.setText("jLabel9");
        java.awt.Image fondo= new javax.swing.ImageIcon("..\\ShippingControl\\src\\Interfaz\\images\\TiposBarcos2.png").getImage();
        jLabel9.setIcon( new javax.swing.ImageIcon(fondo.getScaledInstance(596, 696, java.awt.Image.SCALE_SMOOTH)));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 596, 696));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 600, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        LinkedList<Embarcacion> lista = principal.getPuerto().GetEmbarcaciones();
        Node<Embarcacion> Iterador = lista.getBeginNode();
        while (Iterador != null) {
            if (Iterador.getData().getIMO() == Integer.valueOf(IMO.getText())) {
                if (Integer.parseInt(contenedores.getText()) > Iterador.getData().getCapacidad()) {
                    JOptionPane.showMessageDialog(null, "El número de contenedores actuales no puede\n"
                            + "ser mayor a la capacidad de la embarcación.");
                } else {
                    Iterador.getData().setActuales(Integer.valueOf(contenedores.getText()));
                    Iterador.getData().setDisponibilidad((jComboBoxDisp.getSelectedIndex() == 0) ? false : true);
                    System.out.println(Boolean.valueOf(String.valueOf(jComboBoxDisp.getSelectedIndex())));
                    principal.addPanel(1, new MenuEmbarcaciones(principal));
                }
            }
            Iterador = Iterador.nextNode;
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistroActionPerformed
        // TODO add your handling code here:
        if (Integer.valueOf(contenedores.getText()) > Integer.valueOf(capacidad.getText())) {
            JOptionPane.showMessageDialog(null, "El número de contenedores actuales no puede\n"
                            + "ser mayor a la capacidad de la embarcación.");
        } else {
            Node<Embarcacion> node = new Node<Embarcacion>(new Embarcacion(Integer.parseInt(IMO.getText()), nombre.getText(), bandera.getText(),
                    jComboBoxTipo.getSelectedIndex(), Integer.valueOf(capacidad.getText()), Integer.valueOf(contenedores.getText()),
                    (jComboBoxDisp.getSelectedIndex() == 0) ? false : true));
            principal.getPuerto().GetEmbarcaciones().Enqueue(node);
            principal.addPanel(1, new MenuEmbarcaciones(principal));
        }
    }//GEN-LAST:event_jButtonGuardarRegistroActionPerformed
    private void habilitar() {
        if (registro) {
            nombre.setEditable(true);
            bandera.setEditable(true);
            jComboBoxTipo.setEnabled(true);
            contenedores.setEditable(true);
            capacidad.setEditable(true);
            jComboBoxDisp.setEnabled(true);
            nombre.setBackground(new java.awt.Color(255, 255, 255));
            bandera.setBackground(new java.awt.Color(255, 255, 255));
            jComboBoxTipo.setBackground(new java.awt.Color(255, 255, 255));
            capacidad.setBackground(new java.awt.Color(255, 255, 255));
            contenedores.setBackground(new java.awt.Color(255, 255, 255));
            jComboBoxDisp.setBackground(new java.awt.Color(255, 255, 255));
            jButtonGuardar.setVisible(false);
            jButtonGuardarRegistro.setVisible(true);
        } else {
            nombre.setEditable(false);
            bandera.setEditable(false);
            jComboBoxTipo.setEnabled(false);
            contenedores.setEditable(true);
            capacidad.setEditable(false);
            jComboBoxDisp.setEnabled(true);
            nombre.setBackground(new java.awt.Color(204, 204, 204));
            bandera.setBackground(new java.awt.Color(204, 204, 204));
            jComboBoxTipo.setBackground(new java.awt.Color(204, 204, 204));
            capacidad.setBackground(new java.awt.Color(204, 204, 204));
            contenedores.setBackground(new java.awt.Color(255, 255, 255));
            jComboBoxDisp.setBackground(new java.awt.Color(255, 255, 255));
            jButtonGuardar.setVisible(true);
            jButtonGuardarRegistro.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IMO;
    private javax.swing.JTextField bandera;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField contenedores;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonGuardarRegistro;
    private javax.swing.JComboBox<String> jComboBoxDisp;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables

}
