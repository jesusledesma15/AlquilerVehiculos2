/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresalquiler2;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Cliente {

    private String nif;
    private String nombre;
    private String apellidos;

    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Cliente() {
        this.nif = "00000000A";
        this.nombre = "nomCliente";
        this.apellidos = "apelCliente";
    }

    public static Cliente generarClienteAleatorio() {

        //GENERAR CLIENTE ALEATORIO
        //Generar nombre aleatorio:
        Random aleatorio = new Random();
        String nombre = "", apellidos = "", nif;
        int numCliente = aleatorio.nextInt(4);
        switch (numCliente) {
            case 0:
                nombre = "Jesús";
                break;
            case 1:
                nombre = "Manuel";
                break;
            case 2:
                nombre = "Juan";
                break;
            case 3:
                nombre = "David";
                break;
            case 4:
                nombre = "Cristian";
                break;

        }

        //Generar apellido aleatorio:
        int apellidoCliente = aleatorio.nextInt(4);
        switch (apellidoCliente) {
            case 0:
                apellidos = "Ledesma";
                break;
            case 1:
                apellidos = "Fargas";
                break;
            case 2:
                apellidos = "Álvarez";
                break;
            case 3:
                apellidos = "Reyes";
                break;
            case 4:
                apellidos = "Carrasco";
                break;

        }
        //Números del NIF:
        int num1 = aleatorio.nextInt(10);
        int num2 = aleatorio.nextInt(10);
        int num3 = aleatorio.nextInt(10);
        int num4 = aleatorio.nextInt(10);
        int num5 = aleatorio.nextInt(10);
        int num6 = aleatorio.nextInt(10);
        int num7 = aleatorio.nextInt(10);
        int num8 = aleatorio.nextInt(10);
        String[] numNif = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String numeroNif = numNif[num1] + numNif[num2] + numNif[num3] + numNif[num4] + numNif[num5] + numNif[num6] + numNif[num7] + numNif[num8];

        //Calcular letra DNI:
        int posicionLetra = aleatorio.nextInt(26);
        String[] letra = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String letraNif = letra[posicionLetra];

        //Resultado:        
        nif = numeroNif + letraNif;
        Cliente c = new Cliente(nif, nombre, apellidos);
        return c;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "[CLIENTE] " + "\n NIF: " + nif + "\n Nombre: " + nombre + " \n Apellidos: " + apellidos;
    }

}
