package com.jcdecaux.recruiting.developers.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created By SAIF on 02/07/2018
 */

@Data
@Entity
@Table(name = "DEVELOPPER")
public class Developper {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_developper")
	private int idDevelopper;
	
	@Column(name = "nom_developper")
	private String nomDevelopper;
	
	@Column(name = "poste_developper")
	private String posteDevelopper;
	
	@Column(name = "annee_exp_developper")
	private int anneeExpDevelopper;
}
