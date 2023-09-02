package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repo.modelo.Estudiante;
import com.example.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService estudianteService;
	
	//http://localhost:8080/universidad/estudiantes/vistaEstudiante
	@GetMapping("/vistaEstudiante")
	public String vistaEstudiante(Estudiante e) {
		return "vistaNuevoEstudiante";
	}
	
	//http://localhost:8080/universidad/estudiantes/guardar
	@PostMapping("/guardar")
	public String vistaGuardarEstudiante(Estudiante e) {
		this.estudianteService.guardar(e);
		return "redirect:/materias/vistaEstudiante";
		
	}

	
}
