package miPrincipal;

import miPrincipal.adaptadores.RobotFANUCAdapter;
import miPrincipal.dominio.IRobotIndustrial;
import miPrincipal.dominio.LineaDeProduccion;
import miPrincipal.dominio.RobotLegacyFANUC;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotFANUCAdapterTest {

    /**
     * Verifica que LineaDeProduccion (Client) funciona de forma idéntica con el
     * robot FANUC adaptado, demostrando que el Target IRobotIndustrial es reutilizable
     * con múltiples Adaptees sin cambiar el Client.
     */
    @Test
    public void debeAdaptarRobotFANUCEnLineaDeProduccion() {
        RobotLegacyFANUC fanuc = new RobotLegacyFANUC();
        IRobotIndustrial adapter = new RobotFANUCAdapter(fanuc);
        LineaDeProduccion linea = new LineaDeProduccion("TestFANUC", adapter);
        linea.operar("Pintado de carrocería");
        assertEquals("OPERATIVO", adapter.obtenerEstado());
    }
}
