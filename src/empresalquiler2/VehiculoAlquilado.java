/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresalquiler2;

import java.time.LocalDate;

/**
 *
 * @author jesus
 */
public class VehiculoAlquilado {
    
    private Cliente cliente;
    private Vehiculo vehiculo;
//  private int diaAquiler;
//  private int mesAlquiler;
//  private int anioAlquiler;
    private LocalDate fechaAlqui;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlqui, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaAlqui = fechaAlqui;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaAlqui() {
        return fechaAlqui;
    }

    public void setFechaAlqui(LocalDate fechaAlqui) {
        this.fechaAlqui = fechaAlqui;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    @Override
    public String toString() {
        return "VehiculoAlquilado{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", fechaAlqui=" + fechaAlqui + ", totalDiasAlquiler=" + totalDiasAlquiler + '}';
    }

   

    
    
    
}
