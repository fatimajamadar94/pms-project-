package com.yash.pms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoleMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	@Column
	private String roleName;
	@Column
	private String roleRight;

	public RoleMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleMaster(int roleId, String roleName, String roleRight) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleRight = roleRight;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleRight() {
		return roleRight;
	}

	public void setRoleRight(String roleRight) {
		this.roleRight = roleRight;
	}

	@Override
	public String toString() {
		return "RoleMaster [roleId=" + roleId + ", roleName=" + roleName + ", roleRight=" + roleRight + "]";
	}

}
