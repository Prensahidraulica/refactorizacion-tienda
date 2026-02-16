package daw;

import java.util.ArrayList;

public class InventarioRopa {
    // Atributo
    private ArrayList<Ropa> inventario;

    // Constructor inicializando el inventario
    public InventarioRopa() {
        this.inventario = new ArrayList<>();
    }

    // Getter y Setter
    public ArrayList<Ropa> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Ropa> inventario) {
        this.inventario = inventario;
    }

    // Método toString
    @Override
    public String toString() {
        return "InvntarioRopa [Inventario = " + inventario + "]";
    }

    // Método para añadir un producto al ArrayList
    public void guardar(Ropa producto) {
        inventario.add(producto);
    }

    // Método para mostrar todos los elementos del inventario
    public void mostrar() {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println(i + ". " + inventario.get(i).toString());
        }
    }

    // Método para ver si el inventario está vacío
    public boolean estaVacio() {
        return inventario.isEmpty();
    }

    // Método para realizar una venta
    public void venta(Ropa producto, int cantidad) {
        producto.setStock(producto.getStock() - cantidad);

        System.out.println("Venta realizada con éxito.");
    }

    // Método para saber si un producto está en la lista
    public boolean estaContenido(String nombre) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }

        return false;
    }

    // Método para encontrar un producto por su nombre
    public Ropa devolverProducto(String nombre) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return inventario.get(i);
            }
        }

        return null;
    }

    // Método para devolver la posición de un objeto
    public int devolverPosicion(Ropa producto){  
        if (inventario.contains(producto)) {
            return inventario.indexOf(producto);
        }
        
        return -1;
    }

    // Método para obtener el precio de un producto
    public double devolverPrecio(Ropa producto) {
        if (inventario.contains(producto)) {
            return producto.getPrecio();
        }

        return -1;
    }

    // Método para obtener el precio de un producto
    public double devolverStock(Ropa producto) {
        if (inventario.contains(producto)) {
            return producto.getStock();
        }

        return -1;
    }

}
