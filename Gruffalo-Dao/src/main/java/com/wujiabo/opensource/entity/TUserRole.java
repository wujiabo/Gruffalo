package com.wujiabo.opensource.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user_role database table.
 * 
 */
@Entity
@Table(name="t_user_role")
@NamedQuery(name="TUserRole.findAll", query="SELECT t FROM TUserRole t")
public class TUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TUserRolePK id;

	public TUserRole() {
	}

	public TUserRolePK getId() {
		return this.id;
	}

	public void setId(TUserRolePK id) {
		this.id = id;
	}

}