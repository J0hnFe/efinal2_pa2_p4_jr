package com.example.service;

import com.example.repo.modelo.Estudiante;

public interface IEstudianteService {

	public void guardar(Estudiante e);
	public Estudiante buscarPorId(Integer id);
	
}
