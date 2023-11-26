package hunre.chinh.QLGiangVien.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GiangVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String magv;
	private String hoten;
	private String tenbomon;
	private float hesoluong;
	private String tinhtrang;

	public GiangVien(int id, String magv, String hoten, String tenbomon, float hesoluong, String tinhtrang) {
		super();
		this.id = id;
		this.magv = magv;
		this.hoten = hoten;
		this.tenbomon = tenbomon;
		this.hesoluong = hesoluong;
		this.tinhtrang = tinhtrang;
	}

	public GiangVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMagv() {
		return magv;
	}

	public void setMagv(String magv) {
		this.magv = magv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getTenbomon() {
		return tenbomon;
	}

	public void setTenbomon(String tenbomon) {
		this.tenbomon = tenbomon;
	}

	public float getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(float hesoluong) {
		this.hesoluong = hesoluong;
	}
	

}
