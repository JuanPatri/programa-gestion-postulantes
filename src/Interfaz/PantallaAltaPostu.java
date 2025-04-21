// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Sistema;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class PantallaAltaPostu extends javax.swing.JFrame {

    ButtonGroup btnFormato = new ButtonGroup();
    private String formPostu = "";

    public PantallaAltaPostu(Sistema sistema) {
        modelo = sistema;
        initComponents();

        btnFormato.add(btnRemotoPostu);
        btnFormato.add(btnPresencialPostu);
        btnFormato.add(btnMixtoPostu);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        panelPostu = new javax.swing.JPanel();
        tituloAltaPostu = new javax.swing.JLabel();
        tNombre = new javax.swing.JLabel();
        tCedula = new javax.swing.JLabel();
        tDireccion = new javax.swing.JLabel();
        tTelefono = new javax.swing.JLabel();
        tMail = new javax.swing.JLabel();
        tLinkedin = new javax.swing.JLabel();
        nombrePostu = new javax.swing.JTextField();
        cedulaPostu = new javax.swing.JTextField();
        mailPostu = new javax.swing.JTextField();
        linkedinPostu = new javax.swing.JTextField();
        tFormato = new javax.swing.JLabel();
        btnRemotoPostu = new javax.swing.JRadioButton();
        btnPresencialPostu = new javax.swing.JRadioButton();
        btnMixtoPostu = new javax.swing.JRadioButton();
        BtnCancelarPostu = new javax.swing.JButton();
        BtnSiguientePostu = new javax.swing.JButton();
        telPostu = new javax.swing.JTextField();
        direcPostu = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloAltaPostu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloAltaPostu.setText("Alta postulante");

        tNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tNombre.setText("Nombre:");

        tCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tCedula.setText("Cedula:");

        tDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tDireccion.setText("Direccion:");

        tTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTelefono.setText("Telefono:");

        tMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tMail.setText("Mail:");

        tLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tLinkedin.setText("Linkedin:");

        tFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tFormato.setText("Formato:");

        btnRemotoPostu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemotoPostu.setText("Remoto");
        btnRemotoPostu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemotoPostuActionPerformed(evt);
            }
        });

        btnPresencialPostu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPresencialPostu.setText("Presencial");
        btnPresencialPostu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresencialPostuActionPerformed(evt);
            }
        });

        btnMixtoPostu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMixtoPostu.setText("Mixto");
        btnMixtoPostu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMixtoPostuActionPerformed(evt);
            }
        });

        BtnCancelarPostu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCancelarPostu.setText("Cancelar");
        BtnCancelarPostu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarPostuActionPerformed(evt);
            }
        });

        BtnSiguientePostu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSiguientePostu.setText("Siguiente");
        BtnSiguientePostu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguientePostuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPostuLayout = new javax.swing.GroupLayout(panelPostu);
        panelPostu.setLayout(panelPostuLayout);
        panelPostuLayout.setHorizontalGroup(
            panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostuLayout.createSequentialGroup()
                        .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPostuLayout.createSequentialGroup()
                                .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombrePostu))
                            .addGroup(panelPostuLayout.createSequentialGroup()
                                .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cedulaPostu))
                            .addGroup(panelPostuLayout.createSequentialGroup()
                                .addComponent(tDireccion)
                                .addGap(18, 18, 18)
                                .addComponent(direcPostu))
                            .addGroup(panelPostuLayout.createSequentialGroup()
                                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tMail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tLinkedin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mailPostu)
                                    .addComponent(linkedinPostu)
                                    .addComponent(telPostu))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPostuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tituloAltaPostu)
                        .addGap(132, 132, 132))
                    .addGroup(panelPostuLayout.createSequentialGroup()
                        .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPostuLayout.createSequentialGroup()
                                .addComponent(tFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemotoPostu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPresencialPostu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMixtoPostu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelPostuLayout.createSequentialGroup()
                                .addComponent(BtnCancelarPostu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnSiguientePostu)))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        panelPostuLayout.setVerticalGroup(
            panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAltaPostu)
                .addGap(34, 34, 34)
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre)
                    .addComponent(nombrePostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCedula)
                    .addComponent(cedulaPostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDireccion)
                    .addComponent(direcPostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTelefono)
                    .addComponent(telPostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMail)
                    .addComponent(mailPostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLinkedin)
                    .addComponent(linkedinPostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFormato)
                    .addComponent(btnRemotoPostu)
                    .addComponent(btnPresencialPostu)
                    .addComponent(btnMixtoPostu))
                .addGap(18, 18, 18)
                .addGroup(panelPostuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiguientePostu)
                    .addComponent(BtnCancelarPostu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemotoPostuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemotoPostuActionPerformed
        formPostu = "Remoto";
    }//GEN-LAST:event_btnRemotoPostuActionPerformed

    private void BtnCancelarPostuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarPostuActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarPostuActionPerformed

    private void BtnSiguientePostuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguientePostuActionPerformed

        PantallaAltaPostu altaPostu = new PantallaAltaPostu(modelo);
        boolean bien = true;

        String nomPostu = nombrePostu.getText().trim();

        if (!modelo.validarString(nomPostu)) {
            JOptionPane.showMessageDialog(altaPostu, "Nombre invalido, vuelva a ingresarlo.");
            nombrePostu.setText("");
            nomPostu = nombrePostu.getText().trim();
            bien = false;
        }

        String cedPostu = cedulaPostu.getText().trim();

        if (!modelo.validarCedulaUnica(cedPostu)) {
            JOptionPane.showMessageDialog(altaPostu, "Cedula ya existente, ingrese una distinta.");
            cedulaPostu.setText("");
            cedPostu = cedulaPostu.getText().trim();
            bien = false;
        } else {
            if (!cedPostu.matches("[0-9]{8,8}")) {
                JOptionPane.showMessageDialog(altaPostu, "Cedula invalida, ingresela nuevamente.");
                cedulaPostu.setText("");
                cedPostu = cedulaPostu.getText().trim();
                bien = false;
            }
        }

        String direccionPostu = direcPostu.getText().trim();

        if (!modelo.validarVacio(direccionPostu)) {
            JOptionPane.showMessageDialog(altaPostu, "Direccion invalida, vuelva a ingresarla.");
            direcPostu.setText("");
            direccionPostu = direcPostu.getText().trim();
            bien = false;
        }

        String telefonoPostu = telPostu.getText().trim();

        if (!modelo.validarTelefono(telefonoPostu)) {
            JOptionPane.showMessageDialog(altaPostu, "Telefono invalido, vuelva a ingresarlo.");
            telPostu.setText("");
            telefonoPostu = telPostu.getText().trim();
            bien = false;
        }

        String mPostu = mailPostu.getText().trim();

        if (!modelo.validarMail(mPostu)) {
            JOptionPane.showMessageDialog(altaPostu, "Email invalido, vuelva a ingresarlo.");
            mailPostu.setText("");
            mPostu = mailPostu.getText().trim();
            bien = false;
        }

        String linkPostu = linkedinPostu.getText();

        if (!modelo.validarLinkedIn(linkPostu)) {
            JOptionPane.showMessageDialog(altaPostu, "Link invalido, vuelva a ingresarlo.");
            linkedinPostu.setText("");
            mPostu = mailPostu.getText().trim();
            bien = false;
        }

        if (btnFormato.getSelection() == null) {
            JOptionPane.showMessageDialog(altaPostu, "No seleccionaste ningún botón");
            bien = false;
        }

        if (bien) {

            Pantalla2Postu pantalla = new Pantalla2Postu(modelo, nomPostu, cedPostu, direccionPostu, telefonoPostu, mPostu, linkPostu, formPostu);
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);

            nombrePostu.setText("");
            cedulaPostu.setText("");
            direcPostu.setText("");
            telPostu.setText("");
            mailPostu.setText("");
            linkedinPostu.setText("");
            btnFormato.clearSelection();
        }
    }//GEN-LAST:event_BtnSiguientePostuActionPerformed

    private void btnPresencialPostuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresencialPostuActionPerformed
        formPostu = "Presencial";
    }//GEN-LAST:event_btnPresencialPostuActionPerformed

    private void btnMixtoPostuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMixtoPostuActionPerformed
        formPostu = "Mixto";
    }//GEN-LAST:event_btnMixtoPostuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelarPostu;
    private javax.swing.JButton BtnSiguientePostu;
    private javax.swing.JRadioButton btnMixtoPostu;
    private javax.swing.JRadioButton btnPresencialPostu;
    private javax.swing.JRadioButton btnRemotoPostu;
    private javax.swing.JTextField cedulaPostu;
    private javax.swing.JTextField direcPostu;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField linkedinPostu;
    private javax.swing.JTextField mailPostu;
    private javax.swing.JTextField nombrePostu;
    private javax.swing.JPanel panelPostu;
    private javax.swing.JLabel tCedula;
    private javax.swing.JLabel tDireccion;
    private javax.swing.JLabel tFormato;
    private javax.swing.JLabel tLinkedin;
    private javax.swing.JLabel tMail;
    private javax.swing.JLabel tNombre;
    private javax.swing.JLabel tTelefono;
    private javax.swing.JTextField telPostu;
    private javax.swing.JLabel tituloAltaPostu;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

}
