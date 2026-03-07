package miPrincipal;

import miPrincipal.dominio.ControlCalidad;
import miPrincipal.dominio.SistemaElectrico;
import miPrincipal.dominio.SistemaMotor;
import miPrincipal.dominio.SistemaSoldadura;
import miPrincipal.fachadas.EnsambladorVehiculo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnsambladorVehiculoTest {

    private SistemaSoldadura soldadura;
    private SistemaMotor motor;
    private SistemaElectrico electrico;
    private ControlCalidad calidad;
    private EnsambladorVehiculo ensamblador;

    @Before
    public void setUp() {
        soldadura = new SistemaSoldadura();
        motor = new SistemaMotor();
        electrico = new SistemaElectrico();
        calidad = new ControlCalidad();
        ensamblador = new EnsambladorVehiculo(soldadura, motor, electrico, calidad);
    }

    @Test
    public void debeActivarSoldaduraDuranteEnsamble() {
        ensamblador.iniciarEnsamble();
        assertTrue(soldadura.isSoldado());
    }

    @Test
    public void debeInstalarMotorDuranteEnsamble() {
        ensamblador.iniciarEnsamble();
        assertTrue(motor.isInstalado());
    }

    @Test
    public void debeCablearSistemaElectricoDuranteEnsamble() {
        ensamblador.iniciarEnsamble();
        assertTrue(electrico.isCableado());
    }

    @Test
    public void debeGenerarReporteDeCalidadAlFinalizar() {
        ensamblador.finalizarEnsamble();
        String reporte = ensamblador.obtenerReporteCalidad();
        assertNotNull(reporte);
        assertFalse(reporte.isEmpty());
    }
}
