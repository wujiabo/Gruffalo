package com.wujiabo.opensource.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_role_menu database table.
 * 
 */
@Entity
@Table(name="t_role_menu")
@NamedQuery(name="TRoleMenu.findAll", query="SELECT t FROM TRoleMenu t")
public class TRoleMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TRoleMenuPK id;

	public TRoleMenu() {
	}

	public TRoleMenuPK getId() {
		return this.id;
	}

	public void setId(TRoleMenuPK id) {
		this.id = id;
	}

}