package miPrincipal.adaptadores;

/**
 * Adapter (objetual por composición) – traduce la interfaz moderna IRobotIndustrial
 * a las llamadas del robot legacy ABB.
 *
 * Traducciones:
 *   ejecutarTarea(String)  →  performTask(String)
 *   obtenerEstado()        →  getStatus()
 *   obtenerEficiencia()    →  getEfficiencyPercent() / 100.0
 */
public class RobotABBAdapter implements IRobotIndustrial {


    public RobotABBAdapter(RobotLegacyABB robot) {
        
    }

    @Override
    public void ejecutarTarea(String tarea) {
        
    }

    @Override
    public String obtenerEstado() {
        return "";
    }

    @Override
    public double obtenerEficiencia() {
        return 0;
    }
}
