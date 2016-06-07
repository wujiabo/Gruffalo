package com.wujiabo.opensource.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_menu database table.
 * 
 */
@Entity
@Table(name="t_menu")
@NamedQuery(name="TMenu.findAll", query="SELECT t FROM TMenu t")
public class TMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="menu_id")
	private Long menuId;

	private String locked;

	@Column(name="menu_name")
	private String menuName;

	@Column(name="menu_pid")
	private Long menuPid;

	@Column(name="menu_url")
	private String menuUrl;

	public TMenu() {
	}

	public Long getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getLocked() {
		return this.locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Long getMenuPid() {
		return this.menuPid;
	}

	public void setMenuPid(Long menuPid) {
		this.menuPid = menuPid;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

}