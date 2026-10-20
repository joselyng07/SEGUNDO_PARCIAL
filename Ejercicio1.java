class Estudiante {
    String nombre;
    double nota1, nota2, nota3, promedio;

    Estudiante(String nombre, double n1, double n2, double n3) {
        this.nombre = nombre;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante[] lista = {
            new Estudiante("Ana", 8, 9, 7),
            new Estudiante("Luis", 5, 6, 7),
            new Estudiante("Marta", 4, 3, 5),
            new Estudiante("Pedro", 9, 10, 8),
            new Estudiante("Sofia", 7, 7, 7)
        };
        int aprobados = 0;
        for (Estudiante e : lista) {
            e.promedio = (e.nota1 + e.nota2 + e.nota3) / 3;
            String estado;
            if (e.promedio >= 7) {
                estado = "Aprobado";
                aprobados++;
            } else if (e.promedio >= 5) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }
            System.out.println(e.nombre + " : " + e.promedio + " " + estado);
        }
        System.out.println("Aprobaron: " + aprobados);
    }
}
