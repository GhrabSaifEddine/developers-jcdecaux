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
@Table(name = "PRG_LG")
public class ProgrammingLanguage {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_language")
	private int idLanguage;
	
	@Column(name = "libelle_language")
	private String libelleLanguage;
}
