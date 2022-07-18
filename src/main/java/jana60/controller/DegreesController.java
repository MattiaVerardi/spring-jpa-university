package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Degrees;
import jana60.repository.DegreesRepo;

@Controller
@RequestMapping("/degrees")
public class DegreesController {

	@Autowired
	private DegreesRepo repo;

	@GetMapping
	public String listaDegrees(Model m) {
		List<Degrees> listaDegrees = (List<Degrees>) repo.findAll();
		m.addAttribute("listaDegrees", listaDegrees);
		return "degrees";
	}

}
