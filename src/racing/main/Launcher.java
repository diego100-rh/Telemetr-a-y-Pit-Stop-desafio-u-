package racing.main;
import racing.entidades.AutoCarrera;
import racing.servicios.PitStop;

public class Launcher {
    public static void main (String[] args){
        AutoCarrera autoDisponible = new AutoCarrera("Toyota");
        PitStop mecanicos = new PitStop();
        System.out.println("=== INICIANDO CARRERA DE 5 VUELTAS ===\n");
        for(int i =1; i <= 5; i++){
            System.out.println("--- Vuelta " + i + " ---");
            // El auto da la vuelta y gasta sus recursos internamente
            autoDisponible.darVuelta();
            if (autoDisponible.getCombustible() < 0 || autoDisponible.getIntegridadNeumaticos() < 0){
                //llamar a los mecanicos definidos
                mecanicos.asistir(autoDisponible);

            }
        }

        System.out.println("=== CARRERA FINALIZADA ===");
        System.out.println("\n :) ");
    }
}
