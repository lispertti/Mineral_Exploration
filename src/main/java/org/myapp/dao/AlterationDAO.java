package org.myapp.dao;

import io.ebean.*;
import io.ebean.DB;
import java.util.*;
import org.myapp.ApplicationException;
import org.myapp.model.Alteration;

public class AlterationDAO {


  public void addAlteration(Alteration alteration) throws ApplicationException {
    try {
      alteration.save();
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Saving the alteration failed"));
    }
  }

    public Alteration getAlterationById(Long id) throws ApplicationException {
    try {
      return DB.find(Alteration.class).where(Expr.eq("id", id)).findOne();
    } catch (Exception e) {
      throw (new ApplicationException("Getting alteration " + id + " failed."));
    }
  }
  


  public List<Alteration> getAlterations() throws ApplicationException {
    try {
      return DB.find(Alteration.class).findList();
    } catch (Exception e) {
      throw (new ApplicationException("Getting alterations failed."));
    }
  }

    public void deleteAlteration(Long id) throws ApplicationException {
    try {
      Alteration alterationToBeDeleted = DB.find(Alteration.class).where(Expr.eq("id", id)).findOne();
      if (alterationToBeDeleted == null) {
        throw (new ApplicationException("Alteration was not found."));
      }
      alterationToBeDeleted.delete();
    } catch (ApplicationException e) {
      throw (new ApplicationException("Deleting the alteration failed: " + e.getMessage()));
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Deleting the alteration failed: Unknown error"));
    }
  }
}
