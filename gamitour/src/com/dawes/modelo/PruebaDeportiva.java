package com.dawes.modelo;
// Generated 25-ene-2018 10:02:38 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PruebaDeportiva generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "pruebaDeportiva", catalog = "gamitour")
public class PruebaDeportiva implements java.io.Serializable {

	private Integer idpruebadeportiva;
	private Parada parada;
	private String nombre;
	private Date fechainicio;
	private Date fechafin;
	private String explicacion;
	private Integer puntos;
	private Set<Multimedia> multimedias = new HashSet<Multimedia>(0);

	public PruebaDeportiva() {
	}

	public PruebaDeportiva(Parada parada) {
		this.parada = parada;
	}

	public PruebaDeportiva(Parada parada, String nombre, Date fechainicio, Date fechafin, String explicacion,
			Integer puntos, Set<Multimedia> multimedias) {
		this.parada = parada;
		this.nombre = nombre;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.explicacion = explicacion;
		this.puntos = puntos;
		this.multimedias = multimedias;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idpruebadeportiva", unique = true, nullable = false)
	public Integer getIdpruebadeportiva() {
		return this.idpruebadeportiva;
	}

	public void setIdpruebadeportiva(Integer idpruebadeportiva) {
		this.idpruebadeportiva = idpruebadeportiva;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parada_idparada", nullable = false)
	public Parada getParada() {
		return this.parada;
	}

	public void setParada(Parada parada) {
		this.parada = parada;
	}

	@Column(name = "nombre", length = 60)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechainicio", length = 10)
	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechafin", length = 10)
	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	@Column(name = "explicacion", length = 200)
	public String getExplicacion() {
		return this.explicacion;
	}

	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}

	@Column(name = "puntos")
	public Integer getPuntos() {
		return this.puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pruebaDeportiva")
	public Set<Multimedia> getMultimedias() {
		return this.multimedias;
	}

	public void setMultimedias(Set<Multimedia> multimedias) {
		this.multimedias = multimedias;
	}

}
