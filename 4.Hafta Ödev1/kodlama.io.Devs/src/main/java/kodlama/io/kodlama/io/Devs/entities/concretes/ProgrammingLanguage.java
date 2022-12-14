package kodlama.io.kodlama.io.Devs.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="languages")
@Data //getter and setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguage {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy = "language", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Framework> frameworks;
	

}
