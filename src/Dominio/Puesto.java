// Theo Brum 315141 y Juan Pablo Patri 266824
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Puesto implements Serializable{

    private String nombrePu;
    private String tipo;
    private ArrayList<String> temas;

    public Puesto(String nombrePu, String tipo, ArrayList<String> temas) {
        this.setNombrePu(nombrePu);
        this.setTipo(tipo);
        this.setTemas(temas);
    }
    
    public String getNombrePu() {
        return nombrePu;
    }

    public void setNombrePu(String nombrePu) {
        this.nombrePu = nombrePu;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setTemas(ArrayList<String> temas) {
        this.temas = temas;
    }

    public ArrayList<String> getTemas() {
        return temas;
    }
    
    @Override
    public String toString() { 
        return this.nombrePu;
    }
}
