public class ejercicio5 {

    public static void main (String [] args) {
        //Escribir un programa que solicite nombre, edad, altura y ocupación, y
        //los imprima por pantalla.

        //Declarar los datos

        String nombre = "";
        int edad = 0;
        double altura = 0.0;
        String ocupacion = "";

        System.out.println("Porfavor ingrese nombre, edad, altura y ocupacion: ");
        System.out.println("Ingrese el nombre: ");
        nombre = Utils.leerString();
        System.out.println("Ingrese la edad: ");
        edad = Utils.leerInt();
        System.out.println("Ingrese la altura: ");
        altura = Utils.leerDouble();
        System.out.println("Ingrese la ocupacion: ");
        ocupacion = Utils.leerString();


        System.out.println("Los datos ingresados fueron: ");
        System.out.println("-Nombre: " + nombre);
        System.out.println("-Edad: " + edad );
        System.out.println("-Altura: " + altura);
        System.out.println("-Ocupacion: " + ocupacion);


    }

}
