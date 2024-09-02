public class Estudiantes {
    // Arreglo que almacena los últimos dígitos de las cédulas de los estudiantes.
    private int[] estudiantes;

    // Contadores para cada modelo según el número de la cédula.
    private int mod1 = 0;
    private int mod2 = 0;
    private int mod3 = 0;
    private int mod4 = 0;
    private int mod5 = 0;

    //Constructor de la clase Estudiantes.
    //Inicializa el arreglo `estudiantes` con los valores proporcionados.
    public Estudiantes(int[] estudiantes) {
        this.estudiantes = estudiantes;
    }


    // Método que calcula el número de estudiantes asignados a cada modelo.
    // Se basa en el último dígito de la cédula del estudiante.
    public void calcularMod() {
        // Itera sobre cada último dígito de cédula en el arreglo `estudiantes`.
        for (int estudiante : estudiantes) {
            switch (estudiante) {
                // Asigna los dígitos 1 y 6 al modelo 1.
                case 1:
                case 6:
                    mod1++;
                    break;
                // Asigna los dígitos 2 y 7 al modelo 2.
                case 2:
                case 7:
                    mod2++;
                    break;
                // Asigna los dígitos 3 y 8 al modelo 3.
                case 3:
                case 8:
                    mod3++;
                    break;
                // Asigna los dígitos 4 y 9 al modelo 4.
                case 4:
                case 9:
                    mod4++;
                    break;
                // Asigna los dígitos 5 y 0 al modelo 5.
                case 5:
                case 0:
                    mod5++;
                    break;
            }
        }
    }

    // Métodos que devuelven la cantidad de estudiantes asignados a cada modelo.
    public int getMod1() {
        return this.mod1;
    }

    public int getMod2() {
        return this.mod2;
    }

    public int getMod3() {
        return this.mod3;
    }

    public int getMod4() {
        return this.mod4;
    }

    public int getMod5() {
        return this.mod5;
    }
}
