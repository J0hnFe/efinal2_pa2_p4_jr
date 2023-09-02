package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repo.modelo.Materia;
import com.example.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private IMateriaService  materiaService;
	
	//http://localhost:8080/universidad/materias/vistaMateria
	@GetMapping("/vistaMateria")
	public String vistaMateria(Materia m) {
		return "vistaNuevaMateria";
	}
	
	@PostMapping("/guardar")
	public String vistaGuardarMateria(Materia m) {
		this.materiaService.guardar(m);
		return "redirect:/materias/vistaMateria";
	}

}
