public class ejercicio4 {
    // Buscar  un  elemento  en  un  arreglo  de  caracteres  ya  cargado  de
    //tamaño  10  y  mostrar  la/s  posición/es  del  elemento,  en  caso  de  no
    //estar indicarlo también.
    public static void main(String[] args) {
        //Declaramos un arreglo de 10 caracteres ya asignados
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        System.out.println("Porfavor ingrese el caracter a buscar: ");

        char buscarCaracter = Utils.leerChar();

        //Hacemos un for para recorrer el arreglo entero y determinar si el caracter se encuentra o no
        //Determinamos antes de arrancar el for un boolean en el que muestre que el caracter no se encontro aun
        boolean caracterEncontrado = false;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == buscarCaracter) {
                System.out.println("El caracter ' " + buscarCaracter + " '  se encuentra en la posicion: " + i);
                caracterEncontrado = true;
            }
        }
        if (!caracterEncontrado) {
            System.out.println("El caracter ' " + buscarCaracter + " ' no se encuentra dentro del arreglo");
        }
    }
}
