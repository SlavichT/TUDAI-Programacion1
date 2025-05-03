public class ejercicio1 {
    // Cargar  un  arreglo  de  tamaño  15,  pidiendo  el  ingreso  por  teclado
    //de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
    public static void main(String[] args) {

        //Creo e inicializo el arreglo con el tamaño correspondiente, en este caso nos pide un arreglo de tamaño 15
        int[] numeros = new int[15];

        //Creo un for que recorra todo el arreglo, en este caso por cada valor de i (0 a 14 ya que los arreglos toman desde la posicion 0) va a pedir ingresar un numero
        for(int i = 0 ; i < 15 ; i++){
            System.out.println("Ingrese un numero entre 1 y 12: ");
            numeros[i] = Utils.leerInt();
        }
        System.out.println("El arreglo cargado es : " );
        //En este momento realizo un for para que recorra TODO el arreglo ya cargado y lo muestre.
        for(int i = 0 ; i < 15 ; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
