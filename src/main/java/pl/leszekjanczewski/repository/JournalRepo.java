package pl.leszekjanczewski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.leszekjanczewski.model.Journal;

public interface JournalRepo extends JpaRepository<Journal, Long> {
}
