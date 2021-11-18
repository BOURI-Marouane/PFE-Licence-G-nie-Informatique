package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class CategorieTV implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduitTV;
	@NotNull
	@Size(min = 5, max = 70)
	private String designation;
	private double prix;
	private int quantite;
	private String image;
	private Date registrationDate;
	

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public long getIdProduitTV() {
		return idProduitTV;
	}

	public void setIdProduitTV(int id) {
		this.idProduitTV = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public CategorieTV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategorieTV(int id, String designation, double prix, int quantite, String image) {
		super();
		this.idProduitTV = id;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
		this.image = image;
	}					
				
}
