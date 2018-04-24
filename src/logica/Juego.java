package logica;

import java.util.ArrayList;
import java.util.Collections;

import modelo.Datos;
import utiles.Constantes;

public class Juego<T> implements Jugable<T>{
	
	Datos datos;
	Constantes constantes;
	private int monedas=0;
	
	@Override
	public void disminuirIntentos(int c) {
		c--;
	}

	@Override
	public boolean comprobarGanador() {
		if (monedas>=constantes.CANTIDAD_MAX_MONEDAS) {
			return true;
		}
		return false;
	}

	@Override
	public void incrementarMonedas() {
		monedas++;
	}

	@Override
	public boolean comprobarListaLlena() {
		//El primer getLista coge el objeto Lista. El segundo coge el arrayList de Lista.
		if (datos.getLista().getListaColores().size()>=constantes.TAMANO_LISTA) {
			return true;
		}
		return false;
	}
	
	public Datos getDatos() {
		return this.datos;
	}
	
	
	
	

}
