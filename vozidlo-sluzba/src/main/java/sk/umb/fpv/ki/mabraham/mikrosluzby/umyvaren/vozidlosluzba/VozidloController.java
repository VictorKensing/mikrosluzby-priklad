package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.vozidlosluzba;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VozidloController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private VozidloRepository repository;
	
	@GetMapping("/vozidlo")
	public List<Vozidlo> retrieveAll() {
		
		List<Vozidlo> vozidla = repository.findAll();
		
		logger.info("{}", vozidla);
		
		return vozidla;
	}
	
	@GetMapping("/vozidlo/{ecv}")
	public Vozidlo retrieveVozidlo(@PathVariable String ecv) {
		
		Vozidlo vozidlo = repository.findByEcv(ecv);
		
		logger.info("{}", vozidlo);
		
		return vozidlo;
	}

}
