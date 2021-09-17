package org.danicv.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EjemploCalcularEdad {

	public static void main(String[] args) {
		LocalDate fechaActual = LocalDate.now();
		Scanner teclado = new Scanner(System.in);
		String fechaNacimiento;
		System.out.println("Ingrese la fecha de nacimiento");
		fechaNacimiento = teclado.next();
		LocalDate fechaNacimientoLocalDate = LocalDate.parse(fechaNacimiento);
		Period periodo = Period.between(fechaNacimientoLocalDate, fechaActual);
		System.out.println("edad: " + periodo.getYears());
	}

}
