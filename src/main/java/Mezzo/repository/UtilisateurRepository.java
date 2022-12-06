package Mezzo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Mezzo.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	
	public List<Utilisateur> findByFirstName(String firstName);
	public List<Utilisateur> findByFirstNameAndLastName(String firstName,String lastName );
	
	
	//@Query("SELECT u FROM utilisateur WHERE u.firstName=?1 AND u.lastName=?2")
	//public List<Utilisateur> findByFirstNameAndLastNameWithJPQL(String firstName,String lastName );
	
	
	//@Query("SELECT u FROM Utilisateur WHERE u.firstName:myFirstName AND u.lastName:myLastName")
	//public List<Utilisateur> findByFirstNameAndLastNameWithJPQLWithNamedParameters(@Param(value = "myFirstName") String firstName,@Param(value = "myLastName")String lastName );
	
}
