// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Postulante;
import Dominio.Sistema;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

public class PantallaHistoriaDePostulante extends javax.swing.JFrame implements PropertyChangeListener {

    private ArrayList<String> nomCed = new ArrayList<String>();
    private DefaultTableModel miTabla;
    private int cont;

    public PantallaHistoriaDePostulante(Sistema sistema) {
        modelo = sistema;
        this.modelo.addPropertyChangeListener(this);
        initComponents();

        cargarLista();
    }

    public void cargarLista() {
        listaPostu.setListData(new String[0]);

        Collections.sort(modelo.getListaDePostulantes(), Comparator.comparing(Postulante::getCedulaPostu));

        for (int i = 0; i < modelo.getListaDePostulantes().size(); i++) {
            nomCed.add(modelo.getListaDePostulantes().get(i).getNombrePo() + " (" + modelo.getListaDePostulantes().get(i).getCedulaPostu() + ")");
        }

        if (!nomCed.isEmpty()) {
            listaPostu.setListData(nomCed.toArray());
        }
    }

    public void cargarDatos() {
        textoExperiencia.setListData(new String[0]);
        this.miTabla = (DefaultTableModel) tabla.getModel();
        miTabla.setRowCount(0);
        String sel = (String) listaPostu.getSelectedValue();

        cont = 1;

        if (sel != null) {
            String[] partes = sel.split("\\(");
            String nombrePo = partes[0];
            String cedulaPo = partes[1].substring(0, partes[1].length() - 1);

            for (int i = 0; i < modelo.getListaDePostulantes().size(); i++) {
                if (cedulaPo.equals(modelo.getListaDePostulantes().get(i).getCedulaPostu())) {
                    textoNombre.setText(nombrePo);
                    textoCedula.setText(cedulaPo);
                    textoDireccion.setText(modelo.getListaDePostulantes().get(i).getDireccion());
                    textoTelefono.setText(modelo.getListaDePostulantes().get(i).getTelefono());
                    textoMail.setText(modelo.getListaDePostulantes().get(i).getMail());

                    String link = modelo.getListaDePostulantes().get(i).getLinkedin();
                    textoLinkedin.setText(link);
                    textoLinkedin.setForeground(java.awt.Color.BLUE);
                    textoLinkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                    textoLinkedin.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            modelo.abrirEnlace(link);
                        }
                    });

                    textoFormato.setText(modelo.getListaDePostulantes().get(i).getFormatoPo());

                    ArrayList<String> exp = new ArrayList<String>();
                    ArrayList<String> experiencias = modelo.getListaDePostulantes().get(i).getExperiencias();

                    for (String expp : experiencias) {
                        exp.add(expp);
                    }

                    String[] expArray = exp.toArray(new String[0]);
                    textoExperiencia.setListData(expArray);

                    miTabla.setRowCount(0);

                    for (int j = 0; j < modelo.getListaDeEntrevistas().size(); j++) {
                        if (modelo.getListaDeEntrevistas().get(j).getPostulante().getCedulaPostu().equals(cedulaPo)) {
                            miTabla.addRow(new Object[]{
                                cont,
                                modelo.getListaDeEntrevistas().get(j).getEvaluador() + " (" + modelo.getListaDeEntrevistas().get(j).getEvaluador().getCedulaE() + ")",
                                modelo.getListaDeEntrevistas().get(j).getPuntaje(),
                                modelo.getListaDeEntrevistas().get(j).getComEntrevista()
                            });
                            cont++;
                        }
                    }

                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHistorial = new javax.swing.JPanel();
        tituloHistorialPostulante = new javax.swing.JLabel();
        tituloPostulante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostu = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        tituloNombre = new javax.swing.JLabel();
        tituloCedula = new javax.swing.JLabel();
        tituloDireccion = new javax.swing.JLabel();
        tituloTelefono = new javax.swing.JLabel();
        tituloMail = new javax.swing.JLabel();
        tituloLinkedin = new javax.swing.JLabel();
        tituloFormato = new javax.swing.JLabel();
        tituloExperiencia = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoCedula = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JLabel();
        textoLinkedin = new javax.swing.JLabel();
        textoFormato = new javax.swing.JLabel();
        tituloBuscar = new javax.swing.JLabel();
        txtIngresado = new javax.swing.JTextField();
        BtnBuscarPostulante = new javax.swing.JButton();
        BtnResetarPostulante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        BtnSalir = new javax.swing.JButton();
        textoMail = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textoExperiencia = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloHistorialPostulante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloHistorialPostulante.setText("Historial postulante");

        tituloPostulante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloPostulante.setText("Postulantes:");

        listaPostu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPostuValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPostu);

        tituloNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloNombre.setText("Nombre:");

        tituloCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloCedula.setText("Cedula:");

        tituloDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloDireccion.setText("Direccion:");

        tituloTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloTelefono.setText("Telefono:");

        tituloMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloMail.setText("Mail:");

        tituloLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloLinkedin.setText("Linkedin:");

        tituloFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloFormato.setText("Formato:");

        tituloExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloExperiencia.setText("Experiencia:");

        tituloBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloBuscar.setText("Buscar:");

