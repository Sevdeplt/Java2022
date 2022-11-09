package kodlama.io.kodlama.io.Devs.business.responses;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllFrameworksResponse {
	private int id;
	private String name;
	private ProgrammingLanguage language;
}
