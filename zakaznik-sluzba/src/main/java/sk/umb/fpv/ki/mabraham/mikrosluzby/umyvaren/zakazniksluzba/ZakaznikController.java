package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.zakazniksluzba;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ZakaznikController {
	
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ZakaznikRepository repository;
	
	@GetMapping("/zakaznici")
	public List<Zakaznik> retrieveAll() {
		
		List<Zakaznik> zakaznici = repository.findAll();
		
		logger.info("{}", zakaznici);
		
		return zakaznici;
	}
	
	@GetMapping("/zakaznici/{id}")
	public Zakaznik retrieveZakaznik(@PathVariable long id) {
		
		Optional<Zakaznik> zakaznikOptional = repository.findById(id);
		
		Zakaznik zakaznik = zakaznikOptional.get();
		
		logger.info("{}", zakaznik);
		
		return zakaznik;
	}
	
	@PostMapping("/zakaznici")
	public ResponseEntity<Object> createZakaznik(@Valid @RequestBody Zakaznik zakaznik) {
		Zakaznik novyZakaznik = repository.save(zakaznik);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(novyZakaznik.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}

}
