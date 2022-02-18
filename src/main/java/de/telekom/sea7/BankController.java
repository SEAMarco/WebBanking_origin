package de.telekom.sea7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

<<<<<<< HEAD
/**
 * Protokoll: http
 * ://
 * Host: localhost
 * Pfad (PAth): /search/{kundennummer}
 * 
 *
 */


@Controller
public class BankController {

	@GetMapping ("/search/{kundennummer}")
	@ResponseBody
	public String getKontostand(
			@PathVariable ("kundennummer")String kundennummer,
			@RequestParam ("Datum") String datum,
			@RequestParam ("kontonummer")int kontonummer) {
		return String.format("{\"kundennummer\":\"%s\", \"kontonummer\":\"%s\"}", kundennummer, kontonummer);
	}
=======
@Controller
public class BankController {

	/**
	 * Protokoll: 	https (normal https)
	 * ://
	 * Host: 	 	localhost (oder sonst einer)
	 * Pfad(Path):	/search/pens
	 * ?
	 * RequestParameter: Kontonummer
	 */

	@GetMapping("/{search}/{kundennummer}")
	@ResponseBody	
	public String getKontostand(	
		@PathVariable ("kundennummer") String kundennummer,
		@RequestParam ("datum") String datum,
	    @RequestParam ("kontonummer") int kontonummer){
		return String.format("{\"kundennummer\":\"%s\",\"kundennummer\":\"%s\"}",
				kundennummer, kontonummer);
}
	
	
	
>>>>>>> branch 'master' of git@github.com:SEAMarco/WebBanking.git
}
