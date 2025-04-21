// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Sistema;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PantallaInicio extends javax.swing.JFrame {

    public PantallaInicio(Sistema sistema) {
        modelo = sistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JPanel();
        tInicio = new javax.swing.JLabel();
        tTomarDatos = new javax.swing.JLabel();
        BtnDatos = new javax.swing.JButton();
        tSistVacio = new javax.swing.JLabel();
        BtnSistVacio = new javax.swing.JButton();
        BtnGuardarSalir = new javax.swing.JButton();
        BtnSalirSinGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tInicio.setText("Bienvenido");

        tTomarDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTomarDatos.setText("Tomar datos anteriores");

        BtnDatos.setText("Datos anteriores");
        BtnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDatosActionPerformed(evt);
            }
        });

        tSistVacio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tSistVacio.setText("Comenzar con un sistema vacio");

        BtnSistVacio.setText("Sistema vacio");
        BtnSistVacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSistVacioActionPerformed(evt);
            }
        });

        BtnGuardarSalir.setText("Guardar datos y cerrar programa");
        BtnGuardarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarSalirActionPerformed(evt);
            }
        });

        BtnSalirSinGuardar.setText("Cerrar programa sin guardar datos");
        BtnSalirSinGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirSinGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addComponent(BtnGuardarSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(BtnSalirSinGuardar))
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(tInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnDatos)
                    .addComponent(tTomarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                        .addComponent(tSistVacio)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                        .addComponent(BtnSistVacio)
                        .addGap(53, 53, 53))))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addComponent(tInicio)
                .addGap(12, 12, 12)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTomarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSistVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDatos)
                    .addComponent(BtnSistVacio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarSalir)
                    .addComponent(BtnSalirSinGuardar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDatosActionPerformed
        try {
            ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("SistemaGuardado.ser")));
            Sistema sistemaGuardado = (Sistema) input.readObject();
            sistemaGuardado.inicializarManejador();
            modelo = sistemaGuardado;
            input.close();
            PantallaMenuInicio menu = new PantallaMenuInicio(sistemaGuardado);
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);

        } catch (IOException e) {
            System.out.println("Error de recuperación: No hay datos anteriores guardados " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de recuperación: Clase no encontrada");
        }
    }//GEN-LAST:event_BtnDatosActionPerformed

    private void BtnSistVacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSistVacioActionPerformed
        PantallaMenuInicio menu = new PantallaMenuInicio(modelo);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnSistVacioActionPerformed

    private void BtnGuardarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarSalirActionPerformed
        try (ObjectOutputStream out = new ObjectOutputStream(
                Files.newOutputStream(Paths.get("SistemaGuardado.ser")))) {
            out.writeObject(modelo);
            out.close();
            System.out.println("Los datos fueron guardados con exito");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
            System.exit(1);
        }
        System.exit(0);
    }//GEN-LAST:event_BtnGuardarSalirActionPerformed

    private void BtnSalirSinGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirSinGuardarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirSinGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDatos;
    private javax.swing.JButton BtnGuardarSalir;
    private javax.swing.JButton BtnSalirSinGuardar;
    private javax.swing.JButton BtnSistVacio;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JLabel tInicio;
    private javax.swing.JLabel tSistVacio;
    private javax.swing.JLabel tTomarDatos;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;
}
