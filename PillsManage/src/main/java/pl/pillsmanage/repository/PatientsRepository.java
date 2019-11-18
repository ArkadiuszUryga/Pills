package pl.pillsmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.pillsmanage.entity.Patients;
@Repository
public interface PatientsRepository extends JpaRepository<Patients, Long> {
	Patients findByName(String name);
	int countByName(String	name);
}
