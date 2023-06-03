package s108_n1Ex3_LambdasImprimeMesesAño;

import java.util.Arrays;
import java.util.List;

public class S108_n1Ex3_LambdasImprimeMesesAño {

	public static void main(String[] args) {
		
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
		meses.forEach(mes -> System.out.println(mes));/*La función lambda es "mes -> System.out.println(mes)", significa que para cada elemento de la lista, se imprimirá en una línea separada*/
	}

}
