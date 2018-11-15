package com.jcdecaux.recruiting.developers.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created By SAIF on 02/07/2018
 */
@Data
@Entity
@Table(name = "PRG_LG")
public class ProgrammingLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "langage_generator")
	@SequenceGenerator(name="langage_generator", sequenceName = "seq_langage_id", allocationSize=1)
	@Column(name = "id_language")
	private int idLanguage;
	
	@Column(name = "libelle_language")
	private String libelleLanguage;
}
