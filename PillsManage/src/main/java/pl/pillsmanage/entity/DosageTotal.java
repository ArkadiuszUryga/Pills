package pl.pillsmanage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="laczna_dawka")

public class DosageTotal {
	
public DosageTotal() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
//	@OneToOne
//	private Medicaments medicaments;
	
	@OneToOne
	private Dosage dosage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public Medicaments getMedicaments() {
//		return medicaments;
//	}
//
//	public void setMedicaments(Medicaments medicaments) {
//		this.medicaments = medicaments;
//	}

	public Dosage getDosage() {
		return dosage;
	}

	public void setDosage(Dosage dosage) {
		this.dosage = dosage;
	}

}
