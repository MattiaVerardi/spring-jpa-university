package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Dipartimenti;
import jana60.repository.DipartimentoRepo;

@Controller
@RequestMapping("/")
public class DipartimentiController {

	@GetMapping("/dipartimenti")
	public String dipartimenti(Model m) {
		List<String> dipartimentoList = List.of("Dipartimento di Medicina", "Dipartimento di Ingegneria",
				"Dipartimento di Economia");
		m.addAttribute("listaDipartimenti", dipartimentoList);
		return "dipartimenti";
	}

	@Autowired
	private DipartimentoRepo repo;

	@GetMapping("/diparepo")
	public String diparepo(Model md) {
		List<Dipartimenti> diparepoList = (List<Dipartimenti>) repo.findAll();
		md.addAttribute("listaDipartimenti", diparepoList);
		return "dipartimenti";
	}
}
