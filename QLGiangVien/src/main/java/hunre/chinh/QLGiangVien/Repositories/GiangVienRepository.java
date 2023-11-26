package hunre.chinh.QLGiangVien.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hunre.chinh.QLGiangVien.Entity.GiangVien;

public interface GiangVienRepository extends JpaRepository<GiangVien,Integer>  {

	List<GiangVien> findByTenbomonAndHesoluongLessThanEqual(String tenbomon, float hesoluong);

//	List<GiangVien> searchGiangVien(String theSearchName);

}
