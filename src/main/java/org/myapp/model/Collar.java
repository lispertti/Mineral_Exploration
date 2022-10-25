package org.myapp.model;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;


@Entity
public class Collar extends Model {

	@Id
	Long id;
		  
	String holeid;
	Float easting;
	Float northing;
	Float elevation;
	Float maxDepth;
	Integer dip;
	Integer direction;
	@Version  
	Long lastUpdate;  
		  
    public Collar() {
  }
  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHoleid() {
		return holeid;
	}

	public void setHoleid(String holeid) {
		this.holeid = holeid;
	}

	public Float getEasting() {
		return easting;
	}

	public void setEasting(Float easting) {
		this.easting = easting;
	}

	public Float getNorthing() {
		return northing;
	}

	public void setNorthing(Float northing) {
		this.northing = northing;
	}

	public Float getElevation() {
		return elevation;
	}

	public void setElevation(Float elevation) {
		this.elevation = elevation;
	}

	public Float getMaxDepth() {
		return maxDepth;
	}

	public void setMaxDepth(Float maxDepth) {
		this.maxDepth = maxDepth;
	}

	public Integer getDip() {
		return dip;
	}

	public void setDip(Integer dip) {
		this.dip = dip;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public Long getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
