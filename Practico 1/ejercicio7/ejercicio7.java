package ejercicio7;
//Escribir un programa que dado tres números reales ingresados
//por el usuario, divida el primero por el segundo y al resultado
//obtenido le reste el tercero. Muestre por pantalla el resultado
//obtenido. Puede o no usar variables auxiliares para los cálculos.
//¿Puede ocurrir algún error?

public class ejercicio7 {
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;



        System.out.println("Ingrese el primer numero: ");
        n1 = Utils.leerInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = Utils.leerInt();


        int division = n1/n2;

        System.out.println("A continuacion se mostrara en pantalla el resultado de la division entre el 1er numero y el 2do numero ingresado: ");
        System.out.println("El resultado de la division es: " + division);

        System.out.println("Ingrese el tercer numero para restarle a la anterior division: ");
        n3 = Utils.leerInt();
        int resultado = division-n3;
        System.out.println("A continuacion se mostrara el resultado de la division anterior pero restandole el 3er numero ingresado");
        System.out.println("El resultado final es: " + resultado);
    }
}
