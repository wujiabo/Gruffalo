package com.wujiabo.opensource.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_user_role database table.
 * 
 */
@Embeddable
public class TUserRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private Long userId;

	@Column(name="role_id")
	private Long roleId;

	public TUserRolePK() {
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TUserRolePK)) {
			return false;
		}
		TUserRolePK castOther = (TUserRolePK)other;
		return 
			this.userId.equals(castOther.userId)
			&& this.roleId.equals(castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.roleId.hashCode();
		
		return hash;
	}
}