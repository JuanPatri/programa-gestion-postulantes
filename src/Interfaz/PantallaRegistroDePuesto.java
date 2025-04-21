// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Puesto;
import Dominio.Sistema;
import Dominio.Tematica;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PantallaRegistroDePuesto extends javax.swing.JFrame implements PropertyChangeListener {

    ButtonGroup btnFormato = new ButtonGroup();
    private DefaultListModel<Object> modeloLista = new DefaultListModel<>();

    public PantallaRegistroDePuesto(Sistema sistema) {
        modelo = sistema;
        this.modelo.addPropertyChangeListener(this);
        initComponents();

        btnFormato.add(botonRemoto);
        btnFormato.add(botonPresencial);
        btnFormato.add(botonMixto);

        cargarComboTemas();

    }

    public void cargarComboTemas() {
        comboTemas.removeAllItems();
        if (!modelo.getListaDeTematicas().isEmpty()) {
            for (Tematica tematica : modelo.getListaDeTematicas()) {
                comboTemas.addItem(tematica.toString());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tRegistroDePuesto = new javax.swing.JLabel();
        tNombreDelPuesto = new javax.swing.JLabel();
        tTipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemas = new javax.swing.JList<>();
        tTemas = new javax.swing.JLabel();
        botonRemoto = new javax.swing.JRadioButton();
        botonPresencial = new javax.swing.JRadioButton();
        botonMixto = new javax.swing.JRadioButton();
        nombrePuesto = new javax.swing.JTextField();
        comboTemas = new javax.swing.JComboBox<>();
        BtnAgregar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonResgistrar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tRegistroDePuesto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tRegistroDePuesto.setText("Registro de puesto");

        tNombreDelPuesto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tNombreDelPuesto.setText("Nombre del puesto:");

        tTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTipo.setText("Tipo:");

        jScrollPane1.setViewportView(listaTemas);

        tTemas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTemas.setText("Temas:");

        botonRemoto.setText("Remoto");

        botonPresencial.setText("Presencial");

        botonMixto.setText("Mixto");

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonResgistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonResgistrar.setText("Registrar");
        botonResgistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResgistrarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonResgistrar))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tTemas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtnEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnAgregar))
                                    .addComponent(comboTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tNombreDelPuesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(tRegistroDePuesto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonRemoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPresencial, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(botonMixto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tRegistroDePuesto)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombreDelPuesto)
                    .addComponent(nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTipo)
                    .addComponent(botonRemoto)
                    .addComponent(botonPresencial)
                    .addComponent(botonMixto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTemas)
                    .addComponent(comboTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnEliminar))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonResgistrar)
                    .addComponent(botonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonResgistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResgistrarActionPerformed

        PantallaRegistroDePuesto regPuesto = new PantallaRegistroDePuesto(modelo);
        boolean bien = true;

        String nomPue = nombrePuesto.getText().trim();

        if (!modelo.validarString(nomPue)) {
            JOptionPane.showMessageDialog(regPuesto, "Nombre de puesto invalido, vuelva a ingresarlo.");
            nombrePuesto.setText("");
            nomPue = nombrePuesto.getText().trim();
            bien = false;
        }

        if (!modelo.validarNombrePuesto(nomPue)) {
            JOptionPane.showMessageDialog(regPuesto, "El puesto ingresado ya existe, ingrese un puesto distinto por favor.");
            nombrePuesto.setText("");
            nomPue = nombrePuesto.getText().trim();
            bien = false;
        }

        String formPuesto = "";

        if (btnFormato.getSelection() == null) {
            JOptionPane.showMessageDialog(regPuesto, "No seleccionaste ningún botón");
            bien = false;
        } else {
            if (botonRemoto.isSelected()) {
                formPuesto = "Remoto";
            } else if (botonPresencial.isSelected()) {
                formPuesto = "Presencial";
            } else {
                formPuesto = "Mixto";
            }
        }

        ArrayList<String> temas = new ArrayList<>();

        for (int i = 0; i < modeloLista.size(); i++) {
            temas.add(modeloLista.getElementAt(i).toString());
        }
        if (temas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun tema, por favor seleccione alguno.");
            bien = false;
        }

        if (bien) {
            Puesto nuevoPuesto = new Puesto(nomPue, formPuesto, temas);
            modelo.agregarListaPuestos(nuevoPuesto);
            nombrePuesto.setText("");
            modeloLista.clear();
            btnFormato.clearSelection();
        }

    }//GEN-LAST:event_botonResgistrarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        String seleccionado = comboTemas.getSelectedItem().toString();
        boolean esUnica = true;

        for (int i = 0; i < modeloLista.size(); i++) {
            String elementos = (String) modeloLista.get(i);
            if (elementos.equals(seleccionado)) {
                esUnica = false;
                break;
            }
        }

        if (esUnica) {
            modeloLista.addElement(seleccionado);
        }
        listaTemas.setModel(modeloLista);
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int sel = listaTemas.getSelectedIndex();

        if (sel != -1) {
            modeloLista.remove(sel);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JRadioButton botonMixto;
    private javax.swing.JRadioButton botonPresencial;
    private javax.swing.JRadioButton botonRemoto;
    private javax.swing.JButton botonResgistrar;
    private javax.swing.JComboBox<String> comboTemas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Object> listaTemas;
    private javax.swing.JTextField nombrePuesto;
    private javax.swing.JLabel tNombreDelPuesto;
    private javax.swing.JLabel tRegistroDePuesto;
    private javax.swing.JLabel tTemas;
    private javax.swing.JLabel tTipo;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarComboTemas();
    }

}
