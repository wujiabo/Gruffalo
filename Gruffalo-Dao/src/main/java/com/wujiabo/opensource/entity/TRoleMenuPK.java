package com.wujiabo.opensource.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_role_menu database table.
 * 
 */
@Embeddable
public class TRoleMenuPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="role_id")
	private Long roleId;

	@Column(name="menu_id")
	private Long menuId;

	public TRoleMenuPK() {
	}
	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getMenuId() {
		return this.menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TRoleMenuPK)) {
			return false;
		}
		TRoleMenuPK castOther = (TRoleMenuPK)other;
		return 
			this.roleId.equals(castOther.roleId)
			&& this.menuId.equals(castOther.menuId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roleId.hashCode();
		hash = hash * prime + this.menuId.hashCode();
		
		return hash;
	}
}