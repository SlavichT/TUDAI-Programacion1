public class ejercicio10 {
    // Hacer  un  programa  que  verifique  en  un  arreglo  si  tiene  al
    //menos  N  números  primos.  N  debe  ser  ingresado  por  el  usuario.
    //Reutilizar los métodos ya desarrollados.

    final static int MAX = 10;
    public static void main(String[] args){
        //Declaramos el arreglo a analizar
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        //Declaramos un numeroN para que el usuario ingrese el valor minimo de numeros primos a encontrar
        System.out.println("Por favor ingrese la cantidad minima de numeros primos a buscar en el arreglo.");
        int numeroN = Utils.leerInt();

        int totalPrimos = contarPrimos(numeros);

        //Mostramos el resultado

        if(totalPrimos >= numeroN){
            System.out.println("El arreglo tiene al menos " + numeroN + " numeros primos.");
        } else {
            System.out.println("El arreglo NO tiene al menos " + numeroN + " numeros primos.");
        }
    }
    //Metodo para verificar si un numero es primo o no
    public static boolean esPrimo(int numero){
        if(numero <= 1){
            return false; //No es primo
        }
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false; //No es primo
            }
        }
        return true; //Es primo
    }

    //Metodo para calcular el tamaño del nuevo arreglo
    public static int contarPrimos(int[] numeros){
        int contador = 0;
        //Se inicializa un contador en 0, y se recorre el arreglo en general sumando al contador cada vez que loopea el for
        for(int num : numeros){
            if(esPrimo(num)){
                contador++;
            }
        }
        return contador;
    }

}

