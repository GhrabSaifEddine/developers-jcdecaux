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
@Table(name = "INFOS")
public class Infos {

	@Id
	@Column(name = "version")
	private String version;
}
