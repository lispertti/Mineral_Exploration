package org.myapp.services;

import java.util.*;
import org.myapp.ApplicationException;
import org.myapp.model.Alteration;
import org.myapp.dao.AlterationDAO;

public class AlterationService {

  private AlterationDAO alterationDAO = new AlterationDAO();

  public List<Alteration> listAlterations() throws ApplicationException {
    try {
      List<Alteration> alterations = alterationDAO.getAlterations();
      return alterations;
    } catch (Exception e) {
      System.out.println("listing alterations failed");
      throw new ApplicationException("listing alterations failed");
    }
  }

  public void addAlteration(String holeid, Float depthFrom, Float depthTo, Integer bleaching, Integer veining, Integer sulphides) throws ApplicationException {
    if (holeid == null || depthFrom == null || depthTo == null) {
      throw new ApplicationException("Hole Id, Depth From and Depth To are required");
    }
    Alteration alteration = new Alteration();
    alteration.setHoleid(holeid);
    alteration.setDepthFrom(depthFrom);
    alteration.setDepthTo(depthTo);
    alteration.setBleaching(bleaching);
    alteration.setVeining(veining);
    alteration.setSulphides(sulphides);
    alterationDAO.addAlteration(alteration);
  }

  public void deleteAlteration(Long alterationId) throws ApplicationException {
    if (alterationId < 0) {
      throw new ApplicationException("Alteration id must be positive");
    }
    try {
      Alteration alterationToBeDeleted = alterationDAO.getAlterationById(alterationId);
      if (alterationToBeDeleted == null) {
        throw (new ApplicationException("Alteration was not found."));
      }
      alterationDAO.deleteAlteration(alterationToBeDeleted.getId());
    } catch (ApplicationException e) {
      throw (new ApplicationException("Deleting the alteration failed: " + e.getMessage()));
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Deleting the alteration failed: Unknown error"));
    }
    System.out.println("Alteration is deleted");
  }
  
}
