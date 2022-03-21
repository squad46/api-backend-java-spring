package com.andorpainel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pessoas")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Sexo")
	private String sexo;
	
	@Column(name = "Nome", nullable = false)
	private String nome;
	
	@Column(name = "Email", nullable = false)
	private String email;
	
	@Column(name = "Senha", nullable = false)
	private String senha;
	
	@Column(name = "Telefone", nullable = false)
	private String telefone;
	
	@Column(name = "CRNM", nullable = false)
	private String crnm;
	
	@Column(name = "CPF", nullable = false)
	private String cpf;
	
	@Column(name = "Endereço", nullable = false)
	private String endereço;
	
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
	
	@Column(name = "DataNascimento", nullable = false)
	private String datanascimento;
	
	@Column(name = "Nacionalidade", nullable = false)
	private String nacionalidade;
	
	@Column(name = "DataCadastro", nullable = false)
	private String dataCadastro;
	
	@Column(name = "Classe", nullable = false)
	private String classe;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCrnm() {
		return crnm;
	}

	public void setCrnm(String crnm) {
		this.crnm = crnm;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public Pessoa(int id, String sexo, String nome, String email, String senha, String telefone, String crnm,
			String cpf, String endereço, String bairro, int numero, int cep, String uf, String cidade,
			String datanascimento, String nacionalidade, String dataCadastro, String classe) {
		super();
		this.id = id;
		this.sexo = sexo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.crnm = crnm;
		this.cpf = cpf;
		this.endereço = endereço;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.datanascimento = datanascimento;
		this.nacionalidade = nacionalidade;
		this.dataCadastro = dataCadastro;
		this.classe = classe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	
	
	
}

	

