package records.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import records.beans.Record;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> { }
