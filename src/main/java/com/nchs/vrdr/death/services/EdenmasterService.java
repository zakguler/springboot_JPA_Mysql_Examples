package com.nchs.vrdr.death.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nchs.vrdr.death.model.Edenmaster;
import com.nchs.vrdr.death.repositories.EdenJpaRepository;

@Service	//<================= business services are singleton
public class EdenmasterService {

	@Autowired
	private EdenJpaRepository edenJpaRepository;

	public Edenmaster getEdenmaster(String id) {
		Optional<Edenmaster> edenmaster = edenJpaRepository.findById(id);
//zak
		if (edenmaster.isPresent()) {			
			System.out.println("z..getStateFileNumber" + (edenmaster.get()).getStatefilenumber());
		}
		
		if (edenmaster.isPresent())
			return edenmaster.get();
		else 
			return new Edenmaster();
	}

	public Edenmaster getEdenmasterFhir(Integer fhirSentReceived) {
		Optional<Edenmaster> edenmaster = edenJpaRepository.findValueByFhirSentReceived(fhirSentReceived);
//zak
		if (edenmaster.isPresent()) {			
			System.out.println("z..fhirSentReceived" + (edenmaster.get()).getFhirsentreceived());
		}
		
		if (edenmaster.isPresent())
			return edenmaster.get();
		else 
			return new Edenmaster();
	}


	public Edenmaster getFirstEdenmasterFhir(Integer fhirSentReceived) {
		Optional<Edenmaster> edenmaster = edenJpaRepository.findFirstByFhirsentreceived(fhirSentReceived);
//zak
		if (edenmaster.isPresent()) {			
			System.out.println("z..findFirstByFhirsentreceived" + (edenmaster.get()).getFhirsentreceived());
		}
		
		if (edenmaster.isPresent())
			return edenmaster.get();
		else 
			return new Edenmaster();
	}

	public List<Edenmaster> getBetweenEdenmasterFhir(int fhirSentReceived_0, int fhirSentReceived_2) {
		List<Edenmaster> edenmasters = edenJpaRepository.queryByfhirSentReceivedBetween(fhirSentReceived_0, fhirSentReceived_2);
//zak
		edenmasters.stream().forEach(e -> System.out.println("getStatefilenumber(): " 
				+ e.getStatefilenumber() 
				+ " - " + e.getFhirsentreceived() ));
		return edenmasters;
}
	
}
