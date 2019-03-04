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
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public Vehiculo() {

        this.matricula = "0000AAA";
        this.marca = "Marca";
        this.modelo = "Modelo";
        this.color = "Color";
        this.tarifa = 2;
        this.disponible = false;
    }
    
     public static Vehiculo generarVehiculoRandom() {
        //GENERAR MATRICULA ALEATORIA:
        //Generar letras matriculas aleatorias:
        Random aleatorio = new Random();
        String marca="", modelo="", color="", matricula;
        boolean disponible;
        double tarifa;
        String[] letrasArray1 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int letra1 = aleatorio.nextInt(26);
        int letra2 = aleatorio.nextInt(26);
        int letra3 = aleatorio.nextInt(26);
      

        String letrasMatricula = letrasArray1[letra3] + letrasArray1[letra2] + letrasArray1[letra1];

        //Generar número matrículas aleatorios:
        int num1 = aleatorio.nextInt(10);
        int num2 = aleatorio.nextInt(10);
        int num3 = aleatorio.nextInt(10);
        int num4 = aleatorio.nextInt(10);

        String[] numArray1 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        

        String numeroMatricula = numArray1[num1] + numArray1[num2] + numArray1[num3] + numArray1[num4];
        matricula = numeroMatricula + letrasMatricula;
        
        //GENERAR MARCA Y MODELO ALEAOTORIOS:
        int numMarca = aleatorio.nextInt(4);
        int numModelo = aleatorio.nextInt(3);
        switch (numMarca) {
            case 0:
                marca = "Seat";
                switch (numModelo) {
                    case 0:
                        modelo = "León";
                        break;
                    case 1:
                        modelo = "Ibiza";
                        break;
                    case 2:
                        modelo = "Toledo";
                        break;
                    case 3:
                        modelo = "Córdoba";
                        break;
                }
                break;
            case 1:
                marca = "Ford";
                switch (numModelo) {
                    case 0:
                        modelo = "Focus";
                        break;
                    case 1:
                        modelo = "Mondeo";
                        break;
                    case 2:
                        modelo = "Fiesta";
                        break;
                    case 3:
                        modelo = "Edge";
                        break;
                }
                break;

            case 2:
                marca = "Peugeot";
                switch (numModelo) {
                    case 0:
                        modelo = "208";
                        break;
                    case 1:
                        modelo = "308";
                        break;
                    case 2:
                        modelo = "5008";
                        break;
                    case 3:
                        modelo = "508";
                        break;
                }
                break;
            case 3:
                marca = "Opel";
                    switch (numModelo) {
                    case 0:
                        modelo = "Atra";
                        break;
                    case 1:
                        modelo = "Corsa";
                        break;
                    case 2:
                        modelo = "Insignia";
                        break;
                    case 3:
                        modelo = "Cabrio";
                        break;
                }
                break;
            case 4:
                marca = "Renault";
                                switch (numModelo) {
                    case 0:
                        modelo = "Clio";
                        break;
                    case 1:
                        modelo = "Captur";
                        break;
                    case 2:
                        modelo = "Megane";
                        break;
                    case 3:
                        modelo = "Scenic";
                        break;
                }
                break;
        }

        //GENERAR COLOR ALEATORIO:
        int numColor = aleatorio.nextInt(4);
        switch (numColor) {
            case 0:
                color = "Blanco";
                break;
            case 1:
                color = "Negro";
                break;
            case 2:
                color = "Verde";
                break;
            case 3:
                color = "Azul";
                break;
            case 4:
                color = "Rojo";
                break;
        }       
          //GENERAR TARIFA ALEATORIA
          tarifa = aleatorio.nextInt(10);
          
          //GENERAR DISPONIBILIDAD ALEATORIA
          disponible = aleatorio.nextBoolean();
          Vehiculo v = new Vehiculo(matricula, marca, modelo, color, tarifa, disponible);
          return v;
    } 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

}
