package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.vozidlosluzba;

import java.net.URI;
import java.util.List;

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
public class VozidloController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private VozidloRepository repository;
	
	@GetMapping("/vozidla")
	public List<Vozidlo> retrieveAll() {
		
		List<Vozidlo> vozidla = repository.findAll();
		
		logger.info("{}", vozidla);
		
		return vozidla;
	}
	
	@GetMapping("/vozidla/{ecv}")
	public Vozidlo retrieveVozidlo(@PathVariable String ecv) {
		
		Vozidlo vozidlo = repository.findByEcv(ecv);
		
		logger.info("{}", vozidlo);
		
		return vozidlo;
	}
	
	@PostMapping("/vozidla")
	public ResponseEntity<Object> createVozidlo(@Valid @RequestBody Vozidlo vozidlo) {
		Vozidlo noveVozidlo = repository.save(vozidlo);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ecv}")
				.buildAndExpand(noveVozidlo.getEcv()).toUri();
		
		return ResponseEntity.created(location).build();
	}

}
