// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Postulante;
import Dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;

public class PantallaBajaPostu extends javax.swing.JFrame implements PropertyChangeListener {

    public PantallaBajaPostu(Sistema sistema) {

        initComponents();
        modelo = sistema;
        this.modelo.addPropertyChangeListener(this);

        cargarLista();
    }

    public void cargarLista() {
        listaPos.setListData(new String[0]);
        if (!modelo.getListaDePostulantes().isEmpty()) {
            listaPos.setListData(modelo.getListaDePostulantes().toArray());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBajaPostu = new javax.swing.JPanel();
        tBajaPostu = new javax.swing.JLabel();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tBajaPostu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tBajaPostu.setText("Baja postulante");

        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaPos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Lista de postulantes:");

        javax.swing.GroupLayout panelBajaPostuLayout = new javax.swing.GroupLayout(panelBajaPostu);
        panelBajaPostu.setLayout(panelBajaPostuLayout);
        panelBajaPostuLayout.setHorizontalGroup(
            panelBajaPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBajaPostuLayout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(tBajaPostu)
                .addGap(126, 126, 126))
            .addGroup(panelBajaPostuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBajaPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBajaPostuLayout.createSequentialGroup()
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEliminar))
                    .addGroup(panelBajaPostuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelBajaPostuLayout.setVerticalGroup(
            panelBajaPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBajaPostuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tBajaPostu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBajaPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBajaPostu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBajaPostu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        Postulante postulante = (Postulante) listaPos.getSelectedValue();
        String unPostulante = postulante.toString();
        if (postulante != null) {
            modelo.eliminarPostulante(unPostulante);
            listaPos.setListData(modelo.getListaDePostulantes().toArray());
        } else {
            PantallaBajaPostu pantBajPost = new PantallaBajaPostu(modelo);
            JOptionPane.showMessageDialog(pantBajPost, "No ha seleccionado ningun postulante, seleccione aquel que desea dar de baja.");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Object> listaPos;
    private javax.swing.JPanel panelBajaPostu;
    private javax.swing.JLabel tBajaPostu;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarLista();
    }

}
