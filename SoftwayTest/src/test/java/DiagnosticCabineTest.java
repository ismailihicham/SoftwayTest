

import com.softwayMedical.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class DiagnosticCabineTest {

    private PathologyDiscovery pathologyDiscoveryMock;
    private DiagnosticCabine diagnosticCabine;


    @Test
    public void testDiagnosticCardiology() {
        pathologyDiscoveryMock = new CardiologiePathologie();
        diagnosticCabine = new DiagnosticCabine(pathologyDiscoveryMock);
        String result = diagnosticCabine.diagnostic(55);

        assertEquals("Cardiologie", result);
    }

    @Test
    public void testDiagnosticTraumatology() {
        pathologyDiscoveryMock = new TraumatologiePathologie();
        diagnosticCabine = new DiagnosticCabine(pathologyDiscoveryMock);
        String result = diagnosticCabine.diagnostic(33);

        assertEquals("Traumatologie", result);
    }

    @Test
    public void testDiagnosticTraumatologyAndPathology() {
        pathologyDiscoveryMock = new MultiplePathologie();
        diagnosticCabine = new DiagnosticCabine(pathologyDiscoveryMock);
        String result = diagnosticCabine.diagnostic(15);

        assertEquals("Traumatologie and Cardiologie", result);
    }

    @Test
    public void shouldThrowExceptionWhenIndexInvalid() {
        pathologyDiscoveryMock = new MultiplePathologie();
        diagnosticCabine = new DiagnosticCabine(pathologyDiscoveryMock);
        var thrown = assertThrows(IllegalArgumentException.class, () -> diagnosticCabine.diagnostic(-3));

        assertEquals("Invalid capteur index", thrown.getMessage());
    }
}
