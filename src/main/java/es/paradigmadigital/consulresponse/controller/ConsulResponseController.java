package es.paradigmadigital.consulresponse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consul-response")
public class ConsulResponseController {
	
	@GetMapping()
	public ResponseEntity<String> getTeamByName(String name) {
		ResponseEntity<String> response = new ResponseEntity<String>("response", HttpStatus.OK);
		return response;
	}
	
	@GetMapping(path = "/pito")
	public ResponseEntity<String> getTeddamByName(String name) {
		ResponseEntity<String> response = new ResponseEntity<String>("", HttpStatus.OK);
		return response;
	}
}
