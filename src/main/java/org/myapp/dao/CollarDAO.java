package org.myapp.dao;

import io.ebean.*;
import io.ebean.DB;
import java.util.*;
import org.myapp.ApplicationException;
import org.myapp.model.Collar;

public class CollarDAO {


  public void addCollar(Collar collar) throws ApplicationException {
    try {
      collar.save();
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Saving the collar failed"));
    }
  }

  public Collar getCollarById(Long id) throws ApplicationException {
    try {
      return DB.find(Collar.class).where(Expr.eq("id", id)).findOne();
    } catch (Exception e) {
      throw (new ApplicationException("Getting collar " + id + " failed."));
    }
  }

  /** Seuraavan funktion tarkoitus on hakea taulun tiedot holeIDn perusteella.
  **/
  
  public Collar getCollarByHoleId(String holeid) throws ApplicationException {
    try {
      return DB.find(Collar.class).where(Expr.eq("holeid", holeid)).findOne();
    } catch (Exception e) {
      throw (new ApplicationException("Getting collar " + holeid + " failed."));
    }
  }

  public List<Collar> getCollars() throws ApplicationException {
    try {
      return DB.find(Collar.class).findList();
    } catch (Exception e) {
      throw (new ApplicationException("Getting collars failed."));
    }
  }

  public void deleteCollar(Long id) throws ApplicationException {
    try {
      Collar collarToBeDeleted = DB.find(Collar.class).where(Expr.eq("id", id)).findOne();
      if (collarToBeDeleted == null) {
        throw (new ApplicationException("Collar was not found."));
      }
      collarToBeDeleted.delete();
    } catch (ApplicationException e) {
      throw (new ApplicationException("Deleting the collar failed: " + e.getMessage()));
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Deleting the collar failed: Unknown error"));
    }
  }


  
}