class Mascota {
    String nombre, especie;
    int edad;
    double peso;

    Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro", 4, 25);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.5);
        Mascota m3 = new Mascota("Rocky", "Perro", 6, 18);
        Mascota[] lista = {m1, m2, m3};

        for (Mascota m : lista) {
            String texto = m.nombre + " : " + m.especie + " : " + m.peso;
            if (m.peso > 20) {
                texto += " Revisar peso";
            }
            System.out.println(texto);
        }

        Mascota m4 = m1;
        m4.edad += 1;
        System.out.println(m1.edad);
        // m1.edad cambió porque m4 no es una copia: es otra variable que
        // apunta al MISMO objeto en memoria. Al modificar m4.edad se
        // modifica el objeto que m1 también referencia.
    }
}
