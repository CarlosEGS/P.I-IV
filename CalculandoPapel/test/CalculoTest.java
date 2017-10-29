

import java.util.Objects;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculoTest {
    
    public Calculo c;

    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Calculo();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of somaDivisao method, of class Calculo.
     */
    @Test
    public void testSomaDivisao() {
        assertEquals(4, c.somaDivisao(200, 200));
       
    }

    
    @Test
    public void testsomaMutiplicacao() {
        assertEquals(8, c.somaDivisaoMutiplicacao(200, 200, 2));
        
    }

    
    @Test
    public void testsomaDivisaoMutiplicacaoDivisao() {
        assertEquals(4, c.somaDivisiaoMutiplicacaoDivisao(200, 200, 2, 2));
       
    }

    
    @Test
    public void testRetornaGetAltura() {
    System.out.println("Retorna a Altura");
    Calculo c = new Calculo();
    float retorna = 40f;
    float resultado = c.getAltura();
    assertEquals(retorna, resultado);
    
    }
    
    @Test
    public void testEnviaSetAltura() {
        System.out.println("Enviar quantidade de etiquetas");
        float envia = 40f;
        Calculo c = new Calculo();
        c.setEtiquetasUnidades(envia);
        assertEquals(c.getAltura(), envia);
   
     
    }
       

    
    @Test
    public void testEnviaSetAlturaMedia() {
        System.out.println("Enviar quantidade de etiquetas");
        float envia = 2f;
        Calculo c = new Calculo();
        c.setEtiquetasUnidades(envia);
        assertEquals(c.getAlturaMedia(), envia);
   
     
    }

    
    @Test
    public void testRetornaGetAlturaMedia() {
    System.out.println("Retorna a Altura Media");
    Calculo c = new Calculo();
    float retorna = 2f;
    float resultado = c.getEtiquetasUnidades();
    assertEquals(retorna, resultado);
        
    }
   
    @Test
    public void testRetornaGetMontagemLateral() {
        System.out.println("Retorna a Montagem Lateral");
        Calculo c = new Calculo();
        float retorna = 3f;
        float resultado = c.getAltura();
        assertEquals(retorna, resultado);
        
    }

  
    @Test
    public void testEnviaSetMontagemLateral() {
        System.out.println("Enviar Montagem Lateral");
        float envia = 3f;
        Calculo c = new Calculo();
        c.setEtiquetasUnidades(envia);
        assertEquals(c.getEtiquetasUnidades(), envia);

    }

    
    @Test
    public void testRetornaGetEtiquetasUnidades() {
        System.out.println("Retorna a quantidade de etiquetas por unidade ");
        Calculo c = new Calculo();
        float retorna = 100f;
        float resultado = c.getAltura();
        assertEquals(retorna, resultado);
      
    }

    
    @Test
    public void testSetEtiquetasUnidades() {
        System.out.println("Enviar quantidade de etiquetas");
        float envia = 100f;
        Calculo c = new Calculo();
        c.setEtiquetasUnidades(envia);
        assertEquals(c.getEtiquetasUnidades(), envia);
        
    }
    
}
