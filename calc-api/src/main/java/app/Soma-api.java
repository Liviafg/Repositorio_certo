package app;

import io.jooby.annotations.*;

public class Soma {
@Path(/soma/{operador1}/{operador2})
@GET

public String rotaSoma (@PathParamString operador1,@PathParamString operador2) {
    return "Soma";
}
public void Soma () {
     
    Float.parseFloat (operador1);
    Float.parseFloat (operador2);

    float resultado; 

    resultado = operador1 + operador2;

    System.out.println ("A soma dos dois numeros e: %.2f", resultado);
}
}