/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import java.awt.Color;
    
/**
 *
 * @author jhonz
 */
public class MarcoPrincipal extends javax.swing.JPanel {
    
    private VentanaPrincipal principal;
    
    private CerrarSesionAux cerrar=new CerrarSesionAux();
    
    private RegistroEmbarcacion registroEmb=new RegistroEmbarcacion();
    /**
     * Creates new form MarcoPrincipal
     */

    public MarcoPrincipal(VentanaPrincipal principal) {
        this.principal=principal;
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

        jTabbedPaneContenedor = new javax.swing.JTabbedPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jTabbedPaneContenedor.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneContenedor.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPaneContenedor.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTabbedPaneContenedor.setName(""); // NOI18N
        jTabbedPaneContenedor.add("Prueba",registroEmb);
        jTabbedPaneContenedor.add("Cerrar Sesión",cerrar);
        jTabbedPaneContenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneContenedorMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        add(jTabbedPaneContenedor, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPaneContenedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneContenedorMouseClicked
        // TODO add your handling code here:
        if(jTabbedPaneContenedor.getSelectedIndex()==1){
            principal.addPanelInicio();
        }
    }//GEN-LAST:event_jTabbedPaneContenedorMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPaneContenedor;
    // End of variables declaration//GEN-END:variables
}
