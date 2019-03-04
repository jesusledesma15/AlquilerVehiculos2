/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresalquiler2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class EmpresaAlquilerVehiculos {

    private String cif;
    private String nombre;
    private String paginaweb;
    /* Atributos para controlar el total de clientes que tiene la
    empresa y array de almacenamiento para los objetos Cliente */
    private int totalClientes;
    private ArrayList<Cliente> listaCliente;
    /* Atributos para controlar el total de vehiculos disponibles en
    alquiler que tiene la empresa y array de almacenamiento para los objetos
    Vehiculo */
    private int totalVehiculos;
    private ArrayList<Vehiculo> listaVehiculo;
    /* Atributos para controlar el histórico de alquileres: total de
    alquileres realizados y array de almacenamiento para los objetos
    VehiculoAlquilado */
    private int totalAlquileres;
    private ArrayList<VehiculoAlquilado> listaAlquiler;

    /* Constructor parametrizado donde se establece que el total de clientes
    será 50, igual que el total de vehiculos disponibles. El histórico de  
    vehiculos puede contener hasta 100 elementos */
    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaweb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaweb = paginaweb;
        this.totalClientes = 0;
        this.listaCliente = new ArrayList<>(); //Apuntan a null
        this.totalVehiculos = 0;
        this.listaVehiculo = new ArrayList<>(); //Apuntan a null
        this.totalAlquileres = 0;
        this.listaAlquiler = new ArrayList<>();  //Apuntan a null
    }

    public void registrarCliente(Cliente nuevo) {
        this.listaCliente.add(this.totalClientes, nuevo);
        this.totalClientes++;
    }

    public void registrarVehiculo(Vehiculo nuevo) {
        this.listaVehiculo.add(this.totalVehiculos, nuevo);
        this.totalVehiculos++;
    }

    public void imprimirClientes() {
        System.out.println("NIF cliente\tNombre\n");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(listaCliente.get(i).toString());
        }
    }

    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");
        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(listaVehiculo.get(i).toString());
        }
    }

    private Cliente getCliente(String nif) {
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.listaCliente.get(i).getNif().equals(nif)) {
                return this.listaCliente.get(i);
            }
        }
        return null;
    }

    private Vehiculo getVehiculo(String matricula) {
        for (int i = 0; i < this.getTotalVehiculos(); i++) {
            if (this.listaVehiculo.get(i).getMatricula().equals(matricula)) {
                return this.listaVehiculo.get(i);
            }
        }
        return null;
    }

    public void recibirVehiculo(String matricula) {
        // busca el vehículo con la matrícula dada en el
        // array vehiculos y modifica su disponibilidad
        // para que se pueda alquilar de nuevo
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
        // busca el cliente con el NIF dado en el array
        // clientes y el vehículo con la matrícula dada en el
        // array vehiculos, si el vehículo está disponible se
        // alquila con la fecha actual, que se obtiene
        // ejecutando los métodos diaHoy(), mesHoy() y
        // añoHoy(), cuya declaración no se incluye
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false);
            this.listaAlquiler.add(new VehiculoAlquilado(cliente, vehiculo,
                    LocalDate.now(), dias));

            this.totalAlquileres++;
        }
    }

    public void rellenarArrayVehiculo() {
        for (int i = 0; i < 25; i++) {

            listaVehiculo.add(Vehiculo.generarVehiculoRandom());
            System.out.println(listaVehiculo.get(i));
            totalVehiculos++;
        }        
    }

    public void rellenarArrayCliente() {
        for (int i = 0; i < 25; i++) {

            listaCliente.add(Cliente.generarClienteAleatorio());
            System.out.println(listaCliente.get(i));
            totalClientes++;
        }        
    }

    //Hacer burbuja para Vehiculos
    public void burbujaVehiculos() {
        int aux;
        Vehiculo temp;
        for (int i = 0; i < listaVehiculo.size() - 1; i++) {
            for (int j = i + 1; j < listaVehiculo.size(); j++) {
                aux = listaVehiculo.get(i).getMatricula().compareTo(listaVehiculo.get(j).getMatricula());
                if (aux > 0) {
                    temp = listaVehiculo.get(i);
                    listaVehiculo.set(i, listaVehiculo.get(j));
                    listaVehiculo.set(j, temp);
                }
            }
        }
    }

    //Hacer burbuja para Vehiculos
    public void burbujaCliente() {
        int aux;
        Cliente temp;
        for (int i = 0; i < listaCliente.size() - 1; i++) {
            for (int j = i + 1; j < listaCliente.size(); j++) {
                aux = listaCliente.get(i).getNif().compareTo(listaCliente.get(j).getNif());
                if (aux > 0) {
                    temp = listaCliente.get(i);
                    listaCliente.set(i, listaCliente.get(j));
                    listaCliente.set(j, temp);
                }
            }
        }
    }
    
    //Buscqueda binaria Vehiculo
    public int binarySearchVehiculo(String matricula) {
        int mitad;
        int izquierda = 0;
        int derecha = listaVehiculo.size() - 1;
        int valor = 0;
        while ((izquierda <= derecha)) {
            mitad = (izquierda + derecha) / 2;
            valor = listaVehiculo.get(mitad).getMatricula().compareTo(matricula);
            if (valor == 0) {
                return mitad;
            } else if (valor < 0) {
                izquierda = mitad + 1;; //buscar en el trozo izquierdo
            } else {
                derecha = mitad - 1; // buscar en el trozo derecho
            }
        }
        return -1;

     }
    
    public int binarySearchCliente(String cliente) {
        int mitad;
        int izquierda = 0;
        int derecha = listaCliente.size() - 1;
        int valor = 0;
        while ((izquierda <= derecha)) {
            mitad = (izquierda + derecha) / 2;
            valor = listaCliente.get(mitad).getNif().compareTo(cliente);
            if (valor == 0) {
                return mitad;
            } else if (valor < 0) {
                izquierda = mitad + 1;; //buscar en el trozo izquierdo
            } else {
                derecha = mitad - 1; // buscar en el trozo derecho
            }
        }
        return -1;

     }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public ArrayList<Vehiculo> getListaVehiculo() {
        return listaVehiculo;
    }

    public void setListaVehiculo(ArrayList<Vehiculo> listaVehiculo) {
        this.listaVehiculo = listaVehiculo;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public ArrayList<VehiculoAlquilado> getListaAlquiler() {
        return listaAlquiler;
    }

    public void setListaAlquiler(ArrayList<VehiculoAlquilado> listaAlquiler) {
        this.listaAlquiler = listaAlquiler;
    }

    @Override
    public String toString() {
        return "EmpresaAlquilerVehiculos{" + "cif=" + cif + ", nombre=" + nombre + ", paginaweb=" + paginaweb + ", totalClientes=" + totalClientes + ", listaCliente=" + listaCliente + ", totalVehiculos=" + totalVehiculos + ", listaVehiculo=" + listaVehiculo + ", totalAlquileres=" + totalAlquileres + ", listaAlquiler=" + listaAlquiler + '}';
    }

}
