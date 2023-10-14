package ar.todoCode.pokemonIntegrador;

public class Bulbasaur extends Pokemon implements IPlanta {
	protected String nombre="Bulbasaur";
	protected Integer nroPokedex=1;
	protected Integer temporada=1;
	
	public Bulbasaur(Double peso, String sexo) {
		this.peso=peso;
		this.sexo=sexo;
	}
	
	public void atacarParalizar() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con paralizar";
		
	}

	public void atacarDrenaje() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con drenaje";

	}

	public void atacarHojaAfilada() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con hoja afilada";
		
	}

	public void atacarLatigoCepa() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con latigo cepa";

	}

}
