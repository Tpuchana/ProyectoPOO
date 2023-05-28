/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Clientes> ListaClientes = new ArrayList<>();
        ListaClientes.add(new Clientes("Andres", "Lopez", 123456, 305968745, "8456l","hola@.com","calle65","Bogota"));
       boolean continuar = true;
       int opcion;
       int index;
       while(continuar){
           opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido. "
                   + "\n Ingresa una opcion "
                   + "\n 1.Agregar Cliente "
                   + "\n 2.Mostrar Lista Clientes "
                   + "\n 3.Buscar Cliente por cedula "
                   + "\n 4.Eliminar Cliente "
                   + "\n 5.Salir "));
           switch (opcion){
               case 1: 
                   String nombre = JOptionPane.showInputDialog("Ingrese nombre del cliente: ");
                   String apellido = JOptionPane.showInputDialog("Ingrese apellido del cliente: ");
                   long cedula = Long.parseLong(JOptionPane.showInputDialog("Ingrese numero de celdula del cliente: "));
                   String contraseña = JOptionPane.showInputDialog("Ingrese una contraseña para el cliente: ");
                   String correo = JOptionPane.showInputDialog("Ingrese correo del cliente: ");
                   String direccion = JOptionPane.showInputDialog("Ingrese direccion del cliente: ");
                   String ciudad = JOptionPane.showInputDialog("Ingrese ciudad del cliente: ");
                   long telefono = Long.parseLong(JOptionPane.showInputDialog("Ingrese telefono del cliente: "));
                   ListaClientes.add(new Clientes(nombre, apellido, cedula, telefono, contraseña, correo, direccion, ciudad));
                   JOptionPane.showMessageDialog(null, "El cliente se registró exitosamente");
                   break;
               case 2:
                   if(ListaClientes.isEmpty()){
                       JOptionPane.showMessageDialog(null, "La lista esta vacia");
                   }
                   else{
                   JOptionPane.showMessageDialog(null, ListaClientes);
                   break;
                   }
               case 3:
//          if(ListaClientes.contains(123456)){
//              System.out.println("SIISI");
//            }
//        }
//
//        // Mostrar el resultado de la búsqueda
//        if (objetoEncontrado != null) {
//            System.out.println("Objeto encontrado: " + objetoEncontrado.getAtributo());
//        } else {
//            System.out.println("No se encontró ningún objeto con el valor proporcionado.");
//        }
    

                        
                   
//                   index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del cliente"));
//                   index --;
//                   //Usar metodo listaClientes.get(index)
//                   if(index < ListaClientes.size() && index >= 0){
//                   ListaClientes.get(index).datosCliente();
//                   }
//                   else{
//                       JOptionPane.showMessageDialog(null, "Indice No valido");
//                   }
                   break;
               case 4:
                   index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del cliente que desea eliminar"));
                   index --;
                   //Usar metodo listaClientes.get(index)
                   if(index < ListaClientes.size() && index >= 0){
                   ListaClientes.remove(index);
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Indice No valido");}
                   break;
               
               case 5: 
                   continuar=false;
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcio NO valida");
           }
       }
        ArrayList<Productos> ListaProductos  = new ArrayList<>();
        ListaProductos.add(new Productos(001,"PinACDC","4x5","Neon"));
        boolean continuar1 = true;
       int opcion1;
       int index1;
       while(continuar1){
           opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido. "
                   + "\n Ingresa una opcion "
                   + "\n 1.Agregar Producto "
                   + "\n 2.Mostrar Lista Productos "
                   + "\n 3.Buscar Producto "
                   + "\n 4.Eliminar Producto "
                   + "\n 5.Salir "));
           switch (opcion1){
               case 1: 
                   int referencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese referencia del producto: "));
                   String nombre = JOptionPane.showInputDialog("Ingrese nombre del producto: ");
                   String medidas = JOptionPane.showInputDialog("Ingrese medidas del producto: ");
                   String categoria = JOptionPane.showInputDialog("Ingrese ccategoria del producto: ");
                   ListaProductos.add(new Productos(referencia, nombre, medidas, categoria));
                   JOptionPane.showMessageDialog(null, "El cliente se registró exitosamente");
                   break;
               case 2:
                   if(ListaProductos.isEmpty()){
                       JOptionPane.showMessageDialog(null, "La lista esta vacia");
                   }
                   else{
                   JOptionPane.showMessageDialog(null, ListaProductos);
                   break;
                   }
               case 3:
//          if(ListaClientes.contains(123456)){
//              System.out.println("SIISI");
//            }
//        }
//
//        // Mostrar el resultado de la búsqueda
//        if (objetoEncontrado != null) {
//            System.out.println("Objeto encontrado: " + objetoEncontrado.getAtributo());
//        } else {
//            System.out.println("No se encontró ningún objeto con el valor proporcionado.");
//        }
    

                        
                   
//                   index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del cliente"));
//                   index --;
//                   //Usar metodo listaClientes.get(index)
//                   if(index < ListaClientes.size() && index >= 0){
//                   ListaClientes.get(index).datosCliente();
//                   }
//                   else{
//                       JOptionPane.showMessageDialog(null, "Indice No valido");
//                   }
                   break;
               case 4:
                   index1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del producto que eliminará"));
                   index1 --;
                   //Usar metodo listaClientes.get(index)
                   if(index1 < ListaProductos.size() && index1 >= 0){
                   ListaProductos.remove(index1);
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Indice No valido");}
                   break;
               
               case 5: 
                   continuar1=false;
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcio NO valida");
           }
       }
    }
    
}
