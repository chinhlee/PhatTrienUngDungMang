package hunre.chinh.QLGiangVien.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hunre.chinh.QLGiangVien.Entity.GiangVien;
import hunre.chinh.QLGiangVien.Repositories.GiangVienRepository;


@Service
public class GiangVienService {
	@Autowired
	private GiangVienRepository bRepo;

	public void save(GiangVien b) {
		bRepo.save(b);
	}

	public List<GiangVien> getAllGiangVien() {
		return bRepo.findAll();
	}

	public GiangVien getGiangVienById(int id) {
		return bRepo.findById(id).get();
	}

	public void deleteById(int id) {
		bRepo.deleteById(id);
	}

	public List<GiangVien> findByTenBoMonAndHeSoLuong(String tenbomon, float hesoluong) {
		// TODO Auto-generated method stub
		return bRepo.findByTenbomonAndHesoluongLessThanEqual(tenbomon, hesoluong);
	}

//	public List<GiangVien> searchGiangVien(String theSearchName, String theSearchName2) {
//		// TODO Auto-generated method stub
//		return bRepo.searchGiangVien(theSearchName);  
//	}

}
