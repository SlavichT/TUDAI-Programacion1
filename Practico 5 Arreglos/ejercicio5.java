public class ejercicio5 {
    //  Hacer  un  programa  que  dado  un  arreglo  de  caracteres  de  tamaño
    //  MAX que se encuentra cargado, invierta el orden del contenido.
    final static int MAX = 5;

    public static void main(String[] args){
        char[] letras = {'a', 'b', 'c', 'd', 'e'};

        invertirArreglo(letras);
    }
    public static void invertirArreglo(char[] letras){
        char[] arrInvertido = new char[MAX];
        int pos = 0;
        for(int i = MAX-1 ; i >= 0 ; i--){
            arrInvertido[pos] = letras[i];
            pos++;
        }
        mostrarArreglo(arrInvertido);
    }
    public static void mostrarArreglo(char[] letras){
        System.out.println("El arreglo invertido es : " );
        for(int i = 0 ; i < MAX ; i++){
            System.out.println(letras[i] + " ");
        }
    }
}
