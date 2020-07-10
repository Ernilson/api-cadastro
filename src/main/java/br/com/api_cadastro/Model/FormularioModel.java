package br.com.api_cadastro.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class FormularioModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_c;
    @Column(length = 200, nullable = false)
    private String nome;
   // @Column(length = 200, nullable = false)
    private String ender;
    @Column(length = 20)
    private String fone;
    @Column(length = 40)
    private String email;    
    private String data;
    @Column(length = 20)
    private String status;
	
	public FormularioModel() {
		
	}
	
	public FormularioModel(Long id_c, String nome, String ender, String fone, String email, String data,
			String status) {
		super();
		this.id_c = id_c;
		this.nome = nome;
		this.ender = ender;
		this.fone = fone;
		this.email = email;
		this.data = data;
		this.status = status;
	}

	public Long getId_c() {
		return id_c;
	}
	public void setId_c(Long id_c) {
		this.id_c = id_c;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnder() {
		return ender;
	}
	public void setEnder(String ender) {
		this.ender = ender;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
