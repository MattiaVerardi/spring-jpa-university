package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Departments;
import jana60.repository.DepartmentRepo;

@Controller
@RequestMapping("/departments")
public class DepartmentsController {

	@Autowired
	private DepartmentRepo repo;

//	@GetMapping
//	public String departments(Model m) {
//		List<String> departments = List.of();
//		m.addAttribute("departments", departments);
//		return "/departments/departments";
//	}

	@GetMapping
	public String departments(Model m) {
		List<Departments> departments = (List<Departments>) repo.findAllByOrderByName();
		m.addAttribute("departments", departments);
		return "/departments/departments";
	}
}
