// Theo Brum 315141 y Juan Pablo Patri 266824
package Interfaz;

import Dominio.ArchivoGrabacion;
import Dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;


public class PantallaConsultaParaPuestos extends javax.swing.JFrame implements PropertyChangeListener {

    private ArrayList<String> postu1Entrevista = new ArrayList<>();
    private ArrayList<String> postuFormaTrabajo = new ArrayList<>();
    private ArrayList<String> postusConNivel = new ArrayList<>();
    private ArrayList<String> comp1 = new ArrayList<>();
    private ArrayList<String> resultado = new ArrayList<>();
    private ArrayList<Integer> puntajesRes = new ArrayList<>();
    private ArrayList<String> resultadosOrdenados = new ArrayList<>(resultado);
    private ArrayList<String[]> resultadosExportar = new ArrayList<>();
    private String puestoExportar = "";

    public PantallaConsultaParaPuestos(Sistema sistema) {
        modelo = sistema;
        this.modelo.addPropertyChangeListener(this);

        initComponents();

        SpinnerNumberModel numModel = new SpinnerNumberModel(1, 1, 10, 1);
        nivelPuesto.setModel(numModel);

        cargarListaPuestos();

    }

    public void cargarListaPuestos() {
        listaConsPuesto.setListData(new String[0]);
        if (!modelo.getListaDePuestos().isEmpty()) {
            listaConsPuesto.setListData(modelo.getListaDePuestos().toArray());
        }
    }

