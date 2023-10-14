package ar.todoCode.pokemonIntegrador;

public class Squirtle extends Pokemon implements IAgua{
	protected String nombre="Squirtle";
	protected Integer nroPokedex=4;
	protected Integer temporada=1;
	
	public Squirtle(Double peso, String sexo) {
		this.peso=peso;
		this.sexo=sexo;
	}
	public void atacarHidrobomba() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con hidrobomba";
	}

	public void atacarBurbuja() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con burbuja";
		
	}

	public void atacarPistolaAgua() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con pistola agua";

	}

	public void atacarHidropulso() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con hidropulso";

	}

}
