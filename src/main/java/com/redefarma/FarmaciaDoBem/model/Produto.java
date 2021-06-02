package com.redefarma.FarmaciaDoBem.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {
	
	//atributos
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max=100)
	private String nome;
	
	@NotNull
	@Column(precision=10,scale=2)
	private BigDecimal preco;
	
	@NotNull
	@Size (max=60)
	private String marca;
	
	@Temporal(TemporalType.DATE)
	private Date validade;
	
	@NotNull
	private boolean estoque;
	
	//relacao com tb_categoria
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	//getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public boolean isEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}