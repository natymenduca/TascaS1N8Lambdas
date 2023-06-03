package s108_n1Ex8_LambdasCadenasInversasReverso;

import s108_n1Ex8_LambdasCadenasInversasReverso.Reverso;

public class S108_n1Ex8_LambdasCadenasInversasReverso {

	public static void main(String[] args) {
		/* En el main() de la clase principal, inyecta a la interfaz creada mediante una lambda, 
		 * el cuerpo del método,de forma que vuelva la misma cadena que recibe como parámetro pero 
		 * a la inversa.Invoca la instancia de la interfaz pasándole una cadena y comprueba si el 
		 * resultado es correcto*/
		 Reverso reverso = s -> new StringBuilder(s).reverse().toString();
		    String cadena = "Julio mi mes";
		    String cadenaInversa = reverso.reverso(cadena);
		    System.out.println(cadenaInversa); // imprimira "oiluj"
		}
		
		
	}

