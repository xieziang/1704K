package com.bawei.pojo;

public class Zhiwu {
	private int zid;
	private String zname;
	private String ztile;
	private int lid;
	public Zhiwu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Zhiwu(int zid, String zname, String ztile, int lid) {
		super();
		this.zid = zid;
		this.zname = zname;
		this.ztile = ztile;
		this.lid = lid;
	}
	/**
	 * @return the zid
	 */
	public int getZid() {
		return zid;
	}
	/**
	 * @param zid the zid to set
	 */
	public void setZid(int zid) {
		this.zid = zid;
	}
	/**
	 * @return the zname
	 */
	public String getZname() {
		return zname;
	}
	/**
	 * @param zname the zname to set
	 */
	public void setZname(String zname) {
		this.zname = zname;
	}
	/**
	 * @return the ztile
	 */
	public String getZtile() {
		return ztile;
	}
	/**
	 * @param ztile the ztile to set
	 */
	public void setZtile(String ztile) {
		this.ztile = ztile;
	}
	/**
	 * @return the lid
	 */
	public int getLid() {
		return lid;
	}
	/**
	 * @param lid the lid to set
	 */
	public void setLid(int lid) {
		this.lid = lid;
	}
	
	
}
