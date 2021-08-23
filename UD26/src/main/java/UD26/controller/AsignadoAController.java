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

import UD26.dto.AsignadoA;
import UD26.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAController {

	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;	
	
	@GetMapping("/asignadoA")
	public List<AsignadoA> listarAsignadoA(){
		return asignadoAServiceImpl.listarAsignadoA();
	}
	
	
	@PostMapping("/asignadoA")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA asignadoA) {
		
		return asignadoAServiceImpl.guardarAsignadoA(asignadoA);
	}
	
	
	@GetMapping("/asignadoA/{id}")
	public AsignadoA asignadoAXID(@PathVariable(name="id") int id) {
		
		AsignadoA asignadoaid= new AsignadoA();
		
		asignadoaid=asignadoAServiceImpl.asignadoAXID(id);
		
		System.out.println("RegistroCurso XID: "+asignadoaid);
		
		return asignadoaid;
	}
	
	@PutMapping("/asignadoA/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA asignadoA) {
		
		AsignadoA asignadoASeleccionado= new AsignadoA();
		AsignadoA asignadoAActualizado= new AsignadoA();
		
		asignadoASeleccionado= asignadoAServiceImpl.asignadoAXID(id);
		
		
		asignadoASeleccionado.setCientifico(asignadoA.getCientifico());
		asignadoASeleccionado.setProyecto(asignadoA.getProyecto());
		
		asignadoAActualizado = asignadoAServiceImpl.actualizarAsignadoA(asignadoASeleccionado);
		
		System.out.println("Está asignado a: "+ asignadoAActualizado);
		
		return asignadoAActualizado;
	}
	
	@DeleteMapping("/asignadoA/{id}")
	public void eliminarAsignadoA(@PathVariable(name="id")int id) {
		asignadoAServiceImpl.eliminarAsignadoA(id);
	}
	
}
