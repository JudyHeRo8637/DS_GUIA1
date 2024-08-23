/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;



public class ParqueaderoList {
    
   private List<Vehiculo> vehiculos;
    
   public void parqueaderoList(){
       vehiculos = new ArrayList<>();
   } 
   
   //metodo para registrar el vehiculo
   public void registrarEntrada(Vehiculo vehiculo) {
       if(consultarVehiculo(vehiculo.getPlaca()) == null){
           vehiculo.setHoraEntrada(LocalDateTime.now());//establece la hora de entrada
           vehiculos.add(vehiculo);//agrega el vehiculo a la lista
           System.out.println("Entrada registrada para; "+ vehiculo.getPlaca());
       }
       else{
           System.out.println("El veiculo ya se encuentra registrado en el parqueadero");
       }
   }
   
   //metodo para registrar la salida del vehiculo
       public double registrarSalida(String placa) {
           Vehiculo vehiculo = consultarVehiculo(placa);
           if(vehiculo != null){
               vehiculos.remove(vehiculo);//Elimina el vehiculo de la lista
               LocalDateTime tiempoEntrada = vehiculo.getHoraEntrada();
               LocalDateTime tiempoSalida = LocalDateTime.now();
               double totalPagar = calcularTarifa(tiempoEntrada, tiempoSalida, vehiculo.getTarifaPorHora());
               System.out.println("Salida registrada para: %s%n"+ placa);
               System.out.println("Total a pagar: $%.2f%n" + totalPagar);
               return totalPagar;
           }else{
               System.out.println("El vehiculo no se encuentra en el parqueadero.");
               return 0;
           }
   }
       
    //metodo para calcular la tarifaen funcion del tiuempo transcurrido
       private double calcularTarifa(LocalDateTime tiempoEntrada, LocalDateTime tiempoSalida,double tarifaHora){
           Duration duracion = Duration.between(tiempoEntrada, tiempoSalida);
           double duracionHoras = duracion.toMinutes() / 60.0;
           return Math.ceil(duracionHoras)* tarifaHora;
       }
       
   //Metodo para verificar si un vehiculo esta en el parqueadero
       private Vehiculo consultarVehiculo(String placa){
           for(Vehiculo v : vehiculos){
               if(v.getPlaca().equals(placa)){
                   return v;
               }
           }
           return null;
       }
              
   //Metodo para obtener la lista de vehiculos en el parquedero
       public List<Vehiculo> obtenerVehiculos(){
           return new ArrayList<>(vehiculos);
       }
       
   //Metodo para obtener numero de vehiculos en el parquedero
       public int contarvehiculos(){
           return vehiculos.size();
       }

}  


 
