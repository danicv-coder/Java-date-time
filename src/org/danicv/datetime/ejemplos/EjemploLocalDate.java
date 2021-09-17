package org.danicv.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class EjemploLocalDate {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		System.out.println("Dia: " + fecha.getDayOfMonth());
		System.out.println("mes: " + fecha.getMonth());
		System.out.println("Año: " + fecha.getYear());
		System.out.println("Dia del año: " + fecha.getDayOfYear());
		System.out.println("Era: " + fecha.getEra());
		
		LocalDate fecha2 = LocalDate.of(1997, 9, 15).plusYears(1);
		
		System.out.println(fecha2);
		Duration edad = Duration.between(fecha, fecha2);
		System.out.println(edad);

		fecha = LocalDate.of(2020, 1, 15);
		System.out.println("Fecha con el operador of: " + fecha);

		fecha = LocalDate.of(2020, Month.DECEMBER, 18);
		System.out.println("Fecha con un operador NUM: " + fecha);

		fecha = LocalDate.parse("2021-09-15");
		System.out.println("Convirtiendo la fecha a un string: " + fecha);

		LocalDate diaManañana = LocalDate.now().plusDays(1);
		System.out.println("diaMañana: " + diaManañana);

		LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
		System.out.println("mesAnteriorMismoDia: " + mesAnteriorMismoDia);

		DayOfWeek diaSemana = LocalDate.of(2021, 9, 18).getDayOfWeek();
		System.out.println("dia de la semana: " + diaSemana);
	}

}
