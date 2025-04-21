// Theo Brum 315141 y Juan Pablo Patri 266824
package Dominio;

import java.io.Serializable;

public class Entrevista implements Serializable {

    private Evaluador evaluador;
    private Postulante postulante;
    private String puntaje;
    private String comEntrevista;
    private String numEntrevista;

    public Entrevista(Evaluador unEvaluador, Postulante unPostulante, String puntaje, String comEntrevista, String numEntrevista) {
        this.evaluador = unEvaluador;
        this.postulante = unPostulante;
        this.setPuntaje(puntaje);
        this.setComEntrevista(comEntrevista);
        this.setNumEntrevista(numEntrevista);
    }
    
    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getComEntrevista() {
        return comEntrevista;
    }

    public void setComEntrevista(String comEntrevista) {
        this.comEntrevista = comEntrevista;
    }

    public void setNumEntrevista(String numEntrevista) {
        this.numEntrevista = numEntrevista;
    }
    
    public String getNumEntrevista() {
        return numEntrevista;
    }
    
    public Evaluador getEvaluador() {
        return evaluador;
    }
    
    public Postulante getPostulante() {
        return postulante;
    }
}