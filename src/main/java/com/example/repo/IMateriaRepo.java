package com.example.repo;

import com.example.repo.modelo.Materia;

public interface IMateriaRepo {

	public void insertar(Materia m);
	public Materia seleccionarPorid(Integer id);
	
	
}
