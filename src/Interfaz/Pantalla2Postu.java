// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Postulante;
import Dominio.Sistema;
import Dominio.Tematica;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Pantalla2Postu extends javax.swing.JFrame implements PropertyChangeListener {

    private DefaultListModel<Object> modeloLista = new DefaultListModel<>();
    private DefaultListModel<Object> modeloLista2 = new DefaultListModel<>();

    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String mail;
    private String link;
    private String formato;

    public Pantalla2Postu(Sistema sistema, String nomPostu, String cedPostu, String direccionPostu, String telefonoPostu, String mPostu, String linkPostu, String formPostu) {

        modelo = sistema;
        this.modelo.addPropertyChangeListener(this);
        initComponents();

        nombre = nomPostu;
        cedula = cedPostu;
        direccion = direccionPostu;
        telefono = telefonoPostu;
        mail = mPostu;
        link = linkPostu;
        formato = formPostu;

        SpinnerNumberModel numModel = new SpinnerNumberModel(1, 1, 10, 1);
        cantNivelesPostu.setModel(numModel);
        
        cargarCombo();
    }

    public void cargarCombo() {
        comboTemasPostu.removeAllItems();
        if (!modelo.getListaDeTematicas().isEmpty()) {
            for (Tematica tematica : modelo.getListaDeTematicas()) {
                comboTemasPostu.addItem(tematica.toString());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelPostu2 = new javax.swing.JPanel();
        tTemas = new javax.swing.JLabel();
        tNivel = new javax.swing.JLabel();
        comboTemasPostu = new javax.swing.JComboBox<>();
        cantNivelesPostu = new javax.swing.JSpinner();
        BtnAgregar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        separadorPostu = new javax.swing.JSeparator();
        tExperiencia = new javax.swing.JLabel();
        BtnEliminarPostu2 = new javax.swing.JButton();
        BtnCancelarPostu2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTem = new javax.swing.JList<>();
        BtnRegistrarPostu2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tTemas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTemas.setText("Temas:");

        tNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tNivel.setText("Nivel:");

        BtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        tExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tExperiencia.setText("Experiencia:");

        BtnEliminarPostu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnEliminarPostu2.setText("Eliminar");
        BtnEliminarPostu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarPostu2ActionPerformed(evt);
            }
        });

        BtnCancelarPostu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCancelarPostu2.setText("Cancelar");
        BtnCancelarPostu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarPostu2ActionPerformed(evt);
            }
        });

        listaTem.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTemValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaTem);

        BtnRegistrarPostu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegistrarPostu2.setText("Registrar");
        BtnRegistrarPostu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarPostu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPostu2Layout = new javax.swing.GroupLayout(panelPostu2);
        panelPostu2.setLayout(panelPostu2Layout);
        panelPostu2Layout.setHorizontalGroup(
            panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPostu2Layout.createSequentialGroup()
                        .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTemasPostu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelPostu2Layout.createSequentialGroup()
                                .addComponent(cantNivelesPostu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAgregar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPostu2Layout.createSequentialGroup()
                        .addComponent(BtnCancelarPostu2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegistrarPostu2))
                    .addComponent(separadorPostu)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPostu2Layout.createSequentialGroup()
                        .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tExperiencia)
                            .addComponent(BtnEliminarPostu2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        panelPostu2Layout.setVerticalGroup(
            panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostu2Layout.createSequentialGroup()
                .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostu2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tTemas)
                            .addComponent(comboTemasPostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPostu2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNivel)
                    .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantNivelesPostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorPostu, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostu2Layout.createSequentialGroup()
                        .addComponent(tExperiencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarPostu2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPostu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrarPostu2)
                    .addComponent(BtnCancelarPostu2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPostu2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarPostu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarPostu2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarPostu2ActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        int num = (int) cantNivelesPostu.getValue();
        String temSelec = comboTemasPostu.getSelectedItem().toString();

        String ambas = temSelec + "(" + num + ")";

        boolean esUnica = true;

        for (int i = 0; i < modeloLista2.size(); i++) {
            String elementos = (String) modeloLista2.get(i);
            if (elementos.equals(temSelec)) {
                esUnica = false;
                break;
            }
        }
        if (esUnica) {
            modeloLista.addElement(ambas);
            modeloLista2.addElement(temSelec);
        }
        listaTem.setModel(modeloLista);
        cantNivelesPostu.setValue(1);
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnEliminarPostu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarPostu2ActionPerformed
        int sel = listaTem.getSelectedIndex();

        if (sel != -1) {
            modeloLista.remove(sel);
            modeloLista2.remove(sel);
        }
    }//GEN-LAST:event_BtnEliminarPostu2ActionPerformed

    private void BtnRegistrarPostu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarPostu2ActionPerformed

        ArrayList<String> experiencias = new ArrayList<>();

        for (int i = 0; i < modeloLista.size(); i++) {
            experiencias.add(modeloLista.getElementAt(i).toString());
        }

        if (experiencias.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun tema, por favor seleccione alguno.");
        } else {
            Postulante nuevoPostulante = new Postulante(nombre, cedula, direccion, telefono, mail, link, formato, experiencias);
            modelo.agregarListaPostulantes(nuevoPostulante);
            modeloLista.clear();
            cantNivelesPostu.setValue(1);
            this.dispose();
        }
    }//GEN-LAST:event_BtnRegistrarPostu2ActionPerformed

    private void listaTemValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTemValueChanged

    }//GEN-LAST:event_listaTemValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCancelarPostu2;
    private javax.swing.JButton BtnEliminarPostu2;
    private javax.swing.JButton BtnRegistrarPostu2;
    private javax.swing.JSpinner cantNivelesPostu;
    private javax.swing.JComboBox<String> comboTemasPostu;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Object> listaTem;
    private javax.swing.JPanel panelPostu2;
    private javax.swing.JSeparator separadorPostu;
    private javax.swing.JLabel tExperiencia;
    private javax.swing.JLabel tNivel;
    private javax.swing.JLabel tTemas;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarCombo();
    }

}
