package app;

import io.jooby.annotations.*;

public class Soma {
@Path("/soma/{operador1}/{operador2}")
@GET

public String rotaSoma (@PathParam String operador1, @PathParam String operador2) {
     
    float recebe_op1 = Soma(operador1);
    float recebe_op2 = Soma(operador2);
    float resultado; 

    resultado = operador1 + operador2;

    System.out.println ("A soma dos dois numeros e: %.2f", resultado);
}
}