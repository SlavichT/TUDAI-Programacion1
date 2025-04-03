public class ejercicio2 {
    //Construir un programa que solicite desde teclado un número de
    //mes y posteriormente notifique por pantalla la cantidad de días de
    //ese mes. En el caso de que ingrese 2 como número de mes
    //(febrero) deberá además solicitar ingresar un número de año y,
    //dependiendo si es bisiesto o no con la siguiente sentencia:
    //((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
    //imprimir la cantidad de días correspondiente.

    public static void main (String[] args){
        int mes = 0;
        int anio = 0;
        System.out.println("Ingrese un numero de mes para ver la cantidad de dias del mismo");
        mes = Utils.leerInt();

        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 9: case 12:
                System.out.println("El mes ingresado consta de 31 dias.");
                break;
            case 4: case 6: case 10: case 11:
                System.out.println("El mes ingresado consta de 30 dias.");
                break;
            case 2:
                System.out.println("El mes ingresado consta de 28 o 29 dias dependiendo si es bisiesto o no");
                System.out.println("Porfavor ingrese el año del que desea saber la cantidad de dias");
                anio = Utils.leerInt();

                if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
                    System.out.println("El mes va a ser/ es bisiesto por ende consta de 29 dias.");
                }else{
                    System.out.println("El mes no fue/ no es bisiesto por ende consta de 28 dias.");
                }

        }
    }
}
