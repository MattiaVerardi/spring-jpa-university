package jana60.controller;

//Create questa applicazione mappandola sul database db_university usato nel modulo sql (in allegato il dump da importare).

//I moduli di Spring Boot da includere sono quindi: Spring web, Thymeleaf, DevTools, Spring Data JPA e Mysql Driver.
//Mappate la tabella dei departments su una classe java, create il repository e inseritelo nel controller, 
//in modo da eseguire una query che recuperi tutti i departments da database.
//Ricordatevi di configurare la connessione nel file application.properties
//Passate la lista alla view in modo che li mostri in forma di lista o di tabella

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.repository.DepartmentRepo;

@Controller
@RequestMapping("/")
public class DepartmentController {

	@Autowired
	private DepartmentRepo repo;

	@GetMapping
	public String departmentList(Model m) {
		List<String> departments = List.of("Dipartimento di Economia", "Dipartimento di Medicina",
				"Dipartimento di Ingegneria");
		m.addAttribute("departments", departments);
		return "/department/home";
	}
}
