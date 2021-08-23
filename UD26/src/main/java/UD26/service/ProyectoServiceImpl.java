package UD26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD26.dao.ProyectoDAO;
import UD26.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements ProyectoService{

	@Autowired
	ProyectoDAO proyectoDAO;

	@Override
	public List<Proyecto> listarProyecto() {
		// TODO Auto-generated method stub
		return proyectoDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return proyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(int id) {
		// TODO Auto-generated method stub
		return proyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return proyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(int id) {
		// TODO Auto-generated method stub
		proyectoDAO.deleteById(id);
	}
	
	
	
}
