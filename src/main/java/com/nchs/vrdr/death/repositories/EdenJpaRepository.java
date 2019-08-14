package com.nchs.vrdr.death.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nchs.vrdr.death.model.Edenmaster;

public interface EdenJpaRepository extends JpaRepository<Edenmaster, String>{
	
	Optional<Edenmaster> findById(String statefilenumber);
	List<Edenmaster> findByRescity(String rescity);
	Optional<Edenmaster> findFirstByFhirsentreceived(Integer fhirsentreceived);
	
	@Query("SELECT e FROM Edenmaster e where e.fhirsentreceived = :fhirSentReceived") 
	Optional<Edenmaster> findValueByFhirSentReceived(@Param("fhirSentReceived") Integer fhirSentReceived); 

	@Query("select e from Edenmaster e where e.fhirsentreceived > :fhirSentReceived_0 and e.statefilenumber < :fhirSentReceived_2")
	List<Edenmaster> queryByfhirSentReceivedBetween(@Param("fhirSentReceived_0") int fhirSentReceived_0, @Param("fhirSentReceived_2") int fhirSentReceived_2);
}
