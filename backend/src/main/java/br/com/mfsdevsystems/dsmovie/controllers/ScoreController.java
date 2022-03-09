package br.com.mfsdevsystems.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mfsdevsystems.dsmovie.dto.MovieDTO;
import br.com.mfsdevsystems.dsmovie.dto.ScoreDTO;
import br.com.mfsdevsystems.dsmovie.services.ScoreService;

/* São os end-points, que você pode acessar pelo browser, pelo postman*/

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service ;
	
	@PutMapping
	public MovieDTO SaveScore( @RequestBody ScoreDTO dto ){
		
		MovieDTO movieDTO = service.saveScore(dto) ;
		
		return movieDTO ;
				
	}
}
