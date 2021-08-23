package UD26.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cientificos")
public class Cientifico {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="dni")
	private String dni;
	@Column(name="nom_apels")
	private String nomApels;
	@OneToMany
    @JoinColumn(name="id")
	private List<AsignadoA> asignadoA;
	
	public Cientifico() {
		
	}
	
	public Cientifico(int id, String dni, String nomApels) {
		this.id = id;
		this.dni = dni;
		this.nomApels = nomApels;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}
	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	@Override
	public String toString() {
		return "Cientifico [id=" + id + ", dni=" + dni + ", nomApels=" + nomApels + ", asignadoA=" + asignadoA + "]";
	}
	
	
}
