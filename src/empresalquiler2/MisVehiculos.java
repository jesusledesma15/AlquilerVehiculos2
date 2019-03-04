/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresalquiler2;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class MisVehiculos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // la instancia easydrive de la clase EmpresaAlquilerVehiculos
        EmpresaAlquilerVehiculos rentaCar = new EmpresaAlquilerVehiculos("A-28-187189", "easy drive",
                "www.easydrive.com");

        //Rellenar de manera aleatoria arrayList de clientes:
        rentaCar.rellenarArrayCliente();

        //Rellenar de manera aleatoria arrayList de vehiculos:
        rentaCar.rellenarArrayVehiculo();

        //Imprimir clientes
        rentaCar.imprimirClientes();

        //Imprimir vehiculos
        rentaCar.imprimirVehiculos();

        // El programa solicitará por teclado el nif de un cliente, la matrícula de un vehículo y el número de días que se quiere alquilar
        /*  System.out.print("Indique el NIF: ");
        String solicitarDNI = teclado.next();
        System.out.print("Indique la matrícula: ");
        String solicitarMatricula = teclado.next();
        System.out.print("Indique el número de días del alquiler: ");
        int diasAlquiler = teclado.nextInt();
        
        // El sistema registrará, usando el método apropiado, el alquiler anterior.
        rentaCar.alquilarVehiculo(solicitarMatricula, solicitarDNI, diasAlquiler);*/
        // Se debe mostrar por consola el alquiler registrado.
        //System.out.println(rentaCar.getListaAlquiler());
        // Posteriormente, se ordenarán los clientes y los vehículos usando los métodos apropiados
        System.out.println("ORDENADO POR NIF");
        rentaCar.burbujaCliente();
        rentaCar.imprimirClientes();
        System.out.println("ORDENADO POR MATRÍCULA");
        rentaCar.burbujaVehiculos();
        rentaCar.imprimirVehiculos();

        //Búsqueda binaria matricula
        System.out.print("Introduzca matrícula: ");
        String matriculaSearch = teclado.next();
        rentaCar.binarySearchVehiculo(matriculaSearch);
        if (rentaCar.binarySearchVehiculo(matriculaSearch) == -1) {
            System.out.println("Matrícula no encontrada");
        } else {
            System.out.println("Encontrado en la posición: " + rentaCar.binarySearchVehiculo(matriculaSearch));
        }
        //Búsqueda binaria cliente
        System.out.print("Introduzca NIF: ");
        String nifSearch = teclado.next();
        rentaCar.binarySearchCliente(nifSearch);
        if (rentaCar.binarySearchCliente(nifSearch) == -1) {
            System.out.println("NIF no encontrado");
        } else {
            System.out.println("Encontrado en la posición: " + rentaCar.binarySearchCliente(nifSearch));
        }

    }

}
