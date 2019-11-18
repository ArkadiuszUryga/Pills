package pl.pillsmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.pillsmanage.entity.Medicaments;
@Repository
public interface MedicamentRepository extends JpaRepository<Medicaments, Long> {

	int countByEan(String ean);
}
