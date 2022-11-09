package kodlama.io.kodlama.io.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.Framework;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguagesResponse {
	private int id;
	private String name;
	private List<Framework> frameworks;
}
