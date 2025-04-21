// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Sistema;
import javax.swing.JOptionPane;

public class PantallaMenuInicio extends javax.swing.JFrame {

    public PantallaMenuInicio(Sistema sistema) {
        modelo = sistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelMenu = new javax.swing.JPanel();
        tMenu = new javax.swing.JLabel();
        BtnRegTematica = new javax.swing.JButton();
        BtnAltaPos = new javax.swing.JButton();
        BtnBajaPos = new javax.swing.JButton();
        BtnRegPuesto = new javax.swing.JButton();
        BtnConsTematica2 = new javax.swing.JButton();
        BtnConsPuesto = new javax.swing.JButton();
        BtnRegEvaluador = new javax.swing.JButton();
        BtnHPostulante = new javax.swing.JButton();
        BtnIngEntrevista = new javax.swing.JButton();
        tExplicacion = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tMenu.setText("Menu");

        BtnRegTematica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegTematica.setText("Registro Tematica");
        BtnRegTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegTematicaActionPerformed(evt);
            }
        });

        BtnAltaPos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnAltaPos.setText("Alta Postulante");
        BtnAltaPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaPosActionPerformed(evt);
            }
        });

        BtnBajaPos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnBajaPos.setText("Baja Postulante");
        BtnBajaPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaPosActionPerformed(evt);
            }
        });

        BtnRegPuesto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegPuesto.setText("Registro Puesto");
        BtnRegPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegPuestoActionPerformed(evt);
            }
        });

        BtnConsTematica2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnConsTematica2.setText("Consulta Por Tematica");
        BtnConsTematica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsTematica2ActionPerformed(evt);
            }
        });

        BtnConsPuesto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnConsPuesto.setText("Consulta Puesto");
        BtnConsPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsPuestoActionPerformed(evt);
            }
        });

        BtnRegEvaluador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegEvaluador.setText("Registro Evaluador");
        BtnRegEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegEvaluadorActionPerformed(evt);
            }
        });

        BtnHPostulante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnHPostulante.setText("Historial De Postulante");
        BtnHPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHPostulanteActionPerformed(evt);
            }
        });

        BtnIngEntrevista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnIngEntrevista.setText("Ingreso De Entrevista");
        BtnIngEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngEntrevistaActionPerformed(evt);
            }
        });

        tExplicacion.setText("Haga click en el boton con el nombre de la pantalla que desea utilizar");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addComponent(BtnConsTematica2)
                                .addGap(51, 51, 51)
                                .addComponent(BtnBajaPos))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addComponent(BtnRegEvaluador)
                                .addGap(29, 29, 29)
                                .addComponent(BtnHPostulante)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnIngEntrevista, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnConsPuesto, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(BtnRegTematica)
                        .addGap(67, 67, 67)
                        .addComponent(BtnAltaPos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(tMenu)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(tExplicacion)
                        .addGap(64, 64, 64))))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tExplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegTematica)
                    .addComponent(BtnRegPuesto)
                    .addComponent(BtnAltaPos))
                .addGap(39, 39, 39)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConsTematica2)
                    .addComponent(BtnConsPuesto)
                    .addComponent(BtnBajaPos))
                .addGap(36, 36, 36)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegEvaluador)
                    .addComponent(BtnIngEntrevista)
                    .addComponent(BtnHPostulante))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegTematicaActionPerformed
        PantallaTematica tematica = new PantallaTematica(modelo);
        tematica.setVisible(true);
        tematica.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnRegTematicaActionPerformed

    private void BtnAltaPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaPosActionPerformed
        if (modelo.getListaDeTematicas().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha registrado ninguna tematica, por lo tanto, no es posible registrar un postulante.");
        } else {
            PantallaAltaPostu altaPostu = new PantallaAltaPostu(modelo);
            altaPostu.setVisible(true);
            altaPostu.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_BtnAltaPosActionPerformed

    private void BtnBajaPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaPosActionPerformed
        if (modelo.getListaDePostulantes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha registrado ningun postulante, por lo tanto, no es posible eliminar postulantes.");
        } else {
            PantallaBajaPostu bajaPostu = new PantallaBajaPostu(modelo);
            bajaPostu.setVisible(true);
            bajaPostu.setLocationRelativeTo(null);
        }  
    }//GEN-LAST:event_BtnBajaPosActionPerformed

    private void BtnRegPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegPuestoActionPerformed
        if (modelo.getListaDeTematicas().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha registrado ninguna tematica, por lo tanto, no es posible registrar un puesto.");
        } else {
            PantallaRegistroDePuesto registroPuesto = new PantallaRegistroDePuesto(modelo);
            registroPuesto.setVisible(true);
            registroPuesto.setLocationRelativeTo(null); 
        }
    }//GEN-LAST:event_BtnRegPuestoActionPerformed

    private void BtnConsTematica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsTematica2ActionPerformed
        if (modelo.getListaDeTematicas().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha registrado ninguna tematica, por lo tanto, no es posible realizar una consulta.");
        } else {
            PantallaConsultaTematicas consTem = new PantallaConsultaTematicas(modelo);
            consTem.setVisible(true);
            consTem.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_BtnConsTematica2ActionPerformed

    private void BtnConsPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsPuestoActionPerformed
        if (modelo.getListaDePuestos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha registrado ningun puesto, por lo tanto, no es posible realizar una consulta.");
        } else {
            PantallaConsultaParaPuestos consPuestos = new PantallaConsultaParaPuestos(modelo);
            consPuestos.setVisible(true);
            consPuestos.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_BtnConsPuestoActionPerformed

    private void BtnRegEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegEvaluadorActionPerformed
        PantallaRegistroEvaluador regEvaluador = new PantallaRegistroEvaluador(modelo);
        regEvaluador.setVisible(true);
        regEvaluador.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnRegEvaluadorActionPerformed

    private void BtnHPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHPostulanteActionPerformed
        if (modelo.getListaDePostulantes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha registrado ningun postulante, por lo tanto, no existe historial de ningun postulante.");
        } else {
            PantallaHistoriaDePostulante hPostulante = new PantallaHistoriaDePostulante(modelo);
            hPostulante.setVisible(true);
            hPostulante.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_BtnHPostulanteActionPerformed

    private void BtnIngEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngEntrevistaActionPerformed
        if (modelo.getListaDeEvaluadores().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha registrado ningun evaluador, por lo tanto, no es posible llevar a cabo una entrevista.");
        } else if (modelo.getListaDePostulantes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha registrado ningun postulante, por lo tanto, no es posible llevar a cabo una entrevista.");
        } else {
            PantallaIngresoDeEntrevista ingEntrevista = new PantallaIngresoDeEntrevista(modelo);
            ingEntrevista.setVisible(true);
            ingEntrevista.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_BtnIngEntrevistaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAltaPos;
    private javax.swing.JButton BtnBajaPos;
    private javax.swing.JButton BtnConsPuesto;
    private javax.swing.JButton BtnConsTematica2;
    private javax.swing.JButton BtnHPostulante;
    private javax.swing.JButton BtnIngEntrevista;
    private javax.swing.JButton BtnRegEvaluador;
    private javax.swing.JButton BtnRegPuesto;
    private javax.swing.JButton BtnRegTematica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JLabel tExplicacion;
    private javax.swing.JLabel tMenu;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

}
