package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Department;
import jana60.repository.DepartmentRepo;

@Controller
@RequestMapping("/")
public class DepartmentController {

	@Autowired
	private DepartmentRepo repo;

//	@GetMapping
//	public String departmentList(Model m) {
//		List<String> departments = List.of("Dipartimento di Economia", "Dipartimento di Medicina",
//				"Dipartimento di Ingegneria");
//		m.addAttribute("departments", departments);
//		return "/department/home";
//	}

	@GetMapping
	public String departmentList(Model m) {
		List<Department> departments = (List<Department>) repo.findAll();
		m.addAttribute("departments", departments);
		return "/department/home";
	}
}
