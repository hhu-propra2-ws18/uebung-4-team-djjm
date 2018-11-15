package de.hhu.propra.db.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.hhu.propra.db.entities.Kunde;

public interface KundeRepository extends CrudRepository<Kunde, Long> {
	List<Kunde> findAll();
}
