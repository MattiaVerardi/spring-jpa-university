package jana60.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DepartmentController {

	@GetMapping
	private String departmentList(Model m) {
		List<String> departments = List.of("Dipartimento di Economia", "Dipartimento di Medicina",
				"Dipartimento di Ingegneria");
		m.addAttribute("departments", departments);
		return "/department/home";
	}
}
