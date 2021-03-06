package com.tnt.entity;

// Generated 13 Jun, 2016 1:02:40 PM by Hibernate Tools 3.4.0.CR1

/**
 * Inrqot01Id generated by hbm2java
 */
public class Inrqot01Id implements java.io.Serializable {

	private String uuid;
	private String prdid;
	private String optid;

	public Inrqot01Id() {
	}

	public Inrqot01Id(String uuid, String prdid, String optid) {
		this.uuid = uuid;
		this.prdid = prdid;
		this.optid = optid;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getPrdid() {
		return this.prdid;
	}

	public void setPrdid(String prdid) {
		this.prdid = prdid;
	}

	public String getOptid() {
		return this.optid;
	}

	public void setOptid(String optid) {
		this.optid = optid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Inrqot01Id))
			return false;
		Inrqot01Id castOther = (Inrqot01Id) other;

		return ((this.getUuid() == castOther.getUuid()) || (this.getUuid() != null
				&& castOther.getUuid() != null && this.getUuid().equals(
				castOther.getUuid())))
				&& ((this.getPrdid() == castOther.getPrdid()) || (this
						.getPrdid() != null && castOther.getPrdid() != null && this
						.getPrdid().equals(castOther.getPrdid())))
				&& ((this.getOptid() == castOther.getOptid()) || (this
						.getOptid() != null && castOther.getOptid() != null && this
						.getOptid().equals(castOther.getOptid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUuid() == null ? 0 : this.getUuid().hashCode());
		result = 37 * result
				+ (getPrdid() == null ? 0 : this.getPrdid().hashCode());
		result = 37 * result
				+ (getOptid() == null ? 0 : this.getOptid().hashCode());
		return result;
	}

}
