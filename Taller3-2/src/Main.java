import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario.
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la cantidad de estudiantes.
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int[] numEstudiantes = new int[sc.nextInt()];

        // Bucle para ingresar el último dígito de la cédula de cada estudiante.
        for (int i = 0; i < numEstudiantes.length; ++i) {
            System.out.println("Ingrese el último dígito de la cédula #" + (i + 1));
            numEstudiantes[i] = sc.nextInt();
        }

        // Crear un objeto de la clase Estudiantes, pasando el arreglo de dígitos de cédula.
        Estudiantes estudiantes1 = new Estudiantes(numEstudiantes);

        // Calcular la asignación de estudiantes a cada modelo.
        estudiantes1.calcularMod();

        // Imprimir la cantidad de estudiantes asignados a cada modelo.
        System.out.println("Modelo 1: " + estudiantes1.getMod1());
        System.out.println("Modelo 2: " + estudiantes1.getMod2());
        System.out.println("Modelo 3: " + estudiantes1.getMod3());
        System.out.println("Modelo 4: " + estudiantes1.getMod4());
        System.out.println("Modelo 5: " + estudiantes1.getMod5());
    }
}
