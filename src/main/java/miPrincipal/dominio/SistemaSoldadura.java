package miPrincipal.dominio;

/** Subsistema de la Fachada: gestiona la soldadura del chasis. */
public class SistemaSoldadura {

    private boolean soldado = false;

    public void soldarChasis() {
        this.soldado = true;
        System.out.println("  [SistemaSoldadura] Chasis soldado correctamente");
    }

    public boolean isSoldado() {
        return soldado;
    }
}
