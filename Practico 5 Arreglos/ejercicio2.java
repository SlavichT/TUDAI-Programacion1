public class ejercicio2 {
    // Hacer  un  programa  que  dado  un  arreglo  ya  cargado  con  10
    //enteros, calcule el promedio y lo muestre por la consola.
    final static int MAX = 10;

    public static void main(String[] args) {
        //Declaramos un arreglo de 10 valores ya asignados
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        double promedio = calcularPromedio(numeros);

        System.out.println("El promedio total es: " + promedio);

    }

    //Hacemos un for para que sume todos los valores del arreglo para poder calcular el promedio total
    public static double calcularPromedio(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < MAX; i++) {
            suma += numeros[i];
        }
        return (double) suma / MAX;
    }
}

