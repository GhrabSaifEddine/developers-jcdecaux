package com.jcdecaux.recruiting.developers.controlers;

import com.jcdecaux.recruiting.developers.entities.Developper;
import com.jcdecaux.recruiting.developers.services.DevelopperService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.OK;

/**
 * Created By SAIF on 02/07/2018
 */

@RestController
@RequestMapping(value = "/developers")
@Api(description = "Developer REST Controler", value = "/developers")
public class DeveloperController {

    @Autowired
    DevelopperService developperService;

    @RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Developper>> getAllDevelopers() {
		List<Developper> allDeveloppers =developperService.getAllDeveloppers();
        return new ResponseEntity<>(allDeveloppers, OK) ;
	}

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Save developer", response = Developper.class, responseContainer = "ResponseEntity")
    public ResponseEntity<Object> createDeveloper(@RequestBody Developper developper) {
        Developper savedDeveloper = developperService.saveDevelopper(developper);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idDevelopper}")
				.buildAndExpand(savedDeveloper.getIdDevelopper()).toUri();

		return ResponseEntity.created(location).build();

	}

    @RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Object> updateDeveloper(@RequestBody Developper developper) {

		Optional<Developper> developerToCheck = developperService.findBYId(developper.getIdDevelopper());

		if (!developerToCheck.isPresent())
			return ResponseEntity.notFound().build();

        developperService.saveDevelopper(developper);
		return ResponseEntity.noContent().build();
	}
}
