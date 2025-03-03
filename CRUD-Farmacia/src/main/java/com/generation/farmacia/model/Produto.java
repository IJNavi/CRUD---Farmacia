package com.generation.farmacia.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O Atributo nome é obrigatório.")
	@Size(min = 4, max = 100, message = "minimo de 4 caracteres e maximo de 100")
	private String nome;
	
	@NotNull(message = "O Atributo estocado é obrigatório, informa a quantidade em estoque.")
	private Long estocado;
	
	@NotNull(message = "O Atributo vendas realizadas é obrigatório.")
	private Long vendas;
	
	@NotNull(message = "O Atributo vencimento é obrigatório.")
	private LocalDate vencimento;
	
	@NotNull(message = "O Atributo lote é obrigatório.")
	private Long lote;
	
	@NotNull
	private Boolean generico;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public Long getEstocado() {
		return estocado;
	}

	public void setEstocado(Long estocado) {
		this.estocado = estocado;
	}

	public Long getVendas() {
		return vendas;
	}

	public void setVendas(Long vendas) {
		this.vendas = vendas;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public Long getLote() {
		return lote;
	}

	public void setLote(Long lote) {
		this.lote = lote;
	}

	public Boolean getGenerico() {
		return generico;
	}

	public void setGenerico(Boolean generico) {
		this.generico = generico;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
