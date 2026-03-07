package miPrincipal.dominio;

/**
 * Target – interfaz moderna que el sistema de gestión de línea de producción conoce.
 */
public interface IRobotIndustrial {
    void ejecutarTarea(String tarea);
    String obtenerEstado();
    double obtenerEficiencia();
}
