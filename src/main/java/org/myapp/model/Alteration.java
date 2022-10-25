package org.myapp.model;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Alteration extends Model {


  @Id
  Long id;   
  
  String holeid;
  Float depthFrom;
  Float depthTo;
  Integer bleaching;
  Integer veining;
  Integer sulphides;

  @ManyToOne
  Collar collar;

  @Version  
  Long lastUpdate;  

    public Alteration() {
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

	public Integer getBleaching() {
		return bleaching;
	}

	public void setBleaching(Integer bleaching) {
		this.bleaching = bleaching;
	}

	public Integer getVeining() {
		return veining;
	}

	public void setVeining(Integer veining) {
		this.veining = veining;
	}

	public Integer getSulphides() {
		return sulphides;
	}

	public void setSulphides(Integer sulphides) {
		this.sulphides = sulphides;
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

	