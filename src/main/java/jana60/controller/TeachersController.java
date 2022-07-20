package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Teachers;
import jana60.repository.TeachersRepo;

@Controller
@RequestMapping("/teachers")
public class TeachersController {

	@Autowired
	private TeachersRepo repo;

	@GetMapping
	public String listaTeachers(Model m) {
		List<Teachers> listaTeachers = (List<Teachers>) repo.findAll();
		m.addAttribute("listaTeachers", listaTeachers);
		return "teachers";

	}
}
