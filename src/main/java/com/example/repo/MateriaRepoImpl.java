package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.repo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MateriaRepoImpl implements IMateriaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Materia m) {
		this.entityManager.persist(m);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Materia seleccionarPorid(Integer id) {
		return this.entityManager.find(Materia.class, id);
	}
}
