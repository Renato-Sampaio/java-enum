package teste;

import util.Cursos;

/**
 * Classe responsvel por demonstrar a utilização de ENUM
 * @author Renato Duarte Sampaio
 *
 * @since 7 de abr. de 2021
 * @version 1.0
 */
public class TestaEnum {


	public static void main(String[] args) {
		System.out.println("Curso de "+ Cursos.JAVA + " Duração de " + Cursos.JAVA.getHoras()+ " no periodo " + Cursos.JAVA.getPeriodo());
		System.out.println(Cursos.COBOL);
		System.out.println(Cursos.PHP);
		System.out.println(Cursos.UNITY);
		
		

	}

}
