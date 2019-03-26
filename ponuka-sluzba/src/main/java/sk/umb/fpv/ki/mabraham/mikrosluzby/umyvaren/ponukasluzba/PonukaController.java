package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.ponukasluzba;

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
public class PonukaController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PonukaRepository repository;

	@GetMapping("/ponuky")
	public List<Ponuka> retrieveAll() {

		List<Ponuka> ponuky = repository.findAll();

		logger.info("{}", ponuky);

		return ponuky;
	}

	@GetMapping("/ponuky/{id}")
	public Ponuka retrievePonuka(@PathVariable long id) {

		Optional<Ponuka> PonukaOptional = repository.findById(id);

		Ponuka Ponuka = PonukaOptional.get();

		logger.info("{}", Ponuka);

		return Ponuka;
	}

	@PostMapping("/ponuky")
	public ResponseEntity<Object> createPonuka(@Valid @RequestBody Ponuka Ponuka) {
		Ponuka novaPonuka = repository.save(Ponuka);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(novaPonuka.getId()).toUri();

		return ResponseEntity.created(location).build();
	}

}
