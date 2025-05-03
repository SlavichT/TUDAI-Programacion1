public class ejercicio1 {
    //1. Escribir un diseño de programa que mientras que el usuario
    //ingrese un número distinto de 0, pida ingresar otro número y lo
    //imprima.
    public static void main(String[] args) {

        //Objetivo del programa: Leer un numero. Si este no es 0 pedir otro numero e imprimirlo por pantalla. Repetir siempre y cuando el numero sea distinto a 0.

        int numero = 0;


        //Pseudocodigo
        // Inicio del programa
        //  Leer segundo numero
        //  Imprimir segundo numero
        //  Leer primer numero (Otra vez)

        System.out.print("Ingrese un numero: (ingrese el 0 para terminar la ejecucion): ");
        numero = Utils.leerInt();

        while(numero != 0){
            System.out.println("Ingrese otro numero: ");
            numero = Utils.leerInt();
        }
        System.out.println("El programa finalizo porque se ingreso un numero igual a 0");
    }
}
