package org.danicv.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo {

	public static void main(String[] args) {
	LocalDate fechaActual = LocalDate.now();
	LocalDate fecha = LocalDate.of(1997, 9, 15);
	Period periodo = Period.between(fecha,fechaActual);
	System.out.println(periodo.getYears());
	}

}
