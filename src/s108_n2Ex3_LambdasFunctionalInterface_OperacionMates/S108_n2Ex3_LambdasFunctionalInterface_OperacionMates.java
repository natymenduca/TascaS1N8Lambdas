package s108_n2Ex3_LambdasFunctionalInterface_OperacionMates;

public class S108_n2Ex3_LambdasFunctionalInterface_OperacionMates {

	public static void main(String[] args) {
		    Operacion suma = (a, b) -> a + b;
		    Operacion resta = (a, b) -> a - b;
		    Operacion multiplicacion = (a, b) -> a * b;
		    Operacion division = (a, b) -> a / b;
		    
		    float resultadoSuma = suma.operacion(10, 5);
		    float resultadoResta = resta.operacion(10, 5);
		    float resultadoMultiplicacion = multiplicacion.operacion(10, 5);
		    float resultadoDivision = division.operacion(10, 5);
		    
		    System.out.println(resultadoSuma);
		    System.out.println(resultadoResta);
		    System.out.println(resultadoMultiplicacion);
		    System.out.println(resultadoDivision);
		
		
		
		
	}

}
