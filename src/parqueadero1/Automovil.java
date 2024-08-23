/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero1;

import java.time.LocalDateTime;


public class Automovil extends Vehiculo {
    
    private String tipoCombustible;

    public Automovil() {
    }

    public Automovil(String tipoCombustible, String placa, String marca, String modelo, LocalDateTime horaEntrada) {
        super(placa, marca, modelo, horaEntrada);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public double getTarifaPorHora(){
        return 10.0;
    }
    
    
    
}
