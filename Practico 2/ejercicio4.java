public class ejercicio4 {
    //Escribir un programa donde el usuario ingrese un número entre 0
    //y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
    //tiene 3 dígitos debe informar qué número es.
    public static void main(String[] args){
        int numero = 0;
        int digitos = 0;
        System.out.println("Ingrese un numero entre 0 y 999");
        numero = Utils.leerInt();
        if(numero < 0 || numero > 999){
            System.out.println("El numero ingresado es incorrecto, debe ser un numero en un rango entre 0 y 999");
        }else if (numero < 10){
            digitos = 1;
        }else if(numero < 100){
            digitos = 2;
        }else{
            digitos = 3;
        }
        System.out.println("El numero ingresado contiene " + digitos + " digitos.");

        if(digitos == 3){
            System.out.println("El numero ingresado es " + numero);
        }
    }
}
