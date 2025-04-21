// Theo Brum 315141 y Juan Pablo Patri 266824
package Dominio;

import java.io.Serializable;

public class Evaluador implements Serializable {
    
    private String nombreE;
    private String cedulaE;
    private String direccionE;
    private String anoIngreso;

    public Evaluador(String nombreE, String cedulaE, String direccionE, String anoIngreso) {
        this.setNombreE(nombreE);
        this.setCedulaE(cedulaE);
        this.setDireccionE(direccionE);
        this.setAnoIngreso(anoIngreso);
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getCedulaE() { 
        return cedulaE;
    }

    public void setCedulaE(String cedulaE) {
        this.cedulaE = cedulaE;
    }

    public String getDireccionE() { 
        return direccionE;
    }

    public void setDireccionE(String direccionE) {
        this.direccionE = direccionE;
    }

    public String getAnoIngreso() { 
        return anoIngreso;
    }

    public void setAnoIngreso(String anoIngreso) { 
        this.anoIngreso = anoIngreso;
    }

    @Override
    public String toString() {
        
        return this.nombreE;
    }
    
}