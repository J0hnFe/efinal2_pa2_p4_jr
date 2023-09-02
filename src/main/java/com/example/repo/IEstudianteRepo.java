package com.example.repo;

import java.util.List;

import com.example.repo.modelo.Estudiante;

public interface IEstudianteRepo {

	public void insertar(Estudiante e);
	public Estudiante seleccionarPorId(Integer id);
	
}
