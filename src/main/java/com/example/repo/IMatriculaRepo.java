package com.example.repo;

import java.util.List;

import com.example.repo.modelo.Matricula;
import com.example.repo.modelo.dto.MatriculaDTO;

public interface IMatriculaRepo {

	public void insertar(Matricula m);	
	public List<MatriculaDTO> seleccionarTodos();
	public List<Matricula> seleccionarTodosNormal();
	
}
