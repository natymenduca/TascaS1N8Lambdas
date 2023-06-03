package s108_n2Ex1_AMayuscula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s108_n2Ex1_AMayuscula {
    
	public static void main(String[] args) {
	
		List<String> nombresPropios = Arrays.asList("Natalia", "Sara","Alex","Lua");//Se crea una lista de nombres propios con el método asList de la clase Arrays
		List<String> resultado = nombresPropios.stream()
			    .filter(s -> s.startsWith("A") && s.length() == 4)/*filter utiliza una expresión lambda que evalúa  si el elem s comienza con la letra "A" y tiene una long de 4*/
			    .collect(Collectors.toList());//se utiliza el método toList de la clase Collectors para crear una lista de tipo ArrayList*/
			System.out.println(resultado);

     }
}
