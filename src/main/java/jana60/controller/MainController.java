package jana60.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/dipartimenti")
	public String dipartimenti(Model m) {
		List<String> dipartimentoList = List.of("Dipartimento di Medicina", "Dipartimento di Ingegneria",
				"Dipartimento di Economia");
		m.addAttribute("listaDipartimenti", dipartimentoList);
		return "dipartimenti";
	}
}
