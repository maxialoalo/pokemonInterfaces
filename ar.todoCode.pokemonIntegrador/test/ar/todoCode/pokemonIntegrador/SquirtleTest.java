package ar.todoCode.pokemonIntegrador;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquirtleTest {

	@Test
/*
	public void squirtlePuedeAtacarConHidrobomba() {
		Squirtle miSquirtle=new Squirtle();
		miSquirtle.atacarHidrobomba();
		String esperado="Soy Squirtle y estoy atacando con hidrobomba";
		String obtenido=miSquirtle.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
}

	public void squirtlePuedeAtacarConBurbuja() {
		Squirtle miSquirtle=new Squirtle();
		miSquirtle.atacarBurbuja();
		String esperado="Soy Squirtle y estoy atacando con burbuja";
		String obtenido=miSquirtle.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}

	public void squirtlePuedeAtacarConPistolaAgua() {
		Squirtle miSquirtle=new Squirtle();
		miSquirtle.atacarPistolaAgua();
		String esperado="Soy Squirtle y estoy atacando con pistola agua";
		String obtenido=miSquirtle.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
*/
	public void squirtlePuedeAtacarConHidropulso() {
		Squirtle miSquirtle=new Squirtle(30.0,"femenino");
		miSquirtle.atacarHidropulso();
		String esperado="Soy Squirtle y estoy atacando con hidropulso";
		String obtenido=miSquirtle.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
}

