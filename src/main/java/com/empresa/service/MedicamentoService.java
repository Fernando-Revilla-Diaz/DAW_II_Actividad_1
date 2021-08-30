package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;


public interface MedicamentoService {

	public Medicamento registraActualizaMedicamento(Medicamento medicamento);
	
	public List<Medicamento> listarMedicamentos();
	
}
