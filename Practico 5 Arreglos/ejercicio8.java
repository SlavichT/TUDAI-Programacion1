public class ejercicio8 {

    //8.  Hacer  un  programa  que  determine  si  los  valores  almacenados  en
    //un arreglo de enteros se encuentran en orden ascendente.

    //La idea principal es crear un arreglo, recorrer el arreglo mediante un FOR y determinar si el mismo se encuentra en orden ASCENDENTE o no.
    //Si se encuentra en orden ASCENDENTE mostrar una aclaracion que lo afirme, sino mostrar una aclaracion que diga que NO esta en orden ASCENDENTE.

    final static int MAX = 5;
    public static void main (String[] args){

        //Declaro un arreglo para recorrer y luego analizar
        int[] numeros = {1,2,5,4,3};

        if(determinarOrden(numeros)){
            System.out.println("El arreglo esta en orden ascendente.");
        } else {
            System.out.println("El arreglo NO esta en orden ascendente.");
        }
    }


    public static boolean determinarOrden(int[] numeros){
        //Armo un for y aclaro que es MAX - 1 ya que sino mis valores cuando haga el if se van a salir del arreglo
        for(int i = 0; i < MAX - 1 ; i++){

            if(numeros[i] > numeros[i + 1]){
                return false; //Osea que no esta en orden ascendente
            }
        }
        return true; //Esta en orden ascendente
    }
}
