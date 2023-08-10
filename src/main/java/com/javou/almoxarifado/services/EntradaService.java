package com.javou.almoxarifado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javou.almoxarifado.models.Entrada;
import com.javou.almoxarifado.repository.EntradaRepository;

@Service
public class EntradaService {
	
	@Autowired
	private EntradaRepository entradaRepository;
	
	public List<Entrada> listarEntradas() {
		return entradaRepository.findAll();
	}

}
