// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Tematica;
import Dominio.Sistema;
import javax.swing.JOptionPane;

public class PantallaTematica extends javax.swing.JFrame {

    public PantallaTematica(Sistema sistema) {
        modelo = sistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTematica = new javax.swing.JPanel();
        tRegTematica = new javax.swing.JLabel();
        tNombre = new javax.swing.JLabel();
        nomTematica = new javax.swing.JTextField();
        tDescripcion = new javax.swing.JLabel();
        descTematica = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnRegistrarTematica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tRegTematica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tRegTematica.setText("Registro de tematica");

        tNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tNombre.setText("Nombre:");

        nomTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTematicaActionPerformed(evt);
            }
        });

        tDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tDescripcion.setText("Descripcion:");

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnRegistrarTematica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegistrarTematica.setText("Registrar");
        BtnRegistrarTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarTematicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTematicaLayout = new javax.swing.GroupLayout(panelTematica);
        panelTematica.setLayout(panelTematicaLayout);
        panelTematicaLayout.setHorizontalGroup(
            panelTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTematicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTematicaLayout.createSequentialGroup()
                        .addGroup(panelTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tDescripcion)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTematicaLayout.createSequentialGroup()
                                .addComponent(tNombre)
                                .addGap(24, 24, 24)))
                        .addGroup(panelTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTematicaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(descTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomTematica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelTematicaLayout.createSequentialGroup()
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegistrarTematica)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTematicaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tRegTematica)
                .addGap(74, 74, 74))
        );
        panelTematicaLayout.setVerticalGroup(
            panelTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTematicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tRegTematica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre)
                    .addComponent(nomTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tDescripcion)
                    .addComponent(descTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnRegistrarTematica)
                    .addComponent(BtnCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnRegistrarTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarTematicaActionPerformed

        PantallaTematica pantTem = new PantallaTematica(modelo);
        boolean bien = true;
        
        String nombreTematica = nomTematica.getText().trim();

        if (!modelo.validarVacio(nombreTematica)) {
            JOptionPane.showMessageDialog(pantTem, "Nombre de tematica invalido, vuelva a ingresarlo.");
            nomTematica.setText("");
            nombreTematica = nomTematica.getText().trim();
            bien = false;
        }
        
        if (!modelo.validarNomTematica(nombreTematica)) {
                JOptionPane.showMessageDialog(pantTem, "Nombre de tematica invalido, vuelva a ingresarlo.");
                nomTematica.setText("");
                nombreTematica = nomTematica.getText().trim();
                bien = false;
            }

        String descTem = descTematica.getText().trim();

        if (!modelo.validarVacio(descTem)) {
            JOptionPane.showMessageDialog(pantTem, "Descripcion invalida, vuelva a ingresarlo.");
            descTematica.setText("");
            descTem = descTematica.getText().trim();
            bien = false;
        }

        if (bien) {
            Tematica nuevaTematica = new Tematica(nombreTematica, descTem);
            modelo.agregarListaTematicas(nuevaTematica);
            
            nomTematica.setText("");
            descTematica.setText("");
        }
    }//GEN-LAST:event_BtnRegistrarTematicaActionPerformed

    private void nomTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTematicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTematicaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRegistrarTematica;
    private javax.swing.JTextField descTematica;
    private javax.swing.JTextField nomTematica;
    private javax.swing.JPanel panelTematica;
    private javax.swing.JLabel tDescripcion;
    private javax.swing.JLabel tNombre;
    private javax.swing.JLabel tRegTematica;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

}
