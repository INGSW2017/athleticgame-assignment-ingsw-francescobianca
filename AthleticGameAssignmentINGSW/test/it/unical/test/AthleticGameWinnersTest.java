package it.unical.test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	private static AthleticGame game;

	@BeforeClass
	public static void inizializzazione() {
		System.out.println("before class");
		game = new AthleticGame("Corsa");
	}

	@Before
	public void startTest() {
		game.start();
	}

	@After
	public void resetTest() {
		game.reset();
	}

	// aggiungere due metodi di test per la funzione getWinner (scegliere i test
	// in modo significativo, ma a piacere)
	
	@Test
	public void getWinnerWorks1 () {
		game.addArrival("Andrea", Instant.now().plusMillis(1000));
		game.addArrival("Francesco", Instant.now());
		game.addArrival("Matteo", Instant.now().plusMillis(2000));
		
		Assert.assertNotEquals(null, game.getWinner());
	}
	
	@Test
	public void getWinnerWorks2 () {
		game.addArrival("Andrea", Instant.now().plusMillis(1000));
		game.addArrival("Francesco", Instant.now());
		
		Assert.assertNotEquals("Andrea", game.getWinner());
	}

}
