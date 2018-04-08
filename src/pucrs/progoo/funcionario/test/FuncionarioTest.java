package pucrs.progoo.funcionario.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import pucrs.progoo.funcionario.Funcionario;

public class FuncionarioTest {

    private Funcionario func;

    @Before
    public void setUp() {
        func = new Funcionario(200, "Ze", 1900.0);
    }

    @Test
    public void testGetSalarioLiquidoMenosQue2000() {
        double expected = 1710;
        double actual = func.getSalarioLiquido();
        assertEquals(expected, actual , 0.1);
    }

    @Test
    public void testGetSalarioLiquidoIgual2000() {
        func.setSalarioBase(2000.0);
        double expected = 1800; // ERRO!
        double actual = func.getSalarioLiquido();
        assertEquals(expected, actual , 0.1);        
    }

    @Test
    public void testGetSalarioLiquidoMaior2000() {
        func.setSalarioBase(3000.0);
        double expected = 2580;
        double actual = func.getSalarioLiquido();
        assertEquals(expected, actual , 0.1);
    }
}