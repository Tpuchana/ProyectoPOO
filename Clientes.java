
package listas;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Clientes {
    
    private ArrayList<Clientes> listaClientes;
    
     String nombre;
     String apellido;
     long cedula;
     long telefono;
     String contrasena;
     String correo;
     String direccion;
     String ciudad;
     private static int numeroClientes = 0;

    public Clientes(String nombre, String apellido, long cedula, long telefono, String contrasena, String correo,
            String direccion, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.listaClientes = new ArrayList<>();
    }

    Clientes(String clientes_SKRPINS) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public String getContrasena() {
        return contrasena;
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
    
    public void agregarCliente(Clientes clienteNuevo){
        this.listaClientes.add(clienteNuevo);
        numeroClientes++;
        JOptionPane.showMessageDialog(null, "Se agrego un nuevo cliente");
    }
    
    public void agregarCliente(String nombre, String apellido, long cedula, long telefono, String contrasena, String correo,
            String direccion, String ciudad){
        Clientes clienteNuevo = new Clientes (nombre, apellido, cedula, telefono, contrasena, correo, direccion, ciudad);
        this.agregarCliente(clienteNuevo);
        
    }
    
    public Clientes encontrarCliente (int index){
        if (index>=0 && index < this.listaClientes.size()){
            return this.listaClientes.get(index);
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro el cliente ");
        }
        return null;
    }
    
    public void datosProducto(){
    String Texto = "Datos cliente: \n Nombre: " + this.nombre
    + "\n Apellido: "  + this.apellido
    + "\n Cedula: " + this.cedula
    + "\n Télefono: " + this.telefono
    + "\n Contrasena: " + "****"
    + "\n Correo: " + this.correo
    + "\n Direccion: " + this.direccion
        + "\n Ciudad: " + this.ciudad
        ;
                       
                       
        JOptionPane.showMessageDialog(null, Texto);
                
}

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void add(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}