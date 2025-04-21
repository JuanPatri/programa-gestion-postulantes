// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Entrevista;
import Dominio.Evaluador;
import Dominio.Postulante;
import Dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class PantallaIngresoDeEntrevista extends javax.swing.JFrame implements PropertyChangeListener {

    public PantallaIngresoDeEntrevista(Sistema sistema) {
        modelo = sistema;
        this.modelo.addPropertyChangeListener(this);
        initComponents();

        SpinnerNumberModel numModel = new SpinnerNumberModel(1, 0, 100, 1);
        puntajeEntrevista.setModel(numModel);

        cargarComboEval();
        cargarComboPostu();
    }

    public void cargarComboEval() {
        comboEval.removeAllItems();
        if (!modelo.getListaDeEvaluadores().isEmpty()) {
            for (Evaluador evaluador : modelo.getListaDeEvaluadores()) {
                comboEval.addItem(evaluador);
            }
        }
    }

    public void cargarComboPostu() {
        comboPos.removeAllItems();
        if (!modelo.getListaDePostulantes().isEmpty()) {
            for (Postulante postulante : modelo.getListaDePostulantes()) {
                comboPos.addItem(postulante);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tIngresoDeEnt = new javax.swing.JLabel();
        tEvaluador = new javax.swing.JLabel();
        tPostulante = new javax.swing.JLabel();
        tPuntaje = new javax.swing.JLabel();
        tComentario = new javax.swing.JLabel();
        comboEval = new javax.swing.JComboBox<>();
        comboPos = new javax.swing.JComboBox<>();
        puntajeEntrevista = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentarioEntrevista = new javax.swing.JTextArea();
        BtnCancelar = new javax.swing.JButton();
        BtnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tIngresoDeEnt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tIngresoDeEnt.setText("Ingreso de entrevista");

        tEvaluador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tEvaluador.setText("Evaluador:");

        tPostulante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tPostulante.setText("Postulante:");

        tPuntaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tPuntaje.setText("Puntaje:");

        tComentario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tComentario.setText("Comentario:");

        comentarioEntrevista.setColumns(20);
        comentarioEntrevista.setRows(5);
        jScrollPane1.setViewportView(comentarioEntrevista);

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnEnviar.setText("Registrar");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tIngresoDeEnt)
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tComentario)
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEnviar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tEvaluador)
                        .addGap(18, 18, 18)
                        .addComponent(comboEval, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tPostulante)
                            .addComponent(tPuntaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboPos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(puntajeEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tIngresoDeEnt)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tEvaluador)
                                    .addComponent(comboEval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(tPostulante))
                            .addComponent(comboPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tPuntaje))
                    .addComponent(puntajeEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnEnviar))
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed

        boolean bien = true;
        PantallaIngresoDeEntrevista pantEntre = new PantallaIngresoDeEntrevista(modelo);

        Object eval = comboEval.getSelectedItem();
        Object postu = comboPos.getSelectedItem();

        Evaluador evaluador = null;
        Postulante postulante = null;

        if (eval != null) {
            evaluador = (Evaluador) eval;
        } else {
            JOptionPane.showMessageDialog(pantEntre, "No selecciono ningun evaluador.");
            bien = false;
        }

        if (postu != null) {
            postulante = (Postulante) postu;
        } else {
            JOptionPane.showMessageDialog(pantEntre, "No selecciono ningun postulante.");
            bien = false;
        }

        SpinnerNumberModel puntEntre = (SpinnerNumberModel) puntajeEntrevista.getModel();
        int puntajeNum = (int) puntEntre.getNumber();
        String puntaje = String.valueOf(puntajeNum);

        String comentario = comentarioEntrevista.getText();

        if (!modelo.validarVacio(comentario)) {
            JOptionPane.showMessageDialog(pantEntre, "Debe ingresar un comentario.");
            comentarioEntrevista.setText("");
            comentario = comentarioEntrevista.getText().trim();
            bien = false;
        }

        String numEntrevista = modelo.genNumEntrevista();

        if (bien) {
            Entrevista nuevaEntrevista = new Entrevista(evaluador, postulante, puntaje, comentario, numEntrevista);
            modelo.agregarListaEntrevistas(nuevaEntrevista);

            comentarioEntrevista.setText("");
            puntajeEntrevista.setValue(0);
        }
    }//GEN-LAST:event_BtnEnviarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JComboBox<Object> comboEval;
    private javax.swing.JComboBox<Object> comboPos;
    private javax.swing.JTextArea comentarioEntrevista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner puntajeEntrevista;
    private javax.swing.JLabel tComentario;
    private javax.swing.JLabel tEvaluador;
    private javax.swing.JLabel tIngresoDeEnt;
    private javax.swing.JLabel tPostulante;
    private javax.swing.JLabel tPuntaje;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarComboEval();
        cargarComboPostu();
    }

}
