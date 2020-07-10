package br.com.api_cadastro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api_cadastro.Model.Cliente;
import br.com.api_cadastro.Repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clr;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		return clr.findAll();
	}

}
