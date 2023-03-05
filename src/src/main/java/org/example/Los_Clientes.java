package org.example;

public class Los_Clientes {

    //Para las necesidades de un sitio de venta online de libros de informática, ediciones ENI por ejemplo, se pide crear una clase que permita modelizar a un cliente. Todos los clientes tienen un nombre y se les debe asignar un número de cliente. También se pide escribir un algoritmo de prueba para capturar y mostrar clientes.

    //Ejemplo de ejecución posible:

    //-- Menú --

    //1 - Mostrar clientes

    //2 - Crear un cliente

    //3 - Salir










    private String nombre;
    private int numeroCliente;
    private static int contador = 0;

    public Los_Clientes(String nombre){
        this.nombre = nombre;
        this.numeroCliente = ++contador;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getNumeroCliente(){
        return this.numeroCliente;
    }

    public static void main(String[] args) {
        Los_Clientes cliente1 = new Los_Clientes("Oscar");
        Los_Clientes cliente2 = new Los_Clientes("Ruben");
        Los_Clientes cliente3 = new Los_Clientes("Marta");

        System.out.println("Nombre: " + cliente1.getNombre() + " - Número de cliente: " + cliente1.getNumeroCliente());
        System.out.println("Nombre: " + cliente2.getNombre() + " - Número de cliente: " + cliente2.getNumeroCliente());
        System.out.println("Nombre: " + cliente3.getNombre() + " - Número de cliente: " + cliente3.getNumeroCliente());
    }

}
