package miPrincipal.fachadas;

/**
 * Facade – oculta la complejidad del proceso de ensamblado automotriz
 * detrás de tres operaciones simples: iniciarEnsamble(), finalizarEnsamble()
 * y obtenerReporteCalidad().
 *
 * Los subsistemas se inyectan por constructor para facilitar las pruebas unitarias.
 */
public class EnsambladorVehiculo {

    public EnsambladorVehiculo(SistemaSoldadura soldadura, SistemaMotor motor,
                               SistemaElectrico electrico, ControlCalidad calidad) {
    }

    public void iniciarEnsamble() {
        
    }

    public void finalizarEnsamble() {
        
    }

    public String obtenerReporteCalidad() {
        
    }
}
