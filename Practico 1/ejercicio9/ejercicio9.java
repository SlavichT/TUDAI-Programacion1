package ejercicio9;
//Escribir un programa que permita el ingreso de un número entero
//por teclado e imprima el cociente de la división de dicho número
//por 2, 3, y 4. En base a los resultados obtenidos analice cada
//caso si es correcto o no.
public class ejercicio9 {
    public static void main(String[] args){
        int n1 = 0;

        System.out.println("Ingrese el numero para poder calcular el cociente del mismo: ");
        n1 = Utils.leerInt();

        int divisionpor2 = n1 / 2;
        int divisionpor3 = n1 / 3;
        int divisionpor4 = n1 / 4;

        System.out.println("El cociente del numero dividido por 2 es: " + divisionpor2);
        System.out.println("El cociente del numero dividido por 3 es: " + divisionpor3);
        System.out.println("El cociente del numero dividido por 4 es: " + divisionpor4);

    }
}
