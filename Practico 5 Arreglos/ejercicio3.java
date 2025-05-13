public class ejercicio3 {
    // Con  el  mismo  arreglo  del  ejercicio  anterior  informe  por  pantalla
    //cuantos  elementos  del  mismo  están  por  encima  del  promedio
    //calculado.
    final static int MAX = 10;

    public static void main(String[] args) {
        //Declaramos un arreglo de 10 valores ya asignados
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        double promedio = calcularPromedio(numeros);

        System.out.println("El promedio total es: " + promedio);

        //Declaro el metodo a utilizar

        int cantidadElementosArribaPromedio = contarArribaDelPromedio(numeros, promedio);

        System.out.println("La cantidad de elementos que estan por encima del promedio son: " + cantidadElementosArribaPromedio);
    }

    //Hacemos un for para que sume todos los valores del arreglo para poder calcular el promedio total
    public static double calcularPromedio(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < MAX; i++) {
            suma += numeros[i];
        }
        return (double) suma / MAX;
    }

    public static int contarArribaDelPromedio(int[] numeros, double promedio){
        //Declaro un contador ya que necesito saber la cantidad de elementos que estan por encima en cada vuelta del for, por cada uno se sumara uno al contador.
        int contador = 0;
        for(int i = 0 ; i < MAX ; i++){
            if(numeros[i] > promedio){
                contador++;
            }
        }
        return contador;
    }

}
