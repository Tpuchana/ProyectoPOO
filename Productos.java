
package listas;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Productos {
    
    private ArrayList <Productos> listaProductos;
    
    private int referencia;
    private String nombreProducto;
    private String medidasProducto;
    private String categoriaProducto;
    private static int numeroProductos = 0;

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
    
     public void agregarProducto(Productos productoNuevo){
        this.listaProductos.add(productoNuevo);
        numeroProductos++;
        JOptionPane.showMessageDialog(null, "Se agrego un nuevo producto");
    }
    
    public void agregarProducto(int referencia, String nombreProducto, String medidasProducto, String categoriaProducto){
        Productos productoNuevo = new Productos (referencia, nombreProducto, medidasProducto, categoriaProducto);
        this.agregarProducto(productoNuevo);
        
    }
    
    public Productos encontrarProducto (int index){
        if (index>=0 && index < this.listaProductos.size()){
            return this.listaProductos.get(index);
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro el cliente ");
        }
        return null;
    }
    
    
     public void datosProducto(){
        String Texto = """
                       Datos Producto: 
                       \n Nombre: """ + this.referencia
                       + "\n Telefono: "  + this.nombreProducto
                       + "\n Correo: " + this.medidasProducto
                       + "\n Direccion: " + this.categoriaProducto;
                      
        JOptionPane.showMessageDialog(null, Texto);
}
public String toString() {
    return "Productos{" + "referencia=" + referencia + ", nombreProducto=" + nombreProducto + ", medidasProducto=" + medidasProducto + ", categoriaProducto=" + categoriaProducto + '}';
}
}