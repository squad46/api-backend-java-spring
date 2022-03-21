package com.andorpainel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Moradias")
public class Moradia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Id_pessoa", nullable = false)
	private int idPessoa;
	
	@Column(name = "Name", nullable = false)
	private String name;
	
	@Column(name = "Descricao", nullable = false)
	private String descricao;
	
	@Column(name = "Tipo", nullable = false)
	private String tipo;
	
	@Column(name = "Preco", nullable = false)
	private Float preco;
	
	@Column(name = "Endereco", nullable = false)
	private String endereco;
	
	@Column(name = "Bairro", nullable = false)
	private String bairro;
	
	@Column(name = "Numero", nullable = false)
	private int numero;
	
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

	public Moradia() {
		
	}

	public Moradia(int id, int idPessoa, String name, String descricao, String tipo, Float preco, String endereco,
			String bairro, int numero, int cep, String uf, String cidade, String nomeContato, String telefoneContato,
			String emailContato, String dataCadastro) {
		this.id = id;
		this.idPessoa = idPessoa;
		this.name = name;
		this.descricao = descricao;
		this.tipo = tipo;
		this.preco = preco;
		this.endereco = endereco;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.nomeContato = nomeContato;
		this.telefoneContato = telefoneContato;
		this.emailContato = emailContato;
		this.dataCadastro = dataCadastro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	} 
	
}
