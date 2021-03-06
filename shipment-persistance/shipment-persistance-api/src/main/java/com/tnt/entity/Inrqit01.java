package com.tnt.entity;

// Generated 13 Jun, 2016 1:02:40 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Inrqit01 generated by hbm2java
 */
public class Inrqit01 implements java.io.Serializable {

	private Inrqit01Id id;
	private Inrqut01 inrqut01;
	private BigInteger itqty;
	private String pkgty;
	private String prdty;
	private BigDecimal itlen;
	private BigDecimal itwid;
	private BigDecimal ithgt;
	private BigDecimal itwgt;
	private BigDecimal itvol;
	private String isDeleted;
	private Serializable crtTd;
	private Serializable updtTd;

	public Inrqit01() {
	}

	public Inrqit01(Inrqit01Id id, Inrqut01 inrqut01) {
		this.id = id;
		this.inrqut01 = inrqut01;
	}

	public Inrqit01(Inrqit01Id id, Inrqut01 inrqut01, BigInteger itqty,
			String pkgty, String prdty, BigDecimal itlen, BigDecimal itwid,
			BigDecimal ithgt, BigDecimal itwgt, BigDecimal itvol,
			String isDeleted, Serializable crtTd, Serializable updtTd) {
		this.id = id;
		this.inrqut01 = inrqut01;
		this.itqty = itqty;
		this.pkgty = pkgty;
		this.prdty = prdty;
		this.itlen = itlen;
		this.itwid = itwid;
		this.ithgt = ithgt;
		this.itwgt = itwgt;
		this.itvol = itvol;
		this.isDeleted = isDeleted;
		this.crtTd = crtTd;
		this.updtTd = updtTd;
	}

	public Inrqit01Id getId() {
		return this.id;
	}

	public void setId(Inrqit01Id id) {
		this.id = id;
	}

	public Inrqut01 getInrqut01() {
		return this.inrqut01;
	}

	public void setInrqut01(Inrqut01 inrqut01) {
		this.inrqut01 = inrqut01;
	}

	public BigInteger getItqty() {
		return this.itqty;
	}

	public void setItqty(BigInteger itqty) {
		this.itqty = itqty;
	}

	public String getPkgty() {
		return this.pkgty;
	}

	public void setPkgty(String pkgty) {
		this.pkgty = pkgty;
	}

	public String getPrdty() {
		return this.prdty;
	}

	public void setPrdty(String prdty) {
		this.prdty = prdty;
	}

	public BigDecimal getItlen() {
		return this.itlen;
	}

	public void setItlen(BigDecimal itlen) {
		this.itlen = itlen;
	}

	public BigDecimal getItwid() {
		return this.itwid;
	}

	public void setItwid(BigDecimal itwid) {
		this.itwid = itwid;
	}

	public BigDecimal getIthgt() {
		return this.ithgt;
	}

	public void setIthgt(BigDecimal ithgt) {
		this.ithgt = ithgt;
	}

	public BigDecimal getItwgt() {
		return this.itwgt;
	}

	public void setItwgt(BigDecimal itwgt) {
		this.itwgt = itwgt;
	}

	public BigDecimal getItvol() {
		return this.itvol;
	}

	public void setItvol(BigDecimal itvol) {
		this.itvol = itvol;
	}

	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Serializable getCrtTd() {
		return this.crtTd;
	}

	public void setCrtTd(Serializable crtTd) {
		this.crtTd = crtTd;
	}

	public Serializable getUpdtTd() {
		return this.updtTd;
	}

	public void setUpdtTd(Serializable updtTd) {
		this.updtTd = updtTd;
	}

}
