public class ejercicio1 {
    // Cargar  un  arreglo  de  tamaño  15,  pidiendo  el  ingreso  por  teclado
    //de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
    final static int MAX = 15;
    public static void main(String[] args) {
        //Creo e inicializo el arreglo con el tamaño correspondiente, en este caso nos pide un arreglo de tamaño 15
        int[] numeros = new int[MAX];
        cargarArreglo(numeros);
        mostrarArreglo(numeros);
    }
        public static void cargarArreglo(int[] numeros) {
            //Creo un for que recorra todo el arreglo, en este caso por cada valor de i (0 a 14 ya que los arreglos toman desde la posicion 0) va a pedir ingresar un numero
            for (int i = 0; i < MAX; i++) {
                System.out.println("Ingrese un numero entre 1 y 12: ");
                int numero = Utils.leerInt();

                while (numero < 1 || numero > 12){
                    System.out.println("Numero invalido. Porfavor ingrese un numero entre 1 y 12: ");
                    numero = Utils.leerInt();
                }
                numeros[i] = numero;
            }

        }
        public static void mostrarArreglo(int[] numeros){
        System.out.println("El arreglo cargado es : " );
        //En este momento realizo un for para que recorra TODO el arreglo ya cargado y lo muestre.
        for(int i = 0 ; i < MAX ; i++){
            System.out.print(numeros[i] + " ");

        }
    }
}