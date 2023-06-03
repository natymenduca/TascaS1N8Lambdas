package s108_n3Ex1_LambdasAlumnos_Lista;

public class Alumno {
	 private String nombre;
	    private int edad;
	    private String curso;
	    private double nota;

	    public Alumno(String nombre, int edad, String curso, double nota) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.curso = curso;
	        this.nota = nota;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public String getCurso() {
	        return curso;
	    }

	    public double getNota() {
	        return nota;
	    }


}
