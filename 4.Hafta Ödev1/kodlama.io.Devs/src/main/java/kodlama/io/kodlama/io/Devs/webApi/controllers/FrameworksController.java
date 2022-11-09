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
import kodlama.io.kodlama.io.Devs.business.abstracts.FrameworkService;
import kodlama.io.kodlama.io.Devs.business.requests.CreateFrameworkRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllFrameworksResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.Framework;

@RestController   //annotation
@RequestMapping("/api/frameworks")
public class FrameworksController {
	private FrameworkService frameworkService;
	
@Autowired // git parametrelerine bak,onu implemente eden sınfıfın new lenmiş halini ver.
	public FrameworksController(FrameworkService frameworkService) {
		this.frameworkService = frameworkService;
	}

	@GetMapping
	public List<GetAllFrameworksResponse> getAll(){
		return frameworkService.getAll();
	}
	
	@GetMapping("/{id}")
	public Framework getById(@PathVariable() int id) {
		return frameworkService.getById(id);
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateFrameworkRequest createFrameworkRequest) throws Exception{
		this.frameworkService.add(createFrameworkRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		frameworkService.delete(id);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody CreateFrameworkRequest createFrameworkRequest) {
		frameworkService.update(id, createFrameworkRequest);
	}
	
	
	
	

}
