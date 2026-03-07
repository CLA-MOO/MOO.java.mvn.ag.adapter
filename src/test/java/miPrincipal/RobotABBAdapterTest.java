package miPrincipal;

import miPrincipal.adaptadores.RobotABBAdapter;
import miPrincipal.dominio.IRobotIndustrial;
import miPrincipal.dominio.LineaDeProduccion;
import miPrincipal.dominio.RobotLegacyABB;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotABBAdapterTest {

    @Test
    public void debeEjecutarTareaLegacyViaAdapter() {
        RobotLegacyABB abb = new RobotLegacyABB();
        RobotABBAdapter adapter = new RobotABBAdapter(abb);
        adapter.ejecutarTarea("Soldadura");
        assertNotNull(adapter.obtenerEstado());
    }

    @Test
    public void debeTraducirEstadoDelRobot() {
        RobotLegacyABB abb = new RobotLegacyABB();
        RobotABBAdapter adapter = new RobotABBAdapter(abb);
        adapter.ejecutarTarea("Prueba de estado");
        assertEquals(abb.getStatus(), adapter.obtenerEstado());
    }

    @Test
    public void debeConvertirEficienciaASistemaModerno() {
        RobotLegacyABB abb = new RobotLegacyABB();
        RobotABBAdapter adapter = new RobotABBAdapter(abb);
        double esperado = abb.getEfficiencyPercent() / 100.0;
        assertEquals(esperado, adapter.obtenerEficiencia(), 0.001);
    }

    @Test
    public void debePermitirLineaProduccionUsarRobotLegacy() {
        RobotLegacyABB abb = new RobotLegacyABB();
        IRobotIndustrial adapter = new RobotABBAdapter(abb);
        LineaDeProduccion linea = new LineaDeProduccion("TestABB", adapter);
        linea.operar("Pintura");
        assertEquals("OPERATIVO", adapter.obtenerEstado());
    }
}
