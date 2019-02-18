package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.zakazniksluzba;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Zakaznik {

	@Id
	@GeneratedValue
	private Long id;

	private String meno;

	private String priezvisko;

	public Zakaznik() {
		super();
	}

	public Zakaznik(Long id, String meno, String priezvisko) {
		super();
		this.id = id;
		this.meno = meno;
		this.priezvisko = priezvisko;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public String getPriezvisko() {
		return priezvisko;
	}

	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}

	@Override
	public String toString() {
		return "Zakaznik [id=" + id + ", meno=" + meno + ", priezvisko=" + priezvisko + "]";
	}

}
