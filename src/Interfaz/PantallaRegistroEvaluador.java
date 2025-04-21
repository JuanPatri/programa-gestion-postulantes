// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Evaluador;
import Dominio.Sistema;
import javax.swing.JOptionPane;

public class PantallaRegistroEvaluador extends javax.swing.JFrame {

    public PantallaRegistroEvaluador(Sistema sistema) {
        modelo = sistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloRegistroEval = new javax.swing.JLabel();
        tNombreEval = new javax.swing.JLabel();
        tCedulaEval = new javax.swing.JLabel();
        tDireccionEval = new javax.swing.JLabel();
        tAnoIngresoEval = new javax.swing.JLabel();
        nombreEvaluador = new javax.swing.JTextField();
        cedulaEvaluador = new javax.swing.JTextField();
        direccionEvaluador = new javax.swing.JTextField();
        anoIngresoEvaluador = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloRegistroEval.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloRegistroEval.setText("Registro Evaluador");

        tNombreEval.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tNombreEval.setText("Nombre:");

        tCedulaEval.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tCedulaEval.setText("Cedula:");

        tDireccionEval.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tDireccionEval.setText("Direccion:");

        tAnoIngresoEval.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tAnoIngresoEval.setText("Año de ingreso:");

        nombreEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEvaluadorActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(tituloRegistroEval, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNombreEval)
                            .addComponent(tCedulaEval))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreEvaluador)
                            .addComponent(cedulaEvaluador)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tAnoIngresoEval)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anoIngresoEvaluador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tDireccionEval)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(direccionEvaluador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegistrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloRegistroEval)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombreEval)
                    .addComponent(nombreEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCedulaEval)
                    .addComponent(cedulaEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDireccionEval)
                    .addComponent(direccionEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAnoIngresoEval)
                    .addComponent(anoIngresoEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed

        PantallaRegistroEvaluador pantRegEva = new PantallaRegistroEvaluador(modelo);
        boolean bien = true;

        String nomEval = nombreEvaluador.getText().trim();

        if (!modelo.validarString(nomEval)) {
            JOptionPane.showMessageDialog(pantRegEva, "Nombre invalido, vuelva a ingresarlo.");
            nombreEvaluador.setText("");
            nomEval = nombreEvaluador.getText().trim();
            bien = false;
        }

        String cedEval = cedulaEvaluador.getText().trim();
        
        if (!modelo.validarCedulaUnica(cedEval)) {
            JOptionPane.showMessageDialog(pantRegEva, "Cedula ya existente, ingrese una distinta.");
            cedulaEvaluador.setText("");
            cedEval = cedulaEvaluador.getText().trim();
            bien = false;
        } else {
            if (!cedEval.matches("[0-9]{8,8}")) {
                JOptionPane.showMessageDialog(pantRegEva, "Cedula invalida, ingresela nuevamente.");
                cedulaEvaluador.setText("");
                cedEval = cedulaEvaluador.getText().trim();
                bien = false; 
            }
        }

        String dirEval = direccionEvaluador.getText().trim();

        if (!modelo.validarVacio(dirEval)) {
            JOptionPane.showMessageDialog(pantRegEva, "Direccion invalida, vuelva a ingresarla.");
            direccionEvaluador.setText("");
            dirEval = direccionEvaluador.getText().trim();
            bien = false;
        }

        String anoIng = anoIngresoEvaluador.getText().trim();

        if (!modelo.validarAnoIngreso(anoIng)) {
            JOptionPane.showMessageDialog(pantRegEva, "Año invalido, vuelva a ingresarlo.");
            anoIngresoEvaluador.setText("");
            anoIng = anoIngresoEvaluador.getText().trim();
            bien = false;
        }

        if (bien) {

            Evaluador nuevoEvaluador = new Evaluador(nomEval, cedEval, dirEval, anoIng);
            modelo.agregarListaEvaluadores(nuevoEvaluador);
            
            nombreEvaluador.setText("");
            cedulaEvaluador.setText("");
            direccionEvaluador.setText("");
            anoIngresoEvaluador.setText("");
        }

    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void nombreEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEvaluadorActionPerformed
       
    }//GEN-LAST:event_nombreEvaluadorActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JTextField anoIngresoEvaluador;
    private javax.swing.JTextField cedulaEvaluador;
    private javax.swing.JTextField direccionEvaluador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreEvaluador;
    private javax.swing.JLabel tAnoIngresoEval;
    private javax.swing.JLabel tCedulaEval;
    private javax.swing.JLabel tDireccionEval;
    private javax.swing.JLabel tNombreEval;
    private javax.swing.JLabel tituloRegistroEval;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

}
