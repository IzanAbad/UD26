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

import UD26.dto.Proyecto;
import UD26.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarCcursos(){
		return proyectoServiceImpl.listarProyecto();
	}
	
	
	@PostMapping("/proyectos")
	public Proyecto salvarProyecto(@RequestBody Proyecto proyecto) {
		
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	
	@GetMapping("/proyectos/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") int id) {
		
		Proyecto proyectoid= new Proyecto();
		
		proyectoid=proyectoServiceImpl.proyectoXID(id);
		
		System.out.println("proyecto XID: "+proyectoid);
		
		return proyectoid;
	}
	
	@PutMapping("/proyecto/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")int id,@RequestBody Proyecto proyecto) {
		
		Proyecto proyectoSeleccionado= new Proyecto();
		Proyecto proyectoActualizado= new Proyecto();
		
		proyectoSeleccionado= proyectoServiceImpl.proyectoXID(id);
		
		proyectoSeleccionado.setNombre(proyecto.getNombre());
		proyectoSeleccionado.setHoras(proyecto.getHoras());
		
		
		proyectoActualizado = proyectoServiceImpl.actualizarProyecto(proyectoSeleccionado);
		
		System.out.println("El Estudiante actualizado es: "+ proyectoActualizado);
		
		return proyectoActualizado;
	}
	
	@DeleteMapping("/proyecto/{id}")
	public void eliminarProyecto(@PathVariable(name="id")int id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
	
}
