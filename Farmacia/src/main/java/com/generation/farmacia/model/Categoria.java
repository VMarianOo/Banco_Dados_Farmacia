package com.generation.farmacia.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(min = 5, max = 1000, message = "O atributo descrição deve conter no minimo 05 e no máximo 1000 caracteres")
	private String descricao;

	@NotBlank(message = "O atributo tipo de produto é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo tipo de produto deve conter no minímo 3 e no máximo 100 caracteres")
	private String tipoProduto;

	@NotBlank(message = "O atributo desconto é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo desconto deve conter no minímo 3 e no máximo 100 caracteres")
	private String desconto;

	@NotBlank(message = "O atributo valor de desconto é obrigatório!")
	@Size(min = 0, max = 1000, message = "O atributo valor de desconto deve conter no minímo 0 e no máximo 1000 caracteres")
	private BigDecimal valorDesconto;

	@NotBlank(message = "O atributo Forda de pagamento é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo forma de pagamento deve conter no minímo 3 e no máximo 100 caracteres")
	private String formaPagamento;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}