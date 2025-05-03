public class ejercicio5 {
    // Escribir un programa que solicite una hora del día (valor entero de
    //la hora solamente) y resuelva en cada caso:
    //a. Si la hora está entre las 0 y las 5, pida ingresar la
    //temperatura y si la misma es menor a 20 grados imprima
    //“Encender la calefacción”. Si es mayor a 25, imprima
    //“Apagar calefacción”. Si está en el rango de 20 a 25 imprima
    //“Calefacción encendida, no abra las ventanas!!!”.
    //b. Si la hora está entre las 6 y las 11, pida un carácter letra
    //minúscula y si es vocal imprima por la consola la cantidad de
    //vocales que tiene la palabra que corresponde con la hora.
    //Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
    //cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
    //tiene 2 consonantes.
    //c. Si la hora está entre las 12 y 17 y es par, imprima el
    //promedio entre la hora ingresada y el límite inferior del
    //rango. Si la hora es impar debe imprimir el promedio entre la
    //hora ingresada y el límite superior del rango.
    //d. Si la hora está entre las 18 y 23, pida ingresar una clave
    //numérica, si coincide con la clave almacenada previamente
    //en una constante, pida ingresar una segunda clave de
    //verificación (un valor entre 100 y 999). Para esta segunda
    //clave (que solo la conoce el usuario) se debe verificar que el
    //dígito de mayor peso (centena) sea múltiplo del dígito de
    //mayor peso de la clave almacenada. Si todo esto se cumple
    //debería mostrar por la consola el mensaje “Clave correcta”.
    //Ejemplo: clave almacenada 364, clave ingresada 364,
    //segunda clave ingresada 698.

    public static void main(String[] args) {
        int hora = 0;
        int temperatura = 0;
        char minuscula = ' ';

        System.out.println("Ingrese la hora: ");
        hora = Utils.leerInt();

        //PUNTO A

        if(hora>=0 && hora <=5){
            System.out.println("Ingrese la temperatura: ");
            temperatura = Utils.leerInt();
            if(temperatura < 20){
                System.out.println("Encender la calefaccion.");
            }else if(temperatura > 25){
                System.out.println("Apagar la calefaccion.");
            }else if(temperatura >= 20 && temperatura <=25){
                System.out.println("Calefaccion encendida, no abra las ventanas!!!");
            }else
                //PUNTO B
                if(hora>=6 && hora<=11){
                    System.out.println("Ingrese una minuscula:");
                    minuscula = Utils.leerChar();
                    if(minuscula>='a' && minuscula<='z'){
                        int consonantes = 2;
                        int vocales = 3;
                        switch (minuscula){
                            case 'a','e','i','o','u':
                            {
                                if(hora==6 || hora==8 || hora==10 || hora==11){
                                    vocales=2;
                                }
                                System.out.println("La hora " + hora + " tiene " + vocales + " vocales.");
                                break;
                            }
                            default: System.out.println("La hora " + hora + " tiene " + consonantes + " consonantes");
                        }
                    }
                }else if(hora>=12 && hora<=17){
                    if(hora % 2==0){
                    System.out.println("El promedio es: " + (( hora + 12 ) / 2));
                }else {
                    System.out.println("El promedio es: " + (( hora+17 ) / 2 ));
                }
                } else if (hora>=18 && hora<=23){
                    final int claveAlmacenada=364;
                    int clave=0;
                    System.out.println("ingrese una clave");
                    clave=Utils.leerInt();
                    if (clave==claveAlmacenada){
                        int segundaClave=0;
                        System.out.println("Ingrese segunda clave (100 y 999)");
                        segundaClave=Utils.leerInt();
                        if (segundaClave>=100 && segundaClave<=999){
                            if (((segundaClave/100)%(claveAlmacenada/100))==0){
                                System.out.println("clave correcta");
                            } else {
                                System.out.println("clave incorrecta");
                            }
                        }
                    } else{
                        System.out.println("La primera clave es incorrecta");
                    }} else if (hora>=18 && hora<=23){
                    final int claveAlmacenada=364;
                    int clave=0;
                    System.out.println("ingrese una clave");
                    clave=Utils.leerInt();
                    if (clave==claveAlmacenada){
                        int segundaClave=0;
                        System.out.println("Ingrese segunda clave (100 y 999)");
                        segundaClave=Utils.leerInt();
                        if (segundaClave>=100 && segundaClave<=999){
                            if (((segundaClave/100)%(claveAlmacenada/100))==0){
                                System.out.println("clave correcta");
                            } else {
                                System.out.println("clave incorrecta");
                            }
                        }
                    } else{
                        System.out.println("La primera clave es incorrecta");
                    }


    }
}}
}

