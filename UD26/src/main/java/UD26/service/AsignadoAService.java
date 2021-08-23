package UD26.service;

import java.util.List;

import UD26.dto.AsignadoA;


public interface AsignadoAService {

	public List<AsignadoA> listarAsignadoA(); //Listar All 
	
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA);	//Guarda un RegistroCurso CREATE
	
	public AsignadoA asignadoAXID(int id); //Leer datos de un RegistroCurso READ
	
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA); //Actualiza datos del RegistroCurso UPDATE
	
	public void eliminarAsignadoA(int id);// Elimina el RegistroCurso DELETE

	
}
