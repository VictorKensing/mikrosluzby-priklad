package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.vozidlosluzba;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VozidloRepository extends JpaRepository<Vozidlo, Long> {

	Vozidlo findByEcv(String ecv);
}
