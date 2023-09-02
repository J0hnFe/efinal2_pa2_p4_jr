package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.IEstudianteRepo;
import com.example.repo.modelo.Estudiante;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Estudiante e) {
		this.estudianteRepo.insertar(e);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Estudiante buscarPorId(Integer id) {
		return this.estudianteRepo.seleccionarPorId(id);
	}

	
	
}
