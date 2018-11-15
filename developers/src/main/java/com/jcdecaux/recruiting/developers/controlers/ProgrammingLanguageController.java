package com.jcdecaux.recruiting.developers.controlers;

import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;
import com.jcdecaux.recruiting.developers.services.ProgrammingLanguageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

/**
 * Created By SAIF on 02/07/2018
 */

@CrossOrigin
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
    public ResponseEntity<List<ProgrammingLanguage>> createDeveloper(@RequestBody List<ProgrammingLanguage> langages) {
        langages.stream().forEach(programmingLanguage -> programmingLanguageService.saveProgrammingLanguage(programmingLanguage));
		return getAllProgrammingLanguages();
	}
}
