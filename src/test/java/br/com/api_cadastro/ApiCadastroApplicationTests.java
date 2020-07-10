package br.com.api_cadastro;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.api_cadastro.Model.FormularioModel;
import br.com.api_cadastro.Repository.FormularioRepository;

@SpringBootTest
class ApiCadastroApplicationTests {
	
	@Autowired
	private FormularioRepository rp;

	@Test
	void contextLoads() {
		 FormularioModel fm = new FormularioModel();
		fm.setNome("teste");
		fm.setEnder("teste");
		fm.setFone("0000000000");
		fm.setEmail("teste@teste");
		fm.setData("00/00/0000");
		fm.setStatus("teste");
		
		rp.save(fm);
	
	}

}
