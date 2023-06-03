package s108_n3Ex1_LambdasAlumnos_Lista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S108_n3Ex1_LambdasAlumnos_Lista {

	public static void main(String[] args) {
		List<Alumno> alumnos = Arrays.asList(
				new Alumno("Ana", 20, "Java", 4.0),
				new Alumno("Maria", 20, "PHP", 3.5),
				new Alumno("Romina", 27, "Java", 10.0),
				new Alumno("Silvia", 28, "Python", 7.5),
				new Alumno("Pau", 23, "Java", 9.0),
				new Alumno("Jordi", 23, "PHP", 8.0),
				new Alumno("Natalia", 49, "Python", 8.0),
				new Alumno("Miguel Angel", 36, "Java", 8.5),
				new Alumno("Dani", 33, "PHP", 7.5),
				new Alumno("Nuria",42, "Java", 7.0)
				);
		// Ej 3 Se debe mostrar por pantalla el nombre y la edad de cada alumno/a
		System.out.println("Ejercicio 3");
		alumnos.forEach(a -> System.out.println(a.getNombre() + " - " + a.getEdad()));

		/* Ej 4 Se debe filtrar la lista por todos los alumnos que su nombre empieza por ‘a’. 
		Asignar a estos alumnos a otra lista y mostrar por pantalla la nueva lista (todo con lambdas)*/
		System.out.println("\nEjercicio 4");
		List<Alumno> alumnosConA = alumnos.stream()
				.filter(a -> a.getNombre().toLowerCase().startsWith("a"))
				.collect(Collectors.toList());
		alumnosConA.forEach(a -> System.out.println(a.getNombre()));

		// Eje 5 Se debe filtrar y mostrar por pantalla los alumnos que tienen una nota de 5 o superior
		System.out.println("\nEjercicio 5");
		alumnos.stream()
		.filter(a -> a.getNota() >= 5.0)
		.forEach(a -> System.out.println(a.getNombre()));

		// Ej 6 Se debe filtrar y mostrar por pantalla los alumnos que tienen una nota de 5 o más, y que no son de PHP
		System.out.println("\nEjercicio 6");
		alumnos.stream()
		.filter(a -> a.getNota() >= 5.0 && !a.getCurso().equals("PHP"))
		.forEach(a -> System.out.println(a.getNombre()));

		// Ej 7 Se deben mostrar todos los alumnos que hacen JAVA y son mayores de edad
		System.out.println("\nEjercicio 7");
		alumnos.stream()
		.filter(a -> a.getCurso().equals("Java") && a.getEdad() >= 18)
		.forEach(a -> System.out.println(a.getNombre()));
	}

}

