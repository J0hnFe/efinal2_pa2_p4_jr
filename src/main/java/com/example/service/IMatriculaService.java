package com.example.service;

import java.util.List;

import com.example.repo.modelo.Matricula;
import com.example.repo.modelo.dto.MatriculaDTO;

public interface IMatriculaService {

	public void guardar(Matricula m);

	public List<MatriculaDTO> buscarDto();
	public List<Matricula> buscarTodosNormal();
	
}
