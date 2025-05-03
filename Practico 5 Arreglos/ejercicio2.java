public class ejercicio2 {
    // Hacer  un  programa  que  dado  un  arreglo  ya  cargado  con  10
    //enteros, calcule el promedio y lo muestre por la consola.
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
    }
}
