public class ejercicio3 {
public static void main(String [] args){
    //Escribir un programa que declare una constante de tipo int y pida el
    //ingreso de un valor por teclado (hacer uso de Utils.java). Luego
    //muestre el valor ingresado. ¿Qué pasa en este caso? ¿Se puede o
    //surge algún problema?


    //Declarar la constante

    final int constante= 0;

    System.out.print("Ingrese el valor de la constante: ");
    constante = Utils.leerInt();

    //En este caso no podemos asignarle ningun valor valido a la variable ya que es de tipo FINAL , es decir, que una vez que se define ya no se puede cambiar de ninguna manera.
}
}
