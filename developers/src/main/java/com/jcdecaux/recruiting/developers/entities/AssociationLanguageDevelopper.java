package com.jcdecaux.recruiting.developers.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created By SAIF on 02/07/2018
 */
@Data
@Entity
@Table(name = "ASSOCIATION_PRG_LG_DEV")
public class AssociationLanguageDevelopper {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_association")
	private int idAssociation;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_developper", referencedColumnName = "id_developper")
	private Developper developper;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_language", referencedColumnName = "id_language")
	private ProgrammingLanguage programmingLanguage;
}
