/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero1;

import java.time.LocalDateTime;


public class Motocicleta extends Vehiculo {
    
    private double capacidadCarga;

    public Motocicleta() {
    }

    public Motocicleta(double capacidadCarga, String placa, String marca, String modelo, LocalDateTime horaEntrada) {
        super(placa, marca, modelo, horaEntrada);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
     public double getTarifaPorHora(){
        return 5.0;
    }
    
}
