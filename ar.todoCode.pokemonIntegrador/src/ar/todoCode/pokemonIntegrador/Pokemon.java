package ar.todoCode.pokemonIntegrador;

public abstract class Pokemon{
	protected String mensajeDeAtaque;
	protected Integer nroPokedex;
	protected Double peso;
	protected String nombre;
	protected String sexo;
	protected int temporada;
	
	public String getMensajeDeAtaque() {
		return mensajeDeAtaque;
	}
	public void atacarMordisco() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con mordisco";
	}
	public void atacarAraniazo() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con araniazo";
	}
	public void atacarPlacaje() {
		mensajeDeAtaque="Soy "+ nombre + " y estoy atacando con placaje";
	}
	
}
