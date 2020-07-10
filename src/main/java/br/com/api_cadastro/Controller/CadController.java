package br.com.api_cadastro.Controller;

import br.com.api_cadastro.Model.FormularioModel;
import br.com.api_cadastro.Repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/cad")
public class CadController {

	@Autowired
	FormularioRepository fsl;

	@GetMapping
	public List<FormularioModel> listFormulario(){
		return (List<FormularioModel>) fsl.findAll();
	}

	@GetMapping("/formulario/{id}")
	public FormularioModel listaPorId(@PathVariable(value = "id") long id){
		return fsl.findById(id);
	}

	@PostMapping("/formulario")
	public FormularioModel savarFormulario(@RequestBody FormularioModel formularioModel){
		return fsl.save(formularioModel);
	}

	@DeleteMapping("/formulario")
	public void delete(@RequestBody FormularioModel formularioModel) {
		fsl.delete(formularioModel);
	}

	@PutMapping("/formulario")
	public FormularioModel atualizaProduto(@RequestBody FormularioModel formularioModel) {
		return fsl.save(formularioModel);
	}

}