package pl.pillsmanage.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class PatientNameDTO {
	public PatientNameDTO () {}
	
	@NotEmpty //make sure name is not empty
	@Size(min=3)
	private String name;
	
	private int doubledName;

	public int getDoubledName() {
		return doubledName;
	}

	public void setDoubledName(int doubledName) {
		this.doubledName = doubledName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
