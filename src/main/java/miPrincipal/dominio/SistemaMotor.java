package miPrincipal.dominio;

/** Subsistema de la Fachada: gestiona la instalación del motor. */
public class SistemaMotor {

    private boolean instalado = false;

    public void instalarMotor() {
        this.instalado = true;
        System.out.println("  [SistemaMotor] Motor V6 instalado");
    }

    public boolean isInstalado() {
        return instalado;
    }
}
