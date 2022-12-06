package Mezzo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Compte implements
Serializable {
@Id
private int id;
private double solde;
@ManyToMany
private List<Utilisateur> users ;

public Compte() {
	
}

public Compte(int id, double solde) {
	super();
	this.id = id;
	this.solde = solde;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public List<Utilisateur> getUsers() {
	return users;
}
public void setUsers(List<Utilisateur> users) {
	this.users = users;
}


}