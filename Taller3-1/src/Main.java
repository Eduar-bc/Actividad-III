import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de notas que desea ingresar.
        System.out.println("Ingrese la cantidad de notas");
        int n = scanner.nextInt();

        // Crear un arreglo para almacenar las notas ingresadas por el usuario.
        double[] notas = new double[n];

        // Ciclo para ingresar cada una de las notas.
        for (int j = 0; j < n; j++) {
            System.out.println("Ingrese la nota numero " + (j + 1));
            // Almacenar la nota en el arreglo.
            notas[j] = scanner.nextDouble();
        }

        // Crear un objeto de la clase Operaciones, pasando el arreglo de notas como parámetro.
        Operaciones operaciones = new Operaciones(notas);

        // Calcular el promedio de las notas.
        operaciones.calcularPromedio();

        // Calcular la cantidad de notas que están por encima o iguales al promedio.
        operaciones.calcularPorEncima();

        // Calcular la cantidad de notas que están por debajo o iguales al promedio.
        operaciones.calcularPorDebajo();

        // Imprimir el promedio de las notas.
        System.out.println("El promedio es: " + operaciones.getPromedio());

        // Imprimir la cantidad de notas que están por encima o iguales al promedio.
        System.out.println("El numero de notas por arriba del promedio es: " + operaciones.getPromedioSuperior());

        // Imprimir la cantidad de notas que están por debajo o iguales al promedio.
        System.out.println("El numero de notas por debajo del promedio es: " + operaciones.getPromedioInferior());
    }
}
