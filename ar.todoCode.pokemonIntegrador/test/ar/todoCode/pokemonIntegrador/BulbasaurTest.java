package ar.todoCode.pokemonIntegrador;

import static org.junit.Assert.*;

import org.junit.Test;

public class BulbasaurTest {
	Bulbasaur miBulbasaur = new Bulbasaur(39.54,"Femenino");
	@Test
/*
	public void bulbasaurPuedeAtacarConParalizar() {
	
		miBulbasaur.atacarParalizar();
		String esperado="Soy Bulbasaur y estoy atacando con paralizar";
		String obtenido=miBulbasaur.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	} 

	public void bulbasaurPuedeAtacarConDrenaje() {
		miBulbasaur.atacarDrenaje();
		String esperado="Soy Bulbasaur y estoy atacando con drenaje";
		String obtenido=miBulbasaur.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
	public void bulbasaurPuedeAtacarConHojaAfilada() {
		miBulbasaur.atacarHojaAfilada();
		String esperado="Soy Bulbasaur y estoy atacando con hoja afilada";
		String obtenido=miBulbasaur.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
 */
	public void bulbasaurPuedeAtacarConLatigoCepa() {
		miBulbasaur.atacarLatigoCepa();
		String esperado="Soy Bulbasaur y estoy atacando con latigo cepa";
		String obtenido=miBulbasaur.getMensajeDeAtaque();
		assertEquals(esperado,obtenido);
	}
	
}
