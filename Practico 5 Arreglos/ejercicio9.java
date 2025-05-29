public class ejercicio9 {
    //9.  Dado  un  arreglo  de  caracteres,  determinar  si  en  el  arreglo  existe  al
    //menos una letra repetida.
    final static int MAX = 5;

    public static void main (String[] args){

        //Declaramos el arreglo de char

        char[] caracteres = {'a','b','c','c','d'};

        if(tieneRepetidos(caracteres)){
            System.out.println("Hay caracteres repetidos.");
        } else {
            System.out.println("No hay caracteres repetidos.");
        }
    }

    public static boolean tieneRepetidos(char[] caracteres){
        for(int i = 0; i < MAX - 1; i++){
            for(int j = i + 1 ; j < MAX; j++){
                if(caracteres[i] == caracteres[j]){
                    return true; // Hay repetidos.
                }
            }
        }
        return false;
    }
}
