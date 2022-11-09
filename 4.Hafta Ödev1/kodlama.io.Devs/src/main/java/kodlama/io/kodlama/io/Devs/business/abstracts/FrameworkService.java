package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.business.requests.CreateFrameworkRequest;
import kodlama.io.kodlama.io.Devs.business.responses.GetAllFrameworksResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.Framework;

public interface FrameworkService {
	public List<GetAllFrameworksResponse> getAll();
	
	public Framework getById(int id);

	public void add(CreateFrameworkRequest createFrameworkRequest) throws Exception;

	public void delete(int id);

	public void update(int id, CreateFrameworkRequest createFrameworkRequest);


}
