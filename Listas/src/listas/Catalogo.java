package listas;


public class Catalogo {
    
    private String producto;
    private float precio;
    private double disponible;

    public Catalogo(String producto, float precio, double disponible) {
        this.producto = producto;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getProducto() {
        return producto;
    }

    public float getPrecio() {
        return precio;
    }

    public double getDisponible() {
        return disponible;
    }

    
    
    @Override
    public String toString() {
        return "Catalogo{" + "producto=" + producto + ", precio=" + precio + ", disponible=" + disponible + '}';
    }
    
    
    
    
    
}
