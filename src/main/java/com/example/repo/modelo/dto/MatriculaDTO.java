package com.example.repo.modelo.dto;

public class MatriculaDTO {

	private String cedula;
	private String codigo1;
	private String codigo2;
	private String codigo3;
	private String codigo4;
	private String fecha;

	// Buena practica---
	public MatriculaDTO(String cedula, String codigo1, String codigo2, String codigo3, String codigo4, String fecha) {
		super();
		this.cedula = cedula;
		this.codigo1 = codigo1;
		this.codigo2 = codigo2;
		this.codigo3 = codigo3;
		this.codigo4 = codigo4;
		this.fecha = fecha;
	}

	public MatriculaDTO() {

	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
