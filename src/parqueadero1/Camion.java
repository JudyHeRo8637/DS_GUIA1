/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero1;

import java.time.LocalDateTime;


public class Camion extends Vehiculo {
    
    private int cilindraje;

    public Camion() {
    }

    public Camion(int cilindraje, String placa, String marca, String modelo, LocalDateTime horaEntrada) {
        super(placa, marca, modelo, horaEntrada);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
     public double getTarifaPorHora(){
        return 20.0;
    }
    
}
