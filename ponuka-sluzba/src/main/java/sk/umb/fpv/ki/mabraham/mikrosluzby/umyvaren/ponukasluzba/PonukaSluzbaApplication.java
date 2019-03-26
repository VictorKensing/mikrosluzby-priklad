package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.ponukasluzba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PonukaSluzbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PonukaSluzbaApplication.class, args);
	}

}
