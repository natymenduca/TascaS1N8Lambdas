package s108_n1Ex4_LambdasImprimeMesesForEach;

import java.util.Arrays;
import java.util.List;
public class S108_n1Ex4_LambdasImprimeMesesForEach {

	public static void main(String[] args) {
		
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septiembre", "Octubre", "Noviembre", "Diciembre");
		meses.forEach(System.out::println);/*La expresión lambda System.out::println es equivalente a la función anónima (String s) -> System.out.println(s),
		                                    que toma un String como entrada y lo imprime en la consola*/
	}
}
