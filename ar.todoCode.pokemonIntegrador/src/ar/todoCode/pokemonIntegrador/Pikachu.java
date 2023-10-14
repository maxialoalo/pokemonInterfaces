package ar.todoCode.pokemonIntegrador;

public class Pikachu extends Pokemon implements IElectrico{
	protected String nombre="Pikachu";
	protected Integer nroPokedex=25;
	protected Integer temporada=1;
	
	
	public Pikachu(Double peso, String sexo) {
		this.peso=peso;
		this.sexo=sexo;
	}
	
	public void atacarImpactrueno() {
		mensajeDeAtaque="Soy"+nombre +"y estoy atacando con impactrueno";
	}

	public void atacarPunioTrueno() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con punio trueno";		
	}

	public void atacarRayo() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con rayo";		

	}

	public void atacarRayoCarga() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con rayo carga";		
		
	}
}
