package pl.pillsmanage.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="leki")
public class Medicaments {
	
	public Medicaments(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique=true)
	private String ean;
	
	private String nazwa;
	
	private int doubledEan;
	
	

	private int liczba_w_paczce;
//	@ManyToMany(mappedBy = "medicaments")
//	private List<Patients> patients = new ArrayList<>();



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getEan() {
		return ean;
	}



	public void setEan(String ean) {
		this.ean = ean;
	}



	public String getNazwa() {
		return nazwa;
	}



	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}



	public int getDoubledEan() {
		return doubledEan;
	}



	public void setDoubledEan(int doubledEan) {
		this.doubledEan = doubledEan;
	}



	public int getLiczba_w_paczce() {
		return liczba_w_paczce;
	}



	public void setLiczba_w_paczce(int liczba_w_paczce) {
		this.liczba_w_paczce = liczba_w_paczce;
	}
	
//	@OneToOne(mappedBy="medicaments")
//	private Dosage dosage;
	
//	@OneToOne(mappedBy="medicaments")
//	private DosageTotal dosagetotal;
	
	
	
	

	

}
