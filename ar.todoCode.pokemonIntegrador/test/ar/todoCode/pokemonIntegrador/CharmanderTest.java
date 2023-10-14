package ar.todoCode.pokemonIntegrador;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharmanderTest {

	@Test
	/*public void charmanderPuedeAtacarConPunioFuego() {
		Charmander miCharmander=new Charmander();
		miCharmander.atacarPunioFuego();
		String esperado="Soy Charmander y estoy atacando con punio fuego";
		String obtenido=miCharmander.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
	public void charmanderPuedeAtacarConPunioFuego() {
		Charmander miCharmander=new Charmander();
		miCharmander.atacarAscuas();
		String esperado="Soy Charmander y estoy atacando con ascuas";
		String obtenido=miCharmander.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
	*/
	
	public void charmanderPuedeAtacarConLanzallamas() {
		Charmander miCharmander=new Charmander(22.34,"Masculino");
		miCharmander.atacarLanzallamas();
		String esperado="Soy Charmander y estoy atacando con lanzallamas";
		String obtenido=miCharmander.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}

}
