public class ejercicio4 {
    public static void main(String[] args) {
        //Escribir un programa que permita ingresar 5 números de a uno por
        //vez y que los muestre por pantalla en orden inverso:
        //Ejemplo:   Ingreso: 23, 4, 2, 100, 3
        //Se debe mostrar: 3, 100, 2, 4, 23

        int n1, n2, n3, n4, n5 = 0;

        System.out.println("Ingrese el valor del primer numero: ");
        n1 = Utils.leerInt();
        System.out.println("Ingrese el valor del segundo numero: ");
        n2 = Utils.leerInt();
        System.out.println("Ingrese el valor del tercer numero: ");
        n3 = Utils.leerInt();
        System.out.println("Ingrese el valor del cuarto numero: ");
        n4 = Utils.leerInt();
        System.out.println("Ingrese el valor del quinto numero: ");
        n5 = Utils.leerInt();

        System.out.println("Los numeros ingresados son: (Se mostraran en el orden inverso del que fueron agregados) " + n5 + " " + n4 + " " + n3 + " " + n2 + " " + n1);
    }
}
