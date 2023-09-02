package com.example.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)
	@GeneratedValue(generator = "seq_matricula", strategy = GenerationType.SEQUENCE)
	@Column(name = "matr_id")
	private Integer id;
	@Column(name = "matr_fecha")
	private String fecha;
	@Column(name = "matr_codigo1")
	private String codigo1;
	@Column(name = "matr_codigo2")
	private String codigo2;
	@Column(name = "matr_codigo3")
	private String codigo3;
	@Column(name = "matr_codigo4")
	private String codigo4;
	
	

	@ManyToOne
	@JoinColumn(name = "matr_id_materia")
	private Materia materia;

	@ManyToOne
	@JoinColumn(name = "matr_id_estudiante")
	private Estudiante estudiante;

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Integer getId() {
		return id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCodigo1() {
		return codigo1;
	}

	public void setCodigo1(String codigo1) {
		this.codigo1 = codigo1;
	}

	public String getCodigo2() {
		return codigo2;
	}

	public void setCodigo2(String codigo2) {
		this.codigo2 = codigo2;
	}

	public String getCodigo3() {
		return codigo3;
	}

	public void setCodigo3(String codigo3) {
		this.codigo3 = codigo3;
	}

	public String getCodigo4() {
		return codigo4;
	}

	public void setCodigo4(String codigo4) {
		this.codigo4 = codigo4;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + "]";
	}

}
