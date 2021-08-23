package UD26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD26.dao.CientificoDAO;
import UD26.dto.Cientifico;

@Service
public class CientificoServiceImpl implements CientificoService {

	@Autowired
	CientificoDAO cientificoDAO;

	@Override
	public List<Cientifico> listarCientifico() {
		// TODO Auto-generated method stub
		return cientificoDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return cientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico CientificoXID(int id) {
		// TODO Auto-generated method stub
		return cientificoDAO.findById(id).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return cientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(int id) {
		// TODO Auto-generated method stub
		cientificoDAO.deleteById(id);
	}
	
}
