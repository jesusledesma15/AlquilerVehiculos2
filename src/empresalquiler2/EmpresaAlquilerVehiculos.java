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
