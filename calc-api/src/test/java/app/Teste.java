import io.jooby.annotations.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Somateste {

   @Test

public void testSomacomdoiszeros () {

    @BeforeEach

    public void SetUp () {

    Soma soma = new Soma ();

        System.out.println ("Iniciando teste");

    }
    
    float zero = soma.Igualazero();

     assertEquals(soma, soma.Soma("0"));

     public void tearDown () {
         System.out.println ("Teste finalizado");
     }

    }
}