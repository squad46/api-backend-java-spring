package com.andorpainel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ongs")
public class Ong {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Nome", nullable = false, length = 20)
	private String nome;
	
	@Column(name = "Descricao", nullable = false, length = 400)
	private String descricao;
	
	@Column(name = "Site", nullable = false, length = 100)
	private String site;
	
	@Column(name = "Imagem", nullable = false, length = 100)
	private String imagem;

	public Ong() {
	}

	public Ong(Long id, String nome, String descricao, String site, String imagem) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.site = site;
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
}
