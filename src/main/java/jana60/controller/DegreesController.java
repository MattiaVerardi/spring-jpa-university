package jana60.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.repository.DegreesRepo;

@Controller
@RequestMapping("/degrees")
public class DegreesController {

	@Autowired
	private DegreesRepo repo;

	@GetMapping
	private String degrees(Model m) {
		m.addAttribute("degrees", repo.findAll()); // alternativa più corta per fare quello che facciamo al rigo
													// successivo
//		List<Degrees> degrees = (List<Degrees>) repo.findAll();
//		m.addAttribute("degrees", degrees);
		return "degrees/degrees";
	}
}
