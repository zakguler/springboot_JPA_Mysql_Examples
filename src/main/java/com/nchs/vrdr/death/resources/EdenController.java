package com.nchs.vrdr.death.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.jboss.logging.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nchs.vrdr.death.model.Edenmaster;
import com.nchs.vrdr.death.services.EdenmasterService;

@RestController
@RequestMapping("/api")
public class EdenController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EdenmasterService edenmasterService;
	
	@GetMapping("/test") 
	public String doTest() {		
		return "springboot_JPA_Mysql_Examples: Returned from /api/test endpoint.";
	}
	
	@GetMapping("/eden/{id}") 
	public @ResponseBody ResponseEntity<Edenmaster> getEden(@PathVariable String id) {		
		return new ResponseEntity<Edenmaster>(edenmasterService.getEdenmaster(id), HttpStatus.OK);
	}
	
	@GetMapping("/FhirSentReceived/{fhirSentReceived}") 
	public @ResponseBody ResponseEntity<Edenmaster> getEdenFhir(@PathVariable Integer fhirSentReceived) {		
		return new ResponseEntity<Edenmaster>(edenmasterService.getEdenmasterFhir(fhirSentReceived), HttpStatus.OK);
	}
	
	@GetMapping("/FhirSentReceivedFirst/{fhirSentReceived}") 
	public @ResponseBody ResponseEntity<Edenmaster> getFirstEdenmasterFhir(@PathVariable Integer fhirSentReceived) {		
		return new ResponseEntity<Edenmaster>(edenmasterService.getFirstEdenmasterFhir(fhirSentReceived), HttpStatus.OK);
	}

//	nested exception is java.lang.IllegalArgumentException: Parameter value [2] did not match expected type [java.lang.String (n/a)]"
//	@GetMapping("/FhirSentReceivedBetween") 
//	public @ResponseBody ResponseEntity<List<Edenmaster>> getBetweenEdenmasterFhir(@RequestParam int fhirSentReceived_0, @RequestParam int fhirSentReceived_2) {		
//		return new ResponseEntity<>(edenmasterService.getBetweenEdenmasterFhir(fhirSentReceived_0, fhirSentReceived_2), HttpStatus.OK);
//	}

}
