package listas;

import javax.swing.JOptionPane;

public class Administradores {
    String Nombre;
    String correo;
    String clave;

    public Administradores(String Nombre, String correo, String clave) {
        this.Nombre = Nombre;
        this.correo = correo;
        this.clave = clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

   
    @Override
    public String toString() {
        return "Administradores{" + "Nombre=" + Nombre + ", correo=" + correo + ", clave=" + clave + '}';
    }
}
