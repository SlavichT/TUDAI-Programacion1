public class ejercicio6 {
    public static void main(String[] args){
        //Escribir un programa que pida se ingresen datos necesarios para
        //emitir una factura por la compra de dos artículos de librería (tipo
        //factura, número, nombre cliente, producto 1, importe 1, producto 2,
        //importe 2, importe total). Se debe imprimir por pantalla en un formato de tipo TICKET

        char tipoFactura = ' ';
        int numeroFactura = 0;
        String nombreCliente = " ";
        String producto1 = " ";
        String producto2 = " ";
        double importe1 = 0.0;
        double importe2 = 0.0;
        double importeTotal = importe1 + importe2;

        System.out.println("Ingrese los datos solicitados: ");
        System.out.println("Ingrese el tipo de factura: ");
        tipoFactura = Utils.leerChar();
        System.out.println("Ingrese el numero de factura: ");
        numeroFactura = Utils.leerInt();
        System.out.println("Ingrese el nombre cliente: ");
        nombreCliente = Utils.leerString();
        System.out.println("Ingrese el producto 1: ");
        producto1 = Utils.leerString();
        System.out.println("Ingrese el producto 2: ");
        producto2 = Utils.leerString();
        System.out.println("Ingrese el importe del producto 1: ");
        importe1 = Utils.leerDouble();
        System.out.println("Ingrese el importe del producto 2: ");
        importe2 = Utils.leerDouble();

        System.out.println("Se emitio el ticket con la informacion correspondiente: ");
        System.out.println("Factura         " + tipoFactura + "        N" + numeroFactura);
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Producto        " + "Importe            ");
        System.out.println(producto1 +"           "+ importe1);
        System.out.println(producto2 +"           "+ importe2);
        System.out.println("Importe total:        "+ importeTotal);


    }
}
