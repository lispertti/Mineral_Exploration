package org.myapp.dao;

import io.ebean.*;
import io.ebean.DB;
import java.util.*;
import org.myapp.ApplicationException;
import org.myapp.model.Lithology;

public class LithologyDAO {


  public void addLithology(Lithology lithology) throws ApplicationException {
    try {
      lithology.save();
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Saving the lithology failed"));
    }
  }

  public Lithology getLithologyById(Long id) throws ApplicationException {
    try {
      return DB.find(Lithology.class).where(Expr.eq("id", id)).findOne();
    } catch (Exception e) {
      throw (new ApplicationException("Getting lithology " + id + " failed."));
    }
  }
  


  public List<Lithology> getLithologys() throws ApplicationException {
    try {
      return DB.find(Lithology.class).findList();
    } catch (Exception e) {
      throw (new ApplicationException("Getting lithologys failed."));
    }
  }

  public void deleteLithology(Long id) throws ApplicationException {
    try {
      Lithology lithologyToBeDeleted = DB.find(Lithology.class).where(Expr.eq("id", id)).findOne();
      if (lithologyToBeDeleted == null) {
        throw (new ApplicationException("Lithology was not found."));
      }
      lithologyToBeDeleted.delete();
    } catch (ApplicationException e) {
      throw (new ApplicationException("Deleting the lithology failed: " + e.getMessage()));
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Deleting the lithology failed: Unknown error"));
    }
  }
  
}
