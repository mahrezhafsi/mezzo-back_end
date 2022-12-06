package Mezzo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Role implements
Serializable {
	@Id
	private int id;
	private String titre;
	private String descr;
	@ManyToOne
	private Utilisateur user;
	
	public Role() {
		
	}
	public Role(int id, String titre, String descr) {
		super();
		this.id = id;
		this.titre = titre;
		this.descr = descr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescr() {
		return descr;
	}

	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}

}
