package br.com.api_cadastro.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.api_cadastro.Model.FormularioModel;

@Repository
@Transactional
public interface FormularioRepository extends CrudRepository<FormularioModel, Long> {

	 List<FormularioModel> findByNomeContainingIgnoreCase(String nome);

	 FormularioModel findById(long id);
}
