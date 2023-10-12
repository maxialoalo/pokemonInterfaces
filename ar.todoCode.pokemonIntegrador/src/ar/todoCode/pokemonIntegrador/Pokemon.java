package ar.todoCode.pokemonIntegrador;

public abstract class Pokemon implements TipoAgua,TipoFuego,TipoPlanta,TipoElectrico {
	protected String mensajeDeAtaque;
	
	public String getMensajeDeAtaque() {
		return mensajeDeAtaque;
	}
}
