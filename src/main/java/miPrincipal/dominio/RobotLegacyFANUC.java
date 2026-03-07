package miPrincipal.dominio;

/**
 * Adaptee 2 – robot industrial legacy FANUC con interfaz deliberadamente distinta a ABB:
 * - activate() en lugar de performTask()
 * - estado como código entero (0=inactivo, 1=en operación, 2=error)
 * - potencia como float entre 0.0f y 1.0f en lugar de porcentaje entero
 */
public class RobotLegacyFANUC {

    private int state = 0;
    private float power = 0f;

    public void activate(String command) {
        this.state = 1;
        this.power = 0.92f;
        System.out.println("[RobotLegacyFANUC] activate ejecutado: " + command);
    }

    /** Retorna 0=inactivo, 1=en operación, 2=error */
    public int readState() {
        return state;
    }

    /** Retorna potencia normalizada entre 0.0f y 1.0f */
    public float powerLevel() {
        return power;
    }
}
