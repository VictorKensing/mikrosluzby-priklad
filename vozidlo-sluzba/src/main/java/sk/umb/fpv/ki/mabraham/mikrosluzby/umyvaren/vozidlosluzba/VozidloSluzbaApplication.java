package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.vozidlosluzba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VozidloSluzbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VozidloSluzbaApplication.class, args);
	}

}
