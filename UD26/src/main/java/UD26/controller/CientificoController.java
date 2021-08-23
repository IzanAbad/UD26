package UD26.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import UD26.dto.Cientifico;
import UD26.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoServiceImpl.listarCientifico();
	}
	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	
	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name="id") int id) {
		
		Cientifico cientificoid= new Cientifico();
		
		cientificoid=cientificoServiceImpl.CientificoXID(id);
		
		System.out.println("Cientifico XID: "+cientificoid);
		
		return cientificoid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name="id")int id,@RequestBody Cientifico cientifico) {
		
		Cientifico cientificoSeleccionado= new Cientifico();
		Cientifico cientificoActualizado= new Cientifico();
		
		cientificoSeleccionado= cientificoServiceImpl.CientificoXID(id);
		
		cientificoSeleccionado.setNomApels(cientifico.getNomApels());

		
		cientificoActualizado = cientificoServiceImpl.actualizarCientifico(cientificoSeleccionado);
		
		System.out.println("El cientifico actualizado es: "+ cientificoActualizado);
		
		return cientificoActualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eleiminarCurso(@PathVariable(name="id")int id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}
	
}
