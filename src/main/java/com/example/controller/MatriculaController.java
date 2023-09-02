package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repo.modelo.Matricula;
import com.example.repo.modelo.dto.MatriculaDTO;
import com.example.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	@Autowired
	private IMatriculaService matriculaService;
	
	//http://localhost:8080/universidad/matriculas/vistaMatricula
	@GetMapping("/vistaMatricula")
	public String vistaMatricula(Matricula m) {
		return "vistaNuevaMatricula";
	}
	
	//http://localhost:8080/universidad/matriculas/guardar
	@PostMapping("/guardar")
	public String vistaGuardarMatricula(Matricula m) {
		this.matriculaService.guardar(m);
		return "redirect:/matriculas/listaMatriculas";
	}
	
	//http://localhost:8080/universidad/matriculas/listaMatriculas
	@GetMapping("/listaMatriculas")
	public String listaMatriculas(Model model) {
		List<Matricula> matriculas = this.matriculaService.buscarTodosNormal();
		model.addAttribute("matriculas", matriculas);
		return "vistaListaMatriculas";
	}

}
