/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import java.util.ArrayList;


public class Stock {
        
//    int unidad;
//    int npines;
//    int npinesn;
//    int npinesc;
//    int nlanyards;
    private ArrayList<Catalogo> listaProductos;
            //String producto, float precio, double disponible
    public Stock(int unidad, int npines, int npinesn, int npinesc, int nlanyards) {
        this.listaProductos = new ArrayList<>();
        this.listaProductos.add(new Catalogo("Pin Ironman", 20000, 50));
        this.listaProductos.add(new Catalogo("Pin Ironman", 20000, 50));
        this.listaProductos.add(new Catalogo("Pin Ironman", 20000, 50));
        this.listaProductos.add(new Catalogo("Pin Ironman", 20000, 50));
        this.listaProductos.add(new Catalogo("Pin Ironman", 20000, 50));
        this.listaProductos.add(new Catalogo("Pin Ironman", 20000, 50));
//        this.unidad = unidad;
//        this.npines = npines;
//        this.npinesn = npinesn;
//        this.npinesc = npinesc;
//        this.nlanyards = nlanyards;
    }

//    public int getUnidad() {
//        return unidad;
//    }
//
//    public int getNpines() {
//        return npines;
//    }
//
//    public int getNpinesn() {
//        return npinesn;
//    }
//
//    public int getNpinesc() {
//        return npinesc;
//    }
//
//    public int getNlanyards() {
//        return nlanyards;
//    }
//
//    @Override
//    public String toString() {
//        return "Stock{" + "unidad=" + unidad + ", npines=" + npines + ", npinesn=" + npinesn + ", npinesc=" + npinesc + ", nlanyards=" + nlanyards + '}';
//    }
    
    
            
    
}
