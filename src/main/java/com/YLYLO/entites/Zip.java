package com.YLYLO.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "zip")
public class Zip {
	public Zip(long zip) {
		super();
		this.zip = zip;
	}

	long zip;

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}
	
	
}
