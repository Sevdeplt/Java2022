package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	public List<GetAllProgrammingLanguagesResponse> getAll() {
		List<ProgrammingLanguage> languages= programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> languageResponse=new ArrayList<GetAllProgrammingLanguagesResponse>();
		for (ProgrammingLanguage programmingLanguage : languages) {
			GetAllProgrammingLanguagesResponse responseItem=new GetAllProgrammingLanguagesResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			responseItem.setFrameworks(programmingLanguage.getFrameworks());

			languageResponse.add(responseItem);
		}
		return languageResponse;
	}

	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getReferenceById(id);
	}



	public void delete(int id) {
		programmingLanguageRepository.deleteById(id);
	}

	public void update(int id, CreateProgrammingLanguageRequest request) {
		ProgrammingLanguage programmingLanguage=programmingLanguageRepository.findById(id).get();
		programmingLanguage.setName(request.getName());
		programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void add(CreateProgrammingLanguageRequest request) throws Exception {
		ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
		programmingLanguage.setName(request.getName());
		this.programmingLanguageRepository.save(programmingLanguage);
		
	}
	

}
