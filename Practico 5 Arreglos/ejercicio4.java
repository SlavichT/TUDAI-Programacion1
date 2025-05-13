public class ejercicio4 {
    // Buscar  un  elemento  en  un  arreglo  de  caracteres  ya  cargado  de
    //tamaño  10  y  mostrar  la/s  posición/es  del  elemento,  en  caso  de  no
    //estar indicarlo también.
    final static int MAX = 10;
   public static void main(String[] args) {
       //Declaramos un arreglo de 10 caracteres ya asignados
       char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
       buscarChar(letras);
   }

   public static void buscarChar(char[] letras){
       System.out.println("Porfavor ingrese el caracter a buscar: ");
       char buscarCaracter = Utils.leerChar();

       //Declaro un boolean diciendo que el char no se encontro, por ende se inicializa en FALSE
       boolean charEncontrado = false;

       for(int i = 0; i < MAX ; i++){
           if(letras[i] == buscarCaracter){
               System.out.println("El caracter ' " + buscarCaracter + " ' se encuentra en la posicion: " + i);
               charEncontrado = true;
           }
       }
       if (!charEncontrado){
           System.out.println("El caracter ' " + buscarCaracter + " ' no se encuentra dentro del arreglo");
       }
   }

}
