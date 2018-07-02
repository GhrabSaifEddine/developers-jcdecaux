package com.jcdecaux.recruiting.developers.controlers;

import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;
import com.jcdecaux.recruiting.developers.services.ProgrammingLanguageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

/**
 * Created By SAIF on 02/07/2018
 */

@RestController
@RequestMapping(value = "/languages")
@Api(description = "Languages REST Controler", value = "/languages")
public class ProgrammingLanguageController {

    @Autowired
    ProgrammingLanguageService programmingLanguageService;

    @RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProgrammingLanguage>> getAllProgrammingLanguages() {
		List<ProgrammingLanguage> allProgrammingLanguages =programmingLanguageService.getProgrammingLanguages();
        return new ResponseEntity<>(allProgrammingLanguages, OK) ;
	}

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Save Programming Language", response = ProgrammingLanguage.class, responseContainer = "ResponseEntity")
    public ResponseEntity<ProgrammingLanguage> createDeveloper(@RequestBody ProgrammingLanguage developper) {
        ProgrammingLanguage savedDeveloper = programmingLanguageService.saveProgrammingLanguage(developper);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idLanguage}")
				.buildAndExpand(savedDeveloper.getIdLanguage()).toUri();

		return ResponseEntity.created(location).build();

	}
}
