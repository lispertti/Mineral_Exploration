package org.myapp.model;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Lithology extends Model {


  @Id
  Long id;   
  
  String holeid;
  String rockName;
  Float depthFrom;
  Float depthTo;

  @ManyToOne
  Collar collar;

  @Version  
  Long lastUpdate;  

    public Lithology() {
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

	public String getRockName() {
		return rockName;
	}

	public void setRockName(String rockName) {
		this.rockName = rockName;
	}

	public Float getDepthFrom() {
		return depthFrom;
	}

	public void setDepthFrom(Float depthFrom) {
		this.depthFrom = depthFrom;
	}

	public Float getDepthTo() {
		return depthTo;
	}

	public void setDepthTo(Float depthTo) {
		this.depthTo = depthTo;
	}

	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}

	public Long getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}