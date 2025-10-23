package notas;

public class producto {
    private String nombre;
    private double precio;
    private int cantidad;


    public producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void vender(int unidades) {
        if (unidades <= cantidad) {
            cantidad -= unidades;
            System.out.println("Se vendieron " + unidades + " unidades de " + nombre + ".");
        } else {
            System.out.println("No hay suficiente stock para vender " + unidades + " unidades de " + nombre + ".");
        }
    }
  

    public void reponer(int unidades) {
        cantidad += unidades;
        System.out.println("Se repusieron " + unidades + " unidades de " + nombre + ".");
    }

    
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("----------------------------");
    }


    public static void main(String[] args) {
        // Crear dos productos de ejemplo
        producto producto1 = new producto("Teclado", 29.99, 50);
        producto producto2 = new producto("Ratón", 19.99, 30);

    
        producto1.mostrarProducto();
        producto2.mostrarProducto();

       
        producto1.vender(10);    
        producto2.vender(35);    
        
        producto2.reponer(20);

        
        producto1.mostrarProducto();
        producto2.mostrarProducto();
    }
}



    