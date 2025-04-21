// Theo Brum 315141 y Juan Pablo Patri 266824
package Dominio;

import java.awt.Desktop;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sistema implements Serializable {

    private ArrayList<Tematica> listaDeTematicas = new ArrayList<Tematica>();
    private ArrayList<Puesto> listaDePuestos = new ArrayList<Puesto>();
    private ArrayList<Postulante> listaDePostulantes = new ArrayList<Postulante>();
    private ArrayList<Evaluador> listaDeEvaluadores = new ArrayList<Evaluador>();
    private ArrayList<Entrevista> listaDeEntrevistas = new ArrayList<Entrevista>();
    private int numeradorEntrevistas = 0;

    private transient PropertyChangeSupport manejador = new PropertyChangeSupport(this);

    public void agregarListaTematicas(Tematica nuevaTematica) {
        listaDeTematicas.add(nuevaTematica);
        manejador.firePropertyChange("tematica", null, nuevaTematica);
    }

    public void agregarListaPostulantes(Postulante nuevoPostulante) {
        listaDePostulantes.add(nuevoPostulante);
        manejador.firePropertyChange("postulante", null, nuevoPostulante);
    }

    public void agregarListaPuestos(Puesto nuevoPuesto) {
        listaDePuestos.add(nuevoPuesto);
        manejador.firePropertyChange("puesto", null, nuevoPuesto);
    }

    public void agregarListaEvaluadores(Evaluador nuevoEvaluador) {
        listaDeEvaluadores.add(nuevoEvaluador);
        manejador.firePropertyChange("evaluador", null, nuevoEvaluador);
    }

    public void agregarListaEntrevistas(Entrevista nuevaEntrevista) {
        listaDeEntrevistas.add(nuevaEntrevista);
        manejador.firePropertyChange("entrevista", null, nuevaEntrevista);
    }

    public ArrayList<Tematica> getListaDeTematicas() {
        return listaDeTematicas;
    }

    public ArrayList<Puesto> getListaDePuestos() {
        return listaDePuestos;
    }

    public ArrayList<Postulante> getListaDePostulantes() {
        return listaDePostulantes;
    }

    public ArrayList<Evaluador> getListaDeEvaluadores() {
        return listaDeEvaluadores;
    }

    public ArrayList<Entrevista> getListaDeEntrevistas() {
        return listaDeEntrevistas;
    }

    public boolean validarString(String texto) {
        return texto.matches("[a-zA-Z]+");
    }

    public boolean validarNomTematica(String nombreT) {

        boolean esUnica = true;
        for (int i = 0; i < listaDeTematicas.size(); i++) {
            String nomTematica = listaDeTematicas.get(i).getNombreT().toLowerCase();
            if (nomTematica.equals(nombreT.toLowerCase())) {
                esUnica = false;
                break;
            }
        }
        return esUnica;
    }

    public boolean validarVacio(String texto) {

        boolean estaVacio = true;
        if (texto.trim().isEmpty()) {
            estaVacio = false;
        }
        return estaVacio;
    }

    public boolean validarTelefono(String telefono) {
        return telefono.matches("[0-9]{3,15}");
    }

    public boolean validarMail(String mail) {

        String requisito = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(requisito);
        Matcher matcher = pattern.matcher(mail);

        return matcher.matches();
    }

    public boolean validarLinkedIn(String link) {

        String requisito = "https://www.linkedin.com/in/[a-zA-Z]+.*";
        Pattern pattern = Pattern.compile(requisito);
        Matcher matcher = pattern.matcher(link);

        return matcher.matches();
    }

    public boolean validarCedulaUnica(String cedula) {

        boolean esUnica = true;

        for (int i = 0; i < listaDePostulantes.size(); i++) {
            String cedulaPostulante = listaDePostulantes.get(i).getCedulaPostu();
            if (cedulaPostulante.equals(cedula)) {
                esUnica = false;
                break;
            }
        }

        for (int i = 0; i < listaDeEvaluadores.size(); i++) {
            String cedulaEvaluador = listaDeEvaluadores.get(i).getCedulaE();
            if (cedulaEvaluador.equals(cedula)) {
                esUnica = false;
                break;
            }
        }
        return esUnica;
    }

    public boolean validarAnoIngreso(String anoIngreso) {
        boolean verifica = false;

        if (anoIngreso.equals("")) {
            return verifica;
        } else {
            int Ing = Integer.parseInt(anoIngreso);
            int anoActual = LocalDate.now().getYear();
            if ((Ing >= 1900) && (Ing < anoActual)) {
                verifica = true;
            }
        }
        return verifica;
    }

    public boolean validarNombrePuesto(String nombrePuesto) {
        boolean unico = true;

        for (int i = 0; i < listaDePuestos.size(); i++) {
            String puesto = listaDePuestos.get(i).getNombrePu().toLowerCase();
            if (puesto.equals(nombrePuesto.toLowerCase())) {
                unico = false;
                break;
            }
        }
        return unico;
    }

    public String genNumEntrevista() {
        numeradorEntrevistas++;
        String numEntrevista = Integer.toString(numeradorEntrevistas);

        return numEntrevista;
    }

    public String resaltarPalabraR(String texto, String comentario) {
        return "<html>" + comentario.replaceAll("(?i)" + texto, "<span style='color:red;'>" + texto + "</span>") + "</html>";
    }

    public void eliminarPostulante(String unPostulante) {
        for (int i = 0; i < getListaDePostulantes().size(); i++) {
            String nombre = getListaDePostulantes().get(i).getNombrePo();
            if (unPostulante.equals(nombre)) {
                Postulante postu = getListaDePostulantes().get(i);
                listaDePostulantes.remove(postu);
                break;
            }
        }

        for (int j = 0; j < getListaDeEntrevistas().size(); j++) {
            Entrevista entrevista = getListaDeEntrevistas().get(j);
            String nomPostu = getListaDeEntrevistas().get(j).getPostulante().getNombrePo();
            if (nomPostu.equals(unPostulante)) {
                listaDeEntrevistas.remove(entrevista);
            }
        }
    }

    public void abrirEnlace(String enlace) {
        try {
            Desktop.getDesktop().browse(new URI(enlace));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inicializarManejador() {
        manejador = new PropertyChangeSupport(this);
    }

    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        inicializarManejador();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        manejador.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        manejador.removePropertyChangeListener(listener);
    }
}
