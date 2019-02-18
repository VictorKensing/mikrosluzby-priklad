package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.zakazniksluzba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZakaznikSluzbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZakaznikSluzbaApplication.class, args);
	}

}
