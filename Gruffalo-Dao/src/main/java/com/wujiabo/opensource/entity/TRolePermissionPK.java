package com.wujiabo.opensource.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_role_permission database table.
 * 
 */
@Embeddable
public class TRolePermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="role_id")
	private Long roleId;

	@Column(name="permission_id")
	private Long permissionId;

	public TRolePermissionPK() {
	}
	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getPermissionId() {
		return this.permissionId;
	}
	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TRolePermissionPK)) {
			return false;
		}
		TRolePermissionPK castOther = (TRolePermissionPK)other;
		return 
			this.roleId.equals(castOther.roleId)
			&& this.permissionId.equals(castOther.permissionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roleId.hashCode();
		hash = hash * prime + this.permissionId.hashCode();
		
		return hash;
	}
}