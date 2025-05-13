public class ejercicio6 {
    // Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño  10
    // que  se  encuentra  cargado,  obtenga  la  cantidad  de  números  pares
    // que tiene y la imprima.

    final static int MAX = 10;
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        int cantidadPares = numerosPares(numeros);

        System.out.println("La cantidad de numeros pares presentes en el arreglo es : " + cantidadPares);
    }

    public static int numerosPares(int[] numeros){
        int contador = 0;
        for(int i = 0; i < MAX; i++){
            if(numeros[i] % 2 == 0){
                contador++;
            }
        }
        return contador;
    }
}