    public void cargarListaPostu() {
        listaConsPos.setListData(new String[0]);
        String puesto = "";
        Object seleccionado = listaConsPuesto.getSelectedValue();
        boolean puestoSelec = true;
        int nivelP = (int) nivelPuesto.getValue();
        String tipo = "";
        String nombrePu = "";
        ArrayList<String> temasPue = new ArrayList<String>();

        if (seleccionado != null) {
            puesto = listaConsPuesto.getSelectedValue().toString().trim();
            puestoExportar = puesto;
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun puesto, para realizar la consulta por favor seleccione alguno.");
            puestoSelec = false;
        }

        if (puestoSelec) {
            for (int i = 0; i < modelo.getListaDeEntrevistas().size(); i++) {
                String entPos = modelo.getListaDeEntrevistas().get(i).getPostulante().toString();
                for (int j = 0; j < modelo.getListaDePostulantes().size(); j++) {
                    if (entPos.equals(modelo.getListaDePostulantes().get(j).toString())) {
                        if (!postu1Entrevista.contains(entPos)) {
                            postu1Entrevista.add(entPos);
                        }
                    }
                }
            }

            for (int i = 0; i < modelo.getListaDePuestos().size(); i++) {
                nombrePu = modelo.getListaDePuestos().get(i).getNombrePu();
                if (puesto.equals(nombrePu)) {
                    tipo = modelo.getListaDePuestos().get(i).getTipo();
                    break;
                }
            }

            for (int i = 0; i < modelo.getListaDePostulantes().size(); i++) {
                String post = modelo.getListaDePostulantes().get(i).getNombrePo();
                String formato = modelo.getListaDePostulantes().get(i).getFormatoPo();
                if (formato.equals(tipo)) {
                    if (!postuFormaTrabajo.contains(post)) {
                        postuFormaTrabajo.add(post);
                    }
                }
            }

            for (int i = 0; i < modelo.getListaDePuestos().size(); i++) {
                String puestox = modelo.getListaDePuestos().get(i).getNombrePu();
                ArrayList<String> temasP = (modelo.getListaDePuestos().get(i).getTemas());
                if (puesto.equals(puestox)) {
                    temasPue.addAll(temasP);
                    break;
                }
            }

            for (int i = 0; i < modelo.getListaDePostulantes().size(); i++) {
                String nom = modelo.getListaDePostulantes().get(i).getNombrePo();
                ArrayList<String> experienciasM = modelo.getListaDePostulantes().get(i).getExperiencias();
                ArrayList<String> tems = new ArrayList<>();
                ArrayList<Integer> niveles = new ArrayList<>();

                for (int j = 0; j < experienciasM.size(); j++) {
                    String experiencia = experienciasM.get(j);
                    String[] partes = experiencia.split("\\(");
                    String tema = partes[0];
                    String numero = partes[1].substring(0, partes[1].length() - 1);
                    int nivel = Integer.parseInt(numero);
                    tems.add(tema);
                    niveles.add(nivel);
                }
                Set<String> setTemasPue = new HashSet<>(temasPue);
                Set<String> setTems = new HashSet<>(tems);
                boolean contieneTodos = setTems.containsAll(setTemasPue);
                boolean verifica = true;
                if (contieneTodos) {
                    for (int k = 0; k < niveles.size(); k++) {
                        if (!(nivelP <= niveles.get(k))) {
                            verifica = false;
                            break;
                        }
                    }
                    if (verifica) {
                        if (!postusConNivel.contains(nom)) {
                            postusConNivel.add(nom);
                        }
                    }
                }
            }

            int largoL1 = postu1Entrevista.size();
            int largoL2 = postuFormaTrabajo.size();
            int largoL3 = postusConNivel.size();

            int largoMaxL12 = Math.max(largoL1, largoL2);

            if (largoMaxL12 == largoL1) {
                for (int i = 0; i < largoMaxL12; i++) {
                    String elem = postu1Entrevista.get(i);
                    for (int j = 0; j < largoL2; j++) {
                        if (elem.equals(postuFormaTrabajo.get(j))) {
                            comp1.add(elem);
                        }
                    }
                }
            } else {
                for (int i = 0; i < largoMaxL12; i++) {
                    String elem = postuFormaTrabajo.get(i);
                    for (int j = 0; j < largoL1; j++) {
                        if (elem.equals(postu1Entrevista.get(j))) {
                            comp1.add(elem);
                        }
                    }
                }
            }

            int largoComp1 = comp1.size();
            int largoFinal = Math.max(largoL3, largoComp1);

            if (largoFinal == largoL3) {
                for (int i = 0; i < largoFinal; i++) {
                    String elem = postusConNivel.get(i);
                    for (int j = 0; j < largoComp1; j++) {
                        if (elem.equals(comp1.get(j))) {
                            resultado.add(elem);
                        }
                    }
                }
            } else {
                for (int i = 0; i < largoFinal; i++) {
                    String elem = comp1.get(i);
                    for (int j = 0; j < largoL3; j++) {
                        if (elem.equals(postusConNivel.get(j))) {
                            resultado.add(elem);
                        }
                    }
                }
            }

            String puntajes = "";

            for (int i = 0; i < resultado.size(); i++) {
                String nombrePRes = resultado.get(i);
                int puntajesBien = -1;
                for (int j = 0; j < modelo.getListaDeEntrevistas().size(); j++) {
                    String nombrePEnt = modelo.getListaDeEntrevistas().get(j).getPostulante().getNombrePo();
                    if (nombrePRes.equals(nombrePEnt)) {
                        puntajes = modelo.getListaDeEntrevistas().get(j).getPuntaje();
                        try {
                            puntajesBien = Integer.parseInt(puntajes);
                        } catch (NumberFormatException e) {
                            System.out.println("El puntaje no es un número válido para " + nombrePEnt);
                        }
                    }
                }
                if (puntajesBien != -1) {
                    puntajesRes.add(puntajesBien);
                }
            }

            if (resultado.size() == puntajesRes.size()) {
                HashMap<String, Integer> map = new HashMap<>();

                for (int i = 0; i < resultado.size(); i++) {
                    map.put(resultado.get(i), puntajesRes.get(i));
                }

                Collections.sort(resultado, (a, b) -> map.get(b) - map.get(a));
            }

            if (!resultadosOrdenados.isEmpty()) {
                resultadosOrdenados.clear();
                resultadosOrdenados.addAll(resultado);
            } else {
                resultadosOrdenados.addAll(resultado);
            }

            if (!resultadosOrdenados.isEmpty()) {
                DefaultListModel<String> model = new DefaultListModel<>();

                for (String elem : resultadosOrdenados) {
                    model.addElement(elem);
                }

                listaConsPos.setModel(model);
            } else {
                DefaultListModel<String> modelX = new DefaultListModel<>();
                String vacio = "Ningun postulante registrado cumple con las condiciones requeridas respecto a la consulta.";
                modelX.addElement(vacio);
                listaConsPos.setModel(modelX);
            }
        }

        listaConsPuesto.clearSelection();
        postu1Entrevista.clear();
        postuFormaTrabajo.clear();
        postusConNivel.clear();
        comp1.clear();
        resultado.clear();
        puntajesRes.clear();
        nivelPuesto.setValue(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelConsP = new javax.swing.JPanel();
        tituloConsultaParaPuesto = new javax.swing.JLabel();
        tituloPuesto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaConsPuesto = new javax.swing.JList<>();
        tNivel = new javax.swing.JLabel();
        nivelPuesto = new javax.swing.JSpinner();
        BtnConsultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tPostulantes = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        BtnExportar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaConsPos = new javax.swing.JList<>();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloConsultaParaPuesto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloConsultaParaPuesto.setText("Consulta para puesto");

        tituloPuesto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloPuesto.setText("Puesto:");

        listaConsPuesto.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaConsPuestoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaConsPuesto);

        tNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tNivel.setText("Nivel:");

        BtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        tPostulantes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tPostulantes.setText("Postulantes:");

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnExportar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnExportar.setText("Exportar");
        BtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listaConsPos);

