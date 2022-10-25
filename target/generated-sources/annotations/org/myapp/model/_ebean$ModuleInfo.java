package org.myapp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

import io.ebean.config.ModuleInfo;
import io.ebean.config.ModuleInfoLoader;

@Generated("io.ebean.querybean.generator")
@ModuleInfo(entities={"org.myapp.model.Alteration","org.myapp.model.Assay","org.myapp.model.Collar","org.myapp.model.Lithology"})
public class _ebean$ModuleInfo implements ModuleInfoLoader {

  private List<Class<?>> otherClasses() {
    return Collections.emptyList();
  }

  @Override
  public List<Class<?>> entityClasses() {
    List<Class<?>> entities = new ArrayList<>();
    entities.add(org.myapp.model.Alteration.class);
    entities.add(org.myapp.model.Assay.class);
    entities.add(org.myapp.model.Collar.class);
    entities.add(org.myapp.model.Lithology.class);
    return entities;
  }

  @Override
  public List<Class<?>> entityClassesFor(String dbName) {

    return Collections.emptyList();
  }

}
