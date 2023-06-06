package luqmanmohammad.U2D6SpringBootRestApi.entities;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Utente {
	private String nomeCompleto;
	private String username;
	private String email;
	private List<Prenotazione> listaPrenotazioni;
}