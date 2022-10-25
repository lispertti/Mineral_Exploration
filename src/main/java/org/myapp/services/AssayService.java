package org.myapp.services;

import java.util.*;
import org.myapp.ApplicationException;
import org.myapp.model.Assay;
import org.myapp.dao.AssayDAO;

public class AssayService {

  private AssayDAO assayDAO = new AssayDAO();

  public List<Assay> listAssays() throws ApplicationException {
    try {
      List<Assay> assays = assayDAO.getAssays();
      return assays;
    } catch (Exception e) {
      System.out.println("listing assays failed");
      throw new ApplicationException("listing assays failed");
    }
  }

  public void addAssay(String holeid, Float depthFrom, Float depthTo, Float Au, Float As) throws ApplicationException {
    if (holeid == null || depthFrom == null || depthTo == null) {
      throw new ApplicationException("Hole Id, Depth From and Depth To are required");
    }
    Assay assay = new Assay();
    assay.setHoleid(holeid);
    assay.setDepthFrom(depthFrom);
    assay.setDepthTo(depthTo);
    assay.setAu(Au);
    assay.setAu(As);
    assayDAO.addAssay(assay);
  }

     public void deleteAssay(Long assayId) throws ApplicationException {
    if (assayId < 0) {
      throw new ApplicationException("Assay id must be positive");
    }
    try {
      Assay assayToBeDeleted = assayDAO.getAssayById(assayId);
      if (assayToBeDeleted == null) {
        throw (new ApplicationException("Assay was not found."));
      }
      assayDAO.deleteAssay(assayToBeDeleted.getId());
    } catch (ApplicationException e) {
      throw (new ApplicationException("Deleting the assay failed: " + e.getMessage()));
    } catch (Exception e) {
      // e.printStackTrace();
      throw (new ApplicationException("Deleting the assay failed: Unknown error"));
    }
    System.out.println("Assay is deleted");
  }

}