import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getMoto() {
    }

    @Test
    void calcularTiempoMoto() {
        Moto moto = new Moto("Ejemplo");
        double autoV = 40;
        //VARIABLE A PROBRAR
        double distancia = 100;         // Distancia en kilómetros
        double tiempoEsperado = 2.5;
        double tiempoCalculado = distancia/autoV;

        assertEquals(tiempoEsperado, tiempoCalculado, 0.01);
    }
}