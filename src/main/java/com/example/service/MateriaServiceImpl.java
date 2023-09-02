package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.IMateriaRepo;
import com.example.repo.modelo.Materia;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private IMateriaRepo materiaRepo;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Materia m) {
		this.materiaRepo.insertar(m);
	}

	@Override
	public Materia buscarPorId(Integer id) {
		return this.materiaRepo.seleccionarPorid(id);
	}

}
