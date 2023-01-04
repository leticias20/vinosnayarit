package com.vinosnayarit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VINO")
public class Vino {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "marca")
	private String marca;

	@Column(name = "tamano")
	private String tamano;

	@Column(name = "pais")
	private String pais;

	@Column(name = "uva")
	private String uva;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "anada")
	private String anada;

	@Column(name = "enexistencia")
	private boolean enexistencia;

	public Vino() {

	}

	public Vino(String tipo, String marca, String tamano, String pais, String uva, String categoria, String anada,
			boolean enexistencia) {
		this.tipo = tipo;
		this.marca = marca;
		this.tamano = tamano;
		this.pais = pais;
		this.uva = uva;
		this.categoria = categoria;
		this.anada = anada;
		this.enexistencia = enexistencia;

	}

	@Override
	public String toString() {
		return "Vino + [id=" + id + ", tipo=" + tipo + ", marca=" + marca + ", tamano=" + tamano + ", pais=" + pais
				+ ", uva=" + uva + ", categoria=" + categoria + ", anada=" + anada + ", enexistencia=" + enexistencia
				+ "]";

	}

	public boolean isEnexistencia() {
		return enexistencia;
	}

	public void setEnexistencia(boolean enexistencia) {
		this.enexistencia = enexistencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUva() {
		return uva;
	}

	public void setUva(String uva) {
		this.uva = uva;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAnada() {
		return anada;
	}

	public void setAnada(String anada) {
		this.anada = anada;
	}

}
