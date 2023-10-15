import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAuto() {
    }

    @Test
    void calcularTiempoAuto() {
        Auto auto = new Auto("Ejemplo");
        double autoV = 20; //Variable que no se cambia
        //VARIABLE A PROBRAR
        double distancia = 100;         // Distancia en kilómetros
        double tiempoEsperado = 5.0;    // Tiempo esperado en horas (para una velocidad de 20 km/h)
        double tiempoCalculado = distancia/autoV;

        assertEquals(tiempoEsperado, tiempoCalculado, 0.01); // Aceptamos un margen de error de 0.01 horas
    }
}