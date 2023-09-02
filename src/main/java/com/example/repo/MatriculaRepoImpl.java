package com.example.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.repo.modelo.Materia;
import com.example.repo.modelo.Matricula;
import com.example.repo.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Matricula m) {
		this.entityManager.persist(m);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<MatriculaDTO> seleccionarTodos() {
		TypedQuery<MatriculaDTO> query = this.entityManager.createQuery("SELECT new com.example.repo.modelo.dto.MatriculaDTO(m.estudiante.cedula, m.materia.codigo1, m.materia.codigo2, m.materia.codigo3, m.materia.codigo4, m.fecha) FROM Matricula m", MatriculaDTO.class);
		return query.getResultList();
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Matricula> seleccionarTodosNormal() {
		TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT m FROM Matricula m", Matricula.class);
		return query.getResultList();
	}


}
