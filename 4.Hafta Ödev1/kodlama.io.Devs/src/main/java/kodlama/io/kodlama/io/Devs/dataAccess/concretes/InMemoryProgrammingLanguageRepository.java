package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Repository

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	private List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages=new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Phyton"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage pl : this.programmingLanguages) {
			if (pl.getId() == id) {
				return pl;
			}
		}
		return null;
	}

	@Override
	public void add(ProgrammingLanguage language) throws Exception {
		if (language == null) {
			throw new Exception("Language is Null!!!");
		}
		for (ProgrammingLanguage pl : this.programmingLanguages) {
			if (pl.getId() == language.getId() || 
					pl.getName() == language.getName()) {
				throw new Exception("Language already exists!!!");
			}
		}
		this.programmingLanguages.add(language);
	}

	@Override
	public void delete(int id) {
		for (ProgrammingLanguage pl : this.programmingLanguages) {
			if (pl.getId() == id) {
				this.programmingLanguages.remove(pl);
				return;
			}
		}
	}

	@Override
	public void update(int id, String name) {
		for (ProgrammingLanguage pl : this.programmingLanguages) {
			if (pl.getId() == id) {
				pl.setName(name);
			}
		}
	}





}
