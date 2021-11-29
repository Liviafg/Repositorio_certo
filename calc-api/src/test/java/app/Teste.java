package app;

import io.jooby.annotations.*;

public class Testesoma {
@Path(/soma/{operador1}/{operador2})
@GET

public String rotaSoma (@PathParamString operador1, @PathParamString operador2) {
    return "Soma";
}

public void Soma () {
     
    Float.parseFloat (operador1);
    Float.parseFloat (operador2);

    float resultado; 

    resultado = operador1 + operador2;
    return operador1;
    return operador2;
    return resultado; 

}
}
