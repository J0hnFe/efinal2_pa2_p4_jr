
package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.IMatriculaRepo;
import com.example.repo.modelo.Matricula;
import com.example.repo.modelo.dto.MatriculaDTO;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepo matriculaRepo;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Matricula m) {
		this.matriculaRepo.insertar(m);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<MatriculaDTO> buscarDto() {
		this.matriculaRepo.seleccionarTodos();
		return null;
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Matricula> buscarTodosNormal() {
		return this.matriculaRepo.seleccionarTodosNormal();
	}

}
