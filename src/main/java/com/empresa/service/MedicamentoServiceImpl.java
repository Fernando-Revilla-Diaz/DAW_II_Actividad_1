package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	private MedicamentoRepository repositorio;
	
	@Override
	public Medicamento registraActualizaMedicamento(Medicamento medicamento) {
		return repositorio.save(medicamento);
	}

	@Override
	public List<Medicamento> listarMedicamentos() {
		return repositorio.findAll();
	}

	
	
}
