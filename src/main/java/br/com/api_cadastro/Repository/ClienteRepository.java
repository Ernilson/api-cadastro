package br.com.api_cadastro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api_cadastro.Model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
