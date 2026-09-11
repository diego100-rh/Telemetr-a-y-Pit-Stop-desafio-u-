package racing.entidades;
import java.util.Random;

public class AutoCarrera {
    private String modelo;
    private int combustible;
    private int integridadNeumaticos;



    public AutoCarrera(String modelo){
        this.modelo = modelo;
        this.combustible = 100;
        this.integridadNeumaticos = 100;
    }

    public void darVuelta(){
        System.out.println("Ejecutando Vuelta... ");
        java.util.Random rand = new java.util.Random();

        int desgasteCombustible = rand.nextInt((20-10)+1) + 10;
        int desgasteNeumaticos = rand.nextInt((25-15)+1)+15;

        this.combustible = this.combustible -desgasteCombustible;
        this.integridadNeumaticos = this.integridadNeumaticos - desgasteCombustible;

        if (combustible < 0){
             this.combustible = 0;
            System.out.println("Sin combustible disponible:" + combustible+"%");

        } if (integridadNeumaticos < 0) {
            this.integridadNeumaticos = 0;
            System.out.println("Desgaste de los neumaticos demaciado alto no es seguro realizar la vuelta" +integridadNeumaticos+"%");
        }

        System.out.println("Vuelta finalizada -> Combustible: " + this.combustible + "% | Neumáticos: " + this.integridadNeumaticos + "%");

    }
}
