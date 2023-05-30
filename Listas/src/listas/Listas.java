package listas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clientes ListaClientes = new Clientes ("Clientes SKRPINS");
        ListaClientes.agregarCliente(new Clientes("Andres", "Lopez", 123456, 305968745, "8456l","hola@.com","calle65","Bogota"));
        ArrayList<Administradores> ListaAdmin = new ArrayList<>();
        ListaAdmin.add(new Administradores("Esteban", "Esteban@.com","101356"));
        ListaAdmin.add(new Administradores("Juan", "Juan@.com","21p"));
        ListaAdmin.add(new Administradores("Tomas", "Tomas@.com","50palos"));
        ArrayList<Productos> ListaProductos  = new ArrayList<>();
        ListaProductos.add(new Productos(001,"PinACDC","4x5","Neon"));




        int cho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion: \n 1.Cliente \n 2.Administrador"));
        
        if(cho == 2){
        String InputCorreo = JOptionPane.showInputDialog("Ingrese el correo");
        String InputClave = JOptionPane.showInputDialog("Ingrese la clave");
        boolean ingreso = false;
        for(int i=0; i < ListaAdmin.size(); i ++){
            if(InputCorreo.equals(ListaAdmin.get(i).getCorreo())){
                if(InputClave.equals(ListaAdmin.get(i).getClave())){
                    JOptionPane.showMessageDialog(null, "Bienvenido, Ingreso Correcto");
                    ingreso = true;
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
                   JOptionPane.showMessageDialog(null, ListaClientes.toString());
                   break;
                   }
               case 3:
                   int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresar identificación del cliente: "));
                   JOptionPane.showMessageDialog(null, i);
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
                   break;
           }
       }
        
       boolean continuar1 = true;
       int opcion1;
       int index1;
       while(continuar1){
           opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido. "
                   + "\n Ingresa una opcion "
                   + "\n 1.Agregar Producto "
                   + "\n 2.Mostrar Lista Productos "
                   + "\n 3.Buscar Producto por referencia "
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
                   JOptionPane.showMessageDialog(null, ListaProductos.toString());
                   break;
                   }
               case 3:
                   
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
                   break;
           }
}

    }else{
        JOptionPane.showMessageDialog(null, "Clave Erronea");
        ingreso = true;
        break;
    }
                }
                
                if(ingreso == false){
                    JOptionPane.showMessageDialog(null, "Usuario de Administrador No encontrado");
                    
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Opcion No valida");
        }
    
    if(cho == 1){
        String InputCorreo1 = JOptionPane.showInputDialog("Ingrese el correo");
        String InputClave1 = JOptionPane.showInputDialog("Ingrese la clave");
        boolean ingresar = false;
        for(int i=0; i < ListaClientes.size(); i ++){
            if(InputCorreo1.equals(ListaClientes.get(i).getCorreo())){
                if(InputClave1.equals(ListaClientes.get(i).getContraseña())){
                    JOptionPane.showMessageDialog(null, "Bienvenido, Ingreso Correcto");
                    ingresar = true;
                    if(ListaProductos.isEmpty()){
                        JOptionPane.showMessageDialog(null, "La lista esta vacia");
                    }
                    else{
                    JOptionPane.showMessageDialog(null, ListaProductos);
                    
        }
        }else{
                    JOptionPane.showMessageDialog(null, "Clave Erronea");
                    ingresar = true;
                    break;
                }
                
            }
            if(ingresar == false){
                JOptionPane.showMessageDialog(null, "Usuario No encontrado");
            }
      
}
        
}
else{
    JOptionPane.showMessageDialog(null, "Opcion No valida");
    
}
}
} 

