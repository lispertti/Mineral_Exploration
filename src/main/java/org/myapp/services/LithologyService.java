package org.myapp.services;

import java.util.*;
import org.myapp.ApplicationException;
import org.myapp.model.Lithology;
import org.myapp.dao.LithologyDAO;

public class LithologyService {

  private LithologyDAO lithologyDAO = new LithologyDAO();

  public List<Lithology> listLithologys() throws ApplicationException {
    try {
      List<Lithology> lithologys = lithologyDAO.getLithologys();
      return lithologys;
    } catch (Exception e) {
      System.out.println("listing lithologys failed");
      throw new ApplicationException("listing lithologys failed");
    }
  }

  public void addLithology(String holeid, Float depthFrom, Float depthTo, String rockName) throws ApplicationException {
    if (holeid == null || depthFrom == null || depthTo == null) {
      throw new ApplicationException("Hole Id, Depth From and Depth To are required");
    }
    Lithology lithology = new Lithology();
    lithology.setHoleid(holeid);
    lithology.setDepthFrom(depthFrom);
    lithology.setDepthTo(depthTo);
    lithology.setRockName(rockName);
    lithologyDAO.addLithology(lithology);
  }

    public void deleteLithology(Long lithologyId) throws ApplicationException {
    if (lithologyId < 0) {
      throw new ApplicationException("Lithology id must be positive");
    }
    try {
      Lithology lithologyToBeDeleted = lithologyDAO.getLithologyById(lithologyId);
      if (lithologyToBeDeleted == null) {
        throw (new ApplicationException("Lithology was not found."));
      }
      lithologyDAO.deleteLithology(lithologyToBeDeleted.getId());
    } catch (ApplicationException e) {
      throw (new ApplicationException("Deleting the lithology failed: " + e.getMessage()));
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Deleting the lithology failed: Unknown error"));
    }
    System.out.println("Lithology is deleted");
  }
  
}