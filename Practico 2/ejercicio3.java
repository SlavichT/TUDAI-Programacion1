public class ejercicio3 {
    // Escribir un programa que solicite el ingreso de un número mayor a
    //50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
    public static void main (String[] args){
        int numero = 0;

        System.out.println("Ingrese un numero mayor a 50, en caso de ser multiplo de 2 o 3 se mostrara por pantalla.");
        numero = Utils.leerInt();

        if(numero > 50 && numero%2==0 && numero%3==0){
            System.out.println("El numero ingresado es " + numero + " y es multiplo de 2 y de 3");
        }else if (numero > 50 && numero%2==0){
            System.out.println("El numero ingresado es " + numero + " y es multiplo de 2");
        }else if (numero >50 && numero%3==0){
            System.out.println("El numero ingresado es " + numero + " y es multiplo de 3");
        }else {
            System.out.println("El numero ingresado es menor a 50 por ende no es valido, intente ingresando un numero mayor a 50");
        }

    }
}
