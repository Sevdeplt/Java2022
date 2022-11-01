package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping
	public List<ProgrammingLanguage> getAll() {
		return this.programmingLanguageService.getAll();
	}

	@GetMapping("/{id}")
	public ProgrammingLanguage getById(@PathVariable() int id) {
		return this.programmingLanguageService.getById(id);
	}

	@PostMapping
	public void add(@RequestBody ProgrammingLanguage language) throws Exception{
		this.programmingLanguageService.add(language);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.programmingLanguageService.delete(id);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable int id, @RequestBody String name) {
		this.programmingLanguageService.update(id, name);
	}
}
