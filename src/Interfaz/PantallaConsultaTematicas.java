// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.Sistema;
import Dominio.Tematica;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class PantallaConsultaTematicas extends javax.swing.JFrame implements PropertyChangeListener {

    private ArrayList<String> temYNivelExp = new ArrayList<>();
    private ArrayList<String> temPuestos = new ArrayList<>();
    private int contador1 = 0;
    private int contador2 = 0;

    public PantallaConsultaTematicas(Sistema sistema) {
        initComponents();
        modelo = sistema;
        this.modelo.addPropertyChangeListener(this);
        estadisticas1.setText("Seleccione una tematica para ver las estadisticas");
        estadisticas2.setText("Seleccione una tematica para ver las estadisticas");
        
        cargarLista();

    }

    public void cargarLista() {
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

        jButton1 = new javax.swing.JButton();
        panelConsTem = new javax.swing.JPanel();
        tConsTem = new javax.swing.JLabel();
        tTemas = new javax.swing.JLabel();
        tCant = new javax.swing.JLabel();
        BtnSeleccionar = new javax.swing.JButton();
        tEstadisticas = new javax.swing.JLabel();
        tituloCon = new javax.swing.JLabel();
        comboTemas = new javax.swing.JComboBox<>();
        estadisticas2 = new javax.swing.JLabel();
        estadisticas1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelConsTem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tConsTem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tConsTem.setText("Consulta por tematica");

        tTemas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tTemas.setText("Tematicas:");

        tCant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tCant.setText("Cantidad de postulantes que tiene un nivel mayor a 5 en esta temática:");

        BtnSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSeleccionar.setText("Consultar");
        BtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarActionPerformed(evt);
            }
        });

        tEstadisticas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tEstadisticas.setText("Estadisticas:");

        tituloCon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloCon.setText("Cantidad de puestos que buscan que requieran conocimiento en esta temática:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConsTemLayout = new javax.swing.GroupLayout(panelConsTem);
        panelConsTem.setLayout(panelConsTemLayout);
        panelConsTemLayout.setHorizontalGroup(
            panelConsTemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsTemLayout.createSequentialGroup()
                .addGroup(panelConsTemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelConsTemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSeleccionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConsTemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelConsTemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tCant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConsTemLayout.createSequentialGroup()
                                .addGroup(panelConsTemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloCon)
                                    .addComponent(tTemas)
                                    .addComponent(tEstadisticas))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(318, 318, 318))
            .addGroup(panelConsTemLayout.createSequentialGroup()
                .addGroup(panelConsTemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsTemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(estadisticas1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConsTemLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(tConsTem))
                    .addGroup(panelConsTemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelar))
                    .addGroup(panelConsTemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(estadisticas2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConsTemLayout.setVerticalGroup(
            panelConsTemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsTemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tConsTem)
                .addGap(5, 5, 5)
                .addComponent(tTemas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tEstadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadisticas1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadisticas2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCancelar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelConsTem, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelConsTem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarActionPerformed

        String tematica = comboTemas.getSelectedItem().toString();

        for (int i = 0; i < modelo.getListaDePostulantes().size(); i++) {

            ArrayList<String> expPostulante = modelo.getListaDePostulantes().get(i).getExperiencias();
            temYNivelExp.addAll(expPostulante);
        }

        for (int i = 0; i < temYNivelExp.size(); i++) {
            String experiencia = temYNivelExp.get(i);
            String[] partes = experiencia.split("\\(");
            String tema = partes[0];
            String numero = partes[1].substring(0, partes[1].length() - 1);

            int nivel = Integer.parseInt(numero);

            for (int j = 0; j < modelo.getListaDePostulantes().size(); j++) {
                if (tematica.equals(tema) && nivel > 5) {
                    contador1++;
                    break;
                }
            }
        }

        String cont1 = Integer.toString(contador1);
        estadisticas1.setText(cont1);

        for (int i = 0; i < modelo.getListaDePuestos().size(); i++) {
            ArrayList<String> temP = modelo.getListaDePuestos().get(i).getTemas();
            temPuestos.addAll(temP);
        }

        for (int i = 0; i < temPuestos.size(); i++) {
            String est2Temas = temPuestos.get(i);

            for (int j = 0; j < temPuestos.size(); j++) {
                if (tematica.equals(est2Temas)) {
                    contador2++;
                    break;
                }
            }
        }

        String cont2 = Integer.toString(contador2);
        estadisticas2.setText(cont2);

        contador1 = 0;
        contador2 = 0;
        temYNivelExp.clear();
        temPuestos.clear();
    }//GEN-LAST:event_BtnSeleccionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboTemas;
    private javax.swing.JLabel estadisticas1;
    private javax.swing.JLabel estadisticas2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelConsTem;
    private javax.swing.JLabel tCant;
    private javax.swing.JLabel tConsTem;
    private javax.swing.JLabel tEstadisticas;
    private javax.swing.JLabel tTemas;
    private javax.swing.JLabel tituloCon;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarLista();
    }

}
