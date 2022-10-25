
package org.myapp.services;

import java.util.*;
import org.myapp.ApplicationException;
import org.myapp.model.Collar;
import org.myapp.dao.CollarDAO;

public class CollarService {

  private CollarDAO collarDAO = new CollarDAO();

  public List<Collar> listCollars() throws ApplicationException {
    try {
      List<Collar> collars = collarDAO.getCollars();
      return collars;
    } catch (Exception e) {
      System.out.println("listing collars failed");
      throw new ApplicationException("listing collars failed");
    }
  }

  public void addCollar(String holeid, Float easting, Float northing, Integer dip, Integer direction) throws ApplicationException {
    if (holeid == null || easting == null || northing == null || dip == null || direction == null) {
      throw new ApplicationException("Hole Id, Easting, Northing, Dip and Direction are required.");
    }
    Collar collar = new Collar();
    collar.setHoleid(holeid);
    collar.setEasting(easting);
    collar.setNorthing(northing);
    collar.setDip(dip);
    collar.setDirection(direction);
    collarDAO.addCollar(collar);
  }

   public void deleteCollar(Long collarId) throws ApplicationException {
    if (collarId < 0) {
      throw new ApplicationException("Collar id must be positive");
    }
    try {
      Collar collarToBeDeleted = collarDAO.getCollarById(collarId);
      if (collarToBeDeleted == null) {
        throw (new ApplicationException("Collar was not found."));
      }
      collarDAO.deleteCollar(collarToBeDeleted.getId());
    } catch (ApplicationException e) {
      throw (new ApplicationException("Deleting the collar failed: " + e.getMessage()));
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Deleting the collar failed: Unknown error"));
    }
    System.out.println("Collar is deleted");
  }
}
