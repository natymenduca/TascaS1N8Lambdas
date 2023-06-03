package s108_n2Ex2_LambdasIntegerCadena_Comas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class s108_n2Ex2_LambdasIntegerCadena_Comas {

	public static void main(String[] args) {
		List<Object> lista = Arrays.asList("o1", "e2","o3", "e4");//La lista contiene 6 elem, diferentes tipos de datos, incluyendo cadenas y enteros
		List<Object> sortedList = lista.stream()
				 .sorted(Comparator.comparing(String::valueOf))
				 .collect(Collectors.toList());
		System.out.println(sortedList);	
	}

}
