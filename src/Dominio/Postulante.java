// Theo Brum 315141 y Juan Pablo Patri 266824
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Postulante implements Serializable {

    private String nombrePo;
    private String cedulaPostu;
    private String direccion;
    private String telefono;
    private String mail;
    private String linkedin;
    private String formatoPo;
    private ArrayList<String> experiencias;

    public Postulante(String nombrePo, String cedulaPo, String direccion, String telefono, String mail, String linkedin, String formatoPo, ArrayList<String> experiencias) {
        this.setNombrePo(nombrePo);
        this.setCedulaPo(cedulaPo);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setMail(mail);
        this.setLinkedin(linkedin);
        this.setFormatoPo(formatoPo);
        this.setExperiencias(experiencias);
    }
    
    public ArrayList<String> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(ArrayList<String> experiencias) {
        this.experiencias = experiencias;
    }
    
    public String getNombrePo() {
        return nombrePo;
    }

    public void setNombrePo(String nombre) {
        this.nombrePo = nombre;
    }

    public String getCedulaPostu() {
        return cedulaPostu;
    }

    public void setCedulaPo(String cedulaPostu) {
        this.cedulaPostu = cedulaPostu;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFormatoPo() {
        return formatoPo;
    }

    public void setFormatoPo(String formatoPo) {
        this.formatoPo = formatoPo;
    }
    
    @Override
    public String toString() { 
        return this.nombrePo;
    }
}
