package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.ponukasluzba;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ponuka {

	@Id
	@GeneratedValue
	private Long id;

	private String nazov;

	private BigDecimal cena;

	// cas v minutach
	private Integer cas;

	public Ponuka() {
		super();
	}

	public Ponuka(Long id, String nazov, BigDecimal cena, Integer cas) {
		super();
		this.id = id;
		this.nazov = nazov;
		this.cena = cena;
		this.cas = cas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	public Integer getCas() {
		return cas;
	}

	public void setCas(Integer cas) {
		this.cas = cas;
	}

	@Override
	public String toString() {
		return "Ponuka [id=" + id + ", nazov=" + nazov + ", cena=" + cena + ", cas=" + cas
				+ "]";
	}

}
