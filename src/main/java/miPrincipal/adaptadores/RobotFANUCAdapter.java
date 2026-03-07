package miPrincipal.adaptadores;

import miPrincipal.dominio.IRobotIndustrial;
import miPrincipal.dominio.RobotLegacyFANUC;

/**
 * Adapter (objetual por composición) – traduce la interfaz moderna IRobotIndustrial
 * a las llamadas del robot legacy FANUC, cuya interfaz difiere significativamente de ABB.
 *
 * Traducciones:
 *   ejecutarTarea(String)  →  activate(String)
 *   obtenerEstado()        →  readState() mapeado: 0→"INACTIVO", 1→"OPERATIVO", 2→"ERROR"
 *   obtenerEficiencia()    →  (double) powerLevel()   [float→double]
 */
public class RobotFANUCAdapter implements IRobotIndustrial {

   

    public RobotFANUCAdapter(RobotLegacyFANUC robot) {
       
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
