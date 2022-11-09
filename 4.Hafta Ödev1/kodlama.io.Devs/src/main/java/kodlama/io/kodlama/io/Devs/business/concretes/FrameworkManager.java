package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.FrameworkService;
import kodlama.io.kodlama.io.Devs.business.requests.CreateFrameworkRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllFrameworksResponse;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.FrameworkRepository;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Framework;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class FrameworkManager implements FrameworkService {

	private FrameworkRepository frameworkRepository;
	private ProgrammingLanguageRepository plRepository;

	@Autowired
	public FrameworkManager(FrameworkRepository frameworkRepository, ProgrammingLanguageRepository plRepository) {
		this.frameworkRepository = frameworkRepository;
		this.plRepository = plRepository;
	}

	public List<GetAllFrameworksResponse> getAll() {
		List<Framework> frameworks= frameworkRepository.findAll();
		List<GetAllFrameworksResponse> frameworkResponse=new ArrayList<GetAllFrameworksResponse>();
		for (Framework framework : frameworks) {
			GetAllFrameworksResponse responseItem=new GetAllFrameworksResponse();
			responseItem.setId(framework.getId());
			responseItem.setName(framework.getName());
			responseItem.setLanguage(framework.getLanguage());

			frameworkResponse.add(responseItem);
		}
		return frameworkResponse;
	}

	@Override
	public Framework getById(int id) {
		return frameworkRepository.findById(id).get();
	}


	@Override
	public void delete(int id) {
		frameworkRepository.deleteById(id);
	}

	@Override
	public void update(int id, CreateFrameworkRequest request) {
		Framework framework=frameworkRepository.findById(id).get();
		ProgrammingLanguage language = plRepository.findById(request.getLanguageId()).get();
		
		framework.setName(request.getName());
		framework.setLanguage(language);
		
		this.frameworkRepository.save(framework);
	}

	@Override
	public void add(CreateFrameworkRequest request) throws Exception {
		Framework framework=new Framework();
		ProgrammingLanguage language = plRepository.findById(request.getLanguageId()).get();
		
		framework.setName(request.getName());
		framework.setLanguage(language);
		
		this.frameworkRepository.save(framework);
	}
}
