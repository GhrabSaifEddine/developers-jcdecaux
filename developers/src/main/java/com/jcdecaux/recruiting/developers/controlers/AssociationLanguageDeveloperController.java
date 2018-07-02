package com.jcdecaux.recruiting.developers.controlers;

import com.jcdecaux.recruiting.developers.entities.AssociationLanguageDevelopper;
import com.jcdecaux.recruiting.developers.entities.Developper;
import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;
import com.jcdecaux.recruiting.developers.services.AssociationLanguageDevelopperService;
import com.jcdecaux.recruiting.developers.services.DevelopperService;
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

@RestController
@RequestMapping(value = "/associations")
@Api(description = "Associations REST Controler", value = "/associations")
public class AssociationLanguageDeveloperController {

    @Autowired
    private AssociationLanguageDevelopperService associationLanguageDevelopperService;

    @Autowired
    DevelopperService developperService;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "GET ALL associations")
	public ResponseEntity<List<AssociationLanguageDevelopper>> getAllAssociations() {
		List<AssociationLanguageDevelopper> associationLanguageDeveloppers =associationLanguageDevelopperService.getAllAssociations();
        return new ResponseEntity<>(associationLanguageDeveloppers, OK) ;
	}

    @RequestMapping(method = RequestMethod.GET,value = "/by-id-language")
	@ApiOperation(value = "get All Developpers by idLangage")
    public List<Developper>  getAllDeveloppersByLanguage(@RequestParam(value = "idLangage", required = true) int idLangage) {
        List<Developper> allDevsByIdPrg=associationLanguageDevelopperService.getAllDeveloppersByLanguage(idLangage);
        return allDevsByIdPrg;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/by-id-developer")
    @ApiOperation(value = "get All Languages By idDevelopper ")
    public List<ProgrammingLanguage>  getAllLanguagesByDevelopper(@RequestParam(value = "idDevelopper", required = true) int idDevelopper) {
        List<ProgrammingLanguage> allProgramsByIdDev=associationLanguageDevelopperService.
                getAllLanguagesByDevelopper(idDevelopper);
        return allProgramsByIdDev;
    }
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Save association Language Developper", response = AssociationLanguageDevelopper.class, responseContainer = "ResponseEntity")
    public ResponseEntity<AssociationLanguageDevelopper> createAssociationLanguageDevelopper
            (@RequestBody AssociationLanguageDevelopper associationLanguageDevelopper) {
        AssociationLanguageDevelopper savedAssociationLanguageDevelopper = associationLanguageDevelopperService.
                saveAssociationLanguageDevelopper(associationLanguageDevelopper);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idLanguage}")
				.buildAndExpand(savedAssociationLanguageDevelopper.getIdAssociation()).toUri();

		return ResponseEntity.created(location).build();

	}
}
