package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.repo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Estudiante e) {
		this.entityManager.persist(e);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Estudiante seleccionarPorId(Integer id) {
		return this.entityManager.find(Estudiante.class, id);
	}
}
