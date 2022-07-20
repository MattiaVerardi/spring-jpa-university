package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Department;
import jana60.repository.DipartimentoRepo;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DipartimentoRepo repo;

	@GetMapping
	public String departments(Model m) {
		List<Department> diparepoList = (List<Department>) repo.findAll();
		m.addAttribute("listaDipartimenti", diparepoList);
		return "departments";
	}

	@GetMapping("/{id}")
	public String departmentDetails(Model m, @PathVariable(name = "id") Integer departmentPrimaryKey) {
		Department currentDepartment = repo.findById(departmentPrimaryKey).get();
		m.addAttribute("department", currentDepartment);
		return "departmentsDetails";

	}
}
