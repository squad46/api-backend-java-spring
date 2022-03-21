package com.andorpainel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trabalhos")
public class Trabalho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Id_pessoa", nullable = false)
	private int idPessoa;
	
	@Column(name = "Instituição", nullable = false)
	private int instituição;
	
	@Column(name = "Nome", nullable = false)
	private String nome;
	
	@Column(name = "Atividade", nullable = false)
	private String atividade;
	
	@Column(name = "Tipo", nullable = false)
	private String tipo;
	
	@Column(name = "Salario", nullable = false)
	private Float salario;
	
	@Column(name = "Endereco", nullable = false)
	private String endereco;
	
	@Column(name = "Numero", nullable = false)
	private int numero;
	
	@Column(name = "Bairro", nullable = false)
	private String bairro;
	
	@Column(name = "CEP", nullable = false)
	private int cep;
	
	@Column(name = "UF", nullable = false)
	private String uf;
	
	@Column(name = "Cidade", nullable = false)
	private String cidade;
	
	@Column(name = "NomeContato", nullable = false)
	private String nomeContato;
	
	@Column(name = "TelefoneContato", nullable = false)
	private String telefoneContato;
	
	@Column(name = "EmailContato", nullable = false)
	private String emailContato;
	
	@Column(name = "DataCadastro", nullable = false)
	private String dataCadastro;
	
	public Trabalho(){
		
	}

	public Trabalho(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
