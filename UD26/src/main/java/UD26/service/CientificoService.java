package UD26.service;

import java.util.List;

import UD26.dto.Cientifico;

public interface CientificoService {

	public List<Cientifico> listarCientifico();
	
	public Cientifico guardarCientifico(Cientifico cientifico);	//Guarda un Curso CREATE
	
	public Cientifico CientificoXID(int id); //Leer datos de un Curso READ
	
	public Cientifico actualizarCientifico(Cientifico cientifico); //Actualiza datos del Curso UPDATE
	
	public void eliminarCientifico(int id);// Elimina el Curso DELETE

	
}
