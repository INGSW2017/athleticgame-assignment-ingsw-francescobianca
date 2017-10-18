package it.unical.test;

import java.time.Instant;

import org.junit.BeforeClass;
import org.junit.Test;
import it.unical.asde.AthleticGame;
import junit.framework.Assert;

public class AthleticGameBasicTest {

	private static AthleticGame game;

	@BeforeClass
	public static void inizializzazione() {
		System.out.println("before class");
		game = new AthleticGame("Corsa");
	}

	// aggiungere un test per testare il metodo addArrival(String participant,
	// Instant arrival). In questo test verificare che, aggiungendo un nuovo
	// arrivo, la taglia della mappa arrivals diventi pari ad 1

	@Test
	public void addArrivalWorks() {
		Instant arrive = Instant.now();
		game.addArrival("Andrea", arrive);
		Assert.assertEquals(1, game.getArrivals().size());
	}

	// aggiungere un test per verificare che getParecipiantTime(String
	// participant) lanci un'eccezione in caso di partecipante non valido
	
	@Test (expected = IllegalArgumentException.class)
	public void getParecipiantTimeThrowsException() {
		game.getParecipiantTime("andrea");
	}

}
