// Theo Brum 315141 y Juan Pablo Patri 266824
package Dominio;

import java.io.Serializable;

public class Tematica implements Serializable {

    private String nombreT;
    private String descripcion;


    public Tematica(String nombreT, String descripcion) {
        this.setNombreT(nombreT);
        this.setDescripcion(descripcion);
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        
        return this.nombreT;
    }
}
