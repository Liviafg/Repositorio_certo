import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class Somateste {

     Soma soma;

    @BeforeEach

public void SetUp () { 

       soma = new Soma ();

       System.out.println ("Iniciando teste...");

}
    @Test

    public void Test_soma_dá_certo () {

        assertEquals(5+2, soma.Soma("7."));
    }

     public void tearDown () {

         System.out.println ("Teste finalizado.");
     }

    
}