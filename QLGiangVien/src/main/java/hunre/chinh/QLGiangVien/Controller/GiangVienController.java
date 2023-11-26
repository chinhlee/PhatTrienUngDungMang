package hunre.chinh.QLGiangVien.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hunre.chinh.QLGiangVien.Entity.GiangVien;
import hunre.chinh.QLGiangVien.Service.GiangVienService;


@Controller
public class GiangVienController {
	@Autowired
	private GiangVienService service;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/giangvien_register")
	public String giangvienRegister() {
		return "giangvienRegister";
	}

	@GetMapping("/available_giangvien")
	public ModelAndView getAllGiangVien() {
		List<GiangVien> list = service.getAllGiangVien();
		// ModelAndView m=new ModelAndView();
		// m.setViewName("bookList");
		// m.addObject("book",list);
		return new ModelAndView("giangvienList", "giangvien", list);
	}

	@PostMapping("/save")
	public String addGiangVien(@ModelAttribute GiangVien b) {
		service.save(b);
		return "redirect:/available_giangvien";
	}

	@RequestMapping("/editGiangVien/{id}")
	public String editGiangVien(@PathVariable("id") int id, Model model) {
		GiangVien b = service.getGiangVienById(id);
		model.addAttribute("giangvien", b);
		return "giangvienEdit";
	}

	@RequestMapping("/deleteGiangVien/{id}")
	public String deleteGiangVien(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/available_giangvien";
	}
	
//	@PostMapping("/giangvien_search/{id}")
//	public String searchGiangVien(@ModelAttribute GiangVien b)
//	@GetMapping("/giangvien_search")
//    public String searchGiangVien(@RequestParam("theSearchName") String theSearchName,Model model) {
//        List<GiangVien> b = service.searchGiangVien(theSearchName, theSearchName);
//        model.addAttribute("giangvien", b);      
//        return "redirect:/available_giangvien";        
//    }
	
	@GetMapping("/giangvien_search")
	public String searchGiangVien(@RequestParam("tenbomon") String tenbomon, @RequestParam("hesoluong") float hesoluong,
			Model model) {
		List<GiangVien> giangvienList = service.findByTenBoMonAndHeSoLuong(tenbomon, hesoluong);
		model.addAttribute("giangvien", giangvienList);
		return "giangvienSearch"; // Trả về trang kết quả
	}



}
