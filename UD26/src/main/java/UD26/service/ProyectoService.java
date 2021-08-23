package UD26.service;

import java.util.List;

import UD26.dto.Proyecto;


public interface ProyectoService {

	public List<Proyecto> listarProyecto(); //Listar All 
	
	public Proyecto guardarProyecto(Proyecto proyecto);	//Guarda un Curso CREATE
	
	public Proyecto proyectoXID(int id); //Leer datos de un Curso READ
	
	public Proyecto actualizarProyecto(Proyecto proyecto); //Actualiza datos del Curso UPDATE
	
	public void eliminarProyecto(int id);// Elimina el Curso DELETE

}
