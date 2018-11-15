package com.jcdecaux.recruiting.developers.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created By SAIF on 02/07/2018
 */

@Data
@Entity
@Table(name = "DEVELOPPER")
public class Developper {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "developer_generator")
	@SequenceGenerator(name="developer_generator", sequenceName = "seq_developer_id", allocationSize=1)
	@Column(name = "id_developper")
	private int idDevelopper;
	
	@Column(name = "nom_developper")
	private String nomDevelopper;
	
	@Column(name = "poste_developper")
	private String posteDevelopper;
	
	@Column(name = "annee_exp_developper")
	private int anneeExpDevelopper;
}
