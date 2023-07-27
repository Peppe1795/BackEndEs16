package Giuseppe.Es16;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
@AllArgsConstructor
public class Pizza {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String topping;
	private String drink;
	private int numeroTavolo;
	private int numeroOrdine;

}
