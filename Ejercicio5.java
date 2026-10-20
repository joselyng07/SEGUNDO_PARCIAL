class Libro {
    String titulo, autor;
    boolean disponible = true;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

class Socio {
    String nombre;
    int librosPrestados = 0;

    Socio(String nombre) {
        this.nombre = nombre;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Libro[] libros = {
            new Libro("Don Quijote", "Cervantes"),
            new Libro("Cien años de soledad", "García Márquez"),
            new Libro("El principito", "Saint-Exupéry"),
            new Libro("Rayuela", "Cortázar")
        };
        Socio s1 = new Socio("María");
        Socio s2 = new Socio("Juan");

        libros[0].disponible = false;
        libros[1].disponible = false;
        s1.librosPrestados += 2;

        libros[2].disponible = false;
        s2.librosPrestados += 1;

        int libres = 0;
        for (Libro l : libros) {
            if (l.disponible) {
                System.out.println(l.titulo + " : Disponible");
                libres++;
            } else {
                System.out.println(l.titulo + " : Prestado");
            }
        }
        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);
        System.out.println("Libros disponibles: " + libres);
    }
}
