package racing.servicios;

import racing.entidades.AutoCarrera;

public class PipStop {
    public void asistir (AutoCarrera auto){
        System.out.println("\n==== [PIT STOP] =====");
        System.out.println("Vehiculo de modelo" +auto.getModelo()+ "recibido revisando... ");
        System.out.println("Estado actual de combustible:" +auto.getCombustible()+"%");
        System.out.println("Neumaticos al "+auto.getIntegridadNeumaticos()+"de capacidad");

        auto.setCombustible(100);
        auto.setIntegridadNeumaticos(100);
        System.out.println("Mantenimiento finalizado exitosamente.");
        System.out.println("Estado Actual -> Combustible: " + auto.getCombustible() + "% ,  Neumáticos: " + auto.getIntegridadNeumaticos() + "%");
        System.out.println("================================================\n");

    }



}
