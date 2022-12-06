package Mezzo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Adresse implements Serializable {
	@Id
	private int id;
	private String pays;
	private String ville;
	private String rue;
	private int numero;
	@OneToOne
	private Utilisateur user;
	
	public Adresse() {
		
	}
	public Adresse(int id, String pays, String ville, String rue, int numero) {
		super();
		this.id = id;
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
		this.numero = numero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
}
