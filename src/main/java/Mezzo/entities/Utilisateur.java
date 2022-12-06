package Mezzo.entities;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date startetDate;
	private int age;
	private boolean active;
	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private Adresse adresse;
	@ManyToMany(mappedBy="users",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Compte> comptes;
	@OneToMany(mappedBy="user",cascade={CascadeType.PERSIST,CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<Role> role ; //with role
	
	public Utilisateur() {
		
	}
	
	
	
	public Utilisateur(Long id, String firstName, String lastName, String email, String password, Date startetDate,
			int age, boolean active, Adresse adresse, List<Compte> comptes, List<Role> role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.startetDate = startetDate;
		this.age = age;
		this.active = active;
		this.adresse = adresse;
		this.comptes = comptes;
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getStartetDate() {
		return startetDate;
	}
	public void setStartetDate(Date startetDate) {
		this.startetDate = startetDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	
	
	

}
