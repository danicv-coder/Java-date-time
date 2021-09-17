package org.danicv.datetime.ejemplos;

import java.time.LocalTime;

public class EjemploLocalTime {
	public static void main(String[] args) {
		LocalTime hora = LocalTime.now();
		System.out.println("Hora: " + hora);

		System.out.println("Hora: " + hora.getHour());
		System.out.println("Minutos: " + hora.getMinute());
		System.out.println("Segundos: " + hora.getSecond());
	}
}