        BtnBuscarPostulante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnBuscarPostulante.setText("Buscar");
        BtnBuscarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPostulanteActionPerformed(evt);
            }
        });

        BtnResetarPostulante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnResetarPostulante.setText("Resetear");
        BtnResetarPostulante.setToolTipText("");
        BtnResetarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetarPostulanteActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        BtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(textoExperiencia);

        javax.swing.GroupLayout panelHistorialLayout = new javax.swing.GroupLayout(panelHistorial);
        panelHistorial.setLayout(panelHistorialLayout);
        panelHistorialLayout.setHorizontalGroup(
            panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHistorialLayout.createSequentialGroup()
                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloPostulante)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistorialLayout.createSequentialGroup()
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelHistorialLayout.createSequentialGroup()
                                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tituloCedula)
                                            .addComponent(tituloNombre))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHistorialLayout.createSequentialGroup()
                                        .addComponent(tituloDireccion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textoCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(109, 109, 109))
                            .addGroup(panelHistorialLayout.createSequentialGroup()
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloTelefono)
                                    .addComponent(tituloMail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textoMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(82, 82, 82))
                            .addGroup(panelHistorialLayout.createSequentialGroup()
                                .addComponent(tituloLinkedin)
                                .addGap(42, 42, 42)
                                .addComponent(textoLinkedin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(73, 73, 73))
                            .addGroup(panelHistorialLayout.createSequentialGroup()
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloFormato)
                                    .addComponent(tituloExperiencia))
                                .addGap(26, 26, 26)
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelHistorialLayout.createSequentialGroup()
                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane2)
                            .addGroup(panelHistorialLayout.createSequentialGroup()
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelHistorialLayout.createSequentialGroup()
                                        .addComponent(tituloBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnBuscarPostulante)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnResetarPostulante))
                                    .addComponent(BtnSalir))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(tituloHistorialPostulante)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelHistorialLayout.setVerticalGroup(
            panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloHistorialPostulante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloNombre)
                        .addComponent(tituloPostulante)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelHistorialLayout.createSequentialGroup()
                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelHistorialLayout.createSequentialGroup()
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloCedula)
                                    .addComponent(textoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tituloDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tituloTelefono))
                            .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloMail)
                            .addComponent(textoMail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tituloLinkedin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloExperiencia)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloBuscar)
                    .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBuscarPostulante)
                        .addComponent(BtnResetarPostulante)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSalir)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnResetarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetarPostulanteActionPerformed
        txtIngresado.setText("");
        miTabla.setRowCount(0);

        if (!listaPostu.isSelectionEmpty()) {
            String sel = (String) listaPostu.getSelectedValue();
            String[] partes = sel.split("\\(");
            String cedulaPo = partes[1].substring(0, partes[1].length() - 1);

            for (int i = 0; i < modelo.getListaDePostulantes().size(); i++) {
                for (int j = 0; j < modelo.getListaDeEntrevistas().size(); j++) {
                    if (cedulaPo.equals(modelo.getListaDePostulantes().get(i).getCedulaPostu())) {
                        miTabla.addRow(new Object[]{
                            cont,
                            modelo.getListaDeEntrevistas().get(j).getEvaluador() + " (" + modelo.getListaDeEntrevistas().get(j).getEvaluador().getCedulaE() + ")",
                            modelo.getListaDeEntrevistas().get(j).getPuntaje(),
                            modelo.getListaDeEntrevistas().get(j).getComEntrevista()
                        });
                    }
                }
            }
        }
    }//GEN-LAST:event_BtnResetarPostulanteActionPerformed

    private void BtnBuscarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarPostulanteActionPerformed
        this.miTabla = (DefaultTableModel) tabla.getModel();
        String texto = txtIngresado.getText();

        txtIngresado.setText("");
        miTabla.setRowCount(0);

        if (!listaPostu.isSelectionEmpty()) {
            String sel = (String) listaPostu.getSelectedValue();
            String[] partes = sel.split("\\(");
            String cedulaPo = partes[1].substring(0, partes[1].length() - 1);

            for (int i = 0; i < modelo.getListaDePostulantes().size(); i++) {
                for (int j = 0; j < modelo.getListaDeEntrevistas().size(); j++) {
                    if (cedulaPo.equals(modelo.getListaDePostulantes().get(i).getCedulaPostu())) {
                        miTabla.addRow(new Object[]{
                            modelo.getListaDeEntrevistas().get(j).getNumEntrevista(),
                            modelo.getListaDeEntrevistas().get(j).getEvaluador() + " (" + modelo.getListaDeEntrevistas().get(j).getEvaluador().getCedulaE() + ")",
                            modelo.getListaDeEntrevistas().get(j).getPuntaje(),
                            modelo.getListaDeEntrevistas().get(j).getComEntrevista()
                        });
                    }
                }
            }
        }

        for (int i = 0; i < miTabla.getRowCount(); i++) {
            String comentario = (String) miTabla.getValueAt(i, 3);
            if (comentario.contains(texto)) {
                miTabla.setValueAt(modelo.resaltarPalabraR(texto, comentario), i, 3);
            }
        }
    }//GEN-LAST:event_BtnBuscarPostulanteActionPerformed

    private void listaPostuValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPostuValueChanged
        cargarDatos();
    }//GEN-LAST:event_listaPostuValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarPostulante;
    private javax.swing.JButton BtnResetarPostulante;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<Object> listaPostu;
    private javax.swing.JPanel panelHistorial;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel textoCedula;
    private javax.swing.JLabel textoDireccion;
    private javax.swing.JList<String> textoExperiencia;
    private javax.swing.JLabel textoFormato;
    private javax.swing.JLabel textoLinkedin;
    private javax.swing.JLabel textoMail;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoTelefono;
    private javax.swing.JLabel tituloBuscar;
    private javax.swing.JLabel tituloCedula;
    private javax.swing.JLabel tituloDireccion;
    private javax.swing.JLabel tituloExperiencia;
    private javax.swing.JLabel tituloFormato;
    private javax.swing.JLabel tituloHistorialPostulante;
    private javax.swing.JLabel tituloLinkedin;
    private javax.swing.JLabel tituloMail;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloPostulante;
    private javax.swing.JLabel tituloTelefono;
    private javax.swing.JTextField txtIngresado;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarLista();
        cargarDatos();
    }

}
