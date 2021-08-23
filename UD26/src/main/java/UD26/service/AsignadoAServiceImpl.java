package UD26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD26.dao.AsignadoADAO;
import UD26.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements AsignadoAService{
	
	@Autowired
	AsignadoADAO asignadoADAO;

	@Override
	public List<AsignadoA> listarAsignadoA() {
		// TODO Auto-generated method stub
		return asignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA) {
		// TODO Auto-generated method stub
		return asignadoADAO.save(asignadoA);
	}

	@Override
	public AsignadoA asignadoAXID(int id) {
		// TODO Auto-generated method stub
		return asignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA) {
		// TODO Auto-generated method stub
		return asignadoADAO.save(asignadoA);
	}

	@Override
	public void eliminarAsignadoA(int id) {
		// TODO Auto-generated method stub
		asignadoADAO.deleteById(id);
	}

}
