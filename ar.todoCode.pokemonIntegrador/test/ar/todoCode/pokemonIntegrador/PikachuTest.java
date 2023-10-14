package ar.todoCode.pokemonIntegrador;

import static org.junit.Assert.*;

import org.junit.Test;

public class PikachuTest {
	Pikachu miPikachu=new Pikachu(15.5,"Masculino");
	@Test
/*
	public void pikachuPuedeAtacarConImpactrueno() {
		miPikachu.atacarImpactrueno();
		String esperado="Soy Pikachu y estoy atacando con impactrueno";
		String obtenido=miPikachu.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
	public void pikachuPuedeAtacarConPunioTrueno() {
		miPikachu.atacarPunioTrueno();
		String esperado="Soy Pikachu y estoy atacando con punio trueno";
		String obtenido=miPikachu.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
	public void pikachuPuedeAtacarConRayo() {
		miPikachu.atacarRayo();
		String esperado="Soy Pikachu y estoy atacando con rayo";
		String obtenido=miPikachu.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
 */
	public void pikachuPuedeAtacarConRayoCarga() {
		miPikachu.atacarRayoCarga();
		String esperado="Soy Pikachu y estoy atacando con rayo carga";
		String obtenido=miPikachu.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
}
