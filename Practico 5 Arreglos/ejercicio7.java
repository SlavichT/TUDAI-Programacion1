import java.util.Arrays;

public class ejercicio7 {
    //Hacer  un  programa  que  dado  un  arreglo  de  enteros  y  un  número
    //N,  genere  un  arreglo  con  las  posiciones  donde  se  encuentra  dicho
    //número.  A  continuación,  multiplicar  por  un  número  M  todas  las
    //ocurrencias del número N en el arreglo original.
    final static int MAX = 6;
    public static void main(String[] args){

        //declaro un arreglo de enteros
        int[] numeros = {2,4,6,8,2,2};

        //declaro el numero N, osea el numero a buscar (en este caso hardcodeado)
        int numeroN = 2;

        //declaro el numeroM, osea el numero que va a multiplicar la posicion de N
        int numeroM = 10;


        int[] posiciones = new int [calcularTamañoPosiciones(numeros, numeroN)];
        cargarArregloN(numeros, numeroN, posiciones);

        //declaro un nuevo arreglo que me muestre en que posiciones esta el numeroN
        //int[] posicionesN = calcularPosicionesN(numeros, numeroN);

        multiplicarM(numeros, numeroN, numeroM);

        System.out.println("Arreglo multiplicado por M: ");
        for(int i = 0; i < MAX; i++){
            System.out.println(numeros[i] + " ");
        }
    }

    //Metodo para calcular el tamaño del nuevo arreglo
    public static int calcularTamañoPosiciones(int[] numeros, int numeroN){
        int contador = 0;
        //Se inicializa un contador en 0, y se recorre el arreglo en general sumando al contador cada vez que loopea el for
        for(int i = 0; i < MAX; i++){
            if(numeros[i] == numeroN){
                contador++;
            }
        }
        return contador;
    }

    //Armar un metodo para poder contar las posiciones de N
    public static void cargarArregloN(int[] numeros, int numeroN, int[] posiciones){

    //Creo un arreglo de posiciones con la variable contador de antes
       int j = 0;
    //Vuelvo a hacer un for para poder ir sumando cada posicion al arreglo que posee contador y lo voy guardando con una variable j
     for(int i = 0; i < MAX; i++){
     if(numeros[i] == numeroN){
           posiciones[j] = i;
       j++;
    }
    }
    }
    public static void multiplicarM(int[] numeros, int numeroN, int numeroM){
        for(int i = 0; i < MAX; i++){
            if(numeros[i] == numeroN) {
                numeros[i] *= numeroM;
            }
        }
    }
}




