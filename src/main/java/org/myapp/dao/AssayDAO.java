package org.myapp.dao;

import io.ebean.*;
import io.ebean.DB;
import java.util.*;
import org.myapp.ApplicationException;
import org.myapp.model.Assay;

public class AssayDAO {


  public void addAssay(Assay assay) throws ApplicationException {
    try {
      assay.save();
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Saving the assay failed"));
    }
  }

   public Assay getAssayById(Long id) throws ApplicationException {
    try {
      return DB.find(Assay.class).where(Expr.eq("id", id)).findOne();
    } catch (Exception e) {
      throw (new ApplicationException("Getting assay " + id + " failed."));
    }
  }
  


  public List<Assay> getAssays() throws ApplicationException {
    try {
      return DB.find(Assay.class).findList();
    } catch (Exception e) {
      throw (new ApplicationException("Getting assays failed."));
    }
  }

  public void deleteAssay(Long id) throws ApplicationException {
    try {
      Assay assayToBeDeleted = DB.find(Assay.class).where(Expr.eq("id", id)).findOne();
      if (assayToBeDeleted == null) {
        throw (new ApplicationException("Assay was not found."));
      }
      assayToBeDeleted.delete();
    } catch (ApplicationException e) {
      throw (new ApplicationException("Deleting the assay failed: " + e.getMessage()));
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Deleting the assay failed: Unknown error"));
    }
  }
  
}