package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	public List<GetAllProgrammingLanguagesResponse> getAll();
	
	public ProgrammingLanguage getById(int id);

	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;

	public void delete(int id);

	public void update(ProgrammingLanguage language);
}