        javax.swing.GroupLayout panelConsPLayout = new javax.swing.GroupLayout(panelConsP);
        panelConsP.setLayout(panelConsPLayout);
        panelConsPLayout.setHorizontalGroup(
            panelConsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloConsultaParaPuesto)
                .addGap(136, 136, 136))
            .addGroup(panelConsPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelConsPLayout.createSequentialGroup()
                        .addComponent(tNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(nivelPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(BtnConsultar))
                    .addGroup(panelConsPLayout.createSequentialGroup()
                        .addGroup(panelConsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloPuesto)
                            .addComponent(tPostulantes))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelConsPLayout.createSequentialGroup()
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnExportar)))
                .addContainerGap())
        );
        panelConsPLayout.setVerticalGroup(
            panelConsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsPLayout.createSequentialGroup()
                .addComponent(tituloConsultaParaPuesto)
                .addGap(18, 18, 18)
                .addComponent(tituloPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsultar)
                    .addComponent(tNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPostulantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(panelConsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnExportar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelConsP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelConsP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportarActionPerformed
        for (int i = 0; i < modelo.getListaDePostulantes().size(); i++) {
            String nombre = modelo.getListaDePostulantes().get(i).getNombrePo();
            String cedula = modelo.getListaDePostulantes().get(i).getCedulaPostu();
            String mail = modelo.getListaDePostulantes().get(i).getMail();
            String[] nomCedMail = new String[3];
            nomCedMail[0] = "Nombre: " + nombre;
            nomCedMail[1] = "Cedula: " + cedula;
            nomCedMail[2] = "Mail: " + mail;

            for (int j = 0; j < resultadosOrdenados.size(); j++) {
                if (nombre.equals(resultadosOrdenados.get(j))) {
                    resultadosExportar.add(nomCedMail);
                }
            }
        }

        ArchivoGrabacion exportador = new ArchivoGrabacion();
        exportador.exportarResultados(puestoExportar, resultadosExportar);

        resultadosOrdenados.clear();
        resultadosExportar.clear();
        puestoExportar = "";
    }//GEN-LAST:event_BtnExportarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
        DefaultListModel<String> vaciar = new DefaultListModel<>();
        listaConsPos.setModel(vaciar);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        cargarListaPostu();
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void listaConsPuestoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaConsPuestoValueChanged
        
    }//GEN-LAST:event_listaConsPuestoValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnExportar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList<String> listaConsPos;
    private javax.swing.JList<Object> listaConsPuesto;
    private javax.swing.JSpinner nivelPuesto;
    private javax.swing.JPanel panelConsP;
    private javax.swing.JLabel tNivel;
    private javax.swing.JLabel tPostulantes;
    private javax.swing.JLabel tituloConsultaParaPuesto;
    private javax.swing.JLabel tituloPuesto;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarListaPuestos();
        cargarListaPostu();
    }

}
