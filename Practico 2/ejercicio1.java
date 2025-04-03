public class ejercicio1 {

    //1. Escribir un programa completo (declaración de constantes y
    //variables, carga de datos, procesamiento e impresión de
    //resultados) para cada caso o ítem que:
    //a. solicite un número e indique si es positivo o negativo.
    //b. solicite un número e imprima “grande” si es mayor a 100 y
    //“chico “ si es menor.
    //c. solicite un número del 1 al 7 e imprima el día de la semana.
    //d. solicite una letra e imprima si es vocal o consonante.
    //e. solicite 3 números e imprima “creciente” si los tres números
    //están en orden creciente, “decreciente” si están en orden
    //decreciente o “error” si no cumplen ningún orden

public static void main(String[] args){
        //declarar las variables a utilizar

        //Punto A

        int numeroA = 0;

        System.out.println("Ingrese un numero para verificar si el mismo es positivo o negativo: ");
        numeroA = Utils.leerInt();
        if(numeroA > 0){
            System.out.println("El numero ingresado es " + numeroA + " y es positivo." );
        }else if(numeroA < 0){
            System.out.println("El numero ingresado es " + numeroA + " y es negativo.");
        }else{
            System.out.println("El numero ingresado es 0.");
        }

        //Punto B
        int numeroB = 0;
        System.out.println("Ingrese un numero para verificar si es mas grande o mas chico que 100");
        numeroB = Utils.leerInt();
        if(numeroB > 100){
            System.out.println("El numero ingresado es mayor a 100. GRANDE");
        }else{
            System.out.println("El numero ingresado es menor a 100. CHICO");
        }
         //Punto C
        int dia = 0;
        System.out.println("Ingrese un numero del 1 al 7 para obtener un dia de la semana");
        dia = Utils.leerInt();
        switch(dia){
            case 1 : System.out.println("Lunes");
            break;
            case 2 : System.out.println("Martes");
            break;
            case 3 : System.out.println("Miercoles");
            break;
            case 4 : System.out.println("Jueves");
            break;
            case 5 : System.out.println("Viernes");
            break;
            case 6 : System.out.println("Sabado");
            break;
            case 7 : System.out.println("Domingo");
            break;
            default : System.out.println("El numero ingresado es incorrecto debe encontrarse entre el 1 y el 7");
        }

        //Punto D
        char letra = ' ';

        System.out.println("Ingrese una letra para determinar si la misma es una vocal o una consonante");
        letra = Utils.leerChar();
        switch(letra){
            case 'a': case 'e': case'i': case'o': case'u':
                System.out.println("La letra ingresada es una vocal");
                break;
            default: System.out.println("La letra ingresada es una consonante");
        }
        //Punto E
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        System.out.println("Porfavor ingrese 3 numeros para determinar si estan en orden creciente o decreciente");
        System.out.println("Ingrese el primer numero: ");
        numero1 = Utils.leerInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = Utils.leerInt();
        System.out.println("Ingrese el tercer numero: ");
        numero3 = Utils.leerInt();

        if(numero1 < numero2 && numero2 < numero3){
            System.out.println("Los numeros ingresados se encuentran en orden creciente.");
        }else if (numero1 > numero2 && numero2>numero3){
            System.out.println("Los numeros ingresados se encuentran en orden decreciente.");
        } else{
            System.out.println("Error");
        }
    }
}
