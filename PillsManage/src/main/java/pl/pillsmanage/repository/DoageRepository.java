package pl.pillsmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.pillsmanage.entity.Dosage;

@Repository

public interface DoageRepository extends JpaRepository<Dosage, Long>{

}
