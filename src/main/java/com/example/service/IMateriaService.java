package com.example.service;

import com.example.repo.modelo.Materia;

public interface IMateriaService {

	public void guardar(Materia m);
	public Materia buscarPorId(Integer id);
	
}
