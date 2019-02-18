package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.vozidlosluzba;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vozidlo {

	@Id
	@GeneratedValue
	private Long id;

	private String ecv;

	private String vyrobca;

	private String model;

	public Vozidlo() {
	}

	public Vozidlo(Long id, String ecv, String vyrobca, String model) {
		super();
		this.id = id;
		this.ecv = ecv;
		this.vyrobca = vyrobca;
		this.model = model;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEcv() {
		return ecv;
	}

	public void setEcv(String ecv) {
		this.ecv = ecv;
	}

	public String getVyrobca() {
		return vyrobca;
	}

	public void setVyrobca(String vyrobca) {
		this.vyrobca = vyrobca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vozidlo [id=" + id + ", ecv=" + ecv + ", vyrobca=" + vyrobca + ", model="
				+ model + "]";
	}
	
	

}
