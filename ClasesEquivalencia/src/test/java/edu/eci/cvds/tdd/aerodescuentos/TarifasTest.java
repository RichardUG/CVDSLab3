package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;


public class TarifasTest {
    @Test
    public void validateEdadCorrecta(){
        double tarifaBase = 50000;
        int diasAntelacion = 21;
        int edad = 20;
        double ans = 42500.0;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertTrue(ans == tarifa);
    }
    @Test
    public void validateEdadIncorrecta(){
        double tarifaBase = 50000;
        int diasAntelacion = 0;
        int edad = -1;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals("ExcepcionParametrosInvalidos",tarifa);
    }
    @Test
    public void validateDiasantelacionCorrecta(){
        double tarifaBase = 50000;
        int diasAntelacion = 16;
        int edad = 20;
        double ans = 50000.0;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertTrue(ans == tarifa);
    }
    @Test
    public void validateDiasantelacionIncorrecta(){
        double tarifaBase = 50000;
        int diasAntelacion = -2;
        int edad = 50;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals("ExcepcionParametrosInvalidos",tarifa);
    }
    @Test
    public void validateTarifaBaseCorrecta(){
        double tarifaBase = 50000;
        int diasAntelacion = 80;
        int edad = 80;
        double ans = 38500.0;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertTrue(ans == tarifa);
    }
    @Test
    public void validateTarifaBaseIncorrecta(){
        double tarifaBase = 0;
        int diasAntelacion = 80;
        int edad = 80;
        double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals("ExcepcionParametrosInvalidos",tarifa);
    }

}
