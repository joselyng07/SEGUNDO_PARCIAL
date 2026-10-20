class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Producto[] p = {
            new Producto("Cuaderno", 1.50, 10),
            new Producto("Lapiz", 0.50, 7),
            new Producto("Borrador", 0.75, 20),
            new Producto("Regla", 1.00, 6)
        };
        for (Producto x : p) {
            System.out.println(x.nombre + " : " + x.precio);
        }
        p[1].stock -= 3; // venta de 3 lapices
        p[3].stock -= 3; // venta de 3 reglas

        double total = 0;
        for (Producto x : p) {
            if (x.stock < 5) {
                System.out.println(x.nombre + " : Reponer");
            }
            total += x.precio * x.stock;
        }
        System.out.println("Valor total del inventario: " + total);
    }
}
