package com.wujiabo.opensource.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_role_permission database table.
 * 
 */
@Entity
@Table(name="t_role_permission")
@NamedQuery(name="TRolePermission.findAll", query="SELECT t FROM TRolePermission t")
public class TRolePermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TRolePermissionPK id;

	public TRolePermission() {
	}

	public TRolePermissionPK getId() {
		return this.id;
	}

	public void setId(TRolePermissionPK id) {
		this.id = id;
	}

}