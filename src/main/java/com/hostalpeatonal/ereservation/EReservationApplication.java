package com.hostalpeatonal.ereservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
/**
 * Excluimos la configuracion por defecto para Spring Security
 * agregando exclude y la clase
 * @author Kyozuke
 *
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EReservationApplication.class, args);
	}

}
