package org.danicv.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EjemploZonedDateTime {

	public static void main(String[] args) {
		LocalDateTime fechaLocal = LocalDateTime.now();
		ZoneId newYord = ZoneId.of("America/New_York");
		ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYord);
		
		System.out.println("Zona horaria de New York: " + zonaNy);
		ZoneId madrid = ZoneId.of("Europe/Madrid");
		ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid);
		System.out.println("Zona horaria de madrid: " + zonaMadrid);

	}

}
