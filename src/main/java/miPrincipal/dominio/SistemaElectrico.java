package miPrincipal.dominio;

/** Subsistema de la Fachada: gestiona el cableado eléctrico del vehículo. */
public class SistemaElectrico {

    private boolean cableado = false;

    public void cablear() {
        this.cableado = true;
        System.out.println("  [SistemaElectrico] Cableado eléctrico completado");
    }

    public boolean isCableado() {
        return cableado;
    }
}
