package Mezzo.services;

import java.util.List;

import Mezzo.entities.Utilisateur;

public interface UtilisateurService {
	
	//methode crud basique
	public List<Utilisateur> getAllUtilisateurs();
	public Utilisateur findUtilisateurById(Long id);
	public Utilisateur createUtilisateur(Utilisateur utilisateur);
	public Utilisateur updateUtilisateur(Utilisateur utilisateur);
	public void deleteUtilisateur (Long id);
	
	//methode avance
	public List<Utilisateur> findByFirstName(String firstName);
	public List<Utilisateur> findByFirstNameAndLastName(String firstName,String lastName );

}
