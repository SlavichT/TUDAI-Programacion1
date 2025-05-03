public class ejercicio3 {
    // Con  el  mismo  arreglo  del  ejercicio  anterior  informe  por  pantalla
    //cuantos  elementos  del  mismo  están  por  encima  del  promedio
    //calculado.
    public static void main(String[] args) {
        //Declaramos un arreglo de 10 valores ya asignados
        int[] numeros = {10,20,30,40,50,60,70,80,90,100};
        int suma = 0;

        //Hacemos un for para que sume todos los valores del arreglo para poder calcular el promedio total
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }

        //En este caso declaramos la variable "promedio" y luego casteamos la variable suma con double para que el resultado de la division no de en enteros
        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio total es : " + promedio);

        int contador = 0;

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] > promedio) {

                contador++;

            }
        }

        System.out.println("Cantidad de elementos por encima del promedio: " + contador);
    }
}
