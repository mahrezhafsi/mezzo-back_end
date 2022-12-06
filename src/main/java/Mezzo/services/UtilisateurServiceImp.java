package Mezzo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mezzo.entities.Utilisateur;
import Mezzo.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImp implements UtilisateurService {
		
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur findUtilisateurById(Long id) {
	Optional<Utilisateur> utOptional=	utilisateurRepository.findById(id);
		if(utOptional.isEmpty()) 
		{
			return null;
		}
		else
		{
			return utOptional.get();
		}
		
	}

	@Override
	public Utilisateur createUtilisateur(Utilisateur utilisateur) {
		
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		Optional<Utilisateur> utOptional=	utilisateurRepository.findById(utilisateur.getId());
		if(utOptional.isEmpty()) 
		{
			return null;
		}
		else
		{
			return utilisateurRepository.save(utilisateur);
		}
	}

	@Override
	public void deleteUtilisateur(Long id) {
		utilisateurRepository.deleteById(id);
		
	}

	@Override
	public List<Utilisateur> findByFirstName(String firstName) {
	
		return utilisateurRepository.findByFirstName(firstName);
	}

	@Override
	public List<Utilisateur> findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		 return utilisateurRepository.findByFirstNameAndLastName(firstName, lastName);
	}

	
}
