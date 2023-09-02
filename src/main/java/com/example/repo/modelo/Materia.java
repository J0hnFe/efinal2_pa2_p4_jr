package com.example.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	
	@Id
	@SequenceGenerator(name = "seq_materia", sequenceName = "seq_materia", allocationSize = 1)
	@GeneratedValue(generator = "seq_materia", strategy = GenerationType.SEQUENCE)
	@Column(name = "mate_id")
	private Integer id;
	@Column(name = "mate_nombre")
	private String nombre;
	@Column(name = "mate_codigo")
	private String codigo;
	@Column(name = "mate_numero_creditos")
	private String nCreditos;
	@Column(name = "mate_cedula_profesor")
	private String cedProfesor;
	
	@OneToMany(mappedBy = "materia", fetch = FetchType.LAZY)
	private List<Matricula> matriculas;
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getnCreditos() {
		return nCreditos;
	}
	public void setnCreditos(String nCreditos) {
		this.nCreditos = nCreditos;
	}
	public String getCedProfesor() {
		return cedProfesor;
	}
	public void setCedProfesor(String cedProfesor) {
		this.cedProfesor = cedProfesor;
	}
	public Integer getId() {
		return id;
	}
	
	//toString
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", nCreditos=" + nCreditos
				+ ", cedProfesor=" + cedProfesor + "]";
	}
	

}
