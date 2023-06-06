package luqmanmohammad.U2D6SpringBootRestApi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Edificio {
	private String nome;
	private String indirizzo;
	private String citta;
}