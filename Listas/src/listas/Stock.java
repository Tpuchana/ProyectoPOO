/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;


public class Stock {
        
    int unidad;
    int npines;
    int npinesn;
    int npinesc;
    int nlanyards;

    public Stock(int unidad, int npines, int npinesn, int npinesc, int nlanyards) {
        this.unidad = unidad;
        this.npines = npines;
        this.npinesn = npinesn;
        this.npinesc = npinesc;
        this.nlanyards = nlanyards;
    }

    public int getUnidad() {
        return unidad;
    }

    public int getNpines() {
        return npines;
    }

    public int getNpinesn() {
        return npinesn;
    }

    public int getNpinesc() {
        return npinesc;
    }

    public int getNlanyards() {
        return nlanyards;
    }

    @Override
    public String toString() {
        return "Stock{" + "unidad=" + unidad + ", npines=" + npines + ", npinesn=" + npinesn + ", npinesc=" + npinesc + ", nlanyards=" + nlanyards + '}';
    }
    
    
            
    
}
