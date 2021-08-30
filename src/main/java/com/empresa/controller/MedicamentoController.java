package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService service; 
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaMedicamentos(){
		List<Medicamento> medicamentos = service.listarMedicamentos();
		return ResponseEntity.ok(medicamentos);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Medicamento> registrarActualizarMedicamento(@RequestBody Medicamento medicamento){
		Medicamento objSalida = service.registraActualizaMedicamento(medicamento);
		if(objSalida != null) {
			return ResponseEntity.ok(objSalida);
		}
		return ResponseEntity.noContent().build();
	}
	
}
