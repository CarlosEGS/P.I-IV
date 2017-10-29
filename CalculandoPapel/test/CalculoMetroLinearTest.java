

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author T-Gamer
 */
public class CalculoMetroLinearTest extends CalculoMetroLinear {
    
    public CalculoMetroLinearTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testMain() {
        System.out.println("Janela de interação com o cliente");
        String[] args = null;
        CalculoMetroLinear.main(args);
        
    }
    
    @Test
    public void jButton1ActionPerformedValores(){
        System.out.println("Depos que clicado, deve aparecer o valor final para o cliente");
        Calculo c = new Calculo();
        c.
        float resultado = c.getEtiquetasUnidades();
        assertEquals(retorna, resultado);
    }
    
}
