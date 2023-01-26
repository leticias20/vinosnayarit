package com.vinosnayarit.model;

import javax.persistence.*;


@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)	
	 private long id;
	 
	 @Column(name = "nombre")
	 private String nombre;
	 
	 @Column(name = "correoelectronico")
     private String correoelectronico;
	 
	 @Column(name = "direccion")
     private String direccion;
	 
	 @Column(name = "telefono")
     private String telefono;
	 
	 
	 public Cliente(String nombre, String correoelectronico, String direccion, String telefono) {
		 this.nombre = nombre;
		 this.correoelectronico = correoelectronico;
		 this.direccion = direccion;
		 this.telefono = telefono;
		 
	 }
	 
	 @Override
	 public String toString() {
		 return "Cliente + [id=" + id + ", nombre=" + nombre + ", correoelectronico=" + correoelectronico +
				 ", direccion=" + direccion + ", telefono=" 
	 + telefono + "]";
		 
	 }
     
     
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
}
