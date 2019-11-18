package pl.pillsmanage.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;



@Entity
@Table(name="pacjenci")
public class Patients {
	
	public Patients() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique=true)
	private String name;
	
	@ManyToMany (cascade= {CascadeType.ALL})
	private List<Medicaments> medicaments = new ArrayList<>();
	
//	@OneToOne(mappedBy="patients")
//	private Dosage dosage;
	
	public List<Medicaments> getMedicaments() {
		return medicaments;
	}

	public void setMedicaments(List<Medicaments> medicaments) {
		this.medicaments = medicaments;
	}

//	public Dosage getDosage() {
//		return dosage;
//	}
//
//	public void setDosage(Dosage dosage) {
//		this.dosage = dosage;
//	}

	private int doubledName;

	public int getDoubledName() {
		return doubledName;
	}

	public void setDoubledName(int doubledName) {
		this.doubledName = doubledName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
