package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.FrameworkService;
import kodlama.io.kodlama.io.Devs.business.requests.CreateFrameworkRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllFrameworksResponse;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.FrameworkRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Framework;

@Service
public class FrameworkManager implements FrameworkService {

	private FrameworkRepository frameworkRepository;

	@Autowired
	public FrameworkManager(FrameworkRepository frameworkRepository) {
		this.frameworkRepository = frameworkRepository;
	}

	public List<GetAllFrameworksResponse> getAll() {
		List<Framework> frameworks= frameworkRepository.findAll();
		List<GetAllFrameworksResponse> frameworkResponse=new ArrayList<GetAllFrameworksResponse>();
		for (Framework framework : frameworks) {
			GetAllFrameworksResponse responseItem=new GetAllFrameworksResponse();
			responseItem.setId(framework.getId());
			responseItem.setName(framework.getName());

			frameworkResponse.add(responseItem);
			
			
		}
		return frameworkResponse;
	}

	@Override
	public Framework getById(int id) {
		return frameworkRepository.getReferenceById(id);
	}


	@Override
	public void delete(int id) {
		frameworkRepository.deleteById(id);
	}

	@Override
	public void update(Framework framework) {
		frameworkRepository.saveAndFlush(framework);

	}

	@Override
	public void add(CreateFrameworkRequest createFrameworkRequest) throws Exception {
		Framework framework=new Framework();
		framework.setName(createFrameworkRequest.getName());
		this.frameworkRepository.save(framework);
	}

}
