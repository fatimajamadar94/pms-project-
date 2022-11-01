package com.yash.pms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

	@Entity
	@Setter
	@Getter
	@AllArgsConstructor
	public class RoleMaster {
		@Id
		@Column
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private int roleId;
		private String roleName;
		private Boolean roleRight;

}
