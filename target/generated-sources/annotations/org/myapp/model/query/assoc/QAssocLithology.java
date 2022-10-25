package org.myapp.model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PFloat;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.processing.Generated;
import org.myapp.model.Lithology;
import org.myapp.model.query.QLithology;

/**
 * Association query bean for AssocLithology.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocLithology<R> extends TQAssocBean<Lithology,R> {

  public PLong<R> id;
  public PString<R> holeid;
  public PString<R> rockName;
  public PFloat<R> depthFrom;
  public PFloat<R> depthTo;
  public QAssocCollar<R> collar;
  public PLong<R> lastUpdate;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QLithology>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QLithology>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QLithology>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QLithology>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocLithology(String name, R root) {
    super(name, root);
  }

  public QAssocLithology(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
