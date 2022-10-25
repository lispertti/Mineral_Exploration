package org.myapp.model;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Assay extends Model {


  @Id
  Long id;   
  
  String holeid;
  String sampleid;
  Float depthFrom;
  Float depthTo;
  Float Au;
  Float As;

  @ManyToOne
  Collar collar;

  @Version  
  Long lastUpdate;  

    public Assay() {
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


public String getSampleid() {
	return sampleid;
}


public void setSampleid(String sampleid) {
	this.sampleid = sampleid;
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


public Float getAu() {
	return Au;
}


public void setAu(Float au) {
	Au = au;
}


public Float getAs() {
	return As;
}


public void setAs(Float as) {
	As = as;
}


public Collar getCollar() {
	return collar;
}


public void setCollar(Collar collar) {
	this.collar = collar;
}


public void setLastUpdate(Long lastUpdate){
  this.lastUpdate=lastUpdate;
}

public Long getLastUpdate(){
  return this.lastUpdate;
}
}

	
	