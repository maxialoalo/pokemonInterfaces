package ar.todoCode.pokemonIntegrador;

public class Charmander extends Pokemon implements IFuego {
	protected String nombre="Charmander";
	protected Integer nroPokedex=7;
	protected Integer temporada=1;
	
	
	public Charmander(Double peso, String sexo) {
		this.peso=peso;
		this.sexo=sexo;
	}
	
	public void atacarPunioFuego() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con punio fuego";
	}
	
	
	


	public void atacarAscuas() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con ascuas";

	}


	public void atacarLanzallamas() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con lanzallamas";

	}
	
	
}
