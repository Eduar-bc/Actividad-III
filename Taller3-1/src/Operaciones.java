public class Operaciones {
    // Arreglo que almacena las notas.
    private double[] notas;

    // Variable que almacena el promedio de las notas.
    private double promedio;

    // Contador que almacena la cantidad de notas que están por encima al promedio.
    private int promedioSuperior;

    // Contador que almacena la cantidad de notas que están por debajo al promedio.
    private int promedioInferior;

    /**
     * Método que calcula el promedio de las notas almacenadas en el arreglo `notas`.
     * El promedio se almacena en la variable `promedio`.
     */
    public void calcularPromedio() {
        double suma = 0;
        // Suma todas las notas en el arreglo `notas`.
        for (double d : notas) {
            suma += d;
        }
        // Calcula el promedio dividiendo la suma total por la cantidad de notas.
        promedio = suma / notas.length;
    }

    /**
     * Método que cuenta cuántas notas son mayores o iguales al promedio.
     * El resultado se almacena en la variable `promedioSuperior`.
     */
    public void calcularPorEncima() {
        // Itera sobre cada nota en el arreglo `notas`.
        for (double d : notas) {
            // Si la nota es mayor o igual al promedio, incrementa el contador.
            if (d >= promedio) {
                promedioSuperior++;
            }
        }
    }

    /**
     * Método que cuenta cuántas notas son menores o iguales al promedio.
     * El resultado se almacena en la variable `promedioInferior`.
     */
    public void calcularPorDebajo() {
        // Itera sobre cada nota en el arreglo `notas`.
        for (double d : notas) {
            // Si la nota es menor o igual al promedio, incrementa el contador.
            if (d <= promedio) {
                promedioInferior++;
            }
        }
    }

    /**
     * Constructor de la clase Operaciones.
     * Inicializa el arreglo `notas` con los valores proporcionados.
     */
    public Operaciones(double[] notas) {
        this.notas = notas;
    }


    //Método que devuelve el promedio calculado de las notas.
    public double getPromedio() {
        return promedio;
    }


    //Método que devuelve la cantidad de notas que son mayores o iguales al promedio.
    public int getPromedioSuperior() {
        return promedioSuperior;
    }


    //Método que devuelve la cantidad de notas que son menores o iguales al promedio.
    public int getPromedioInferior() {
        return promedioInferior;
    }
}