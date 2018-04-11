package irpf;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;




public class IrpfTest {
	private Irpf a1;
	private Irpf a2;
	private Irpf a3;

    @Before
    public void setUp() {
        
        a1 = new Irpf("Joao", "000.000.006-00");
        a2 = new Irpf("Maria", "000.000.006-01");
        a3 = new Irpf("Jose", "000.000.006-02");
    }
    @Test
    public void testTotRendimentos() {
    	
        a1.setTotRendimentos(10000);
       
        assertEquals(10000, (long)a1.getTotRendimentos());
    }
    @Test
    public void testContrPrev() {
    	
        a1.setContrPrev(1000);;
       
        assertEquals(1000, (long)a1.getContrPrev());
    }
    @Test
    public void testNroDep() {
    	
        a1.setNroDep(5);;
       
        assertEquals(5, (long)a1.getNroDep());
    }
    @Test
    public void testIdade() {
    	
        a1.setIdade(30);;
       
        assertEquals(30, (long)a1.getIdade());
    }
    @Test
    public void testImpostoDevidoBCMenor10000() {
    	a1.setTotRendimentos(10000);
    	
    	
    	a1.setContrPrev(1000);
    	
    	a1.setNroDep(0);
    	
    	a1.setIdade(30);
    	
    	assertEquals(0, (long)a1.impostoDevido());
    	
    }
    @Test
    public void testImpostoDevidoBCMaior10000eMenor20000() {
    	
    	a2.setTotRendimentos(20000);
    	
    	
    	a2.setContrPrev(2000);
    	
    	a2.setNroDep(3);
    	
    	a2.setIdade(60);
    	
    	
    	assertEquals(1065, (long)a2.impostoDevido());
    	
    }
    @Test
    public void testImpostoDevidoBCMaior20000() {
    	
    	a3.setTotRendimentos(30000);
    	
    	a3.setContrPrev(3000);
    	
    	a3.setNroDep(7);
    	
    	a3.setIdade(70);
    	
    	assertEquals(3114, (long)a3.impostoDevido());
    }
	
}
