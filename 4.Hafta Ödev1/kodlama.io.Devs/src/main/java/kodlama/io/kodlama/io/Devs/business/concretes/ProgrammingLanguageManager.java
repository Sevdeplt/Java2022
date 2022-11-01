package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	public List<ProgrammingLanguage> getAll() {
		return this.programmingLanguageRepository.getAll();
	}

	public ProgrammingLanguage getById(int id) {
		return this.programmingLanguageRepository.getById(id);
	}

	public void add(ProgrammingLanguage language) throws Exception {
		this.programmingLanguageRepository.add(language);
	}

	public void delete(int id) {
		this.programmingLanguageRepository.delete(id);
	}

	public void update(int id, String name) {
		this.programmingLanguageRepository.update(id, name);
	}
	

}
