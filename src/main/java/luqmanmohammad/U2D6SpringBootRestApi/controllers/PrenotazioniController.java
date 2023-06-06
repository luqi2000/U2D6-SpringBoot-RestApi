package luqmanmohammad.U2D6SpringBootRestApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioniController {

	@GetMapping("/lingua")
	public String regolaLingua(){
		return "Scegli una lingua tra italiano o inglese";
	}
	
	@GetMapping("/lingua/{lingua}")
	public String infoSpec(@PathVariable String lingua) {
		if (lingua.equals("italiano")) {
			return "Benvenuto";
		} else if (lingua.equals("inglese")) {
			return "Welcome";
		} else {
			return "Inserisci una lingua tra italiano e inglese";
		}
	}
}
