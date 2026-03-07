package miPrincipal.dominio;

/**
 * Adaptee 1 – robot industrial legacy ABB con interfaz incompatible:
 * nombres en inglés y eficiencia expresada como porcentaje entero (0-100).
 */
public class RobotLegacyABB {

    private String taskResult;

    public void performTask(String task) {
        this.taskResult = "OPERATIVO";
        System.out.println("[RobotLegacyABB] performTask ejecutado: " + task);
    }

    public String getStatus() {
        return taskResult != null ? taskResult : "INACTIVO";
    }

    public int getEfficiencyPercent() {
        return 87;
    }
}
