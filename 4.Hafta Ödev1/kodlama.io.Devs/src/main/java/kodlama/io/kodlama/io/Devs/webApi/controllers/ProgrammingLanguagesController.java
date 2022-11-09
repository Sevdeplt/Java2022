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
import kodlama.io.kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	@GetMapping("/{id}")
	public ProgrammingLanguage getById(@PathVariable() int id) {
		return programmingLanguageService.getById(id);
	}

	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception{
		this.programmingLanguageService.add(createProgrammingLanguageRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		programmingLanguageService.delete(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody ProgrammingLanguage language) {
		programmingLanguageService.update(language);
	}
}
