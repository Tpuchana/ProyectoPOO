
package listas;

import javax.swing.JOptionPane;

public class Productos {
    private int referencia;
    private String nombreProducto;
    private String medidasProducto;
    private String categoriaProducto;

    public Productos(int referencia, String nombreProducto, String medidasProducto, String categoriaProducto) {
        this.referencia = referencia;
        this.nombreProducto = nombreProducto;
        this.medidasProducto = medidasProducto;
        this.categoriaProducto = categoriaProducto;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getMedidasProducto() {
        return medidasProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }
     public void datosCliente(){
        String Texto = """
                       Datos cliente: 
                       \n Nombre: """ + this.referencia
                       + "\n Telefono: "  + this.nombreProducto
                       + "\n Correo: " + this.medidasProducto
                       + "\n Direccion: " + this.categoriaProducto;
                      
        JOptionPane.showMessageDialog(null, Texto);
}