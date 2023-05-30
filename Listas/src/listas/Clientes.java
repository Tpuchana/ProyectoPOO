
package listas;

import javax.swing.JOptionPane;

public class Clientes {
     String nombre;
     String apellido;
     long cedula;
     long telefono;
     String contraseña;
     String correo;
     String direccion;
     String ciudad;

    public Clientes(String nombre, String apellido, long cedula, long telefono, String contraseña, String correo,
            String direccion, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    
    

    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getCedula() {
        return cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
                       
                       
     
                
}


